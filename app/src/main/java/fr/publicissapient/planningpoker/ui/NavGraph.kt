package fr.publicissapient.planningpoker.ui

import androidx.compose.material3.ColorScheme
import androidx.compose.runtime.Composable
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import fr.publicissapient.planningpoker.model.CardSuitType
import fr.publicissapient.planningpoker.ui.nav.Screen
import fr.publicissapient.planningpoker.ui.screen.CardListScreen
import fr.publicissapient.planningpoker.ui.screen.CardScreen
import fr.publicissapient.planningpoker.ui.screen.CardTypeScreen
import planningpoker.compose.theme.Theme

@Composable
fun NavGraph(
    onThemeChange: (theme: Theme) -> Unit
) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Screen.CardType.route) {
        composable(Screen.CardType.route) {
            CardTypeStackEntry(navController, onThemeChange)
        }
        composable(Screen.CardList.route, Screen.CardList.arguments) {
            CardListStackEntry(it, navController, onThemeChange)
        }
        val screenCard = Screen.Card()
        composable(screenCard.route, screenCard.arguments) {
            CardStackEntry(it, screenCard, navController)
        }
    }
}

@Composable
private fun CardStackEntry(
    backStackEntry: NavBackStackEntry,
    screenCard: Screen.Card,
    navController: NavHostController
) {
    val args = checkNotNull(backStackEntry.arguments) { "Card screen should have arguments!" }
    val cardSuitType = args.getString(Screen.CardList.navArgCardSuit)
    checkNotNull(cardSuitType) { "Card suit required!" }
    val cardSuitTypeKey = when (cardSuitType) {
        "fibonacci" -> CardSuitType.Fibonacci
        "t-shirt" -> CardSuitType.TShirt
        else -> error("Unknown card suit type: $cardSuitType")
    }
    args.getString(screenCard.navArgCardId)?.let { cardId ->
        CardScreen(
            cardSuit = cardSuitTypeKey,
            cardId = cardId,
            onBackClick = navController::popBackStack
        )
    }
}

@Composable
private fun CardListStackEntry(
    backStackEntry: NavBackStackEntry,
    navController: NavHostController,
    onThemeChange: (theme: Theme) -> Unit,
) {
    val args = checkNotNull(backStackEntry.arguments) { "Arguments required!" }
    val cardSuitType = args.getString(Screen.CardList.navArgCardSuit)
    checkNotNull(cardSuitType) { "Card suit required!" }
    val cardSuitTypeKey = when (cardSuitType) {
        "fibonacci" -> CardSuitType.Fibonacci
        "t-shirt" -> CardSuitType.TShirt
        else -> error("Unknown card suit type: $cardSuitType")
    }
    CardListScreen(
        cardSuitType = cardSuitTypeKey,
        navigateToCard = { cardId ->
            navController.navigate("cards/${cardSuitTypeKey.type}/$cardId")
        },
        onBackClick = navController::popBackStack,
        onThemeChange = onThemeChange
    )
}

@Composable
private fun CardTypeStackEntry(
    navController: NavHostController,
    onThemeChange: (theme: Theme) -> Unit,
) = CardTypeScreen(
    navigateToList = { navController.navigate("cards/${it.type}") },
    onThemeChange = onThemeChange
)
