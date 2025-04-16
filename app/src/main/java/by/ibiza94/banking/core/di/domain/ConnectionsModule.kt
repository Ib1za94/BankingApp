package by.ibiza94.banking.core.di.domain

import by.ibiza94.banking.domain.features.connections.LoadUserFromQrCodeUseCase
import by.ibiza94.banking.domain.features.qr_codes.GenerateQrCodeUseCase
import org.koin.dsl.module

val connectionsModule = module {
    factory { GenerateQrCodeUseCase() }
    factory { LoadUserFromQrCodeUseCase(
        contactsRepository = get()
    ) }
}