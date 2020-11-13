package fr.publicissapient.planningpoker.ui.screen

import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.style.TextAlign
import androidx.ui.tooling.preview.Preview
import fr.publicissapient.planningpoker.R
import fr.publicissapient.planningpoker.data.CardRepository
import fr.publicissapient.planningpoker.model.Card
import fr.publicissapient.planningpoker.model.CardSuitType
import fr.publicissapient.planningpoker.ui.body.BodyWithBlop
import fr.publicissapient.planningpoker.ui.card.CardBackSideContent
import fr.publicissapient.planningpoker.ui.card.CardContent
import fr.publicissapient.planningpoker.ui.theme.PlanningPokerTheme

@Composable
fun CardScreen(
    cardSuit: CardSuitType,
    cardId: String,
    onBackClick: () -> Unit = {},
    isFaceUp: Boolean = false,
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Retour", textAlign = TextAlign.Center) },
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
            BodyWithBlop {
                val cards = CardRepository().allCards(
                    MaterialTheme.colors.primary,
                    MaterialTheme.colors.secondary
                )[cardSuit]
                cards?.let {
                    it.find { card ->
                        card.name == cardId
                    }?.let { card ->
                        CardScreenContent(card, isFaceUp)
                    } ?: error("Cannot find card")
                } ?: error("Cannot find suit $cardSuit")
            }
        }
    )
}

@Composable
fun CardScreenContent(card: Card, faceUp: Boolean) {
    val isFaceUp = remember { mutableStateOf(faceUp) }
    Box(
        modifier = Modifier.fillMaxSize(),
        alignment = Alignment.Center,
    ) {
        val toggleVisibility = {
            isFaceUp.value = !isFaceUp.value
        }
        if (isFaceUp.value) {
            CardContent(
                card = card,
                onClick = toggleVisibility
            )
        } else {
            CardBackSideContent(
                onClick = toggleVisibility
            )
        }
    }
}

@Preview
@Composable
fun CardScreenPreview() {
    PlanningPokerTheme {
        CardScreen(
            cardSuit = CardSuitType.Fibonacci,
            cardId = "fib0"
        )
    }
}