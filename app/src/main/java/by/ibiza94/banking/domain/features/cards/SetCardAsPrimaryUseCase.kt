package by.ibiza94.banking.domain.features.cards

class SetCardAsPrimaryUseCase(
    private val cardsRepository: CardsRepository
) {
    suspend fun execute(cardId: String, setAsPrimary: Boolean) {
        return cardsRepository.markCardAsPrimary(cardId, setAsPrimary)
    }
}