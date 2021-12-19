package planningpoker.compose.illustrations

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import planningpoker.compose.illustrations.Illu.Cards


public val Illu.FabDial: ImageVector
    @Composable get() {
        if (_fabDial != null) {
            return _fabDial!!
        }
        _fabDial = Builder(
            name = "FabDial", defaultWidth = 15.0.dp, defaultHeight = 15.0.dp,
            viewportWidth = 15.0f, viewportHeight = 15.0f
        ).apply {
            addPath(
                pathData = addPathNodes("M0 7.305a7.305 7.305 0 1 1 14.61 0 7.305 7.305 0 1 1-14.61 0"),
                fill = SolidColor(Color(0xFFFE414D)), strokeLineWidth = 1.0f,
            )
        }
            .build()
        return _fabDial!!
    }

private var _fabDial: ImageVector? = null

@Preview
@Composable
private fun ImagePreview() {
    Box {
        Image(
            imageVector = Illu.FabDial,
            contentDescription = null,
        )
    }
}
