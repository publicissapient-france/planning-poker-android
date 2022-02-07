package fr.publicissapient.planningpoker.ui.card

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
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
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.luminance
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import fr.publicissapient.planningpoker.model.Card
import planningpoker.compose.LogCompositions
import planningpoker.compose.ThemedImage
import planningpoker.compose.illustrations.Illu
import planningpoker.compose.illustrations.fibonacci.TwentyOne
import planningpoker.compose.theme.PlanningPokerTheme
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
    LogCompositions("CardWithDimensions")
    Surface(
        modifier = modifier,
        shape = RoundedCornerShape(CARD_CORNER * ratio),
        shadowElevation = CARD_ELEVATION,
        color = if (isSystemInDarkTheme()) MaterialTheme.colorScheme.surfaceVariant else MaterialTheme.colorScheme.surface,
        onClick = onClick
    ) {
        val cardContentColor =
            if (isSystemInDarkTheme()) MaterialTheme.colorScheme.primaryContainer else MaterialTheme.colorScheme.primary
        Box(
            modifier = Modifier
                .padding(16.dp * ratio)
                .clip(RoundedCornerShape((CARD_CORNER - 16.dp) * ratio))
                .background(cardContentColor),
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.SpaceBetween,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Count(
                    cardName = card.name,
                    color = contentColorFor(cardContentColor),
                    ratio = ratio
                )
                ThemedImage(
                    imageVector = card.image,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 30.dp * ratio),
                    contentScale = ContentScale.FillWidth
                )
                val highlightColor =
                    if (cardContentColor.luminance() > 0.5f) Color.White else Color.Black
                card.getDescription(highlightColor).takeIf { it.isNotEmpty() }?.let { description ->
                    Text(
                        description,
                        modifier = Modifier.padding(horizontal = 30.dp * ratio),
                        style = MaterialTheme.typography.bodyMedium.copy(
                            textAlign = TextAlign.Center,
                            fontSize = MaterialTheme.typography.bodyMedium.fontSize * ratio,
                            lineHeight = MaterialTheme.typography.bodyMedium.lineHeight * ratio,
                            color = contentColorFor(cardContentColor)
                        )
                    )
                }
                Count(
                    modifier = Modifier.graphicsLayer(rotationZ = -180f),
                    cardName = card.name,
                    color = contentColorFor(cardContentColor),
                    ratio = ratio
                )
            }
        }
    }
}

@Composable
private fun Count(
    modifier: Modifier = Modifier,
    cardName: String,
    color: Color,
    ratio: Float = 1f
) =
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(4.dp * ratio, 0.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        val style = MaterialTheme.typography.bodyLarge.copy(
            color = color,
            fontSize = 33.sp * ratio,
        )
        Text(
            text = cardName.uppercase(Locale.ROOT),
            style = style,
            modifier = modifier
        )
        Text(
            text = cardName.uppercase(Locale.ROOT),
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
            image = Illu.Cards.TwentyOne
        )
        CardContent(
            card = card
        ) {}
    }
}

@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES or Configuration.UI_MODE_TYPE_NORMAL)
@Composable
fun CardContentDarkPreview() {
    PlanningPokerTheme {
        val card = Card(
            name = "21",
            image = Illu.Cards.TwentyOne
        )
        CardContent(
            card = card
        ) {}
    }
}
