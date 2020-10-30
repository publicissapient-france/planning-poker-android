package fr.publicissapient.planningpoker.model

import androidx.compose.ui.graphics.Color

data class Deck(
    val color: Color,
    val cards: List<Card>
)