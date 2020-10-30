package fr.publicissapient.planningpoker.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun PlanningPokerTheme(
	content: @Composable () -> Unit
) {
	MaterialTheme(
		typography = planningPokerTypography,
		content = content
	)
}