/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.ir.backend.js

import com.intellij.openapi.project.Project
import org.jetbrains.kotlin.backend.common.phaser.PhaseConfig
import org.jetbrains.kotlin.backend.common.phaser.invokeToplevel
import org.jetbrains.kotlin.config.CompilerConfiguration
import org.jetbrains.kotlin.ir.backend.js.transformers.irToJs.IrModuleToJsTransformer
import org.jetbrains.kotlin.ir.declarations.IrFile
import org.jetbrains.kotlin.ir.declarations.impl.IrFileImpl
import org.jetbrains.kotlin.ir.declarations.NoopController
import org.jetbrains.kotlin.ir.declarations.StageController
import org.jetbrains.kotlin.ir.declarations.stageController
import org.jetbrains.kotlin.ir.util.ExternalDependenciesGenerator
import org.jetbrains.kotlin.ir.util.patchDeclarationParents
import org.jetbrains.kotlin.psi.KtFile

fun compile(
    project: Project,
    files: List<KtFile>,
    configuration: CompilerConfiguration,
    phaseConfig: PhaseConfig,
    immediateDependencies: List<KlibModuleRef>,
    allDependencies: List<KlibModuleRef>
): String {
    stageController = NoopController()

    val (moduleFragment, dependencyModules, irBuiltIns, symbolTable, deserializer) =
        loadIr(project, files, configuration, immediateDependencies, allDependencies)

    val moduleDescriptor = moduleFragment.descriptor

    val context = JsIrBackendContext(moduleDescriptor, irBuiltIns, symbolTable, moduleFragment, configuration)

    stageController = object: StageController {
        override val currentStage: Int
            get() = context.stage

        override fun lowerUpTo(file: IrFile, stageNonInclusive: Int) {
            val loweredUpTo = (file as? IrFileImpl)?.loweredUpTo ?: 0
            val originalStage = context.stage
            for (i in loweredUpTo + 1 until stageNonInclusive) {
                context.stage = i
                perFilePhaseList[i - 1](context).lower(file)
                (file as? IrFileImpl)?.loweredUpTo = i
            }
            context.stage = originalStage
        }
    }

    // Load declarations referenced during `context` initialization
    dependencyModules.forEach {
        ExternalDependenciesGenerator(
            it.descriptor,
            symbolTable,
            irBuiltIns,
            deserializer = deserializer
        ).generateUnboundSymbolsAsDependencies()
    }

    // TODO: check the order
    val irFiles = dependencyModules.flatMap { it.files } + moduleFragment.files

    moduleFragment.files.clear()
    moduleFragment.files += irFiles

    // Create stubs
    ExternalDependenciesGenerator(
        moduleDescriptor = moduleDescriptor,
        symbolTable = symbolTable,
        irBuiltIns = irBuiltIns
    ).generateUnboundSymbolsAsDependencies()
    moduleFragment.patchDeclarationParents()

    jsPhases.invokeToplevel(phaseConfig, context, moduleFragment)

    generateTests(context, moduleFragment)

    context.stage = perFilePhaseList.size + 1
    val jsProgram = moduleFragment.accept(IrModuleToJsTransformer(context), null)
    return jsProgram.toString()
}