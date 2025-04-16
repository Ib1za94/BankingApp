package by.ibiza94.banking.core.di.domain

import by.ibiza94.banking.domain.features.signup.ConfirmSignUpWithEmailUseCase
import by.ibiza94.banking.domain.features.signup.SignUpWithEmailUseCase
import org.koin.dsl.module

val signUpModule = module {
    factory { ConfirmSignUpWithEmailUseCase(signUpRepository = get()) }
    factory { SignUpWithEmailUseCase(signUpRepository = get()) }
}