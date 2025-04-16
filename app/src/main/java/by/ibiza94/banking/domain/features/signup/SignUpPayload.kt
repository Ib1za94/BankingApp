package by.ibiza94.banking.domain.features.signup

data class SignUpPayload(
    val fullName: String,
    val email: String,
    val password: String,
)
