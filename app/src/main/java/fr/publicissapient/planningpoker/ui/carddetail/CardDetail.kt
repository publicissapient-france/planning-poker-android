package fr.publicissapient.planningpoker.ui.carddetail

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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import fr.publicissapient.planningpoker.data.CardRepository
import fr.publicissapient.planningpoker.model.Card
import fr.publicissapient.planningpoker.ui.components.CardPoint
import fr.publicissapient.planningpoker.ui.theme.PlanningPokerTheme
import fr.publicissapient.planningpoker.ui.theme.getThemeColor

@Composable
fun CardDetail(
    card: Card,
    color: Color
) = Scaffold(
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
                    CardPoint(card.pointValue)
                    Image(
                        asset = vectorResource(id = card.imageResId),
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
                    CardPoint(card.pointValue, Modifier.drawLayer(rotationZ = -180f))
                }
            }
        }
    }
)

@Preview
@Composable
fun PointCardPreview() {
    val redCardSuit = CardRepository().allCards().redCardSuit
    PlanningPokerTheme {
        CardDetail(
            card = redCardSuit.cards[0],
            color = redCardSuit.color.getThemeColor()
        )
    }
}