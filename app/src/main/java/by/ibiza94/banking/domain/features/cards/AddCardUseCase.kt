package by.ibiza94.banking.domain.features.cards

import by.ibiza94.banking.domain.features.cards.model.AddCardPayload

class AddCardUseCase(
    private val cardsRepository: CardsRepository
) {
    suspend fun execute(payload: AddCardPayload) {
        cardsRepository.addCard(payload)
    }
}