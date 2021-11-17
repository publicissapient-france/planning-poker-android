package fr.publicissapient.planningpoker.ui.fab

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import fr.publicissapient.planningpoker.R
import fr.publicissapient.planningpoker.ui.theme.*

enum class FabState {
    IDLE, EXPLODED
}

@Composable
fun AnimatedSpeedDialFloatingActionButton(
    onFabDialClick: (colors: Colors) -> Unit = {}
) {
    val animatingFab = remember { mutableStateOf(false) }
    val state = if (!animatingFab.value) {
        FabState.IDLE
    } else {
        FabState.EXPLODED
    }
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
    state: FabState,
    onFabClick: () -> Unit,
    onFabDialClick: (colors: Colors) -> Unit,
) {
    val sizeState by animateFloatAsState(
        targetValue = if (state == FabState.IDLE) 0f else 4000f,
        animationSpec = tween(500)
    )
    val paddingState by animateDpAsState(
        targetValue = if (state == FabState.IDLE) 10.dp else 75.dp,
        animationSpec = tween(500)
    )
    val colorState by animateColorAsState(
        targetValue = if (state == FabState.IDLE) Color.Transparent else Color.Black,
        animationSpec = tween(500)
    )
    Box(
        contentAlignment = Alignment.BottomEnd
    ) {
        val delta = (paddingState - 10.dp) * .8f
        Canvas(
            modifier = Modifier.padding(28.dp)
        ) {
            drawCircle(Color(0xF2FFFFFF), sizeState)
        }
        Text(
            text = "Choisissez votre couleur",
            modifier = Modifier.padding(
                end = 68.dp,
                bottom = 16.dp
            ),
            color = colorState,
            style = MaterialTheme.typography.body2
        )
        FloatingSpeedDialColor(
            modifier = Modifier.padding(
                bottom = paddingState + delta * 3
            ),
            tint = primaryGreen
        ) {
            onFabDialClick(GreenThemeColors)
        }
        FloatingSpeedDialColor(
            modifier = Modifier.padding(
                bottom = paddingState + delta * 2
            ),
            tint = primaryYellow
        ) {
            onFabDialClick(YellowThemeColors)
        }
        FloatingSpeedDialColor(
            modifier = Modifier.padding(
                bottom = paddingState + delta
            ),
            tint = primaryBlue
        ) {
            onFabDialClick(BlueThemeColors)
        }
        FloatingSpeedDialColor(
            modifier = Modifier.padding(
                bottom = paddingState
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
                Image(
                    painter = rememberImagePainter(
                        data = R.drawable.ic_fab,
                        onExecute = { _, _ -> true },
                    ),
                    contentDescription = null,
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
            Icon(
                painter = rememberImagePainter(
                    data = R.drawable.ic_fab_dial,
                    onExecute = { _, _ -> true },
                ),
                tint = tint,
                contentDescription = null,
            )
        },
        backgroundColor = MaterialTheme.colors.primary,
        modifier = modifier
            .padding(end = 10.dp)
            .width(35.dp)
            .height(35.dp)
    )
}

@Preview
@Composable
fun SpeedDialFloatingActionButtonPreview() {
    PlanningPokerTheme {
        AnimatedSpeedDialFloatingButtonContent(
            onFabDialClick = {},
            onFabClick = {},
            state = FabState.IDLE,
        )
    }
}