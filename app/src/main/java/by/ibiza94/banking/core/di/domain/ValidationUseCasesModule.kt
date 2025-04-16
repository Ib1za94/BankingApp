package by.ibiza94.banking.core.di.domain

import by.ibiza94.banking.domain.features.validation.ValidateBillingAddressUseCase
import by.ibiza94.banking.domain.features.validation.ValidateCardExpirationUseCase
import by.ibiza94.banking.domain.features.validation.ValidateCardHolderUseCase
import by.ibiza94.banking.domain.features.validation.ValidateCardNumberUseCase
import by.ibiza94.banking.domain.features.validation.ValidateCvvCodeUseCase
import by.ibiza94.banking.domain.features.validation.ValidateEmailUseCase
import by.ibiza94.banking.domain.features.validation.ValidatePasswordUseCase
import org.koin.dsl.module

val validationUseCasesModule = module {
    factory { ValidateCardNumberUseCase() }
    factory { ValidateCvvCodeUseCase() }
    factory { ValidateCardExpirationUseCase() }
    factory { ValidateBillingAddressUseCase() }
    factory { ValidateCardHolderUseCase() }
    factory { ValidatePasswordUseCase() }
    factory { ValidateEmailUseCase() }
}