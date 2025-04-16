package by.ibiza94.banking.domain.features.cards

import by.ibiza94.banking.domain.features.cards.model.PaymentCard

class GetCardByIdUseCase(
    private val cardsRepository: CardsRepository
) {
    suspend fun execute(cardId: String): PaymentCard {
        return cardsRepository.getCardById(cardId)
    }
}