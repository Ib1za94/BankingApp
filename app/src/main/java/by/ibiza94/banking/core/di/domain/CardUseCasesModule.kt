package by.ibiza94.banking.core.di.domain

import by.ibiza94.banking.domain.features.account.GetCardBalanceObservableUseCase
import by.ibiza94.banking.domain.features.cards.AddCardUseCase
import by.ibiza94.banking.domain.features.cards.GetAllCardsUseCase
import by.ibiza94.banking.domain.features.cards.GetCardByIdUseCase
import by.ibiza94.banking.domain.features.cards.GetDefaultCardUseCase
import by.ibiza94.banking.domain.features.cards.GetHomeCardsUseCase
import by.ibiza94.banking.domain.features.cards.SetCardAsPrimaryUseCase
import by.ibiza94.banking.domain.features.cards.RemoveCardUseCase
import org.koin.dsl.module

val cardUseCasesModule = module {
    factory { GetAllCardsUseCase(get()) }
    factory { AddCardUseCase(get()) }
    factory { GetHomeCardsUseCase(get()) }
    factory { GetCardByIdUseCase(get()) }
    factory { RemoveCardUseCase(get()) }
    factory { GetDefaultCardUseCase(get()) }
    factory { GetCardBalanceObservableUseCase(get()) }
    factory { SetCardAsPrimaryUseCase(get()) }
}