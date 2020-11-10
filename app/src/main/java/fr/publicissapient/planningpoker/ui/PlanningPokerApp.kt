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
import androidx.navigation.compose.navigate
import androidx.navigation.compose.rememberNavController
import fr.publicissapient.planningpoker.model.CardSuitType
import fr.publicissapient.planningpoker.ui.card.CardScreen
import fr.publicissapient.planningpoker.ui.nav.Screen
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
) = backStackEntry.arguments?.let { bundle ->
    val cardSuitTypeBundle = bundle.getString(Screen.CardList.navArgCardSuit)
    cardSuitTypeBundle?.let { cardSuitTypeString ->
        val cardSuitType = when (cardSuitTypeString) {
            "fibonacci" -> CardSuitType.Fibonacci
            "t-shirt" -> CardSuitType.TShirt
            else -> error("Unknown card suit type!")
        }
        bundle.getString(screenCard.navArgCardId)?.let { cardId ->
            PlanningPokerMultipleColorsTheme(currentColors) {
                CardScreen(
                    cardSuitType,
                    cardId,
                    navController::popBackStack
                )
            }
        }
    } ?: error("Card suit required!")
} ?: error("Card screen should have arguments!")

@Composable
private fun CardListStackEntry(
    backStackEntry: NavBackStackEntry,
    currentColors: MutableState<Colors>,
    navController: NavHostController
) = backStackEntry.arguments?.let { bundle ->
    val cardSuitTypeBundle = bundle.getString(Screen.CardList.navArgCardSuit)
    cardSuitTypeBundle?.let { cardSuitTypeString ->
        val cardSuitType = when (cardSuitTypeString) {
            "fibonacci" -> CardSuitType.Fibonacci
            "t-shirt" -> CardSuitType.TShirt
            else -> error("Unknown card suit type!")
        }
        PlanningPokerMultipleColorsTheme(currentColors) {
            CardListScreen(
                cardSuitType = cardSuitType,
                navigateToCard = { cardId ->
                    navController.navigate("cards/${cardSuitType.type}/$cardId")
                },
                onBackClick = navController::popBackStack,
                onFabDialClick = { colors -> currentColors.value = colors }
            )
        }
    } ?: error("Card suit required!")
} ?: error("Arguments required!")

@Composable
private fun CardTypeStackEntry(
    currentColors: MutableState<Colors>,
    navController: NavHostController
) = PlanningPokerMultipleColorsTheme(currentColors) {
    CardTypeScreen {
        navController.navigate("cards/${it.type}")
    }
}
