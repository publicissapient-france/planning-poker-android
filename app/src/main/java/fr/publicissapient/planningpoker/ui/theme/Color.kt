package fr.publicissapient.planningpoker.ui.theme

import androidx.compose.ui.graphics.Color
import fr.publicissapient.planningpoker.model.CardSuitColor

val primaryRed = Color(0xFFE50040)

private val themeRed = primaryRed
private val themeBlue = Color(0xFF079FFF)
private val themeGreen = Color(0xFF00E6C3)
private val themeYellow = Color(0xFFFFE63B)

fun CardSuitColor.getThemeColor(): Color = when (this) {
    CardSuitColor.RED -> themeRed
    CardSuitColor.BLUE -> themeBlue
    CardSuitColor.GREEN -> themeGreen
    CardSuitColor.YELLOW -> themeYellow
}