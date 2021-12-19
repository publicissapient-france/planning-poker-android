package planningpoker.compose.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext

val RedThemeColors = lightColorScheme(
    primary = primaryRed,
    secondary = primaryRed,
    secondaryContainer = primaryRedVariant,
    onSecondaryContainer = onPrimaryRedVariant,
    onPrimary = Color.White,
    onSecondary = Color.White
)

val BlueThemeColors = lightColorScheme(
    primary = primaryBlue,
    secondary = primaryBlue,
    secondaryContainer = primaryBlueVariant,
    onSecondaryContainer = primaryBlueVariant,
    onPrimary = Color.White,
    onSecondary = Color.White
)

val YellowThemeColors = lightColorScheme(
    primary = primaryYellow,
    secondary = primaryYellow,
    secondaryContainer = primaryYellowVariant,
    onSecondaryContainer = primaryYellowVariant,
    onPrimary = Color.White,
    onSecondary = onSecondaryYellow
)

val GreenThemeColors = lightColorScheme(
    primary = primaryGreen,
    secondary = primaryGreen,
    secondaryContainer = primaryGreenVariant,
    onSecondaryContainer = primaryGreenVariant,
    onPrimary = Color.White,
    onSecondary = Color.White
)

@Composable
fun PlanningPokerTheme(
    colors: ColorScheme? = null,
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = colorScheme(colors),
        typography = planningPokerTypography,
        content = content
    )
}

@Composable
fun PlanningPokerMultipleColorsTheme(
    currentColors: MutableState<ColorScheme?>,
    content: @Composable () -> Unit
) {
    PlanningPokerTheme(colors = currentColors.value) {
        content()
    }
}

@Composable
private fun colorScheme(
    colors: ColorScheme? = null
): ColorScheme {
    val darkTheme = isSystemInDarkTheme()
    val dynamicColor = Build.VERSION.SDK_INT >= Build.VERSION_CODES.S
    val defaultColorScheme = colors ?: RedThemeColors
    return when {
        dynamicColor && darkTheme && colors == null -> dynamicDarkColorScheme(LocalContext.current)
        dynamicColor && !darkTheme && colors == null -> dynamicLightColorScheme(LocalContext.current)
        darkTheme -> defaultColorScheme
        else -> defaultColorScheme
    }
}
