package by.ibiza94.banking.domain.features.connections

import by.ibiza94.banking.domain.features.contacts.Contact
import by.ibiza94.banking.domain.features.contacts.ContactsRepository

class LoadUserFromQrCodeUseCase(
    private val contactsRepository: ContactsRepository
) {
    suspend fun execute(qrCode: String): Contact {
        return contactsRepository.getContactFromQr(qrCode)
    }
}