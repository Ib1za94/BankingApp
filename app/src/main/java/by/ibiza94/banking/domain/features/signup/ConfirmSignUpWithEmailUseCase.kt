package by.ibiza94.banking.domain.features.signup

import by.ibiza94.banking.domain.features.otp.model.OtpConfiguration
import by.ibiza94.banking.domain.features.otp.model.OtpVerificationResponse

class ConfirmSignUpWithEmailUseCase(
    private val signUpRepository: SignUpRepository
) {
    suspend fun execute(
        otpCode: String,
        otpConfiguration: OtpConfiguration
    ): OtpVerificationResponse {
        return signUpRepository.confirmSignUpWithEmail(otpCode, otpConfiguration)
    }
}