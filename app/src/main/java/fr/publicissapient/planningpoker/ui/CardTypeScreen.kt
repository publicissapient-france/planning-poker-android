package fr.publicissapient.planningpoker.ui

import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import fr.publicissapient.planningpoker.model.CardSuitType
import fr.publicissapient.planningpoker.model.CardSuitType.Fibonacci
import fr.publicissapient.planningpoker.model.CardSuitType.TShirt
import fr.publicissapient.planningpoker.ui.theme.PlanningPokerTheme

@Composable
fun CardTypeScreen(
    navigateToList: (CardSuitType) -> Unit,
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Planning Poker", textAlign = TextAlign.Center) },
                backgroundColor = Color.Black,
                contentColor = Color.White
            )
        },
        bodyContent = {
            Column(
                modifier = Modifier.fillMaxHeight().fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Choose your game",
                    style = MaterialTheme.typography.h3,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(0.dp, 64.dp, 0.dp, 24.dp)
                )
                Button(
                    modifier = Modifier.padding(8.dp),
                    onClick = {
                        navigateToList(Fibonacci)
                    }
                ) {
                    Text(
                        text = "Fibonacci",
                        color = Color.White
                    )
                }
                Button(
                    modifier = Modifier.padding(8.dp),
                    onClick = {
                        navigateToList(TShirt)
                    }
                ) {
                    Text(
                        text = "T-shirt",
                        color = Color.White
                    )
                }
            }
        }
    )
}

@Composable
@Preview
fun CardTypeScreenPreview() {
    PlanningPokerTheme {
        CardTypeScreen({})
    }
}