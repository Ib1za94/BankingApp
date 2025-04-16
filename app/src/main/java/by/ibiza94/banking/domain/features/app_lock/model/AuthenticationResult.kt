package by.ibiza94.banking.domain.features.app_lock.model

sealed class AuthenticationResult {
    object Success: AuthenticationResult()

    data class Failure(
        val remainingAttempts: Int?
    ): AuthenticationResult()
}
