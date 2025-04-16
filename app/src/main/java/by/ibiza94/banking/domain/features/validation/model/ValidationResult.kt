package by.ibiza94.banking.domain.features.validation.model

import by.ibiza94.banking.domain.core.ErrorType

data class ValidationResult(
    val isValid: Boolean,
    val validationError: ErrorType? = null
)
