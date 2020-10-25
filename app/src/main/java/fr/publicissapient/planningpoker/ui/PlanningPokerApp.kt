package fr.publicissapient.planningpoker.ui

import androidx.compose.runtime.Composable
import fr.publicissapient.planningpoker.data.CARDS
import fr.publicissapient.planningpoker.ui.theme.PlanningPokerTheme

@Composable
fun PlanningPokerApp() {
	PlanningPokerTheme {
		CardScreen(
			imageResourceId = CARDS.red[0].imageResourceId,
			description = CARDS.red[0].description
		)
	}
}