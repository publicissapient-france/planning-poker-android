package fr.publicissapient.planningpoker.ui.screen

import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import coil.compose.rememberImagePainter
import coil.transform.CircleCropTransformation
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
                )[cardSuit]
                cards?.let {
                    it.find { (cardName) ->
                        cardName == cardId
                    }?.let { card ->
                        CardScreenContent(card)
                    } ?: error("Cannot find card")
                } ?: error("Cannot find suit $cardSuit")
            }
        }
    )
}

@Composable
fun CardScreenContent(card: Card) {
    BoxWithConstraints(
        contentAlignment = Alignment.Center
    ) {
        val width = maxWidth * .85f
        var cardFace by remember {
            mutableStateOf(CardFace.Back)
        }

        FlipCard(
            cardFace,
            onFlip = {
                cardFace = cardFace.next
            },
            backSide = {
                CardBackSideContent(
                    width = width
                )
            },
            frontSide = {
                CardContent(
                    card = card,
                    width = width
                )
            }
        )
    }
}

@Composable
fun FlipCard(
    cardFace: CardFace,
    onFlip: (CardFace) -> Unit,
    modifier: Modifier = Modifier,
    backSide: @Composable () -> Unit,
    frontSide: @Composable () -> Unit,
) {
    val rotation = animateFloatAsState(
        targetValue = cardFace.angle,
        animationSpec = tween(
            durationMillis = 400,
            easing = FastOutSlowInEasing,
        )
    )
    Box(
        modifier = modifier
            .graphicsLayer {
                rotationY = rotation.value
                cameraDistance = 12f * density
            }
            .fillMaxSize()
            .clickable(onClick = { onFlip(cardFace) }),
        contentAlignment = Alignment.Center
    ) {
        if (rotation.value <= 90f) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                frontSide()
            }
        } else {
            Box(
                Modifier
                    .fillMaxSize()
                    .graphicsLayer(rotationY = 180f),
                contentAlignment = Alignment.Center,
            ) {
                backSide()
            }
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

enum class CardFace(val angle: Float) {
    Front(0f) {
        override val next: CardFace
            get() = Back
    },
    Back(180f) {
        override val next: CardFace
            get() = Front
    };

    abstract val next: CardFace
}