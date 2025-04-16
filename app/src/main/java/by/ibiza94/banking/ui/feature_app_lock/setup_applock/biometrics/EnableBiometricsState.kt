package by.ibiza94.banking.ui.feature_app_lock.setup_applock.biometrics

import by.ibiza94.banking.ui.feature_app_lock.core.biometrics.BiometricAuthResult
import by.ibiza94.banking.domain.features.app_lock.model.BiometricsAvailability
import by.ibiza94.banking.ui.feature_app_lock.core.biometrics.BiometricsPromptUi
import de.palm.composestateevents.StateEventWithContent
import de.palm.composestateevents.consumed

data class EnableBiometricsState(
    val prompt: BiometricsPromptUi,
    val biometricsAvailability: BiometricsAvailability,
    val authResultEvent: StateEventWithContent<BiometricAuthResult> = consumed()
)
