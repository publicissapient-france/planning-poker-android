package fr.publicissapient.planningpoker.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.font
import androidx.compose.ui.text.font.fontFamily
import androidx.compose.ui.unit.sp
import fr.publicissapient.planningpoker.R

private val futuraNextFontFamily = fontFamily(
    font(R.font.futura_next_medium),
    font(R.font.futura_next_bold, FontWeight.Bold)
)

val planningPokerTypography = Typography(
    defaultFontFamily = futuraNextFontFamily,
    h1 = TextStyle(
        fontSize = 22.sp,
        fontWeight = FontWeight.Bold,
    ),
    body2 = TextStyle(
        fontSize = 5.sp,
    )
)

