package fr.publicissapient.planningpoker.ui.card

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import fr.publicissapient.planningpoker.R
import fr.publicissapient.planningpoker.ui.theme.PlanningPokerTheme

@Composable
fun CardBackSideContent(
    width: Dp = CARD_WIDTH,
    ratio: Float = 1f,
    onClick: () -> Unit = {}
) {
    CardWithDimensions(
        width * ratio,
        width * CARD_FACTOR * ratio,
        ratio,
        onClick
    )
}

@Composable
private fun CardWithDimensions(
    width: Dp,
    height: Dp,
    ratio: Float,
    onClick: () -> Unit,
) {
    Card(
        modifier = Modifier
            .padding(16.dp * ratio)
            .width(width)
            .height(height)
            .clickable(onClick = onClick),
        shape = RoundedCornerShape(CARD_CORNER * ratio),
        elevation = CARD_WIDTH,
        backgroundColor = MaterialTheme.colors.primary,
    ) {
        Image(
            asset = imageResource(id = R.drawable.ic_logo_ps),
            modifier = Modifier.width(CARD_WIDTH / 2 * ratio)
        )
    }
}

@Preview
@Composable
fun CardBackSideContentPreview() {
    PlanningPokerTheme {
        CardBackSideContent()
    }
}