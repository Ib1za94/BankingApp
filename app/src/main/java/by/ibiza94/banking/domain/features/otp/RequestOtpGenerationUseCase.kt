package by.ibiza94.banking.domain.features.otp

import by.ibiza94.banking.domain.features.otp.model.OtpConfiguration
import by.ibiza94.banking.domain.features.otp.model.OtpGenerationResponse

class RequestOtpGenerationUseCase(
    private val otpRepository: OtpRepository
) {
    suspend fun execute(otpConfiguration: OtpConfiguration): OtpGenerationResponse {
        return otpRepository.requestGenerateOtpCode(otpConfiguration)
    }
}