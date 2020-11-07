package fr.publicissapient.planningpoker.ui.card

import androidx.compose.foundation.BorderStroke
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
import androidx.compose.ui.drawLayer
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.ui.tooling.preview.Preview
import fr.publicissapient.planningpoker.data.CardRepository
import fr.publicissapient.planningpoker.model.Card
import fr.publicissapient.planningpoker.model.CardSuitType
import fr.publicissapient.planningpoker.ui.theme.PlanningPokerTheme

@Composable
fun CardContent(
    card: Card,
    onClick: () -> Unit,
    ratio: Float = 1f
) {
    Card(
        modifier = Modifier
            .padding(16.dp * ratio)
            .clickable(onClick = onClick)
            .width(316.dp * ratio)
            .height(470.dp * ratio),
        shape = RoundedCornerShape(32.dp * ratio),
        elevation = 8.dp
    ) {
        Surface(
            color = MaterialTheme.colors.primary,
            border = BorderStroke(16.dp * ratio, color = Color.White),
            shape = RoundedCornerShape(24.dp * ratio)
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Count(card.name, ratio = ratio)
                Image(
                    asset = imageResource(id = card.imageResourceId),
                    modifier = Modifier.fillMaxWidth().padding(horizontal = 30.dp * ratio),
                    contentScale = ContentScale.FillWidth
                )
                Text(
                    card.description,
                    modifier = Modifier.padding(horizontal = 30.dp * ratio),
                    style = MaterialTheme.typography.body1.copy(
                        textAlign = TextAlign.Center,
                        fontSize = MaterialTheme.typography.body1.fontSize * ratio
                    )
                )
                Count(card.name, Modifier.drawLayer(rotationZ = -180f), ratio)
            }
        }
    }
}

@Composable
private fun Count(cardName: String, modifier: Modifier = Modifier, ratio: Float = 1f) =
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(24.dp * ratio, 16.dp * ratio),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        val style = MaterialTheme.typography.body1.copy(
            fontSize = 40.sp * ratio,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = cardName,
            color = Color.White,
            style = style,
            modifier = modifier
        )
        Text(
            text = cardName,
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
                card = cardSuit.cards[0],
                onClick = {}
            )
        } ?: error("Should not happen!")
    }
}