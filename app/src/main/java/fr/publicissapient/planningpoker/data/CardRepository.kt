package fr.publicissapient.planningpoker.data

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.font.FontWeight
import fr.publicissapient.planningpoker.R
import fr.publicissapient.planningpoker.model.Card
import fr.publicissapient.planningpoker.model.CardSuitType.*
import planningpoker.compose.illustrations.Illu
import planningpoker.compose.illustrations.One
import planningpoker.compose.illustrations.Three
import planningpoker.compose.illustrations.Two
import planningpoker.compose.illustrations.Zero
import planningpoker.compose.illustrations.fibonacci.Eight
import planningpoker.compose.illustrations.fibonacci.Five
import planningpoker.compose.illustrations.fibonacci.Forty
import planningpoker.compose.illustrations.fibonacci.Hundred
import planningpoker.compose.illustrations.fibonacci.Thirteen
import planningpoker.compose.illustrations.fibonacci.TwentyOne
import planningpoker.compose.illustrations.tshirt.L
import planningpoker.compose.illustrations.tshirt.M
import planningpoker.compose.illustrations.tshirt.Question
import planningpoker.compose.illustrations.tshirt.S
import planningpoker.compose.illustrations.tshirt.Xl
import planningpoker.compose.illustrations.tshirt.Xs

object CardRepository {

    @Composable
    fun allCards(highLightColor: Color) = mapOf(
        Fibonacci to listOf(
            "0",
            "1",
            "2",
            "3",
            "5",
            "8",
            "13",
            "21",
            "40",
            "100",
            "?"
        ).map { name ->
            Card(name, getCardImage(name), getDescription(highLightColor, name))
        },
        TShirt to listOf(
            "xs",
            "s",
            "m",
            "l",
            "xl",
            "?"
        ).map { name ->
            Card(name, getCardImage(name))
        },
        Choice to listOf()
    )


    @Composable
    fun choiceCards() = mapOf(
        Fibonacci to Card("", getCardImage("fibo")),
        TShirt to Card("", getCardImage("tshirt"))
    )

    @Composable
    fun getCardImage(name: String): ImageVector = when (name) {
        "0" -> Illu.Cards.Zero
        "1" -> Illu.Cards.One
        "2" -> Illu.Cards.Two
        "3" -> Illu.Cards.Three
        "5" -> Illu.Cards.Five
        "8" -> Illu.Cards.Eight
        "13" -> Illu.Cards.Thirteen
        "21" -> Illu.Cards.TwentyOne
        "40" -> Illu.Cards.Forty
        "100" -> Illu.Cards.Hundred
        "?" -> Illu.Cards.Question
        "xs" -> Illu.Cards.Xs
        "s" -> Illu.Cards.S
        "m" -> Illu.Cards.M
        "l" -> Illu.Cards.L
        "xl" -> Illu.Cards.Xl
        "fibo" -> Illu.Cards.Xl
        "tshirt" -> Illu.Cards.Xl
        else -> error("Undefined card name $name")
    }

    private fun getDescription(highLightColor: Color, name: String): AnnotatedString {
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
            else -> error("Undefined card name $name")
        }
    }

    private fun getHighLightSpanStyle(highLightColor: Color) = SpanStyle(
        color = highLightColor,
        fontWeight = FontWeight.Bold
    )
}
