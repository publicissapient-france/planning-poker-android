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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.ui.tooling.preview.Preview
import fr.publicissapient.planningpoker.data.CardRepository
import fr.publicissapient.planningpoker.model.CardSuitType.Companion.FIBONACCI
import fr.publicissapient.planningpoker.ui.theme.PlanningPokerTheme
import fr.publicissapient.planningpoker.ui.theme.getThemeColor

@Composable
fun CardScreen(
    cardSuit: String,
    cardId: Int,
) {
    Scaffold(
        bodyContent = {
            val suit = CardRepository().allCards()[cardSuit]
            suit?.let {
                val card = it.cards[cardId]
                Card(
                    modifier = Modifier.padding(16.dp),
                    shape = RoundedCornerShape(24.dp)
                ) {
                    Surface(
                        color = it.color.getThemeColor()
                    ) {
                        Column(
                            modifier = Modifier.fillMaxWidth().fillMaxHeight(),
                            verticalArrangement = Arrangement.SpaceBetween
                        ) {
                            Count(card.pointValue)
                            Image(
                                asset = vectorResource(id = card.imageResourceId),
                                modifier = Modifier.fillMaxWidth().padding(horizontal = 30.dp),
                                contentScale = ContentScale.FillWidth
                            )
                            Text(
                                card.description,
                                modifier = Modifier.padding(horizontal = 30.dp),
                                style = MaterialTheme.typography.body1.copy(
                                    textAlign = TextAlign.Center
                                )
                            )
                            Count(card.pointValue, Modifier.drawLayer(rotationZ = -180f))
                        }
                    }
                }
            } ?: error("Cannot find cart suit!")
        }
    )
}

@Composable
private fun Count(pointValue: Int, modifier: Modifier = Modifier) =
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
            text = pointValue.toString(),
            color = Color.White,
            style = style,
            modifier = modifier
        )
        Text(
            text = pointValue.toString(),
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
            cardSuit = FIBONACCI,
            cardId = 0
        )
    }
}