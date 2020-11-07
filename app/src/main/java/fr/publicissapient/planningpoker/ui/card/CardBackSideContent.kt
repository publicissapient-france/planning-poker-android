package fr.publicissapient.planningpoker.ui.card

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import fr.publicissapient.planningpoker.R
import fr.publicissapient.planningpoker.ui.theme.PlanningPokerTheme

@Composable
fun CardBackSideContent(
    ratio: Float = 1f,
    onClick: () -> Unit = {}
) {
    Card(
        modifier = Modifier
            .padding(16.dp * ratio)
            .width(316.dp * ratio)
            .height(470.dp * ratio)
            .clickable(onClick = onClick),
        shape = RoundedCornerShape(32.dp * ratio),
        elevation = 8.dp,
        backgroundColor = Color.Black,
    ) {
        Image(vectorResource(id = R.drawable.ic_logo_pse))
    }
}

@Preview
@Composable
fun CardBackSideContentPreview() {
    PlanningPokerTheme {
        CardBackSideContent()
    }
}