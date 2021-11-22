package fr.publicissapient.planningpoker.ui.card

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberImagePainter
import fr.publicissapient.planningpoker.R
import fr.publicissapient.planningpoker.data.fibo21
import fr.publicissapient.planningpoker.model.Card
import fr.publicissapient.planningpoker.ui.theme.PlanningPokerTheme
import java.util.Locale

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
            .height(width * CARD_FACTOR),
        onClick = onClick
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun CardWithDimensions(
    card: Card,
    ratio: Float,
    modifier: Modifier,
    onClick: () -> Unit = {},
) {
    Surface(
        modifier = modifier,
        shape = RoundedCornerShape(CARD_CORNER * ratio),
        shadowElevation = CARD_ELEVATION,
        color = Color.White,
        onClick = onClick
    ) {
        Box(
            modifier = Modifier
                .padding(16.dp * ratio)
                .clip(RoundedCornerShape((CARD_CORNER - 16.dp) * ratio))
                .background(MaterialTheme.colorScheme.primaryContainer),
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.SpaceBetween,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Count(cardName = card.name, ratio = ratio)
                Image(
                    painter = rememberImagePainter(data = card.imageResourceId) {
                        placeholder(R.drawable.ic_blue_21)
                    },
                    contentDescription = null,
                    modifier = Modifier.padding(horizontal = 30.dp * ratio)
                )
                card.description?.let { description ->
                    Text(
                        description,
                        modifier = Modifier.padding(horizontal = 30.dp * ratio),
                        style = MaterialTheme.typography.bodyMedium.copy(
                            textAlign = TextAlign.Center,
                            fontSize = MaterialTheme.typography.bodyMedium.fontSize * ratio,
                            color = MaterialTheme.colorScheme.secondary
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
        val style = MaterialTheme.typography.bodyLarge.copy(
            fontSize = 33.sp * ratio,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = cardName.uppercase(Locale.ROOT),
            color = MaterialTheme.colorScheme.onPrimaryContainer,
            style = style,
            modifier = modifier
        )
        Text(
            text = cardName.uppercase(Locale.ROOT),
            color = MaterialTheme.colorScheme.onPrimaryContainer,
            style = style,
            modifier = modifier
        )
    }

@Preview
@Composable
fun CardContentPreview() {
    PlanningPokerTheme {
        val card = Card(
            name = "21",
            imageResourceId = R.drawable.ic_yellow_21,
            description = fibo21(
                SpanStyle(
                    color = MaterialTheme.colorScheme.tertiary,
                    fontWeight = FontWeight.Bold
                )
            )
        )
        CardContent(
            card = card
        ) {}
    }
}
