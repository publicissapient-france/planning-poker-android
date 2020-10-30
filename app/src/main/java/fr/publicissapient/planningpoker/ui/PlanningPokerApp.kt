package fr.publicissapient.planningpoker.ui

import androidx.compose.runtime.Composable
import fr.publicissapient.planningpoker.data.CardRepository
import fr.publicissapient.planningpoker.ui.carddetail.CardDetail
import fr.publicissapient.planningpoker.ui.theme.PlanningPokerTheme
import fr.publicissapient.planningpoker.ui.theme.getThemeColor

@Composable
fun PlanningPokerApp() {
    val redCardSuit = CardRepository().allCards().redCardSuit

    PlanningPokerTheme {
        CardDetail(
            card = redCardSuit.cards[0],
            color = redCardSuit.color.getThemeColor()
        )
    }
}