package planningpoker.compose.vector

import androidx.compose.runtime.AbstractApplier
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ComposeNode
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.PathNode

@Composable
fun Group(
    name: String = DefaultGroupName,
    rotation: Float = DefaultRotation,
    pivotX: Float = DefaultPivotX,
    pivotY: Float = DefaultPivotY,
    scaleX: Float = DefaultScaleX,
    scaleY: Float = DefaultScaleY,
    translationX: Float = DefaultTranslationX,
    translationY: Float = DefaultTranslationY,
    clipPathData: List<PathNode> = EmptyPath,
    content: @Composable () -> Unit
) {
    ComposeNode<GroupComponent, VectorApplier>(
        factory = { GroupComponent() },
        update = {
            set(name) { this.name = it }
            set(rotation) { this.rotation = it }
            set(pivotX) { this.pivotX = it }
            set(pivotY) { this.pivotY = it }
            set(scaleX) { this.scaleX = it }
            set(scaleY) { this.scaleY = it }
            set(translationX) { this.translationX = it }
            set(translationY) { this.translationY = it }
            set(clipPathData) { this.clipPathData = it }
        }
    ) {
        content()
    }
}

@Composable
fun Path(
    pathData: List<PathNode>,
    pathFillType: PathFillType = DefaultFillType,
    name: String = DefaultPathName,
    fill: Brush? = null,
    fillAlpha: Float = 1.0f,
    stroke: Brush? = null,
    strokeAlpha: Float = 1.0f,
    strokeLineWidth: Float = DefaultStrokeLineWidth,
    strokeLineCap: StrokeCap = DefaultStrokeLineCap,
    strokeLineJoin: StrokeJoin = DefaultStrokeLineJoin,
    strokeLineMiter: Float = DefaultStrokeLineMiter,
    trimPathStart: Float = DefaultTrimPathStart,
    trimPathEnd: Float = DefaultTrimPathEnd,
    trimPathOffset: Float = DefaultTrimPathOffset
) {
    ComposeNode<PathComponent, VectorApplier>(
        factory = { PathComponent() },
        update = {
            set(name) { this.name = it }
            set(pathData) { this.pathData = it }
            set(pathFillType) { this.pathFillType = it }
            set(fill) { this.fill = it }
            set(fillAlpha) { this.fillAlpha = it }
            set(stroke) { this.stroke = it }
            set(strokeAlpha) { this.strokeAlpha = it }
            set(strokeLineWidth) { this.strokeLineWidth = it }
            set(strokeLineJoin) { this.strokeLineJoin = it }
            set(strokeLineCap) { this.strokeLineCap = it }
            set(strokeLineMiter) { this.strokeLineMiter = it }
            set(trimPathStart) { this.trimPathStart = it }
            set(trimPathEnd) { this.trimPathEnd = it }
            set(trimPathOffset) { this.trimPathOffset = it }
        }
    )
}

class VectorApplier(root: VNode) : AbstractApplier<VNode>(root) {
    override fun insertTopDown(index: Int, instance: VNode) {
        current.asGroup().insertAt(index, instance)
    }

    override fun insertBottomUp(index: Int, instance: VNode) {
        // Ignored as the tree is built top-down.
    }

    override fun remove(index: Int, count: Int) {
        current.asGroup().remove(index, count)
    }

    override fun onClear() {
        root.asGroup().let { it.remove(0, it.numChildren) }
    }

    override fun move(from: Int, to: Int, count: Int) {
        current.asGroup().move(from, to, count)
    }

    private fun VNode.asGroup(): GroupComponent {
        return when (this) {
            is GroupComponent -> this
            else -> error("Cannot only insert VNode into Group")
        }
    }
}