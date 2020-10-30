package fr.publicissapient.planningpoker.ui.home

import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.ui.tooling.preview.Preview
import fr.publicissapient.planningpoker.data.CardRepository
import fr.publicissapient.planningpoker.model.Card
import fr.publicissapient.planningpoker.ui.theme.PlanningPokerTheme
import fr.publicissapient.planningpoker.ui.theme.getThemeColor

@Composable
fun CardListItem(
    card: Card,
    color: Color
) = Scaffold(
    bodyContent = {
        Card(
            modifier = Modifier.padding(16.dp).width(180.dp).height(252.dp),
            shape = RoundedCornerShape(24.dp)
        ) {
            Surface(
                color = color
            ) {
                Column(
                    verticalArrangement = Arrangement.SpaceBetween
                ) {
                    val style = MaterialTheme.typography.body1.copy(
                        fontSize = 40.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = card.pointValue.toString(),
                        color = Color.White,
                        style = style
                    )
                }
            }
        }
    }
)

@Preview
@Composable
fun CardListItemPreview() {
    val redCardSuit = CardRepository().allCards().redCardSuit
    PlanningPokerTheme {
        CardListItem(
            card = redCardSuit.cards[0],
            color = redCardSuit.color.getThemeColor()
        )
    }
}