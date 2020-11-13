package fr.publicissapient.planningpoker.ui.theme

import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.graphics.Color

val RedThemeColors = lightColors(
    primary = primaryRed,
    primaryVariant = primaryRedVariant,
    secondary = Color.White,
    onSurface = Color.White,
    onPrimary = Color.Black
)

val BlueThemeColors = lightColors(
    primary = primaryBlue,
    primaryVariant = primaryBlueVariant,
    secondary = Color.White,
    onSurface = Color.White,
    onPrimary = Color.Black
)

val YellowThemeColors = lightColors(
    primary = primaryYellow,
    primaryVariant = primaryYellowVariant,
    secondary = secondaryYellow,
    onSurface = Color.Black,
    onPrimary = Color.Black,
)

val GreenThemeColors = lightColors(
    primary = primaryGreen,
    primaryVariant = primaryGreenVariant,
    secondary = Color.White,
    onSurface = Color.White,
    onPrimary = Color.Black,
)

@Composable
fun PlanningPokerTheme(
    colors: Colors = RedThemeColors,
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colors = colors,
        typography = planningPokerTypography,
        content = content
    )
}

@Composable
fun PlanningPokerMultipleColorsTheme(
    currentColors: MutableState<Colors>,
    content: @Composable () -> Unit
) {
    PlanningPokerTheme(colors = currentColors.value) {
        content()
    }
}