package by.ibiza94.banking.ui.feature_app_settings

import by.ibiza94.banking.R
import by.ibiza94.banking.domain.features.app_lock.model.BiometricsAvailability
import by.ibiza94.banking.ui.core.resources.UiText
import by.ibiza94.banking.ui.feature_app_lock.core.biometrics.BiometricAuthResult
import by.ibiza94.banking.ui.feature_app_lock.core.biometrics.BiometricsPromptUi
import de.palm.composestateevents.StateEventWithContent
import de.palm.composestateevents.consumed

data class AppSettingsState(
    val biometricPrompt: BiometricsPromptUi = BiometricsPromptUi(
        title = UiText.StringResource(R.string.unlock_app_biometrics),
        cancelBtnText = UiText.StringResource(R.string.cancel)
    ),
    val biometricsAvailability: BiometricsAvailability,
    val isAppLockedWithBiometrics: Boolean,
    val biometricsAuthEvent: StateEventWithContent<BiometricAuthResult> = consumed()
)
