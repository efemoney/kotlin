/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.scripting.gradle

import com.intellij.lang.cacheBuilder.WordOccurrence
import com.intellij.lang.findUsages.LanguageFindUsages
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.psi.PsiManager
import org.jetbrains.kotlin.idea.KotlinLanguage
import org.jetbrains.kotlin.idea.core.script.configuration.cache.CachedConfigurationInputs
import org.jetbrains.kotlin.idea.core.script.configuration.cache.ScriptInputsCalculator
import org.jetbrains.kotlin.idea.util.application.runReadAction
import org.jetbrains.kotlin.psi.KtCallExpression
import org.jetbrains.kotlin.psi.KtFile
import org.jetbrains.kotlin.psi.KtScriptInitializer
import org.jetbrains.kotlin.psi.psiUtil.getChildrenOfType
import java.util.zip.CRC32

private val sections = arrayListOf("buildscript", "plugins", "initscript", "pluginManagement")

class GradleScriptInputsCalculator(private val project: Project) : ScriptInputsCalculator {
    override fun isApplicable(file: VirtualFile): Boolean = isGradleKotlinScript(file)

    override fun calculate(project: Project, file: VirtualFile, ktFile: KtFile?): CachedConfigurationInputs {
        return getGradleScriptInputsStamp(project, file, ktFile)
            ?: CachedConfigurationInputs.PsiModificationStamp.get(project, file, ktFile)
    }

    private fun getGradleScriptInputsStamp(
        project: Project,
        file: VirtualFile,
        givenKtFile: KtFile? = null
    ): GradleKotlinScriptConfigurationInputs? {
        if (!isGradleKotlinScript(file)) return null

        return runReadAction {
            val ktFile = givenKtFile ?: PsiManager.getInstance(project).findFile(file) as? KtFile ?: return@runReadAction null

            val result = StringBuilder()
            ktFile.script?.blockExpression
                ?.getChildrenOfType<KtScriptInitializer>()
                ?.forEach {
                    val call = it.children.singleOrNull() as? KtCallExpression
                    if (call?.firstChild?.text in sections) {
                        result.append(call?.text)
                        result.append("\n")
                    }
                }

            val timeStamp = System.currentTimeMillis()

            val crc32 = CRC32()
            val wordsScanner = LanguageFindUsages.getWordsScanner(KotlinLanguage.INSTANCE)
                ?: return@runReadAction GradleKotlinScriptConfigurationInputs(
                    result.toString().hashCode().toLong(),
                    timeStamp
                )

            wordsScanner.processWords(result.toString()) { occurrence ->
                if (occurrence.kind !== WordOccurrence.Kind.COMMENTS) {
                    val currentWord = occurrence.baseText.subSequence(occurrence.start, occurrence.end)
                    var i = 0
                    val end = currentWord.length
                    while (i < end) {
                        crc32.update(currentWord[i].toInt())
                        i++
                    }
                }
                true
            }

            return@runReadAction GradleKotlinScriptConfigurationInputs(crc32.value, timeStamp)
        }
    }
}