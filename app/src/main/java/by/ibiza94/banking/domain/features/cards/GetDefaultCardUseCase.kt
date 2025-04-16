package by.ibiza94.banking.domain.features.cards

import by.ibiza94.banking.domain.features.cards.model.PaymentCard

class GetDefaultCardUseCase(
    private val cardsRepository: CardsRepository
) {
    suspend fun execute(): PaymentCard? {
        val cards = cardsRepository.getCards()

        return cards.find {
            it.isPrimary
        } ?: cards.firstOrNull()
    }
}