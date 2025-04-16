package by.ibiza94.banking.domain.features.account

import by.ibiza94.banking.domain.features.account.model.MoneyAmount
import kotlinx.coroutines.flow.Flow

interface AccountRepository {
    fun getBalanceFlow(): Flow<MoneyAmount>
    suspend fun getCardBalanceFlow(cardId: String): Flow<MoneyAmount>
    suspend fun topUpCard(cardId: String, amount: MoneyAmount)
    suspend fun sendFromCard(cardId: String, amount: MoneyAmount, contactId: Long)
}