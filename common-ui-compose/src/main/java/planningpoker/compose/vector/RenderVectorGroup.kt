package planningpoker.compose.vector

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.VectorConfig
import androidx.compose.ui.graphics.vector.VectorGroup
import androidx.compose.ui.graphics.vector.VectorPath
import androidx.compose.ui.graphics.vector.VectorProperty

@Composable
fun RenderVectorGroup(
    group: VectorGroup,
    configs: Map<String, VectorConfig> = emptyMap()
) {
    for (vectorNode in group) {
        if (vectorNode is VectorPath) {
            val config = configs[vectorNode.name] ?: object : VectorConfig {}
            Path(
                pathData = config.getOrDefault(
                    VectorProperty.PathData,
                    vectorNode.pathData
                ),
                pathFillType = vectorNode.pathFillType,
                name = vectorNode.name,
                fill = config.getOrDefault(
                    VectorProperty.Fill,
                    vectorNode.fill
                ),
                fillAlpha = config.getOrDefault(
                    VectorProperty.FillAlpha,
                    vectorNode.fillAlpha
                ),
                stroke = config.getOrDefault(
                    VectorProperty.Stroke,
                    vectorNode.stroke
                ),
                strokeAlpha = config.getOrDefault(
                    VectorProperty.StrokeAlpha,
                    vectorNode.strokeAlpha
                ),
                strokeLineWidth = config.getOrDefault(
                    VectorProperty.StrokeLineWidth,
                    vectorNode.strokeLineWidth
                ),
                strokeLineCap = vectorNode.strokeLineCap,
                strokeLineJoin = vectorNode.strokeLineJoin,
                strokeLineMiter = vectorNode.strokeLineMiter,
                trimPathStart = config.getOrDefault(
                    VectorProperty.TrimPathStart,
                    vectorNode.trimPathStart
                ),
                trimPathEnd = config.getOrDefault(
                    VectorProperty.TrimPathEnd,
                    vectorNode.trimPathEnd
                ),
                trimPathOffset = config.getOrDefault(
                    VectorProperty.TrimPathOffset,
                    vectorNode.trimPathOffset
                )
            )
        } else if (vectorNode is VectorGroup) {
            val config = configs[vectorNode.name] ?: object : VectorConfig {}
            Group(
                name = vectorNode.name,
                rotation = config.getOrDefault(
                    VectorProperty.Rotation,
                    vectorNode.rotation
                ),
                scaleX = config.getOrDefault(
                    VectorProperty.ScaleX,
                    vectorNode.scaleX
                ),
                scaleY = config.getOrDefault(
                    VectorProperty.ScaleY,
                    vectorNode.scaleY
                ),
                translationX = config.getOrDefault(
                    VectorProperty.TranslateX,
                    vectorNode.translationX
                ),
                translationY = config.getOrDefault(
                    VectorProperty.TranslateY,
                    vectorNode.translationY
                ),
                pivotX = config.getOrDefault(
                    VectorProperty.PivotX,
                    vectorNode.pivotX
                ),
                pivotY = config.getOrDefault(
                    VectorProperty.PivotY,
                    vectorNode.pivotY
                ),
                clipPathData = config.getOrDefault(
                    VectorProperty.PathData,
                    vectorNode.clipPathData
                )
            ) {
                RenderVectorGroup(group = vectorNode, configs = configs)
            }
        }
    }
}