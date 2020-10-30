package fr.publicissapient.planningpoker.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.font.FontWeight
import fr.publicissapient.planningpoker.R
import fr.publicissapient.planningpoker.model.Card
import fr.publicissapient.planningpoker.model.Cards
import fr.publicissapient.planningpoker.model.Deck

val CARDS = Cards(
	red = Deck(
		color = Color(0xFFE50040),
		cards = listOf(
			Card(
				R.drawable.ic_red_1,
				with(AnnotatedString.Builder("C‘est le ")) {
					pushStyle(SpanStyle(color = Color.White, fontWeight = FontWeight.Bold))
					append("1er")
					pop()
					append(
						" avril 1976 que la startup Apple Computer est née, dans la " +
							"maison d'enfance de Steve Jobs à Los Altos, en Californie."
					)
					toAnnotatedString()
				},
				1
			)
		)
	)
)