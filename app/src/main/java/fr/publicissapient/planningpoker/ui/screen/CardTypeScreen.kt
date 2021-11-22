package fr.publicissapient.planningpoker.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.google.accompanist.insets.LocalWindowInsets
import com.google.accompanist.insets.navigationBarsPadding
import com.google.accompanist.insets.rememberInsetsPaddingValues
import fr.publicissapient.planningpoker.data.CardRepository
import fr.publicissapient.planningpoker.model.CardSuitType
import fr.publicissapient.planningpoker.model.CardSuitType.Fibonacci
import fr.publicissapient.planningpoker.model.CardSuitType.TShirt
import fr.publicissapient.planningpoker.ui.body.BodyWithBlop
import fr.publicissapient.planningpoker.ui.card.CardContent
import fr.publicissapient.planningpoker.ui.fab.AnimatedSpeedDialFloatingActionButton
import fr.publicissapient.planningpoker.ui.theme.PlanningPokerTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CardTypeScreen(
    navigateToList: (CardSuitType) -> Unit = {},
    onFabDialClick: (colors: ColorScheme) -> Unit = {}
) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text("Planning Poker", textAlign = TextAlign.Center)
                },
                modifier = Modifier.padding(
                    rememberInsetsPaddingValues(
                        LocalWindowInsets.current.systemBars,
                        applyBottom = false
                    )
                )
            )
        },
        floatingActionButton = {
            AnimatedSpeedDialFloatingActionButton(
                modifier = Modifier.navigationBarsPadding(),
                onFabDialClick = onFabDialClick
            )
        }) { contentPadding ->
        BodyWithBlop {
            CardTypeScreenContent(contentPadding, navigateToList)
        }
    }
}

@Composable
private fun CardTypeScreenContent(
    contentPadding: PaddingValues,
    navigateToList: (CardSuitType) -> Unit
) =
    BoxWithConstraints(
        contentAlignment = Alignment.Center,
        modifier = Modifier.padding(contentPadding)
    ) {
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceAround
        ) {
            Spacer(modifier = Modifier.weight(1f))
            Text(
                text = "Choisissez votre jeu",
                color = MaterialTheme.colorScheme.onBackground,
                style = MaterialTheme.typography.headlineLarge,
                textAlign = TextAlign.Center,
                modifier = Modifier.weight(1f)
            )
            Spacer(modifier = Modifier.weight(1f))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(8f),
                horizontalArrangement = Arrangement.SpaceEvenly,
            ) {
                val choiceCards = CardRepository().choiceCards(
                    MaterialTheme.colorScheme.secondary
                )
                choiceCards[Fibonacci]?.let { fiboChoiceCard ->
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        CardContent(
                            card = fiboChoiceCard,
                            width = this@BoxWithConstraints.maxWidth * .4f
                        ) { navigateToList(Fibonacci) }
                        Spacer(modifier = Modifier.height(16.dp))
                        Text(text = "FIBONACCI", style = MaterialTheme.typography.bodyMedium)
                    }
                }
                choiceCards[TShirt]?.let { tshirtChoiceCard ->
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        CardContent(
                            card = tshirtChoiceCard,
                            width = this@BoxWithConstraints.maxWidth * .4f
                        ) { navigateToList(TShirt) }
                        Spacer(modifier = Modifier.height(16.dp))
                        Text(text = "TSHIRT", style = MaterialTheme.typography.bodyMedium)
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
