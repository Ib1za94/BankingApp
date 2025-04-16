package by.ibiza94.banking.core.di.domain

import by.ibiza94.banking.domain.features.contacts.GetContactByIdUseCase
import by.ibiza94.banking.domain.features.contacts.GetContactsUseCase
import by.ibiza94.banking.domain.features.contacts.GetRecentContactUseCase
import org.koin.dsl.module

val contactsModule = module {
    factory { GetContactsUseCase(get()) }
    factory { GetContactByIdUseCase(get()) }
    factory { GetRecentContactUseCase(get()) }
}