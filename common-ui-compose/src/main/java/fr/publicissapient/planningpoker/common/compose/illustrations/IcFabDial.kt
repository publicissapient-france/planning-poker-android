//package fr.publicissapient.planningpoker.common.compose.illustrations
//
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
//import androidx.compose.ui.graphics.SolidColor
//import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
//import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
//import androidx.compose.ui.graphics.vector.ImageVector
//import androidx.compose.ui.graphics.vector.ImageVector.Builder
//import androidx.compose.ui.graphics.vector.path
//import androidx.compose.ui.unit.dp
//
//
//public val Illu.Cards.IcFabDial: ImageVector
//    get() {
//        if (_icFabDial != null) {
//            return _icFabDial!!
//        }
//        _icFabDial = Builder(name = "IcFabDial", defaultWidth = 15.0.dp, defaultHeight = 15.0.dp,
//                viewportWidth = 15.0f, viewportHeight = 15.0f).apply {
//            path(fill = SolidColor(Color(0xFFFE414D)), stroke = null, strokeLineWidth = 1.0f,
//                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
//                    pathFillType = NonZero) {
//                moveTo(0.0f, 7.305f)
//                arcToRelative(7.305f, 7.305f, 0.0f, true, true, 14.61f, 0.0f)
//                arcToRelative(7.305f, 7.305f, 0.0f, true, true, -14.61f, 0.0f)
//            }
//        }
//        .build()
//        return _icFabDial!!
//    }
//
//private var _icFabDial: ImageVector? = null
