package planningpoker.compose.theme

import android.os.Build
import androidx.compose.foundation.LocalIndication
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.saveable.Saver
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import planningpoker.compose.theme.ColorMode.Blue
import planningpoker.compose.theme.ColorMode.Dynamic
import planningpoker.compose.theme.ColorMode.Green
import planningpoker.compose.theme.ColorMode.Yellow

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
    theme: Theme = Theme(),
    content: @Composable () -> Unit
) {
    val rippleIndication = rememberRipple()
    val colorScheme = selectColorScheme(theme)
    CompositionLocalProvider(LocalIndication provides rippleIndication) {
        MaterialTheme(
            colorScheme = colorScheme,
            typography = planningPokerTypography,
            content = content
        )
    }
}

@Composable
private fun selectColorScheme(theme: Theme): ColorScheme {
    val darkTheme = isSystemInDarkTheme()
    val isDynamicColor = Build.VERSION.SDK_INT >= Build.VERSION_CODES.S &&
        theme.colorMode == Dynamic
    return when {
        isDynamicColor && darkTheme -> dynamicDarkColorScheme(LocalContext.current)
        isDynamicColor && !darkTheme -> dynamicLightColorScheme(LocalContext.current)
        else -> when (theme.colorMode) {
            Blue -> BlueThemeColors
            Green -> GreenThemeColors
            Yellow -> YellowThemeColors
            else -> RedThemeColors
        }
    }
}

/**
 * Determines what color scheme should be used when viewing the catalog in the Google Material 3
 * theme.
 */
enum class ColorMode(val label: String) {

    Red("Red"),
    Blue("Blue"),
    Yellow("Yellow"),
    Green("Green"),

    /**
     * Build a color scheme from the dynamic colors taken from the Android System.
     *
     * If the dynamic colors are not available, the baseline color scheme will be used as a fallback.
     */
    Dynamic("Dynamic"),
}

data class Theme(val colorMode: ColorMode = Dynamic)

val ThemeSaver =
    Saver<Theme, Map<String, Int>>(
        save = { (colorMode) ->
            mapOf(
                ColorModeKey to colorMode.ordinal,
            )
        },
        restore = { map ->
            Theme(
                colorMode = ColorMode.values()[map.getValue(ColorModeKey)],
            )
        }
    )

private const val ColorModeKey = "colorMode"

val LocalColorSchemeName = compositionLocalOf { "Rouge" }
