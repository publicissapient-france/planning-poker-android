package planningpoker.compose.illustrations

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


public val Illu.Blop: ImageVector
    @Composable get() {
        if (_blop != null) {
            return _blop!!
        }
        _blop = Builder(
            name = "Blop", defaultWidth = 133.0.dp, defaultHeight = 200.0.dp,
            viewportWidth = 133.0f, viewportHeight = 200.0f
        ).apply {
            addPath(
                pathData = addPathNodes("M0 188.674V0.517c16.413-1.924 32.918 1.477 46.389 10.932 25.341 17.786 29.703 28.513 38.43 49.975 2.164 5.322 4.596 11.304 7.683 18.217 6.311 14.125 14.566 24.133 21.918 33.046 10.739 13.02 19.551 23.703 17.557 41.469-3.359 29.926-30.107 48.813-65.618 45.148-1.591-0.164-3.199-0.329-4.821-0.494C42.13 196.829 20.6 194.63 0 188.674z"),
                fill = SolidColor(MaterialTheme.colorScheme.secondaryContainer),
                pathFillType = EvenOdd
            )
        }.build()
        return _blop!!
    }

private var _blop: ImageVector? = null

@Preview
@Composable
private fun ImagePreview() {
    Box {
        Image(
            imageVector = Illu.Blop,
            contentDescription = null,
        )
    }
}
