package fr.publicissapient.planningpoker.ui.nav

import androidx.navigation.NavType
import androidx.navigation.compose.navArgument

sealed class Screen(val route: String) {

    object CardType : Screen("cardType")

    object CardList : Screen("cards/{cardSuit}") {
        val navArgCardSuit = "cardSuit"
        val arguments = listOf(
            navArgument("cardSuit") { type = NavType.StringType }
        )
    }

    class Card : Screen("cards/{cardSuit}/{cardId}") {
        val navArgCardSuit = "cardSuit"
        val navArgCardId = "cardId"
        val arguments = listOf(
            navArgument(navArgCardSuit) { type = NavType.StringType },
            navArgument(navArgCardId) { type = NavType.IntType }
        )

        fun toRoute(cardSuit: String, cardId: Int): String = "cards/$cardSuit/$cardId"
    }
}
