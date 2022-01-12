package planningpoker.compose

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Composition
import androidx.compose.runtime.CompositionContext
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCompositionContext
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.DefaultAlpha
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import planningpoker.compose.theme.LocalColorSchemeName
import planningpoker.compose.vector.RenderVectorGroup
import planningpoker.compose.vector.VectorApplier

@Composable
fun ThemedImage(
    imageVector: ImageVector,
//    contentDescription: String?,
    modifier: Modifier = Modifier,
    alignment: Alignment = Alignment.Center,
    contentScale: ContentScale = ContentScale.Fit,
    alpha: Float = DefaultAlpha,
    colorFilter: ColorFilter? = null
) {
    Image(
        painter = rememberVectorPainter(imageVector),
        contentDescription = LocalColorSchemeName.current,
        modifier = modifier,
        alignment = alignment,
        contentScale = contentScale,
        alpha = alpha,
        colorFilter = colorFilter,
    )
}

@Composable
fun rememberVectorPainter(image: ImageVector) =
    rememberVectorPainter(
        defaultWidth = image.defaultWidth,
        defaultHeight = image.defaultHeight,
        viewportWidth = image.viewportWidth,
        viewportHeight = image.viewportHeight,
        name = LocalColorSchemeName.current,
        tintColor = image.tintColor,
        tintBlendMode = image.tintBlendMode,
        content = { _, _ -> RenderVectorGroup(group = image.root) }
    )

@Composable
fun rememberVectorPainter(
    defaultWidth: Dp,
    defaultHeight: Dp,
    viewportWidth: Float = Float.NaN,
    viewportHeight: Float = Float.NaN,
    name: String = LocalColorSchemeName.current,
    tintColor: Color = Color.Unspecified,
    tintBlendMode: BlendMode = BlendMode.SrcIn,
    content: @Composable (viewportWidth: Float, viewportHeight: Float) -> Unit
): VectorPainter {
    val density = LocalDensity.current
    val widthPx = with(density) { defaultWidth.toPx() }
    val heightPx = with(density) { defaultHeight.toPx() }

    val vpWidth = if (viewportWidth.isNaN()) widthPx else viewportWidth
    val vpHeight = if (viewportHeight.isNaN()) heightPx else viewportHeight
    LogCompositions("create painter")

    val painter = remember(LocalColorSchemeName.current) { VectorPainter() }.apply {
        // This assignment is thread safe as the internal Size parameter is
        // backed by a mutableState object
        size = Size(widthPx, heightPx)
        RenderVector(name, vpWidth, vpHeight, content)
    }
    SideEffect {
        // Initialize the intrinsic color filter if a tint color is provided on the
        // vector itself. Note this tint can be overridden by an explicit ColorFilter
        // provided on the Modifier.paint call
        painter.intrinsicColorFilter = if (tintColor != Color.Unspecified) {
            ColorFilter.tint(tintColor, tintBlendMode)
        } else {
            null
        }
    }
    return painter
}

class VectorPainter internal constructor() : Painter() {

    internal var size by mutableStateOf(Size.Zero)

    /**
     * configures the intrinsic tint that may be defined on a VectorPainter
     */
    internal var intrinsicColorFilter: ColorFilter?
        get() = vector.intrinsicColorFilter
        set(value) {
            vector.intrinsicColorFilter = value
        }

    private val vector = planningpoker.compose.vector.VectorComponent().apply {
        invalidateCallback = {
            isDirty = true
        }
    }

    private var composition: Composition? = null

    private fun composeVector(
        parent: CompositionContext,
        composable: @Composable (viewportWidth: Float, viewportHeight: Float) -> Unit
    ): Composition {
        val existing = composition
        val next = if (existing == null || existing.isDisposed) {
            Composition(
                VectorApplier(vector.root),
                parent
            )
        } else {
            existing
        }
        composition = next
        next.setContent {
            composable(vector.viewportWidth, vector.viewportHeight)
        }
        return next
    }

    private var isDirty by mutableStateOf(true)

    @Composable
    internal fun RenderVector(
        name: String,
        viewportWidth: Float,
        viewportHeight: Float,
        content: @Composable (viewportWidth: Float, viewportHeight: Float) -> Unit
    ) {
        vector.apply {
            this.name = name
            this.viewportWidth = viewportWidth
            this.viewportHeight = viewportHeight
        }
        val composition = composeVector(
            rememberCompositionContext(),
            content
        )

        DisposableEffect(composition) {
            onDispose {
                composition.dispose()
            }
        }
    }

    private var currentAlpha: Float = 1.0f
    private var currentColorFilter: ColorFilter? = null

    override val intrinsicSize: Size
        get() = size

    override fun DrawScope.onDraw() {
        with(vector) {
            draw(currentAlpha, currentColorFilter ?: intrinsicColorFilter)
        }
        // This conditional is necessary to obtain invalidation callbacks as the state is
        // being read here which adds this callback to the snapshot observation
        if (isDirty) {
            isDirty = false
        }
    }

    override fun applyAlpha(alpha: Float): Boolean {
        currentAlpha = alpha
        return true
    }

    override fun applyColorFilter(colorFilter: ColorFilter?): Boolean {
        currentColorFilter = colorFilter
        return true
    }
}
