package by.ibiza94.banking.core.di.domain

import by.ibiza94.banking.domain.features.savings.GetAllSavingsUseCase
import by.ibiza94.banking.domain.features.savings.GetHomeSavingsUseCase
import by.ibiza94.banking.domain.features.savings.GetSavingByIdUseCase
import org.koin.dsl.module

val savingsUseCasesModule = module {
    factory { GetAllSavingsUseCase(savingsRepository = get()) }
    factory { GetHomeSavingsUseCase(savingsRepository = get()) }
    factory { GetSavingByIdUseCase(savingsRepository = get()) }
}