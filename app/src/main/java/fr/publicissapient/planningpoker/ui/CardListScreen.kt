package fr.publicissapient.planningpoker.ui

import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
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
import fr.publicissapient.planningpoker.ui.fab.SpeedDialFloatingActionButton
import fr.publicissapient.planningpoker.ui.theme.PlanningPokerTheme

@Composable
fun CardListScreen(
    cardSuitType: CardSuitType,
    navigateToCard: (String) -> Unit = {},
    onBackClick: () -> Unit = {},
    onFabDialClick: (colors: Colors) -> Unit = {}
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
            val cards = CardRepository().allCards(MaterialTheme.colors.primary)[cardSuitType]
            cards?.let {
                Column {
                    val rows = cards.windowed(2, 2, true)
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
                                    card = card,
                                    onClick = {
                                        navigateToCard(card.name)
                                    },
                                    ratio = .58f
                                )
                            }
                        }
                    }
                }
            } ?: error("Unknown card suit!")
        },
        floatingActionButton = {
            SpeedDialFloatingActionButton(onFabDialClick)
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