package by.ibiza94.banking.domain.features.otp.model

data class OtpConfiguration(
    val operationType: OtpOperationType,
    val otpType: OtpType,
    val otpDestination: String
)
