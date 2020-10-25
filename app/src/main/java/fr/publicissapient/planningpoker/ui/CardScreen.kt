package fr.publicissapient.planningpoker.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.drawLayer
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.ui.tooling.preview.Preview
import fr.publicissapient.planningpoker.data.CARDS

@Composable
fun CardScreen(
	imageResourceId: Int,
	description: AnnotatedString
) =
	Scaffold(
		bodyContent = {
			Card(
				modifier = Modifier.padding(16.dp),
				shape = RoundedCornerShape(24.dp)
			) {
				Surface(
					color = Color.Red
				) {
					Column(
						modifier = Modifier.fillMaxWidth().fillMaxHeight(),
						verticalArrangement = Arrangement.SpaceBetween
					) {
						Count()
						Image(
							imageResource(id = imageResourceId),
							modifier = Modifier.padding(horizontal = 30.dp)
						)
						Text(
							description,
							modifier = Modifier.padding(horizontal = 30.dp),
							style = TextStyle(textAlign = TextAlign.Center)
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
		val style = TextStyle(fontSize = 40.sp, fontWeight = FontWeight.ExtraBold)
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
	CardScreen(
		imageResourceId = CARDS.red[0].imageResourceId,
		description = CARDS.red[0].description
	)
}