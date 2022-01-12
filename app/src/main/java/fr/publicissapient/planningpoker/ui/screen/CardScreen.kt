package fr.publicissapient.planningpoker.ui.screen

import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.google.accompanist.insets.LocalWindowInsets
import com.google.accompanist.insets.navigationBarsPadding
import com.google.accompanist.insets.rememberInsetsPaddingValues
import fr.publicissapient.planningpoker.R
import fr.publicissapient.planningpoker.data.CardRepository
import fr.publicissapient.planningpoker.model.Card
import fr.publicissapient.planningpoker.model.CardSuitType
import fr.publicissapient.planningpoker.model.CardSuitType.Fibonacci
import fr.publicissapient.planningpoker.ui.body.BodyWithBlop
import fr.publicissapient.planningpoker.ui.card.CardBackSideContent
import fr.publicissapient.planningpoker.ui.card.CardContent
import planningpoker.compose.theme.PlanningPokerTheme
import planningpoker.compose.toolbars.SmallTopAppBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CardScreen(
    cardSuit: CardSuitType,
    cardId: String,
    onBackClick: () -> Unit = {},
) {
    Scaffold(
        topBar = {
            SmallTopAppBar(
                contentPadding = rememberInsetsPaddingValues(
                    LocalWindowInsets.current.statusBars,
                    applyBottom = false,
                ),
                navigationIcon = {
                    IconButton(onClick = onBackClick) {
                        Icon(
                            Icons.Default.ArrowBack,
                            contentDescription = stringResource(R.string.a11y_navigate_up)
                        )
                    }
                }
            )
        },
        content = {
            BodyWithBlop {
                val cards = CardRepository.allCards()[cardSuit]
                requireNotNull(cards) { "Cannot find suit $cardSuit" }
                val selectedCard = cards.find { (cardName) ->
                    cardName == cardId
                }
                requireNotNull(selectedCard) { "Cannot find card $cardId in suit ${cardSuit.type}" }
                CardScreenContent(selectedCard)
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
        val onFlip = {
            cardFace = cardFace.next
        }

        FlipCard(
            cardFace,
            backSide = {
                CardBackSideContent(
                    modifier = Modifier.navigationBarsPadding(),
                    width = width,
                    onClick = { onFlip() }
                )
            },
            frontSide = {
                CardContent(
                    card = card,
                    modifier = Modifier.navigationBarsPadding(),
                    width = width,
                    onClick = { onFlip() }
                )
            }
        )
    }
}

@Composable
fun FlipCard(
    cardFace: CardFace,
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
            .fillMaxSize(),
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
            cardSuit = Fibonacci,
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
