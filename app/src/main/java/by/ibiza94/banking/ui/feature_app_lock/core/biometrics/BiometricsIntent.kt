package by.ibiza94.banking.ui.feature_app_lock.core.biometrics

sealed class BiometricsIntent {
    object RefreshBiometricsAvailability: BiometricsIntent()
    data class ConsumeAuthResult(val result: BiometricAuthResult) : BiometricsIntent()
}
