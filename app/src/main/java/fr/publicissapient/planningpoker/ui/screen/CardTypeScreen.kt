package fr.publicissapient.planningpoker.ui.screen

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.WithConstraints
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fr.publicissapient.planningpoker.data.CardRepository
import fr.publicissapient.planningpoker.model.CardSuitType
import fr.publicissapient.planningpoker.model.CardSuitType.Fibonacci
import fr.publicissapient.planningpoker.model.CardSuitType.TShirt
import fr.publicissapient.planningpoker.ui.body.BodyWithBlop
import fr.publicissapient.planningpoker.ui.card.CardContent
import fr.publicissapient.planningpoker.ui.fab.AnimatedSpeedDialFloatingActionButton
import fr.publicissapient.planningpoker.ui.theme.PlanningPokerTheme

@Composable
fun CardTypeScreen(
    navigateToList: (CardSuitType) -> Unit = {},
    onFabDialClick: (colors: Colors) -> Unit = {}
) = Scaffold(
    topBar = {
        TopAppBar(
            title = { Text("Planning Poker", textAlign = TextAlign.Center) },
            backgroundColor = MaterialTheme.colors.primary,
            contentColor = MaterialTheme.colors.onPrimary,
        )
    },
    bodyContent = {
        BodyWithBlop {
            CardTypeScreenContent(navigateToList)
        }
    },
    floatingActionButton = {
        AnimatedSpeedDialFloatingActionButton(onFabDialClick)
    }
)

@Composable
private fun CardTypeScreenContent(navigateToList: (CardSuitType) -> Unit) =
    WithConstraints {
        Column(
            modifier = Modifier.fillMaxHeight().fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceAround
        ) {
            Spacer(modifier = Modifier.weight(1f))
            Text(
                text = "Choisissez votre jeu",
                style = MaterialTheme.typography.h1,
                textAlign = TextAlign.Center,
                modifier = Modifier.weight(1f)
            )
            Spacer(modifier = Modifier.weight(1f))
            Row(
                modifier = Modifier.fillMaxWidth().weight(8f),
                horizontalArrangement = Arrangement.SpaceEvenly,
            ) {
                val choiceCards = CardRepository().choiceCards(
                    MaterialTheme.colors.secondary
                )
                choiceCards[Fibonacci]?.let { fiboChoiceCard ->
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        CardContent(
                            card = fiboChoiceCard,
                            width = maxWidth * .4f
                        ) { navigateToList(Fibonacci) }
                        Spacer(modifier = Modifier.height(16.dp))
                        Text(text = "FIBONACCI", style = MaterialTheme.typography.body2)
                    }
                }
                choiceCards[TShirt]?.let { tshirtChoiceCard ->
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        CardContent(
                            card = tshirtChoiceCard,
                            width = maxWidth * .4f
                        ) { navigateToList(TShirt) }
                        Spacer(modifier = Modifier.height(16.dp))
                        Text(text = "TSHIRT", style = MaterialTheme.typography.body2)
                    }
                }
            }
        }
    }

@Composable
@Preview
fun CardTypeScreenPreview() {
    PlanningPokerTheme {
        CardTypeScreen()
    }
}