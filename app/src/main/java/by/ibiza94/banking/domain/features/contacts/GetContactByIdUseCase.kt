package by.ibiza94.banking.domain.features.contacts

class GetContactByIdUseCase(
    private val contactsRepository: ContactsRepository
) {
    suspend fun execute(contactId: Long): Contact {
        return contactsRepository.getContactById(contactId)
    }
}