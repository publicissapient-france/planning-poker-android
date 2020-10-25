package fr.publicissapient.planningpoker.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.drawLayer
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.ui.tooling.preview.Preview
import fr.publicissapient.planningpoker.data.CARDS
import fr.publicissapient.planningpoker.ui.theme.PlanningPokerTheme

@Composable
fun CardScreen(
	vectorResourceId: Int,
	description: AnnotatedString,
	color: Color,
) =
	Scaffold(
		bodyContent = {
			Card(
				modifier = Modifier.padding(16.dp),
				shape = RoundedCornerShape(24.dp)
			) {
				Surface(
					color = color
				) {
					Column(
						modifier = Modifier.fillMaxWidth().fillMaxHeight(),
						verticalArrangement = Arrangement.SpaceBetween
					) {
						Count()
						Image(
							asset = vectorResource(id = vectorResourceId),
							modifier = Modifier.fillMaxWidth().padding(horizontal = 30.dp),
							contentScale = ContentScale.FillWidth
						)
						Text(
							description,
							modifier = Modifier.padding(horizontal = 30.dp),
							style = MaterialTheme.typography.body1.copy(
								textAlign = TextAlign.Center
							)
						)
						Count(Modifier.drawLayer(rotationZ = -180f))
					}
				}
			}
		}
	)

@Composable
private fun Count(modifier: Modifier = Modifier) =
	Row(
		modifier = Modifier
			.fillMaxWidth()
			.padding(start = 8.dp, end = 8.dp),
		horizontalArrangement = Arrangement.SpaceBetween
	) {
		val style = MaterialTheme.typography.body1.copy(
			fontSize = 40.sp,
			fontWeight = FontWeight.Bold
		)
		Text(
			text = "1",
			color = Color.White,
			style = style,
			modifier = modifier
		)
		Text(
			text = "1",
			color = Color.White,
			style = style,
			modifier = modifier
		)
	}

@Preview
@Composable
fun CardScreenPreview() {
	PlanningPokerTheme {
		CardScreen(
			vectorResourceId = CARDS.red.cards[0].imageResourceId,
			description = CARDS.red.cards[0].description,
			color = CARDS.red.color
		)
	}
}