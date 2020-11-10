package fr.publicissapient.planningpoker.data

import androidx.compose.ui.graphics.Color
import fr.publicissapient.planningpoker.R
import fr.publicissapient.planningpoker.model.Card
import fr.publicissapient.planningpoker.model.CardSuitType
import fr.publicissapient.planningpoker.ui.theme.primaryBlue
import fr.publicissapient.planningpoker.ui.theme.primaryGreen
import fr.publicissapient.planningpoker.ui.theme.primaryRed
import fr.publicissapient.planningpoker.ui.theme.primaryYellow

class CardRepository {

    fun allCards(color: Color) = mapOf(
        CardSuitType.Fibonacci to listOf(
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
            Card(name, getImage(color, name), getDescription(color, name))
        }
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
                else -> error("Undefined card name $name")
            }
            else -> error("Undefined color $color")
        }

    private fun getDescription(color: Color, name: String) =
        when (color) {
            primaryRed, primaryGreen, primaryBlue -> when (name) {
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
            primaryYellow -> when (name) {
                "0" -> fibo0(highlightDarkSpanStyle)
                "1" -> fibo1(highlightDarkSpanStyle)
                "2" -> fibo2(highlightDarkSpanStyle)
                "3" -> fibo3(highlightDarkSpanStyle)
                "5" -> fibo5(highlightDarkSpanStyle)
                "8" -> fibo8(highlightDarkSpanStyle)
                "13" -> fibo13(highlightDarkSpanStyle)
                "21" -> fibo21(highlightDarkSpanStyle)
                "?" -> fiboQuestion(highlightDarkSpanStyle)
                else -> error("Undefined card name $name")
            }
            else -> error("Undefined card name $name")
        }
}