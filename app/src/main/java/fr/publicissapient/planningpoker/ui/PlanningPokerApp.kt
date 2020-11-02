package fr.publicissapient.planningpoker.ui

import androidx.compose.runtime.Composable
import androidx.navigation.compose.*
import fr.publicissapient.planningpoker.model.CardSuitType.Companion.FIBONACCI
import fr.publicissapient.planningpoker.ui.nav.Screen
import fr.publicissapient.planningpoker.ui.theme.PlanningPokerTheme

@Composable
fun PlanningPokerApp() {
    val navController = rememberNavController()
    val screenCard = Screen.Card()
    PlanningPokerTheme {
        NavHost(navController = navController, startDestination = Screen.Home.route) {
            composable(Screen.Home.route) {
                HomeScreen {
                    navController.navigate(screenCard.toRoute(FIBONACCI, 0))
                }
            }
            composable(screenCard.route, screenCard.arguments) {
                it.arguments?.let { bundle ->
                    bundle.getString(screenCard.navArgCardSuit)?.let { cardSuit ->
                        CardScreen(
                            cardSuit,
                            bundle.getInt(screenCard.navArgCardId)
                        )
                    } ?: error("Card suit is required!")
                } ?: error("Card screen should have arguments!")
            }
        }
    }
}