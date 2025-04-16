package by.ibiza94.banking.ui.feature_app_lock.core

import by.ibiza94.banking.ui.feature_app_lock.core.biometrics.BiometricsIntent

interface BiometricsViewModel {
    fun emitBiometricsIntent(intent: BiometricsIntent)
}