package fr.publicissapient.planningpoker.model

import androidx.compose.ui.text.AnnotatedString

data class Card(
	val imageResourceId: Int,
	val description: AnnotatedString,
	val value: Int
)