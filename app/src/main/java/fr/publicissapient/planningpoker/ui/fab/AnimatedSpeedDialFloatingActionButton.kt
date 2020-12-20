package fr.publicissapient.planningpoker.ui.fab

import androidx.compose.animation.ColorPropKey
import androidx.compose.animation.DpPropKey
import androidx.compose.animation.core.FloatPropKey
import androidx.compose.animation.core.TransitionState
import androidx.compose.animation.core.transitionDefinition
import androidx.compose.animation.core.tween
import androidx.compose.animation.transition
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.chrisbanes.accompanist.coil.CoilImage
import fr.publicissapient.planningpoker.R
import fr.publicissapient.planningpoker.ui.theme.*

val sizeState = FloatPropKey(label = "sizeState")
val colorState = ColorPropKey(label = "colorState")
val paddingState = DpPropKey(label = "paddingState")

enum class FabState {
    IDLE, EXPLODED
}

val fabExplosionTransitionDefinition = transitionDefinition<FabState> {
    state(FabState.IDLE) {
        this[sizeState] = 0f
        this[colorState] = Color.Transparent
        this[paddingState] = 10.dp
    }
    state(FabState.EXPLODED) {
        this[sizeState] = 4000f
        this[colorState] = Color.Black
        this[paddingState] = 75.dp
    }
    transition(fromState = FabState.IDLE, toState = FabState.EXPLODED) {
        sizeState using tween(500)
        colorState using tween(500)
        paddingState using tween(500)
    }
}

@Composable
fun AnimatedSpeedDialFloatingActionButton(
    onFabDialClick: (colors: Colors) -> Unit = {}
) {
    val animatingFab = remember { mutableStateOf(false) }
    val state = transition(
        definition = fabExplosionTransitionDefinition,
        initState = FabState.IDLE,
        toState = if (!animatingFab.value) {
            FabState.IDLE
        } else {
            FabState.EXPLODED
        }
    )
    val onFabClick = {
        animatingFab.value = !animatingFab.value
    }
    AnimatedSpeedDialFloatingButtonContent(
        state = state,
        onFabClick = {
            onFabClick()
        },
        onFabDialClick = {
            onFabClick()
            onFabDialClick(it)
        },
    )
}

@Composable
private fun AnimatedSpeedDialFloatingButtonContent(
    state: TransitionState,
    onFabClick: () -> Unit,
    onFabDialClick: (colors: Colors) -> Unit,
) {
    Box(
        contentAlignment = Alignment.BottomEnd
    ) {
        val delta = (state[paddingState] - 10.dp) * .8f
        Canvas(
            modifier = Modifier.padding(28.dp)
        ) {
            drawCircle(Color(0xF2FFFFFF), state[sizeState])
        }
        Text(
            text = "Choisissez votre couleur",
            modifier = Modifier.padding(
                end = 68.dp,
                bottom = 16.dp
            ),
            color = state[colorState],
            style = MaterialTheme.typography.body2
        )
        FloatingSpeedDialColor(
            modifier = Modifier.padding(
                bottom = state[paddingState] + delta * 3
            ),
            tint = primaryGreen
        ) {
            onFabDialClick(GreenThemeColors)
        }
        FloatingSpeedDialColor(
            modifier = Modifier.padding(
                bottom = state[paddingState] + delta * 2
            ),
            tint = primaryYellow
        ) {
            onFabDialClick(YellowThemeColors)
        }
        FloatingSpeedDialColor(
            modifier = Modifier.padding(
                bottom = state[paddingState] + delta
            ),
            tint = primaryBlue
        ) {
            onFabDialClick(BlueThemeColors)
        }
        FloatingSpeedDialColor(
            modifier = Modifier.padding(
                bottom = state[paddingState]
            ),
            tint = primaryRed
        ) {
            onFabDialClick(RedThemeColors)
        }
        FloatingActionButton(
            onClick = {
                onFabClick()
            },
            content = {
                CoilImage(
                    R.drawable.ic_fab,
                    contentScale = ContentScale.Fit,
                    modifier = Modifier.size(32.dp)
                )
            },
            backgroundColor = MaterialTheme.colors.primary,
        )
    }
}

@Composable
private fun FloatingSpeedDialColor(
    modifier: Modifier = Modifier,
    tint: Color,
    onClick: () -> Unit = {}
) {
    FloatingActionButton(
        onClick = onClick,
        content = {
            Icon(imageVector = vectorResource(id = R.drawable.ic_fab_dial), tint = tint)
        },
        backgroundColor = MaterialTheme.colors.primary,
        modifier = modifier.padding(end = 10.dp).width(35.dp).height(35.dp)
    )
}

@Preview
@Composable
fun SpeedDialFloatingActionButtonPreview() {
    PlanningPokerTheme {
        AnimatedSpeedDialFloatingButtonContent(
            onFabDialClick = {},
            onFabClick = {},
            state = transition(
                definition = fabExplosionTransitionDefinition,
                initState = FabState.IDLE,
                toState = FabState.IDLE
            )
        )
    }
}