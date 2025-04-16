package by.ibiza94.banking.ui.feature_transactions

import androidx.paging.PagingData
import by.ibiza94.banking.ui.core.resources.UiText
import by.ibiza94.banking.ui.feature_transactions.model.TransactionUi
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow

data class TransactionHistoryState(
    val transactionsPagingState: Flow<PagingData<TransactionUi>> = MutableStateFlow(PagingData.empty()),
    val screenError: UiText? = null
)
