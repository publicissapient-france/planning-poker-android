package fr.publicissapient.planningpoker.ui

import androidx.compose.foundation.lazy.LazyColumnFor
import androidx.compose.foundation.lazy.LazyColumnForIndexed
import androidx.compose.material.Divider
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.ui.tooling.preview.Preview
import fr.publicissapient.planningpoker.data.CardRepository
import fr.publicissapient.planningpoker.model.CardSuitType
import fr.publicissapient.planningpoker.ui.card.CardContent
import fr.publicissapient.planningpoker.ui.theme.PlanningPokerTheme

@Composable
fun CardListScreen(
    cardSuitType: CardSuitType,
    navigateToCard: (Int) -> Unit
) {
    Scaffold(
        bodyContent = {
            val cardSuit = CardRepository().allCards()[cardSuitType]
            cardSuit?.let {
                LazyColumnForIndexed(items = cardSuit.cards) { index, card ->
                    CardContent(
                        cardSuit = cardSuit,
                        card = card,
                        onClick = {
                            navigateToCard(index)
                        }
                    )
                }
                Divider()
            } ?: error("Unknown card suit!")
        }
    )
}

@Preview
@Composable
fun CardListScreenPreview() {
    PlanningPokerTheme {
        CardListScreen(cardSuitType = CardSuitType.Fibonacci) {}
    }
}