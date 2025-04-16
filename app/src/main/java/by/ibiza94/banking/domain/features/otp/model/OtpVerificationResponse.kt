package by.ibiza94.banking.domain.features.otp.model

data class OtpVerificationResponse(
    val isSuccess: Boolean,
    val remainingAttempts: Int?
)
