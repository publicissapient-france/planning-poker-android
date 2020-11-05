package fr.publicissapient.planningpoker.ui

import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumnFor
import androidx.compose.foundation.lazy.LazyColumnForIndexed
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import fr.publicissapient.planningpoker.R
import fr.publicissapient.planningpoker.data.CardRepository
import fr.publicissapient.planningpoker.model.CardSuitType
import fr.publicissapient.planningpoker.ui.card.CardContent
import fr.publicissapient.planningpoker.ui.theme.PlanningPokerTheme

@Composable
fun CardListScreen(
    cardSuitType: CardSuitType,
    navigateToCard: (Int) -> Unit = {},
    onBackClick: () -> Unit = {}
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Complexity", textAlign = TextAlign.Center) },
                backgroundColor = Color.Black,
                contentColor = Color.White,
                navigationIcon = {
                    IconButton(onClick = onBackClick) {
                        Icon(vectorResource(id = R.drawable.ic_baseline_arrow_back))
                    }
                }
            )
        },
        bodyContent = {
            val cardSuit = CardRepository().allCards()[cardSuitType]
            cardSuit?.let {
                Column {
                    val rows = cardSuit.cards.windowed(2, 2, true)
                    LazyColumnForIndexed(
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        items = rows,
                    ) { index, cards ->
                        if (index == 0) {
                            Text(
                                text = "Choose complexity",
                                style = MaterialTheme.typography.h3,
                                textAlign = TextAlign.Center,
                                modifier = Modifier.padding(24.dp, 36.dp, 24.dp, 24.dp)
                            )
                        }
                        Row {
                            cards.map { card ->
                                CardContent(
                                    cardSuit = cardSuit,
                                    card = card,
                                    onClick = {
                                        navigateToCard(index)
                                    },
                                    ratio = .58f
                                )
                            }
                        }
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