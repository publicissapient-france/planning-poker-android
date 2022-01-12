package fr.publicissapient.planningpoker.model

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.font.FontWeight
import fr.publicissapient.planningpoker.data.fibo0
import fr.publicissapient.planningpoker.data.fibo1
import fr.publicissapient.planningpoker.data.fibo100
import fr.publicissapient.planningpoker.data.fibo13
import fr.publicissapient.planningpoker.data.fibo2
import fr.publicissapient.planningpoker.data.fibo21
import fr.publicissapient.planningpoker.data.fibo3
import fr.publicissapient.planningpoker.data.fibo40
import fr.publicissapient.planningpoker.data.fibo5
import fr.publicissapient.planningpoker.data.fibo8
import fr.publicissapient.planningpoker.data.fiboQuestion

data class Card(
    val name: String,
    val image: ImageVector,
) {

    // TODO-Scott (20 déc. 2021): Imo it should be put somewhere else
    fun getDescription(highLightColor: Color): AnnotatedString {
        val highlightLightSpanStyle = getHighLightSpanStyle(highLightColor)
        return when (name) {
            "0" -> fibo0(highlightLightSpanStyle)
            "1" -> fibo1(highlightLightSpanStyle)
            "2" -> fibo2(highlightLightSpanStyle)
            "3" -> fibo3(highlightLightSpanStyle)
            "5" -> fibo5(highlightLightSpanStyle)
            "8" -> fibo8(highlightLightSpanStyle)
            "13" -> fibo13(highlightLightSpanStyle)
            "21" -> fibo21(highlightLightSpanStyle)
            "40" -> fibo40(highlightLightSpanStyle)
            "100" -> fibo100(highlightLightSpanStyle)
            "?" -> fiboQuestion(highlightLightSpanStyle)
            else -> AnnotatedString.Builder("").toAnnotatedString()
        }
    }

    private fun getHighLightSpanStyle(highLightColor: Color) = SpanStyle(
        color = highLightColor,
        fontWeight = FontWeight.Bold,
        shadow = Shadow(
            color = Color.White,
            offset = Offset(4f, 4f),
            blurRadius = 8f
        )
    )
}
