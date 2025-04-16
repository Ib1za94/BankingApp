package by.ibiza94.banking.ui.feature_qr_codes

import by.ibiza94.banking.ui.core.resources.UiText

data class DisplayQrState(
    val isLoading: Boolean = false,
    val qrString: String? = null,
    val error: UiText? = null,
)
