package planningpoker.compose.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import fr.publicissapient.planningpoker.common.compose.R

private val futuraNextFontFamily = FontFamily(
    Font(R.font.futura_next_medium),
    Font(R.font.futura_next_bold, FontWeight.Bold)
)

val planningPokerTypography = Typography().let { typo ->
    typo.copy(
        displayLarge = typo.displayLarge.copy(
            fontFamily = futuraNextFontFamily,
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
        ),
        displayMedium = typo.displayMedium.copy(
            fontFamily = futuraNextFontFamily,
        ),
        displaySmall = typo.displaySmall.copy(
            fontFamily = futuraNextFontFamily,
        ),
        headlineLarge = typo.headlineLarge.copy(
            fontFamily = futuraNextFontFamily,
        ),
        headlineMedium = typo.headlineMedium.copy(
            fontFamily = futuraNextFontFamily,
        ),
        headlineSmall = typo.headlineSmall.copy(
            fontFamily = futuraNextFontFamily,
        ),
        titleLarge = typo.titleLarge.copy(
            fontFamily = futuraNextFontFamily,
        ),
        titleMedium = typo.titleMedium.copy(
            fontFamily = futuraNextFontFamily,
        ),
        titleSmall = typo.titleSmall.copy(
            fontFamily = futuraNextFontFamily,
        ),
        bodyLarge = typo.bodyLarge.copy(
            fontFamily = futuraNextFontFamily,
            fontWeight = FontWeight.Bold,
            fontSize = 30.sp
        ),
        bodyMedium = typo.bodyMedium.copy(
            fontFamily = futuraNextFontFamily,
            fontSize = 14.sp,
        ),
        bodySmall = typo.bodySmall.copy(
            fontFamily = futuraNextFontFamily,
        ),
        labelLarge = typo.labelLarge.copy(
            fontFamily = futuraNextFontFamily,
        ),
        labelMedium = typo.labelMedium.copy(
            fontFamily = futuraNextFontFamily,
        ),
        labelSmall = typo.labelSmall.copy(
            fontFamily = futuraNextFontFamily,
        )
    )
}

