package fr.publicissapient.planningpoker.ui

import androidx.compose.material.Colors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
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
import fr.publicissapient.planningpoker.ui.theme.PlanningPokerMultipleColorsTheme
import fr.publicissapient.planningpoker.ui.theme.RedThemeColors

@Composable
fun PlanningPokerApp() {
    val navController = rememberNavController()
    val currentColors = remember { mutableStateOf(RedThemeColors) }
    NavHost(navController = navController, startDestination = Screen.CardType.route) {
        composable(Screen.CardType.route) {
            CardTypeStackEntry(currentColors, navController)
        }
        composable(Screen.CardList.route, Screen.CardList.arguments) {
            CardListStackEntry(it, currentColors, navController)
        }
        val screenCard = Screen.Card()
        composable(screenCard.route, screenCard.arguments) {
            CardStackEntry(it, screenCard, currentColors, navController)
        }
    }
}

@Composable
private fun CardStackEntry(
    backStackEntry: NavBackStackEntry,
    screenCard: Screen.Card,
    currentColors: MutableState<Colors>,
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
        PlanningPokerMultipleColorsTheme(currentColors) {
            CardScreen(
                cardSuit = cardSuitTypeKey,
                cardId = cardId,
                onBackClick = navController::popBackStack
            )
        }
    }
}

@Composable
private fun CardListStackEntry(
    backStackEntry: NavBackStackEntry,
    currentColors: MutableState<Colors>,
    navController: NavHostController
) {
    val args = checkNotNull(backStackEntry.arguments) { "Arguments required!" }
    val cardSuitType = args.getString(Screen.CardList.navArgCardSuit)
    checkNotNull(cardSuitType) { "Card suit required!" }
    val cardSuitTypeKey = when (cardSuitType) {
        "fibonacci" -> CardSuitType.Fibonacci
        "t-shirt" -> CardSuitType.TShirt
        else -> error("Unknown card suit type: $cardSuitType")
    }
    PlanningPokerMultipleColorsTheme(currentColors) {
        CardListScreen(
            cardSuitType = cardSuitTypeKey,
            navigateToCard = { cardId ->
                navController.navigate("cards/${cardSuitTypeKey.type}/$cardId")
            },
            onBackClick = navController::popBackStack,
            onFabDialClick = { colors -> currentColors.value = colors }
        )
    }
}

@Composable
private fun CardTypeStackEntry(
    currentColors: MutableState<Colors>,
    navController: NavHostController
) = PlanningPokerMultipleColorsTheme(currentColors) {
    CardTypeScreen(
        navigateToList = { navController.navigate("cards/${it.type}") },
        onFabDialClick = { colors -> currentColors.value = colors }
    )
}
