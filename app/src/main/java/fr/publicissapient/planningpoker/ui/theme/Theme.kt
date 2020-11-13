package fr.publicissapient.planningpoker.ui.theme

import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.graphics.Color

val RedThemeColors = lightColors(
    primary = Color.Black,
    secondary = primaryRed,
    secondaryVariant = primaryRedVariant,
    onPrimary = Color.White,
    onSecondary = Color.White
)

val BlueThemeColors = lightColors(
    primary = Color.Black,
    secondary = primaryBlue,
    secondaryVariant = primaryBlueVariant,
    onPrimary = Color.White,
    onSecondary = Color.White
)

val YellowThemeColors = lightColors(
    primary = Color.Black,
    secondary = primaryYellow,
    secondaryVariant = primaryYellowVariant,
    onPrimary = Color.White,
    onSecondary = onSecondaryYellow
)

val GreenThemeColors = lightColors(
    primary = Color.Black,
    secondary = primaryGreen,
    secondaryVariant = primaryGreenVariant,
    onPrimary = Color.White,
    onSecondary = Color.White
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