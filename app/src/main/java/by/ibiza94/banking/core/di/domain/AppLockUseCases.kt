package by.ibiza94.banking.core.di.domain

import by.ibiza94.banking.domain.features.app_lock.AuthenticateWithPinUseCase
import by.ibiza94.banking.domain.features.app_lock.CheckAppLockUseCase
import by.ibiza94.banking.domain.features.app_lock.CheckAppLockedWithBiometricsUseCase
import by.ibiza94.banking.domain.features.app_lock.CheckIfBiometricsAvailableUseCase
import by.ibiza94.banking.domain.features.app_lock.SetupAppLockUseCase
import by.ibiza94.banking.domain.features.app_lock.SetupAppLockedWithBiometricsUseCase
import org.koin.dsl.module

val appLockUseCasesModule = module {
    factory { AuthenticateWithPinUseCase(
        appLockRepository = get()
    ) }

    factory { CheckAppLockUseCase(
        appLockRepository = get()
    ) }

    factory {
        SetupAppLockUseCase(
            appLockRepository = get()
        )
    }

    factory {
        SetupAppLockedWithBiometricsUseCase(
            appLockRepository = get()
        )
    }

    factory {
        CheckAppLockedWithBiometricsUseCase(
            appLockRepository = get()
        )
    }

    factory {
        CheckIfBiometricsAvailableUseCase(
            appLockRepository = get()
        )
    }
}