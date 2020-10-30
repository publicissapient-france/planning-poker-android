package fr.publicissapient.planningpoker.ui

import androidx.compose.runtime.Composable
import fr.publicissapient.planningpoker.data.CardRepository
import fr.publicissapient.planningpoker.ui.theme.PlanningPokerTheme

@Composable
fun PlanningPokerApp() {
    val redCardSuit = CardRepository().allCards().redCardSuit
    PlanningPokerTheme {
        CardScreen(
            imageResId = redCardSuit.cards[0].imageResourceId,
            description = redCardSuit.cards[0].description,
            pointValue = redCardSuit.cards[0].pointValue,
            color = redCardSuit.color
        )
    }
}