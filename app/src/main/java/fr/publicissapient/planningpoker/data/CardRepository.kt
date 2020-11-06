package fr.publicissapient.planningpoker.data

import fr.publicissapient.planningpoker.R
import fr.publicissapient.planningpoker.model.Card
import fr.publicissapient.planningpoker.model.CardSuit
import fr.publicissapient.planningpoker.model.CardSuitColor.RED
import fr.publicissapient.planningpoker.model.CardSuitType

class CardRepository {

    fun allCards() = mapOf(
        CardSuitType.Fibonacci to CardSuit(
            color = RED,
            cards = listOf(
                Card("fib0", "0", R.drawable.ic_red_0, fibo0),
                Card("fib1", "1", R.drawable.ic_red_1, fibo1),
                Card("fib2", "2", R.drawable.ic_red_2, fibo2),
                Card("fib3", "3", R.drawable.ic_red_3, fibo3),
                Card("fib5", "5", R.drawable.ic_red_5, fibo5),
                Card("fib8", "8", R.drawable.ic_red_8, fibo8),
                Card("fib13", "13", R.drawable.ic_red_13, fibo13),
                Card("fib21", "21", R.drawable.ic_red_21, fibo21),
                Card("fibques", "?", R.drawable.ic_red_question, fiboQuestion),
            )
        )
    )
}