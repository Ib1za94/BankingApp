package by.ibiza94.banking.ui.feature_app_lock.components

import by.ibiza94.banking.ui.core.resources.UiText

data class AppLockUiState(
    val prompt: UiText = UiText.DynamicString(""),
    val pinLength: Int = 4,
    val pinValue: String = "",
    val error: UiText? = null,
    val isLoading: Boolean = false,
    val showBiometricsBtn: Boolean = false,
)