/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.fir

import com.intellij.ide.util.PropertiesComponent

// Just a wrapper to see whether resolve works via FIR or not
object FirResolution {
    private const val ENABLED_BY_DEFAULT = false
    private const val optionName = "kotlin.use.fir.resolution"

    var enabled: Boolean
        get() = PropertiesComponent.getInstance().getBoolean(optionName, ENABLED_BY_DEFAULT)
        set(value) {
            PropertiesComponent.getInstance().setValue(optionName, value, ENABLED_BY_DEFAULT)
        }
}