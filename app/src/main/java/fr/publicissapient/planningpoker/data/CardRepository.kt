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
            Card(name, getImage(color, name), getDescription(name))
        }
    )

    private fun getImage(color: Color, id: String) =
        when (color) {
            primaryRed -> when (id) {
                "0" -> R.drawable.ic_red_0
                "1" -> R.drawable.ic_red_1
                "2" -> R.drawable.ic_red_2
                "3" -> R.drawable.ic_red_3
                "5" -> R.drawable.ic_red_5
                "8" -> R.drawable.ic_red_8
                "13" -> R.drawable.ic_red_13
                "21" -> R.drawable.ic_red_21
                "?" -> R.drawable.ic_red_question
                else -> error("Undefined card name $id")
            }
            primaryYellow -> when (id) {
                "0" -> R.drawable.ic_yellow_0
                "1" -> R.drawable.ic_yellow_1
                "2" -> R.drawable.ic_yellow_2
                "3" -> R.drawable.ic_yellow_3
                "5" -> R.drawable.ic_yellow_5
                "8" -> R.drawable.ic_yellow_8
                "13" -> R.drawable.ic_yellow_13
                "21" -> R.drawable.ic_yellow_21
                "?" -> R.drawable.ic_yellow_question
                else -> error("Undefined card name $id")
            }
            primaryGreen -> when (id) {
                "0" -> R.drawable.ic_green_0
                "1" -> R.drawable.ic_green_1
                "2" -> R.drawable.ic_green_2
                "3" -> R.drawable.ic_green_3
                "5" -> R.drawable.ic_green_5
                "8" -> R.drawable.ic_green_8
                "13" -> R.drawable.ic_green_13
                "21" -> R.drawable.ic_green_21
                "?" -> R.drawable.ic_green_question
                else -> error("Undefined card name $id")
            }
            primaryBlue -> when (id) {
                "0" -> R.drawable.ic_green_0
                "1" -> R.drawable.ic_green_1
                "2" -> R.drawable.ic_green_2
                "3" -> R.drawable.ic_green_3
                "5" -> R.drawable.ic_green_5
                "8" -> R.drawable.ic_green_8
                "13" -> R.drawable.ic_green_13
                "21" -> R.drawable.ic_green_21
                "?" -> R.drawable.ic_green_question
                else -> error("Undefined card name $id")
            }
            else -> error("Undefined color $color")
        }

    private fun getDescription(name: String) =
        when (name) {
            "0" -> fibo0
            "1" -> fibo1
            "2" -> fibo2
            "3" -> fibo3
            "5" -> fibo5
            "8" -> fibo8
            "13" -> fibo13
            "21" -> fibo21
            "?" -> fiboQuestion
            else -> error("Undefined card name $name")
        }
}