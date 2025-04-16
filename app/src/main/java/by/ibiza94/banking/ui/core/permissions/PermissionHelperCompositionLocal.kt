package by.ibiza94.banking.ui.core.permissions

import androidx.compose.runtime.compositionLocalOf

val LocalPermissionHelper = compositionLocalOf<PermissionHelper> { error("No PermissionHelper provided") }