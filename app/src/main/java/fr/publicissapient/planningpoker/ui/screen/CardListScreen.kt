package fr.publicissapient.planningpoker.ui.screen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import coil.transform.CircleCropTransformation
import fr.publicissapient.planningpoker.R
import fr.publicissapient.planningpoker.data.CardRepository
import fr.publicissapient.planningpoker.model.Card
import fr.publicissapient.planningpoker.model.CardSuitType
import fr.publicissapient.planningpoker.ui.body.BodyWithBlop
import fr.publicissapient.planningpoker.ui.card.CardContent
import fr.publicissapient.planningpoker.ui.fab.AnimatedSpeedDialFloatingActionButton
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
                title = { Text("Retour", textAlign = TextAlign.Center) },
                backgroundColor = MaterialTheme.colors.primary,
                contentColor = MaterialTheme.colors.onPrimary,
                navigationIcon = {
                    IconButton(onClick = onBackClick) {
                        Icon(
                            painter = rememberImagePainter(
                                data = R.drawable.ic_baseline_arrow_back,
                                onExecute = { _, _ -> true },
                                builder = {
                                    crossfade(true)
                                    placeholder(R.drawable.ic_baseline_arrow_back)
                                    transformations(CircleCropTransformation())
                                }
                            ),
                            contentDescription = null
                        )
                    }
                }
            )
        },
        content = {
            BodyWithBlop {
                val cards = CardRepository().allCards(
                    MaterialTheme.colors.secondary,
                    MaterialTheme.colors.onSecondary
                )[cardSuitType]
                cards?.let {
                    CardListContent(cards, navigateToCard)
                } ?: error("Unknown card suit!")
            }
        },
        floatingActionButton = {
            AnimatedSpeedDialFloatingActionButton(onFabDialClick)
        }
    )
}

@Composable
private fun CardListContent(cards: List<Card>, navigateToCard: (String) -> Unit) {
    BoxWithConstraints(
        contentAlignment = Alignment.Center
    ) {
        Column {
            val rows = cards.windowed(3, 3, true)
            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                itemsIndexed(rows) { index, items ->
                    if (index == 0) {
                        Text(
                            text = "Choisissez votre carte",
                            style = MaterialTheme.typography.h1,
                            textAlign = TextAlign.Center,
                            modifier = Modifier.padding(24.dp, 36.dp, 24.dp, 24.dp)
                        )
                    }
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(8f),
                        horizontalArrangement = Arrangement.SpaceEvenly,
                    ) {
                        items.map { card ->
                            CardContent(
                                card = card,
                                width = this@BoxWithConstraints.maxWidth * .28f
                            ) {
                                navigateToCard(card.name)
                            }
                        }
                    }
                    val lastRow = index == rows.size - 1
                    if (lastRow) {
                        Spacer(modifier = Modifier.height(64.dp))
                    } else {
                        Spacer(modifier = Modifier.height(16.dp))
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun CardListScreenPreview() {
    PlanningPokerTheme {
        CardListScreen(cardSuitType = CardSuitType.Fibonacci) {}
    }
}