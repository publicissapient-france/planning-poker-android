package fr.publicissapient.planningpoker.ui.home

import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.ExperimentalLazyDsl
import androidx.compose.foundation.lazy.LazyRowFor
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.ui.tooling.preview.Preview
import fr.publicissapient.planningpoker.data.CardRepository
import fr.publicissapient.planningpoker.model.CardSuit
import fr.publicissapient.planningpoker.ui.theme.PlanningPokerTheme
import fr.publicissapient.planningpoker.ui.theme.getThemeColor

@ExperimentalLazyDsl
@Composable
fun CardList(
    cardSuit: CardSuit
) = Scaffold(
    bodyContent = {
        Column {
            Text(
                text = "Choose your card",
                style = MaterialTheme.typography.h3
            )
            LazyRowFor(cardSuit.cards) {
                // TODO why it's not working?
                CardListItem(it, cardSuit.color.getThemeColor())
            }
        }
    }
)

@ExperimentalLazyDsl
@Preview
@Composable
fun CardListPreview() {
    PlanningPokerTheme {
        val allCards = CardRepository().allCards()
        CardList(allCards.redCardSuit)
    }
}