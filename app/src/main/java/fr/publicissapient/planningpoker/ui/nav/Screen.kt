package fr.publicissapient.planningpoker.ui.nav

import androidx.navigation.NavType
import androidx.navigation.compose.navArgument

sealed class Screen(val route: String) {

    object CardType : Screen("cardType")

    object CardList : Screen("cards/{cardSuit}") {
        const val navArgCardSuit = "cardSuit"
        val arguments = listOf(
            navArgument("cardSuit") { type = NavType.StringType }
        )
    }

    class Card : Screen("cards/{cardSuit}/{cardId}") {
        private val navArgCardSuit = "cardSuit"
        val navArgCardId = "cardId"
        val arguments = listOf(
            navArgument(navArgCardSuit) { type = NavType.StringType },
            navArgument(navArgCardId) { type = NavType.StringType }
        )
    }
}
