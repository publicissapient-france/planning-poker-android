package fr.publicissapient.planningpoker.ui.body

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import dev.chrisbanes.accompanist.coil.CoilImage
import fr.publicissapient.planningpoker.R

@Composable
fun BodyWithBlop(content: @Composable () -> Unit) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.CenterStart
    ) {
        CoilImage(
            data = R.drawable.ic_blop,
            modifier = Modifier.fillMaxHeight(.85f),
            colorFilter = ColorFilter.tint(MaterialTheme.colors.secondaryVariant),
            contentScale = ContentScale.FillHeight
        )
        content()
    }
}
