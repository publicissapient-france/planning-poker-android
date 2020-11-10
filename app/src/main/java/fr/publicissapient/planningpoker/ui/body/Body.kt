package fr.publicissapient.planningpoker.ui.body

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.vectorResource
import fr.publicissapient.planningpoker.R

@Composable
fun BodyWithBlop(content: @Composable () -> Unit) {
    Box(
        modifier = Modifier.fillMaxSize(),
        alignment = Alignment.CenterStart
    ) {
        Image(
            modifier = Modifier.fillMaxHeight(.9f),
            asset = vectorResource(id = R.drawable.ic_blop),
            colorFilter = ColorFilter.tint(MaterialTheme.colors.primaryVariant),
            contentScale = ContentScale.FillHeight
        )
        content()
    }
}
