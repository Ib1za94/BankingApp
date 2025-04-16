package by.ibiza94.banking.domain.features.app_lock

import by.ibiza94.banking.domain.features.app_lock.model.AuthenticationResult
import by.ibiza94.banking.domain.features.app_lock.model.BiometricsAvailability

interface AppLockRepository {
    fun setupAppLock(pinCode: String)
    fun authenticateWithPin(pin: String): AuthenticationResult
    fun checkIfAppLocked(): Boolean
    fun checkBiometricsAvailable(): BiometricsAvailability
    fun setupLockWithBiometrics(isLocked: Boolean)
    fun checkIfAppLockedWithBiometrics(): Boolean
}