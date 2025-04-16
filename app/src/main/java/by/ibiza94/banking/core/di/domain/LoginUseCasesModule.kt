package by.ibiza94.banking.core.di.domain

import by.ibiza94.banking.domain.features.login.CheckIfLoggedInUseCase
import by.ibiza94.banking.domain.features.login.LoginWithEmailUseCase
import by.ibiza94.banking.domain.features.login.LogoutUseCase
import org.koin.dsl.module

val loginUseCasesModule = module {
    factory { LoginWithEmailUseCase(loginRepository = get()) }
    factory { LogoutUseCase(loginRepository = get()) }
    factory { CheckIfLoggedInUseCase(loginRepository = get()) }
}