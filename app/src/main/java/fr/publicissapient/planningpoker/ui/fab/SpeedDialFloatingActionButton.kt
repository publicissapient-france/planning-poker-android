package fr.publicissapient.planningpoker.ui.fab

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.ConstraintLayout
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.Colors
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import fr.publicissapient.planningpoker.R
import fr.publicissapient.planningpoker.ui.theme.*

@Composable
fun SpeedDialFloatingActionButton(
    onFabDialClick: (colors: Colors) -> Unit = {}
) {
    val visibility = remember { mutableStateListOf(false, false, false, false) }
    val onFabClick = {
        visibility[0] = !visibility[0]
        visibility[1] = !visibility[1]
        visibility[2] = !visibility[2]
        visibility[3] = !visibility[3]
    }
    SpeedDialFloatingButtonContent(
        visibility = visibility,
        onFabDialClick = {
            onFabDialClick(it)
            onFabClick()
        },
        onFabClick = onFabClick
    )
}

@Composable
private fun SpeedDialFloatingButtonContent(
    visibility: SnapshotStateList<Boolean>,
    onFabDialClick: (colors: Colors) -> Unit,
    onFabClick: () -> Unit
) {
    ConstraintLayout {
        val (dialGreen, dialYellow, dialBlue, dialRed, fab) = createRefs()
        FloatingActionButton(
            onClick = onFabClick,
            icon = {
                Image(
                    asset = imageResource(id = R.drawable.ic_fab),
                    contentScale = ContentScale.Fit,
                    modifier = Modifier.height(32.dp).width(32.dp)
                )
            },
            backgroundColor = MaterialTheme.colors.primary,
            modifier = Modifier.constrainAs(fab) {
                bottom.linkTo(parent.bottom)
            }
        )
        FloatingSpeedDialColor(
            tint = primaryGreen,
            onClick = {
                onFabDialClick(GreenThemeColors)
            },
            visible = visibility[3],
            modifier = Modifier.constrainAs(dialGreen) {
                bottom.linkTo(dialYellow.top, margin = 8.dp)
                start.linkTo(fab.start)
                end.linkTo(fab.end)
            }
        )
        FloatingSpeedDialColor(
            tint = primaryYellow,
            onClick = {
                onFabDialClick(YellowThemeColors)
            },
            visible = visibility[2],
            modifier = Modifier.constrainAs(dialYellow) {
                bottom.linkTo(dialBlue.top, margin = 8.dp)
                start.linkTo(fab.start)
                end.linkTo(fab.end)
            }
        )
        FloatingSpeedDialColor(
            tint = primaryBlue,
            onClick = {
                onFabDialClick(BlueThemeColors)
            },
            visible = visibility[1],
            modifier = Modifier.constrainAs(dialBlue) {
                bottom.linkTo(dialRed.top, margin = 8.dp)
                start.linkTo(fab.start)
                end.linkTo(fab.end)
            }
        )
        FloatingSpeedDialColor(
            tint = primaryRed,
            onClick = {
                onFabDialClick(RedThemeColors)
            },
            visible = visibility[0],
            modifier = Modifier.constrainAs(dialRed) {
                bottom.linkTo(fab.top, margin = 8.dp)
                start.linkTo(fab.start)
                end.linkTo(fab.end)
            }
        )
    }
}

@Composable
private fun FloatingSpeedDialColor(
    tint: Color,
    onClick: () -> Unit = {},
    visible: Boolean = true,
    modifier: Modifier
) {
    if (visible) {
        FloatingActionButton(
            onClick = onClick,
            icon = {
                Icon(asset = vectorResource(id = R.drawable.ic_fab_dial), tint = tint)
            },
            backgroundColor = MaterialTheme.colors.primary,
            modifier = modifier.width(35.dp).height(35.dp)
        )
    }
}

@Preview
@Composable
fun SpeedDialFloatingActionButtonPreview() {
    PlanningPokerTheme {
        SpeedDialFloatingButtonContent(
            visibility = mutableStateListOf(true, true, true, true),
            onFabDialClick = {},
            onFabClick = {}
        )
    }
}