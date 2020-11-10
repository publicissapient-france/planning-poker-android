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
    onPrimary = Color.Black,
    onSecondary = Color.White
)

val BlueThemeColors = lightColors(
    primary = primaryBlue,
    primaryVariant = primaryBlueVariant,
    onPrimary = Color.Black,
    onSecondary = Color.White
)

val YellowThemeColors = lightColors(
    primary = primaryYellow,
    primaryVariant = primaryYellowVariant,
    onPrimary = Color.Black,
)

val GreenThemeColors = lightColors(
    primary = primaryGreen,
    primaryVariant = primaryGreenVariant,
    onPrimary = Color.Black,
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