package by.ibiza94.banking.domain.features.otp

import by.ibiza94.banking.domain.features.otp.model.OtpConfiguration
import by.ibiza94.banking.domain.features.otp.model.OtpGenerationResponse
import by.ibiza94.banking.domain.features.otp.model.OtpVerificationResponse

interface OtpRepository {
    suspend fun requestGenerateOtpCode(otpConfiguration: OtpConfiguration): OtpGenerationResponse

    suspend fun verifyOtpCode(
        otpConfiguration: OtpConfiguration,
        code: String,
    ): OtpVerificationResponse
}