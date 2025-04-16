package by.ibiza94.banking.ui.feature_qr_codes

import by.ibiza94.banking.domain.features.qr_codes.model.QrPurpose

sealed class DisplayQrIntent {
    data class GenerateQr(val qrPurpose: QrPurpose): DisplayQrIntent()
}
