package fr.publicissapient.planningpoker.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val RedThemeColors = lightColors(
    primary = primaryRed,
    primaryVariant = primaryRed,
    onPrimary = Color.White,
    secondary = primaryRed,
    secondaryVariant = primaryRed,
    onSecondary = Color.White
)

@Composable
fun PlanningPokerTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colors = RedThemeColors,
        typography = planningPokerTypography,
        content = content
    )
}