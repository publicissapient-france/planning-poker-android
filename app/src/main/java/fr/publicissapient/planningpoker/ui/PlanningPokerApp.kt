package fr.publicissapient.planningpoker.ui

import androidx.compose.runtime.Composable
import androidx.navigation.compose.*
import fr.publicissapient.planningpoker.model.CardSuitType
import fr.publicissapient.planningpoker.ui.card.CardScreen
import fr.publicissapient.planningpoker.ui.nav.Screen
import fr.publicissapient.planningpoker.ui.theme.PlanningPokerTheme

@Composable
fun PlanningPokerApp() {
    val navController = rememberNavController()
    val screenCard = Screen.Card()
    PlanningPokerTheme {
        NavHost(navController = navController, startDestination = Screen.CardType.route) {
            composable(Screen.CardType.route) {
                CardTypeScreen {
                    navController.navigate("cards/${it.type}")
                }
            }
            composable(Screen.CardList.route, Screen.CardList.arguments) {
                it.arguments?.let { bundle ->
                    val cardSuitTypeBundle = bundle.getString(Screen.CardList.navArgCardSuit)
                    cardSuitTypeBundle?.let { cardSuitTypeString ->
                        val cardSuitType = when (cardSuitTypeString) {
                            "fibonacci" -> CardSuitType.Fibonacci
                            "t-shirt" -> CardSuitType.TShirt
                            else -> error("Unknown card suit type!")
                        }
                        CardListScreen(
                            cardSuitType,
                            { navController.navigate("cards/${cardSuitType.type}/$id") },
                            navController::popBackStack
                        )
                    } ?: error("Card suit required!")
                } ?: error("Arguments required!")
            }
            composable(screenCard.route, screenCard.arguments) {
                it.arguments?.let { bundle ->
                    val cardSuitTypeBundle = bundle.getString(Screen.CardList.navArgCardSuit)
                    cardSuitTypeBundle?.let { cardSuitTypeString ->
                        val cardSuitType = when (cardSuitTypeString) {
                            "fibonacci" -> CardSuitType.Fibonacci
                            "t-shirt" -> CardSuitType.TShirt
                            else -> error("Unknown card suit type!")
                        }
                        CardScreen(
                            cardSuitType,
                            bundle.getInt(screenCard.navArgCardId),
                            navController::popBackStack
                        )
                    } ?: error("Card suit required!")
                } ?: error("Card screen should have arguments!")
            }
        }
    }
}
