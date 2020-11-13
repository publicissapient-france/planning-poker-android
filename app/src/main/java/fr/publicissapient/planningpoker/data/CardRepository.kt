package fr.publicissapient.planningpoker.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.font.FontWeight
import fr.publicissapient.planningpoker.R
import fr.publicissapient.planningpoker.model.Card
import fr.publicissapient.planningpoker.model.CardSuitType.Fibonacci
import fr.publicissapient.planningpoker.model.CardSuitType.TShirt
import fr.publicissapient.planningpoker.ui.theme.primaryBlue
import fr.publicissapient.planningpoker.ui.theme.primaryGreen
import fr.publicissapient.planningpoker.ui.theme.primaryRed
import fr.publicissapient.planningpoker.ui.theme.primaryYellow

class CardRepository {

    fun allCards(color: Color, highLightColor: Color) = mapOf(
        Fibonacci to listOf(
            "0",
            "1",
            "2",
            "3",
            "5",
            "8",
            "13",
            "21",
            "?"
        ).map { name ->
            Card(name, getImage(color, name), getDescription(highLightColor, name))
        },
        TShirt to listOf(
            "xs",
            "s",
            "m",
            "l",
            "xl",
            "?"
        ).map { name ->
            Card(name, getImage(color, name))
        }
    )

    fun choiceCards(color: Color) = mapOf(
        Fibonacci to Card("", getImage(color, "fibo")),
        TShirt to Card("", getImage(color, "tshirt"))
    )

    private fun getImage(color: Color, name: String) =
        when (color) {
            primaryRed -> when (name) {
                "0" -> R.drawable.ic_red_0
                "1" -> R.drawable.ic_red_1
                "2" -> R.drawable.ic_red_2
                "3" -> R.drawable.ic_red_3
                "5" -> R.drawable.ic_red_5
                "8" -> R.drawable.ic_red_8
                "13" -> R.drawable.ic_red_13
                "21" -> R.drawable.ic_red_21
                "?" -> R.drawable.ic_red_question
                "xs" -> R.drawable.ic_red_xs
                "s" -> R.drawable.ic_red_s
                "m" -> R.drawable.ic_red_m
                "l" -> R.drawable.ic_red_l
                "xl" -> R.drawable.ic_red_xl
                "fibo" -> R.drawable.ic_fibo_red
                "tshirt" -> R.drawable.ic_tshirt_red
                else -> error("Undefined card name $name")
            }
            primaryYellow -> when (name) {
                "0" -> R.drawable.ic_yellow_0
                "1" -> R.drawable.ic_yellow_1
                "2" -> R.drawable.ic_yellow_2
                "3" -> R.drawable.ic_yellow_3
                "5" -> R.drawable.ic_yellow_5
                "8" -> R.drawable.ic_yellow_8
                "13" -> R.drawable.ic_yellow_13
                "21" -> R.drawable.ic_yellow_21
                "?" -> R.drawable.ic_yellow_question
                "xs" -> R.drawable.ic_yellow_xs
                "s" -> R.drawable.ic_yellow_s
                "m" -> R.drawable.ic_yellow_m
                "l" -> R.drawable.ic_yellow_l
                "xl" -> R.drawable.ic_yellow_xl
                "fibo" -> R.drawable.ic_fibo_yellow
                "tshirt" -> R.drawable.ic_tshirt_yellow
                else -> error("Undefined card name $name")
            }
            primaryGreen -> when (name) {
                "0" -> R.drawable.ic_green_0
                "1" -> R.drawable.ic_green_1
                "2" -> R.drawable.ic_green_2
                "3" -> R.drawable.ic_green_3
                "5" -> R.drawable.ic_green_5
                "8" -> R.drawable.ic_green_8
                "13" -> R.drawable.ic_green_13
                "21" -> R.drawable.ic_green_21
                "?" -> R.drawable.ic_green_question
                "xs" -> R.drawable.ic_green_xs
                "s" -> R.drawable.ic_green_s
                "m" -> R.drawable.ic_green_m
                "l" -> R.drawable.ic_green_l
                "xl" -> R.drawable.ic_green_xl
                "fibo" -> R.drawable.ic_fibo_green
                "tshirt" -> R.drawable.ic_tshirt_green
                else -> error("Undefined card name $name")
            }
            primaryBlue -> when (name) {
                "0" -> R.drawable.ic_blue_0
                "1" -> R.drawable.ic_blue_1
                "2" -> R.drawable.ic_blue_2
                "3" -> R.drawable.ic_blue_3
                "5" -> R.drawable.ic_blue_5
                "8" -> R.drawable.ic_blue_8
                "13" -> R.drawable.ic_blue_13
                "21" -> R.drawable.ic_blue_21
                "?" -> R.drawable.ic_blue_question
                "xs" -> R.drawable.ic_blue_xs
                "s" -> R.drawable.ic_blue_s
                "m" -> R.drawable.ic_blue_m
                "l" -> R.drawable.ic_blue_l
                "xl" -> R.drawable.ic_blue_xl
                "fibo" -> R.drawable.ic_fibo_blue
                "tshirt" -> R.drawable.ic_tshirt_blue
                else -> error("Undefined card name $name")
            }
            else -> error("Undefined color $color")
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
            "?" -> fiboQuestion(highlightLightSpanStyle)
            else -> error("Undefined card name $name")
        }
    }

    private fun getHighLightSpanStyle(highLightColor: Color) = SpanStyle(
        color = highLightColor,
        fontWeight = FontWeight.Bold
    )
}