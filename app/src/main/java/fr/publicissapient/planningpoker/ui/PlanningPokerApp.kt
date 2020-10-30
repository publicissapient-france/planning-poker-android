package fr.publicissapient.planningpoker.ui

import androidx.compose.runtime.Composable
import fr.publicissapient.planningpoker.data.CARDS
import fr.publicissapient.planningpoker.ui.theme.PlanningPokerTheme

@Composable
fun PlanningPokerApp() {
    PlanningPokerTheme {
        CardScreen(
            vectorResourceId = CARDS.red.cards[0].imageResourceId,
            description = CARDS.red.cards[0].description,
            color = CARDS.red.color
        )
    }
}