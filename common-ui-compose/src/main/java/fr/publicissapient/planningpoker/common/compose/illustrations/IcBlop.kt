//package fr.publicissapient.planningpoker.common.compose.illustrations
//
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
//import androidx.compose.ui.graphics.SolidColor
//import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
//import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
//import androidx.compose.ui.graphics.vector.ImageVector
//import androidx.compose.ui.graphics.vector.ImageVector.Builder
//import androidx.compose.ui.graphics.vector.path
//import androidx.compose.ui.unit.dp
//
//
//public val Illu.Cards.IcBlop: ImageVector
//    get() {
//        if (_icBlop != null) {
//            return _icBlop!!
//        }
//        _icBlop = Builder(name = "IcBlop", defaultWidth = 133.0.dp, defaultHeight = 200.0.dp,
//                viewportWidth = 133.0f, viewportHeight = 200.0f).apply {
//            path(fill = SolidColor(Color(0xFFF0D1DD)), stroke = null, strokeLineWidth = 1.0f,
//                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
//                    pathFillType = EvenOdd) {
//                moveTo(0.0f, 188.674f)
//                verticalLineTo(0.517f)
//                curveToRelative(16.413f, -1.924f, 32.918f, 1.477f, 46.389f, 10.932f)
//                curveToRelative(25.341f, 17.786f, 29.703f, 28.513f, 38.43f, 49.975f)
//                curveToRelative(2.164f, 5.322f, 4.596f, 11.304f, 7.683f, 18.217f)
//                curveToRelative(6.311f, 14.125f, 14.566f, 24.133f, 21.918f, 33.046f)
//                curveToRelative(10.739f, 13.02f, 19.551f, 23.703f, 17.557f, 41.469f)
//                curveToRelative(-3.359f, 29.926f, -30.107f, 48.813f, -65.618f, 45.148f)
//                curveToRelative(-1.591f, -0.164f, -3.199f, -0.329f, -4.821f, -0.494f)
//                curveTo(42.13f, 196.829f, 20.6f, 194.63f, 0.0f, 188.674f)
//                close()
//            }
//        }
//        .build()
//        return _icBlop!!
//    }
//
//private var _icBlop: ImageVector? = null
