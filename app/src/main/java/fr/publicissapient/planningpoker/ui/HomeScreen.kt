package fr.publicissapient.planningpoker.ui

import androidx.compose.foundation.Text
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.ui.tooling.preview.Preview
import fr.publicissapient.planningpoker.ui.theme.PlanningPokerTheme

@Composable
fun HomeScreen(navigateToCard: () -> Unit) =
    Scaffold(
        bodyContent = {
            Button(
                onClick = {
                    navigateToCard()
                }
            ) {
                Text(text = "See card")
            }
        }
    )

@Preview
@Composable
fun HomeScreenPreview() {
    PlanningPokerTheme {
        HomeScreen(navigateToCard = {})
    }
}
