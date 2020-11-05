package fr.publicissapient.planningpoker.ui

import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumnFor
import androidx.compose.foundation.lazy.LazyColumnForIndexed
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
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
                Column {
                    LazyColumnForIndexed(
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        items = cardSuit.cards,
                    ) { index, card ->
                        if (index == 0) {
                            Text(
                                text = "Choose your price",
                                style = MaterialTheme.typography.h3,
                                textAlign = TextAlign.Center,
                                modifier = Modifier.padding(24.dp, 48.dp, 24.dp, 24.dp)
                            )
                        }
                        CardContent(
                            cardSuit = cardSuit,
                            card = card,
                            onClick = {
                                navigateToCard(index)
                            }
                        )
                    }
                }
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