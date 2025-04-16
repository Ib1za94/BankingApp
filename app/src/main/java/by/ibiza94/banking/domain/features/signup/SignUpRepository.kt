package by.ibiza94.banking.domain.features.signup

import by.ibiza94.banking.domain.features.otp.model.OtpConfiguration
import by.ibiza94.banking.domain.features.otp.model.OtpVerificationResponse

interface SignUpRepository {
    suspend fun signUpWithEmail(payload: SignUpPayload)

    suspend fun confirmSignUpWithEmail(
        otpCode: String,
        otpConfiguration: OtpConfiguration
    ): OtpVerificationResponse
}