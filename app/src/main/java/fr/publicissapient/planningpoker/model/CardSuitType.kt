package fr.publicissapient.planningpoker.model

sealed class CardSuitType(val type: String) {
    object Fibonacci : CardSuitType("fibonacci")
    object TShirt : CardSuitType("t-shirt")
}
