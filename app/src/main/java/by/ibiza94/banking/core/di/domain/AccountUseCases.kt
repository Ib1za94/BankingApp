package by.ibiza94.banking.core.di.domain

import by.ibiza94.banking.domain.features.account.GetTotalAccountBalanceUseCase
import by.ibiza94.banking.domain.features.account.account_topup.GetSuggestedTopUpValuesUseCase
import by.ibiza94.banking.domain.features.account.account_topup.TopUpAccountUseCase
import by.ibiza94.banking.domain.features.account.send_money.GetSuggestedSendValuesForCardBalance
import by.ibiza94.banking.domain.features.account.send_money.SendMoneyUseCase
import org.koin.dsl.module

val accountUseCasesModule = module {
    factory {
        GetTotalAccountBalanceUseCase(
            accountRepository = get()
        )
    }

    factory {
        GetSuggestedTopUpValuesUseCase()
    }

    factory {
        GetSuggestedSendValuesForCardBalance()
    }

    factory {
        TopUpAccountUseCase(
            transactionRepository = get()
        )
    }

    factory {
        SendMoneyUseCase(
            transactionRepository = get()
        )
    }
}