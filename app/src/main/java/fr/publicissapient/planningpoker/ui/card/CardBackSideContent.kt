package fr.publicissapient.planningpoker.ui.card

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import coil.compose.rememberImagePainter
import fr.publicissapient.planningpoker.R
import fr.publicissapient.planningpoker.ui.theme.PlanningPokerTheme

@Composable
fun CardBackSideContent(
    modifier: Modifier = Modifier,
    width: Dp = CARD_WIDTH,
    ratio: Float = 1f,
    onClick: () -> Unit = {},
) {
    CardWithDimensions(
        ratio = ratio,
        modifier = modifier
            .width(width)
            .height(width * CARD_FACTOR)
            .clickable(onClick = onClick)
    )
}

@Composable
private fun CardWithDimensions(
    ratio: Float,
    modifier: Modifier,
) {
    Card(
        modifier = modifier,
        shape = RoundedCornerShape(CARD_CORNER * ratio),
        elevation = CARD_ELEVATION,
        backgroundColor = MaterialTheme.colors.primary,
    ) {
        BoxWithConstraints(
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = rememberImagePainter(R.drawable.ic_logo_ps),
                contentDescription = null,
                modifier = Modifier.width(maxWidth * .5f)
            )
        }
    }
}

@Preview
@Composable
fun CardBackSideContentPreview() {
    PlanningPokerTheme {
        CardBackSideContent()
    }
}
