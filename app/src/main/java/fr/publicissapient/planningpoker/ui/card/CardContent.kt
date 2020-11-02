package fr.publicissapient.planningpoker.ui.card

import androidx.compose.foundation.Image
import androidx.compose.foundation.Text
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.WithConstraints
import androidx.compose.ui.drawLayer
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.DensityAmbient
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.ui.tooling.preview.Preview
import fr.publicissapient.planningpoker.data.CardRepository
import fr.publicissapient.planningpoker.model.Card
import fr.publicissapient.planningpoker.model.CardSuit
import fr.publicissapient.planningpoker.model.CardSuitType
import fr.publicissapient.planningpoker.ui.theme.PlanningPokerTheme
import fr.publicissapient.planningpoker.ui.theme.getThemeColor

@Composable
fun CardContent(
    cardSuit: CardSuit,
    card: Card,
    onClick: () -> Unit
) {
    WithConstraints {
        val width = with(DensityAmbient.current) { constraints.maxWidth.toDp() - 32.dp }
        val height =
            with(DensityAmbient.current) { constraints.maxWidth.toDp() + constraints.maxWidth.toDp() / 5 }
        Card(
            modifier = Modifier
                .padding(16.dp)
                .clickable(onClick = onClick)
                .width(width)
                .height(height),
            shape = RoundedCornerShape(24.dp),
        ) {
            Surface(
                color = cardSuit.color.getThemeColor()
            ) {
                Column(
                    modifier = Modifier.fillMaxSize(),
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
    }
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
fun CardContentPreview() {
    PlanningPokerTheme {
        val cardSuit = CardRepository().allCards()[CardSuitType.Fibonacci]
        cardSuit?.let {
            CardContent(
                cardSuit = cardSuit,
                card = cardSuit.cards[0],
                onClick = {}
            )
        } ?: error("Should not happen!")
    }
}