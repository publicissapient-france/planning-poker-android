package fr.publicissapient.planningpoker.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import fr.publicissapient.planningpoker.R

private val futuraNextFontFamily = FontFamily(
    Font(R.font.futura_next_medium),
    Font(R.font.futura_next_bold, FontWeight.Bold)
)

val planningPokerTypography = Typography(
    defaultFontFamily = futuraNextFontFamily,
    h1 = TextStyle(
        fontSize = 22.sp,
        fontWeight = FontWeight.Bold,
    ),
    body2 = TextStyle(
        fontSize = 14.sp,
    )
)

