package fr.publicissapient.planningpoker.ui.card

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberImagePainter
import fr.publicissapient.planningpoker.data.CardRepository
import fr.publicissapient.planningpoker.model.Card
import fr.publicissapient.planningpoker.model.CardSuitType
import fr.publicissapient.planningpoker.ui.theme.PlanningPokerTheme
import java.util.*

const val CARD_FACTOR = 1.48f

val CARD_WIDTH = 325.dp
val CARD_CORNER = 32.dp
val CARD_ELEVATION = 8.dp

@Composable
fun CardContent(
    modifier: Modifier = Modifier,
    card: Card,
    width: Dp = CARD_WIDTH,
    onClick: () -> Unit = {},
) {
    CardWithDimensions(
        card = card,
        ratio = width / CARD_WIDTH,
        modifier = modifier
            .width(width)
            .height(width * CARD_FACTOR)
            .clickable(onClick = onClick),
    )
}

@Composable
private fun CardWithDimensions(
    card: Card,
    ratio: Float,
    modifier: Modifier,
) {
    Card(
        modifier = modifier,
        shape = RoundedCornerShape(CARD_CORNER * ratio),
        elevation = CARD_ELEVATION,
        backgroundColor = Color.White
    ) {
        Box(
            modifier = Modifier
                .padding(16.dp * ratio)
                .clip(RoundedCornerShape((CARD_CORNER - 16.dp) * ratio))
                .background(MaterialTheme.colors.secondary),
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Count(cardName = card.name, ratio = ratio)
                Image(
                    painter = rememberImagePainter(
                        data = card.imageResourceId,
                        onExecute = { _, _ -> true },
                    ),
                    contentDescription = null,
                    modifier = Modifier.padding(horizontal = 30.dp * ratio)
                )
                card.description?.let { description ->
                    Text(
                        description,
                        modifier = Modifier.padding(horizontal = 30.dp * ratio),
                        style = MaterialTheme.typography.body2.copy(
                            textAlign = TextAlign.Center,
                            fontSize = MaterialTheme.typography.body2.fontSize * ratio,
                            color = MaterialTheme.colors.primary
                        )
                    )
                }
                Count(Modifier.graphicsLayer(rotationZ = -180f), card.name, ratio)
            }
        }
    }
}

@Composable
private fun Count(
    modifier: Modifier = Modifier,
    cardName: String,
    ratio: Float = 1f
) =
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(4.dp * ratio, 0.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        val style = MaterialTheme.typography.body1.copy(
            fontSize = 33.sp * ratio,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = cardName.uppercase(Locale.ROOT),
            color = MaterialTheme.colors.onPrimary,
            style = style,
            modifier = modifier
        )
        Text(
            text = cardName.uppercase(Locale.ROOT),
            color = MaterialTheme.colors.onPrimary,
            style = style,
            modifier = modifier
        )
    }

@Preview
@Composable
fun CardContentPreview() {
    PlanningPokerTheme {
        val cards = CardRepository().allCards(
            MaterialTheme.colors.secondary,
            MaterialTheme.colors.onSecondary,
        )[CardSuitType.Fibonacci]
        cards?.let {
            CardContent(
                card = cards[7]
            ) {}
        } ?: error("Should not happen!")
    }
}
