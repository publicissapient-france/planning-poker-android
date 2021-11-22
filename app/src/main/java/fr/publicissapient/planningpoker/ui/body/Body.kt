package fr.publicissapient.planningpoker.ui.body

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import coil.compose.rememberImagePainter
import coil.size.Scale
import fr.publicissapient.planningpoker.R

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
            painter = rememberImagePainter(R.drawable.ic_blop) {
                scale(Scale.FILL)
            },
            colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.secondary),
            contentDescription = null,
            modifier = Modifier.fillMaxHeight(.75f)
        )
        content()
    }
}
