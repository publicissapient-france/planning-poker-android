package fr.publicissapient.planningpoker.ui.body

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.layout.ContentScale
import planningpoker.compose.illustrations.Blop
import planningpoker.compose.illustrations.Illu

@Composable
fun BodyWithBlop(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.CenterStart
    ) {
        Image(
            painter = rememberVectorPainter(Illu.Blop),
            colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.secondary),
            contentDescription = null,
            alignment = Alignment.CenterStart,
            modifier = Modifier
                .fillMaxHeight(.75f)
                .fillMaxWidth(),
            contentScale = ContentScale.FillBounds
        )
        content()
    }
}
