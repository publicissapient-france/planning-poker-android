package planningpoker.compose.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import fr.publicissapient.planningpoker.common.compose.R

private val futuraNextFontFamily = FontFamily(
    Font(R.font.futura_next_medium),
    Font(R.font.futura_next_bold, FontWeight.Bold)
)

val planningPokerTypography = Typography(
    displayLarge = TextStyle(
        fontFamily = futuraNextFontFamily,
        fontSize = 22.sp,
        fontWeight = FontWeight.Bold,
    ),
    bodyMedium = TextStyle(
        fontFamily = futuraNextFontFamily,
        fontSize = 14.sp,
    )
)

