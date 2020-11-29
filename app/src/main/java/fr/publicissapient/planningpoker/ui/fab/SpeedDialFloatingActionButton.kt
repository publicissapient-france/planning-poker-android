package fr.publicissapient.planningpoker.ui.fab

import androidx.compose.animation.ColorPropKey
import androidx.compose.animation.DpPropKey
import androidx.compose.animation.core.FloatPropKey
import androidx.compose.animation.core.TransitionState
import androidx.compose.animation.core.transitionDefinition
import androidx.compose.animation.core.tween
import androidx.compose.animation.transition
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Colors
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import fr.publicissapient.planningpoker.R
import fr.publicissapient.planningpoker.ui.theme.*

val sizeState = FloatPropKey()
val colorState = ColorPropKey()
val paddingState = DpPropKey()

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
        alignment = Alignment.BottomEnd
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
            style = MaterialTheme.typography.body2,
            color = state[colorState]
        )
        FloatingSpeedDialColor(
            tint = primaryGreen,
            onClick = {
                onFabDialClick(GreenThemeColors)
            },
            modifier = Modifier.padding(
                bottom = state[paddingState] + delta * 3
            )
        )
        FloatingSpeedDialColor(
            tint = primaryYellow,
            onClick = {
                onFabDialClick(YellowThemeColors)
            },
            modifier = Modifier.padding(
                bottom = state[paddingState] + delta * 2
            )
        )
        FloatingSpeedDialColor(
            tint = primaryBlue,
            onClick = {
                onFabDialClick(BlueThemeColors)
            },
            modifier = Modifier.padding(
                bottom = state[paddingState] + delta
            )
        )
        FloatingSpeedDialColor(
            tint = primaryRed,
            onClick = {
                onFabDialClick(RedThemeColors)
            },
            modifier = Modifier.padding(
                bottom = state[paddingState]
            )
        )
        FloatingActionButton(
            onClick = {
                onFabClick()
            },
            icon = {
                Image(
                    asset = imageResource(id = R.drawable.ic_fab),
                    contentScale = ContentScale.Fit,
                    modifier = Modifier.height(32.dp).width(32.dp)
                )
            },
            backgroundColor = MaterialTheme.colors.primary,
        )
    }
}

@Composable
private fun FloatingSpeedDialColor(
    tint: Color,
    onClick: () -> Unit = {},
    modifier: Modifier = Modifier
) {
    FloatingActionButton(
        onClick = onClick,
        icon = {
            Icon(asset = vectorResource(id = R.drawable.ic_fab_dial), tint = tint)
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