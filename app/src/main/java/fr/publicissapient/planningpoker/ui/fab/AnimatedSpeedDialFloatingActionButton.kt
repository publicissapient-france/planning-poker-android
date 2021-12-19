package fr.publicissapient.planningpoker.ui.fab

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import fr.publicissapient.planningpoker.R
import fr.publicissapient.planningpoker.ui.fab.FabState.IDLE
import planningpoker.compose.illustrations.FabDial
import planningpoker.compose.illustrations.Illu
import planningpoker.compose.theme.BlueThemeColors
import planningpoker.compose.theme.GreenThemeColors
import planningpoker.compose.theme.PlanningPokerTheme
import planningpoker.compose.theme.RedThemeColors
import planningpoker.compose.theme.YellowThemeColors
import planningpoker.compose.theme.primaryBlue
import planningpoker.compose.theme.primaryGreen
import planningpoker.compose.theme.primaryRed
import planningpoker.compose.theme.primaryYellow

enum class FabState {
    IDLE, EXPLODED
}

@Composable
fun AnimatedSpeedDialFloatingActionButton(
    modifier: Modifier = Modifier,
    onFabDialClick: (colors: ColorScheme) -> Unit = {}
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
        modifier,
        onFabClick = {
            onFabClick()
        },
    ) {
        onFabClick()
        onFabDialClick(it)
    }
}

@Composable
private fun AnimatedSpeedDialFloatingButtonContent(
    state: FabState,
    modifier: Modifier = Modifier,
    onFabClick: () -> Unit,
    onFabDialClick: (colors: ColorScheme) -> Unit,
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
        modifier = modifier,
        contentAlignment = Alignment.BottomEnd,
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
            style = MaterialTheme.typography.bodyMedium
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
            containerColor = MaterialTheme.colorScheme.primary,
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
                painter = rememberVectorPainter(Illu.FabDial),
                tint = tint,
                contentDescription = null,
            )
        },
        containerColor = MaterialTheme.colorScheme.primary,
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
            state = IDLE,
            onFabClick = {},
        ) {}
    }
}