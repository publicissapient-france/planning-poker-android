package fr.publicissapient.planningpoker.ui.card

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.ui.tooling.preview.Preview
import fr.publicissapient.planningpoker.data.CardRepository
import fr.publicissapient.planningpoker.model.CardSuitType
import fr.publicissapient.planningpoker.ui.theme.PlanningPokerTheme

@Composable
fun CardScreen(
    cardSuit: CardSuitType,
    cardId: Int,
) {
    Scaffold(
        bodyContent = {
            val suit = CardRepository().allCards()[cardSuit]
            suit?.let {
                val card = it.cards[cardId]
                CardContent(
                    cardSuit = it,
                    card = card,
                    onClick = {}
                )
            } ?: error("Cannot find cart suit!")
        }
    )
}

@Preview
@Composable
fun CardScreenPreview() {
    PlanningPokerTheme {
        CardScreen(
            cardSuit = CardSuitType.Fibonacci,
            cardId = 0
        )
    }
}