package by.ibiza94.banking.core.di.domain

import by.ibiza94.banking.domain.features.transactions.GetTransactionsUseCase
import by.ibiza94.banking.domain.features.transactions.ObserveTransactionStatusUseCase
import org.koin.dsl.module

val transactionsModule = module {
    factory { GetTransactionsUseCase(get()) }
    factory { ObserveTransactionStatusUseCase(get()) }
}