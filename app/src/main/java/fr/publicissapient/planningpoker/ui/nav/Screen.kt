package fr.publicissapient.planningpoker.ui.nav

import androidx.navigation.NavType
import androidx.navigation.compose.navArgument

sealed class Screen(val route: String) {

    object Home : Screen("home")

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
