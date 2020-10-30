package fr.publicissapient.planningpoker.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.font
import androidx.compose.ui.text.font.fontFamily
import fr.publicissapient.planningpoker.R

private val futuraNextFontFamily = fontFamily(
    font(R.font.futura_next_medium),
    font(R.font.futura_next_bold, FontWeight.Bold)
)

val planningPokerTypography = Typography(
    defaultFontFamily = futuraNextFontFamily
)
