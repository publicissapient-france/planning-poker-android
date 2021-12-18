//package fr.publicissapient.planningpoker.common.compose.illustrations
//
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.graphics.PathFillType
//import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
//import androidx.compose.ui.graphics.SolidColor
//import androidx.compose.ui.graphics.StrokeCap
//import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
//import androidx.compose.ui.graphics.StrokeJoin
//import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
//import androidx.compose.ui.graphics.vector.ImageVector
//import androidx.compose.ui.graphics.vector.ImageVector.Builder
//import androidx.compose.ui.graphics.vector.path
//import androidx.compose.ui.unit.dp
//
//
//public val Illu.Cards.IcQuestion: ImageVector
//    get() {
//        if (_icQuestion != null) {
//            return _icQuestion!!
//        }
//        _icQuestion = Builder(name = "IcQuestion", defaultWidth = 133.0.dp, defaultHeight = 88.0.dp,
//                viewportWidth = 133.0f, viewportHeight = 88.0f).apply {
//            path(fill = SolidColor(Color(0xFFB9DDF4)), stroke = null, fillAlpha = 0.7f,
//                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
//                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
//                moveTo(27.11f, 66.12f)
//                reflectiveCurveToRelative(9.62f, 12.62f, 27.32f, 14.47f)
//                curveToRelative(17.69f, 1.85f, 34.18f, -6.86f, 47.74f, -13.6f)
//                curveToRelative(13.57f, -6.74f, 18.68f, -19.36f, 12.83f, -30.55f)
//                curveToRelative(-5.85f, -11.19f, -17.93f, -8.45f, -31.69f, -17.07f)
//                curveTo(69.57f, 10.76f, 67.29f, 6.62f, 50.75f, 6.02f)
//                curveToRelative(-16.54f, -0.6f, -31.2f, 14.2f, -31.73f, 32.01f)
//                curveToRelative(-0.53f, 17.81f, 8.09f, 28.09f, 8.09f, 28.09f)
//                close()
//            }
//            path(fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
//                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
//                    pathFillType = NonZero) {
//                moveTo(58.45f, 47.37f)
//                verticalLineTo(30.8f)
//                curveToRelative(1.36f, 0.25f, 2.46f, 0.42f, 3.49f, 0.42f)
//                curveToRelative(6.21f, 0.0f, 11.05f, -3.48f, 11.05f, -8.5f)
//                curveToRelative(0.0f, -3.4f, -2.47f, -6.29f, -6.29f, -6.29f)
//                curveToRelative(-3.49f, 0.0f, -5.78f, 2.64f, -5.78f, 6.46f)
//                horizontalLineTo(44.0f)
//                curveTo(44.0f, 11.42f, 53.86f, 3.0f, 67.04f, 3.0f)
//                curveToRelative(13.35f, 0.0f, 22.44f, 9.61f, 22.44f, 20.15f)
//                curveToRelative(0.0f, 8.5f, -5.1f, 14.54f, -15.39f, 18.11f)
//                verticalLineToRelative(6.12f)
//                horizontalLineTo(58.45f)
//                verticalLineToRelative(-0.01f)
//                close()
//                moveToRelative(8.25f, 3.4f)
//                curveToRelative(5.53f, 0.0f, 9.95f, 4.42f, 9.95f, 9.95f)
//                curveToRelative(0.0f, 5.53f, -4.42f, 9.95f, -9.95f, 9.95f)
//                curveToRelative(-5.53f, 0.0f, -9.95f, -4.42f, -9.95f, -9.95f)
//                curveToRelative(0.0f, -5.53f, 4.42f, -9.95f, 9.95f, -9.95f)
//                close()
//            }
//            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = SolidColor(Color(0xFF010202)),
//                    strokeLineWidth = 0.25f, strokeLineCap = Butt, strokeLineJoin = Miter,
//                    strokeLineMiter = 10.0f, pathFillType = NonZero) {
//                moveTo(132.1f, 46.47f)
//                curveToRelative(-0.21f, -0.9f, -1.01f, -1.51f, -1.9f, -1.52f)
//                curveToRelative(0.0f, -0.18f, -0.02f, -0.35f, -0.08f, -0.54f)
//                curveToRelative(-0.09f, -0.29f, -0.26f, -0.56f, -0.46f, -0.79f)
//                curveToRelative(-0.52f, -0.59f, -1.3f, -0.86f, -2.05f, -1.12f)
//                curveToRelative(-0.79f, -0.28f, -1.59f, -0.6f, -2.23f, -1.15f)
//                curveToRelative(-1.2f, -1.06f, -0.78f, -2.64f, -1.61f, -3.87f)
//                curveToRelative(-0.6f, -0.88f, -1.25f, -1.01f, -2.03f, -0.94f)
//                lineToRelative(-0.26f, -0.74f)
//                curveToRelative(2.18f, -0.45f, 3.81f, -0.84f, 3.93f, -1.03f)
//                curveToRelative(0.11f, -0.16f, 0.02f, -1.19f, -0.3f, -2.75f)
//                lineToRelative(2.63f, -1.28f)
//                curveToRelative(0.84f, -0.42f, -2.84f, -9.81f, -3.24f, -10.65f)
//                curveToRelative(-1.98f, -4.15f, -5.32f, -7.34f, -9.35f, -9.2f)
//                curveToRelative(-1.86f, -0.86f, -3.87f, -1.43f, -5.96f, -1.68f)
//                curveToRelative(-0.28f, -0.03f, -1.96f, 0.21f, -2.05f, 0.13f)
//                lineToRelative(-3.71f, -3.15f)
//                curveToRelative(-0.19f, -0.17f, -0.52f, -0.03f, -0.47f, 0.2f)
//                lineToRelative(0.86f, 4.35f)
//                curveToRelative(-3.4f, 1.79f, -5.49f, 4.0f, -5.49f, 4.0f)
//                lineToRelative(1.4f, 1.82f)
//                curveToRelative(0.98f, 1.28f, -1.45f, 8.67f, -1.45f, 8.67f)
//                lineToRelative(3.7f, 3.31f)
//                reflectiveCurveToRelative(2.47f, -0.55f, 2.37f, -1.82f)
//                curveToRelative(-0.11f, -1.27f, 0.43f, -2.46f, 0.43f, -2.46f)
//                lineToRelative(6.67f, -3.0f)
//                lineToRelative(0.07f, 1.22f)
//                lineToRelative(-4.64f, 11.91f)
//                curveToRelative(-0.07f, 0.17f, -0.04f, 0.37f, 0.07f, 0.52f)
//                lineToRelative(2.13f, 2.86f)
//                curveToRelative(0.12f, 0.16f, 0.32f, 0.24f, 0.52f, 0.21f)
//                lineToRelative(3.67f, -0.64f)
//                lineToRelative(0.13f, 0.96f)
//                curveToRelative(-0.71f, 0.31f, -1.26f, 0.8f, -1.39f, 1.73f)
//                curveToRelative(-0.2f, 1.47f, 0.88f, 2.71f, 0.26f, 4.19f)
//                curveToRelative(-0.32f, 0.78f, -0.9f, 1.41f, -1.49f, 2.02f)
//                curveToRelative(-0.55f, 0.56f, -1.14f, 1.15f, -1.34f, 1.91f)
//                curveToRelative(-0.17f, 0.64f, -0.11f, 1.17f, 0.13f, 1.59f)
//                curveToRelative(-0.81f, 0.39f, -1.27f, 1.3f, -1.05f, 2.21f)
//                lineToRelative(0.01f, 0.04f)
//                curveToRelative(0.25f, 1.06f, 1.3f, 1.72f, 2.36f, 1.47f)
//                lineToRelative(19.76f, -4.59f)
//                curveToRelative(1.06f, -0.25f, 1.72f, -1.3f, 1.47f, -2.36f)
//                lineToRelative(-0.02f, -0.04f)
//                close()
//            }
//            path(fill = SolidColor(Color(0xFF8C8E90)), stroke = null, fillAlpha = 0.16f,
//                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
//                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
//                moveTo(113.27f, 37.35f)
//                lineToRelative(8.21f, -1.55f)
//                lineToRelative(0.26f, 0.74f)
//                lineToRelative(-8.41f, 1.08f)
//                lineToRelative(-0.06f, -0.27f)
//                close()
//                moveToRelative(11.85f, -5.33f)
//                curveToRelative(0.18f, -0.08f, -1.53f, -4.66f, -1.71f, -5.12f)
//                curveToRelative(-0.66f, -1.73f, -1.42f, -3.42f, -2.34f, -5.03f)
//                curveToRelative(-1.88f, -3.28f, -4.46f, -6.28f, -7.93f, -7.91f)
//                curveToRelative(-2.41f, -1.13f, -5.3f, -1.95f, -7.97f, -1.3f)
//                curveToRelative(2.01f, -0.48f, 4.18f, -0.72f, 6.23f, -0.54f)
//                curveToRelative(3.67f, 0.32f, 6.71f, 3.05f, 9.01f, 5.72f)
//                curveToRelative(2.15f, 2.49f, 3.82f, 5.38f, 4.91f, 8.48f)
//                curveToRelative(0.12f, 0.35f, 1.73f, 4.72f, 1.52f, 4.86f)
//                lineToRelative(-1.72f, 0.84f)
//                close()
//            }
//            path(fill = SolidColor(Color(0xFF079FFF)), stroke = SolidColor(Color(0xFF010202)),
//                    strokeLineWidth = 0.25f, strokeLineCap = Butt, strokeLineJoin = Miter,
//                    strokeLineMiter = 10.0f, pathFillType = NonZero) {
//                moveTo(103.69f, 75.92f)
//                curveToRelative(0.05f, -0.07f, 0.1f, -0.16f, 0.13f, -0.25f)
//                curveToRelative(0.05f, -0.15f, 0.06f, -0.32f, 0.04f, -0.48f)
//                curveToRelative(-0.04f, -0.41f, -0.3f, -0.77f, -0.53f, -1.11f)
//                curveToRelative(-0.25f, -0.36f, -0.5f, -0.74f, -0.6f, -1.17f)
//                curveToRelative(-0.1f, -0.44f, 0.38f, -3.05f, 0.85f, -5.36f)
//                lineToRelative(1.22f, 0.51f)
//                curveToRelative(0.25f, 0.1f, 0.52f, -0.12f, 0.45f, -0.38f)
//                curveToRelative(-0.15f, -0.61f, -0.39f, -1.17f, -0.7f, -1.65f)
//                curveToRelative(1.02f, -0.31f, 1.89f, -1.05f, 2.33f, -2.11f)
//                curveToRelative(0.78f, -1.88f, -0.11f, -4.04f, -1.99f, -4.82f)
//                curveToRelative(-1.88f, -0.78f, -4.04f, 0.11f, -4.82f, 1.99f)
//                curveToRelative(-0.44f, 1.06f, -0.35f, 2.2f, 0.14f, 3.14f)
//                curveToRelative(-0.56f, 0.12f, -1.12f, 0.35f, -1.66f, 0.67f)
//                curveToRelative(-0.23f, 0.14f, -0.21f, 0.48f, 0.04f, 0.59f)
//                lineToRelative(1.15f, 0.48f)
//                curveToRelative(-1.27f, 1.95f, -2.72f, 4.11f, -3.1f, 4.34f)
//                curveToRelative(-0.38f, 0.23f, -0.82f, 0.33f, -1.26f, 0.4f)
//                curveToRelative(-0.41f, 0.07f, -0.84f, 0.14f, -1.16f, 0.4f)
//                curveToRelative(-0.27f, 0.22f, -0.4f, 0.46f, -0.43f, 0.72f)
//                curveToRelative(-0.47f, -0.08f, -0.94f, 0.17f, -1.13f, 0.62f)
//                lineToRelative(-0.01f, 0.02f)
//                curveToRelative(-0.22f, 0.53f, 0.03f, 1.13f, 0.56f, 1.35f)
//                lineToRelative(9.45f, 3.92f)
//                curveToRelative(0.53f, 0.22f, 1.13f, -0.03f, 1.35f, -0.56f)
//                lineToRelative(0.01f, -0.02f)
//                curveToRelative(0.21f, -0.45f, 0.05f, -0.96f, -0.33f, -1.24f)
//                close()
//            }
//            path(fill = SolidColor(Color(0xFF8C8E90)), stroke = null, fillAlpha = 0.16f,
//                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
//                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
//                moveTo(100.34f, 64.3f)
//                reflectiveCurveToRelative(1.52f, 2.21f, 4.11f, 1.69f)
//                curveToRelative(-0.46f, 0.27f, -2.8f, 1.51f, -4.11f, -1.69f)
//                close()
//                moveToRelative(-0.53f, 1.61f)
//                lineToRelative(3.6f, 2.31f)
//                lineToRelative(0.16f, -0.79f)
//                lineToRelative(-3.76f, -1.52f)
//                close()
//            }
//            path(fill = SolidColor(Color(0xFF1C6B9A)), stroke = null, strokeLineWidth = 0.0f,
//                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
//                    pathFillType = NonZero) {
//                moveTo(55.12f, 85.06f)
//                curveToRelative(0.0f, 1.56f, -12.35f, 2.81f, -27.56f, 2.81f)
//                curveTo(12.35f, 87.87f, 0.0f, 86.61f, 0.0f, 85.06f)
//                reflectiveCurveToRelative(12.35f, -2.8f, 27.56f, -2.8f)
//                curveToRelative(15.21f, 0.0f, 27.56f, 1.25f, 27.56f, 2.8f)
//                close()
//            }
//            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = SolidColor(Color(0xFF010202)),
//                    strokeLineWidth = 0.25f, strokeLineCap = Butt, strokeLineJoin = Miter,
//                    strokeLineMiter = 10.0f, pathFillType = NonZero) {
//                moveTo(29.3f, 81.01f)
//                curveToRelative(0.05f, -0.19f, 0.07f, -0.39f, 0.06f, -0.61f)
//                curveToRelative(-0.02f, -0.34f, -0.14f, -0.67f, -0.3f, -0.97f)
//                curveToRelative(-0.41f, -0.78f, -1.2f, -1.27f, -1.94f, -1.75f)
//                curveToRelative(-0.79f, -0.51f, -1.58f, -1.07f, -2.13f, -1.83f)
//                curveToRelative(-0.48f, -0.68f, -2.1f, -13.05f, -2.45f, -19.31f)
//                horizontalLineToRelative(3.06f)
//                verticalLineToRelative(-1.77f)
//                horizontalLineToRelative(1.71f)
//                lineToRelative(0.63f, -9.75f)
//                horizontalLineToRelative(-4.27f)
//                lineToRelative(-0.64f, 2.91f)
//                horizontalLineToRelative(-2.34f)
//                verticalLineToRelative(-2.91f)
//                horizontalLineToRelative(-5.68f)
//                verticalLineToRelative(2.91f)
//                horizontalLineToRelative(-2.33f)
//                lineToRelative(-0.64f, -2.91f)
//                horizontalLineTo(7.33f)
//                lineToRelative(1.07f, 9.75f)
//                horizontalLineToRelative(1.71f)
//                verticalLineToRelative(1.77f)
//                horizontalLineToRelative(3.2f)
//                curveToRelative(-0.49f, 6.32f, -1.9f, 18.34f, -2.39f, 19.01f)
//                curveToRelative(-0.56f, 0.76f, -1.36f, 1.3f, -2.15f, 1.8f)
//                curveToRelative(-0.75f, 0.47f, -1.54f, 0.95f, -1.96f, 1.72f)
//                curveToRelative(-0.36f, 0.65f, -0.43f, 1.24f, -0.28f, 1.76f)
//                curveToRelative(-0.98f, 0.21f, -1.72f, 1.08f, -1.73f, 2.12f)
//                verticalLineToRelative(0.04f)
//                curveToRelative(0.0f, 1.22f, 0.98f, 2.21f, 2.2f, 2.22f)
//                lineToRelative(21.76f, 0.17f)
//                curveToRelative(1.22f, 0.01f, 2.21f, -0.96f, 2.22f, -2.18f)
//                verticalLineToRelative(-0.04f)
//                curveToRelative(0.0f, -1.04f, -0.71f, -1.91f, -1.68f, -2.15f)
//                close()
//            }
//            path(fill = SolidColor(Color(0xFF8C8E90)), stroke = null, fillAlpha = 0.16f,
//                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
//                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
//                moveTo(13.34f, 56.55f)
//                lineToRelative(9.31f, 1.46f)
//                lineToRelative(-0.1f, -1.47f)
//                lineToRelative(-9.21f, 0.01f)
//                close()
//            }
//            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
//                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
//                    pathFillType = NonZero) {
//                moveTo(41.74f, 47.88f)
//                lineToRelative(-0.76f, 1.4f)
//                curveToRelative(-0.1f, 0.17f, -0.45f, 1.1f, -0.35f, 1.32f)
//                curveToRelative(0.11f, 0.22f, 0.21f, 0.35f, 0.42f, 0.38f)
//                curveToRelative(0.21f, 0.03f, 0.38f, 0.42f, 0.73f, 0.49f)
//                curveToRelative(0.22f, 0.04f, 0.44f, 0.07f, 0.66f, 0.07f)
//                curveToRelative(0.11f, 0.08f, 0.25f, 0.11f, 0.38f, 0.07f)
//                curveToRelative(0.21f, -0.07f, 0.38f, -0.17f, 0.52f, -0.76f)
//                curveToRelative(0.08f, -0.29f, 0.11f, -0.6f, 0.07f, -0.9f)
//                lineToRelative(-0.06f, -1.19f)
//                lineToRelative(-1.61f, -0.88f)
//                close()
//            }
//            path(fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
//                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
//                    pathFillType = NonZero) {
//                moveTo(42.7f, 51.74f)
//                curveToRelative(-0.1f, 0.0f, -0.21f, -0.03f, -0.3f, -0.09f)
//                curveToRelative(-0.22f, -0.01f, -0.43f, -0.03f, -0.65f, -0.07f)
//                curveToRelative(-0.2f, -0.05f, -0.38f, -0.17f, -0.51f, -0.32f)
//                curveToRelative(-0.06f, -0.07f, -0.14f, -0.13f, -0.22f, -0.16f)
//                curveToRelative(-0.23f, -0.05f, -0.42f, -0.22f, -0.5f, -0.44f)
//                curveToRelative(-0.14f, -0.28f, 0.27f, -1.3f, 0.35f, -1.42f)
//                lineToRelative(0.76f, -1.4f)
//                curveToRelative(0.01f, -0.03f, 0.04f, -0.04f, 0.07f, -0.05f)
//                horizontalLineToRelative(0.08f)
//                lineToRelative(1.61f, 0.87f)
//                curveToRelative(0.03f, 0.02f, 0.06f, 0.05f, 0.06f, 0.09f)
//                lineToRelative(0.06f, 1.19f)
//                curveToRelative(0.04f, 0.31f, 0.02f, 0.63f, -0.07f, 0.93f)
//                curveToRelative(-0.14f, 0.59f, -0.32f, 0.75f, -0.59f, 0.84f)
//                lineToRelative(-0.15f, 0.03f)
//                close()
//                moveToRelative(-0.91f, -3.71f)
//                lineToRelative(-0.71f, 1.31f)
//                curveToRelative(-0.12f, 0.2f, -0.41f, 1.08f, -0.34f, 1.21f)
//                curveToRelative(0.11f, 0.22f, 0.19f, 0.3f, 0.34f, 0.32f)
//                curveToRelative(0.13f, 0.04f, 0.25f, 0.12f, 0.33f, 0.22f)
//                curveToRelative(0.1f, 0.13f, 0.24f, 0.22f, 0.4f, 0.26f)
//                curveToRelative(0.21f, 0.04f, 0.42f, 0.06f, 0.64f, 0.07f)
//                lineToRelative(0.07f, 0.02f)
//                curveToRelative(0.08f, 0.06f, 0.18f, 0.08f, 0.28f, 0.05f)
//                curveToRelative(0.15f, -0.05f, 0.31f, -0.1f, 0.44f, -0.68f)
//                curveToRelative(0.08f, -0.28f, 0.1f, -0.57f, 0.07f, -0.86f)
//                lineToRelative(-0.06f, -1.15f)
//                lineToRelative(-1.46f, -0.77f)
//                close()
//            }
//            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
//                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
//                    pathFillType = NonZero) {
//                moveTo(45.56f, 81.01f)
//                reflectiveCurveToRelative(-0.94f, 1.53f, -0.94f, 1.9f)
//                curveToRelative(0.0f, 0.37f, 1.3f, 1.05f, 1.85f, 1.3f)
//                curveToRelative(0.56f, 0.25f, 1.54f, 0.44f, 2.35f, 0.56f)
//                curveToRelative(0.8f, 0.11f, 2.47f, 0.44f, 1.98f, -0.19f)
//                curveToRelative(-0.49f, -0.63f, -3.47f, -2.28f, -3.59f, -2.47f)
//                curveToRelative(-0.15f, -0.18f, -0.32f, -0.35f, -0.51f, -0.5f)
//                lineToRelative(-1.14f, -0.6f)
//                close()
//            }
//            path(fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
//                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
//                    pathFillType = NonZero) {
//                moveTo(50.4f, 85.06f)
//                curveToRelative(-0.47f, -0.02f, -0.94f, -0.07f, -1.4f, -0.16f)
//                lineToRelative(-0.2f, -0.03f)
//                curveToRelative(-1.12f, -0.17f, -1.92f, -0.36f, -2.37f, -0.56f)
//                curveToRelative(-0.08f, -0.04f, -1.92f, -0.86f, -1.92f, -1.4f)
//                curveToRelative(0.0f, -0.39f, 0.86f, -1.8f, 0.96f, -1.96f)
//                curveToRelative(0.03f, -0.05f, 0.09f, -0.07f, 0.15f, -0.04f)
//                lineToRelative(1.14f, 0.6f)
//                curveToRelative(0.2f, 0.16f, 0.39f, 0.34f, 0.55f, 0.54f)
//                curveToRelative(0.05f, 0.06f, 0.54f, 0.37f, 1.01f, 0.66f)
//                curveToRelative(1.0f, 0.62f, 2.24f, 1.4f, 2.57f, 1.8f)
//                curveToRelative(0.12f, 0.15f, 0.15f, 0.27f, 0.08f, 0.37f)
//                curveToRelative(-0.07f, 0.11f, -0.26f, 0.18f, -0.57f, 0.18f)
//                close()
//                moveToRelative(-4.8f, -3.9f)
//                curveToRelative(-0.36f, 0.59f, -0.87f, 1.52f, -0.87f, 1.76f)
//                reflectiveCurveToRelative(0.94f, 0.82f, 1.79f, 1.2f)
//                curveToRelative(0.44f, 0.19f, 1.22f, 0.38f, 2.32f, 0.55f)
//                lineToRelative(0.2f, 0.03f)
//                curveToRelative(0.41f, 0.06f, 1.64f, 0.26f, 1.74f, 0.09f)
//                curveToRelative(0.0f, 0.0f, 0.0f, -0.04f, -0.07f, -0.13f)
//                curveToRelative(-0.3f, -0.37f, -1.58f, -1.17f, -2.51f, -1.76f)
//                curveToRelative(-0.75f, -0.47f, -1.02f, -0.64f, -1.08f, -0.72f)
//                curveToRelative(-0.15f, -0.17f, -0.31f, -0.33f, -0.49f, -0.47f)
//                lineToRelative(-1.03f, -0.55f)
//                close()
//            }
//            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
//                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
//                    pathFillType = NonZero) {
//                moveTo(47.04f, 83.42f)
//                lineToRelative(0.33f, 0.49f)
//                curveToRelative(0.36f, 0.54f, 0.84f, 0.98f, 1.41f, 1.29f)
//                curveToRelative(0.88f, 0.48f, 2.24f, 1.02f, 3.43f, 0.69f)
//                curveToRelative(1.94f, -0.54f, -2.95f, -3.49f, -2.95f, -3.49f)
//                reflectiveCurveToRelative(-1.75f, 1.23f, -2.22f, 1.02f)
//                close()
//            }
//            path(fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
//                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
//                    pathFillType = NonZero) {
//                moveTo(51.43f, 86.11f)
//                curveToRelative(-0.98f, 0.0f, -1.98f, -0.41f, -2.71f, -0.81f)
//                curveToRelative(-0.58f, -0.32f, -1.08f, -0.77f, -1.45f, -1.32f)
//                lineToRelative(-0.33f, -0.5f)
//                curveToRelative(-0.03f, -0.04f, -0.03f, -0.09f, 0.0f, -0.13f)
//                curveToRelative(0.03f, -0.04f, 0.08f, -0.05f, 0.13f, -0.03f)
//                curveToRelative(0.28f, 0.12f, 1.4f, -0.51f, 2.11f, -1.0f)
//                curveToRelative(0.04f, -0.02f, 0.08f, -0.02f, 0.12f, 0.0f)
//                curveToRelative(0.37f, 0.22f, 3.6f, 2.2f, 3.46f, 3.21f)
//                curveToRelative(-0.03f, 0.22f, -0.22f, 0.39f, -0.53f, 0.48f)
//                curveToRelative(-0.26f, 0.07f, -0.53f, 0.11f, -0.8f, 0.1f)
//                close()
//                moveToRelative(-4.17f, -2.56f)
//                lineToRelative(0.21f, 0.31f)
//                curveToRelative(0.35f, 0.52f, 0.82f, 0.95f, 1.37f, 1.25f)
//                curveToRelative(0.9f, 0.49f, 2.2f, 1.0f, 3.35f, 0.69f)
//                curveToRelative(0.34f, -0.1f, 0.37f, -0.25f, 0.37f, -0.3f)
//                curveToRelative(0.1f, -0.72f, -2.29f, -2.34f, -3.29f, -2.95f)
//                curveToRelative(-0.36f, 0.23f, -1.42f, 0.93f, -2.01f, 1.0f)
//                close()
//            }
//            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
//                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
//                    pathFillType = NonZero) {
//                moveTo(47.6f, 83.66f)
//                curveToRelative(0.54f, 0.81f, 1.35f, 1.4f, 2.28f, 1.66f)
//                curveToRelative(1.6f, 0.46f, 2.06f, 0.34f, 2.4f, -0.11f)
//            }
//            path(fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
//                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
//                    pathFillType = NonZero) {
//                moveTo(51.41f, 85.71f)
//                curveToRelative(-0.53f, -0.03f, -1.05f, -0.13f, -1.55f, -0.3f)
//                curveToRelative(-0.97f, -0.26f, -1.8f, -0.87f, -2.35f, -1.71f)
//                curveToRelative(-0.03f, -0.05f, -0.01f, -0.12f, 0.04f, -0.15f)
//                reflectiveCurveToRelative(0.12f, -0.01f, 0.15f, 0.04f)
//                curveToRelative(0.52f, 0.78f, 1.31f, 1.35f, 2.22f, 1.61f)
//                curveToRelative(1.56f, 0.44f, 1.98f, 0.33f, 2.28f, -0.07f)
//                curveToRelative(0.04f, -0.05f, 0.11f, -0.06f, 0.15f, -0.02f)
//                curveToRelative(0.05f, 0.04f, 0.06f, 0.11f, 0.02f, 0.15f)
//                curveToRelative(-0.22f, 0.31f, -0.58f, 0.48f, -0.96f, 0.45f)
//                close()
//            }
//            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
//                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
//                    pathFillType = NonZero) {
//                moveTo(44.74f, 82.63f)
//                reflectiveCurveToRelative(1.76f, 1.26f, 2.63f, 1.29f)
//                close()
//            }
//            path(fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
//                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
//                    pathFillType = NonZero) {
//                moveTo(47.36f, 84.03f)
//                curveToRelative(-0.88f, -0.02f, -2.61f, -1.26f, -2.69f, -1.31f)
//                curveToRelative(-0.05f, -0.04f, -0.06f, -0.1f, -0.02f, -0.15f)
//                curveToRelative(0.03f, -0.05f, 0.1f, -0.06f, 0.15f, -0.03f)
//                curveToRelative(0.02f, 0.01f, 1.75f, 1.25f, 2.56f, 1.27f)
//                curveToRelative(0.06f, 0.0f, 0.11f, 0.05f, 0.11f, 0.11f)
//                reflectiveCurveToRelative(-0.05f, 0.11f, -0.11f, 0.11f)
//                close()
//                moveTo(40.91f, 48.3f)
//                reflectiveCurveToRelative(1.57f, 2.6f, 1.9f, 3.2f)
//                curveToRelative(0.33f, 0.6f, 4.56f, 5.43f, 6.24f, 9.59f)
//                curveToRelative(1.68f, 4.16f, 3.29f, 7.91f, 3.22f, 9.12f)
//                curveToRelative(-0.07f, 1.21f, -5.57f, 11.4f, -5.57f, 11.4f)
//                lineToRelative(-1.14f, -0.6f)
//                reflectiveCurveToRelative(1.74f, -9.59f, 1.54f, -10.6f)
//                curveToRelative(-0.2f, -1.01f, -6.36f, -11.0f, -6.36f, -11.0f)
//                reflectiveCurveToRelative(-2.88f, -2.01f, -4.09f, -4.36f)
//            }
//            path(fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
//                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
//                    pathFillType = NonZero) {
//                moveTo(41.14f, 54.79f)
//                reflectiveCurveToRelative(-0.87f, 1.88f, -0.87f, 2.15f)
//                reflectiveCurveToRelative(4.89f, 14.69f, 6.3f, 17.97f)
//                curveToRelative(0.89f, 2.1f, 1.67f, 4.25f, 2.35f, 6.44f)
//                curveToRelative(0.0f, 0.0f, 0.54f, 0.66f, 0.13f, 1.34f)
//                curveToRelative(-0.4f, 0.68f, -2.01f, 1.14f, -2.35f, 0.54f)
//                curveToRelative(-0.34f, -0.6f, -3.62f, -3.75f, -5.03f, -6.91f)
//                curveToRelative(-1.41f, -3.16f, -3.42f, -8.52f, -4.56f, -10.53f)
//                curveToRelative(-1.5f, -2.57f, -2.85f, -5.24f, -4.02f, -7.98f)
//                curveToRelative(-1.48f, -3.49f, -3.0f, -7.27f, -3.0f, -7.27f)
//                curveToRelative(1.99f, 0.17f, 4.0f, -0.06f, 5.9f, -0.66f)
//                curveToRelative(3.09f, -1.01f, 4.41f, -2.93f, 4.41f, -2.93f)
//                reflectiveCurveToRelative(0.78f, 2.01f, 0.99f, 2.39f)
//            }
//            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
//                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
//                    pathFillType = NonZero) {
//                moveTo(41.6f, 60.45f)
//                curveToRelative(-0.03f, 0.0f, -0.06f, -0.02f, -0.07f, -0.05f)
//                lineToRelative(-1.54f, -4.01f)
//                curveToRelative(-0.01f, -0.03f, 0.0f, -0.06f, 0.02f, -0.09f)
//                lineToRelative(1.73f, -1.48f)
//                curveToRelative(0.03f, -0.03f, 0.08f, -0.03f, 0.11f, 0.0f)
//                reflectiveCurveToRelative(0.03f, 0.08f, 0.0f, 0.11f)
//                lineToRelative(-1.69f, 1.45f)
//                lineToRelative(1.52f, 3.97f)
//                curveToRelative(0.02f, 0.04f, 0.0f, 0.08f, -0.04f, 0.1f)
//                horizontalLineTo(41.6f)
//                close()
//            }
//            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
//                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
//                    pathFillType = NonZero) {
//                moveTo(40.05f, 56.44f)
//                lineTo(40.0f, 56.42f)
//                curveToRelative(-0.02f, -0.01f, -0.02f, -0.03f, -0.02f, -0.06f)
//                curveToRelative(0.0f, -0.01f, 0.0f, -1.22f, -0.54f, -1.98f)
//                lineToRelative(-0.33f, -0.48f)
//                curveToRelative(-0.28f, -0.4f, -0.37f, -0.52f, -0.42f, -0.72f)
//                curveToRelative(-0.03f, -0.23f, -0.03f, -0.47f, 0.0f, -0.71f)
//                curveToRelative(0.01f, -0.04f, 0.05f, -0.07f, 0.09f, -0.06f)
//                curveToRelative(0.04f, 0.01f, 0.07f, 0.04f, 0.06f, 0.08f)
//                curveToRelative(-0.03f, 0.22f, -0.03f, 0.43f, 0.0f, 0.65f)
//                curveToRelative(0.04f, 0.17f, 0.12f, 0.28f, 0.4f, 0.67f)
//                lineToRelative(0.33f, 0.48f)
//                curveToRelative(0.49f, 0.7f, 0.56f, 1.71f, 0.57f, 2.0f)
//                lineToRelative(3.13f, -0.12f)
//                curveToRelative(0.04f, 0.0f, 0.08f, 0.03f, 0.08f, 0.07f)
//                curveToRelative(0.0f, 0.04f, -0.03f, 0.07f, -0.07f, 0.08f)
//                lineToRelative(-3.23f, 0.12f)
//                close()
//                moveToRelative(10.5f, 14.27f)
//                curveToRelative(-1.4f, 0.0f, -3.17f, -0.9f, -3.25f, -0.94f)
//                curveToRelative(-0.04f, -0.02f, -0.05f, -0.06f, -0.03f, -0.1f)
//                curveToRelative(0.02f, -0.04f, 0.06f, -0.05f, 0.1f, -0.03f)
//                curveToRelative(0.02f, 0.01f, 2.04f, 1.04f, 3.42f, 0.92f)
//                curveToRelative(0.04f, 0.0f, 0.08f, 0.03f, 0.08f, 0.07f)
//                curveToRelative(0.0f, 0.04f, -0.03f, 0.08f, -0.07f, 0.08f)
//                horizontalLineToRelative(-0.25f)
//                close()
//                moveToRelative(-0.19f, 1.16f)
//                horizontalLineToRelative(-0.02f)
//                curveToRelative(-1.24f, -0.31f, -2.63f, -1.45f, -2.69f, -1.5f)
//                curveToRelative(-0.03f, -0.03f, -0.03f, -0.08f, 0.0f, -0.11f)
//                reflectiveCurveToRelative(0.07f, -0.04f, 0.11f, -0.01f)
//                curveToRelative(0.01f, 0.01f, 1.42f, 1.17f, 2.63f, 1.47f)
//                curveToRelative(0.04f, 0.01f, 0.06f, 0.05f, 0.05f, 0.09f)
//                curveToRelative(0.0f, 0.05f, -0.04f, 0.07f, -0.08f, 0.06f)
//                close()
//            }
//            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
//                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
//                    pathFillType = NonZero) {
//                moveTo(39.99f, 55.26f)
//                curveToRelative(-0.02f, 0.0f, -0.05f, -0.01f, -0.06f, -0.03f)
//                curveToRelative(-0.02f, -0.03f, -0.02f, -0.08f, 0.02f, -0.1f)
//                curveToRelative(0.3f, -0.21f, 0.77f, -0.61f, 0.77f, -0.8f)
//                curveToRelative(0.0f, -0.13f, -0.16f, -0.28f, -0.33f, -0.44f)
//                curveToRelative(-0.19f, -0.16f, -0.35f, -0.35f, -0.46f, -0.57f)
//                curveToRelative(-0.11f, -0.26f, -0.52f, -1.29f, -0.44f, -1.54f)
//                curveToRelative(0.01f, -0.04f, 0.05f, -0.06f, 0.09f, -0.05f)
//                curveToRelative(0.04f, 0.01f, 0.06f, 0.06f, 0.05f, 0.1f)
//                curveToRelative(-0.05f, 0.13f, 0.19f, 0.88f, 0.43f, 1.43f)
//                curveToRelative(0.11f, 0.2f, 0.25f, 0.38f, 0.43f, 0.52f)
//                curveToRelative(0.21f, 0.2f, 0.38f, 0.36f, 0.38f, 0.56f)
//                curveToRelative(0.0f, 0.34f, -0.75f, 0.87f, -0.84f, 0.93f)
//                lineToRelative(-0.04f, -0.01f)
//                close()
//                moveToRelative(-7.35f, 0.44f)
//                curveToRelative(-0.04f, 0.0f, -0.08f, -0.03f, -0.08f, -0.07f)
//                curveToRelative(0.0f, -0.02f, 0.01f, -0.05f, 0.03f, -0.06f)
//                lineToRelative(0.62f, -0.49f)
//                curveToRelative(0.59f, -0.47f, 0.96f, -1.68f, 0.96f, -1.69f)
//                curveToRelative(0.01f, -0.04f, 0.05f, -0.06f, 0.09f, -0.05f)
//                curveToRelative(0.04f, 0.01f, 0.06f, 0.05f, 0.05f, 0.09f)
//                curveToRelative(-0.02f, 0.05f, -0.39f, 1.26f, -1.01f, 1.76f)
//                lineToRelative(-0.62f, 0.49f)
//                lineToRelative(-0.04f, 0.02f)
//                close()
//            }
//            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
//                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
//                    pathFillType = NonZero) {
//                moveTo(47.3f, 83.52f)
//                lineToRelative(-0.06f, -0.03f)
//                curveToRelative(-0.79f, -0.97f, -1.5f, -2.0f, -2.13f, -3.07f)
//                curveToRelative(-0.85f, -1.53f, -3.31f, -5.7f, -3.33f, -5.73f)
//                curveToRelative(-0.23f, -0.5f, -0.4f, -1.03f, -0.5f, -1.57f)
//                lineToRelative(-0.04f, -0.22f)
//                curveToRelative(-0.08f, -0.56f, -0.12f, -0.78f, -0.86f, -1.26f)
//                reflectiveCurveToRelative(-0.78f, -1.31f, -0.85f, -2.19f)
//                lineToRelative(-0.05f, -0.64f)
//                curveToRelative(-0.1f, -0.88f, -2.44f, -4.85f, -4.15f, -7.73f)
//                lineToRelative(-1.03f, -1.74f)
//                curveToRelative(-1.53f, -2.63f, -2.59f, -6.09f, -2.6f, -6.13f)
//                curveToRelative(-0.01f, -0.04f, 0.01f, -0.08f, 0.05f, -0.09f)
//                curveToRelative(0.04f, -0.01f, 0.08f, 0.01f, 0.09f, 0.05f)
//                curveToRelative(0.01f, 0.04f, 1.06f, 3.48f, 2.59f, 6.1f)
//                lineToRelative(1.03f, 1.74f)
//                curveToRelative(1.72f, 2.9f, 4.07f, 6.87f, 4.17f, 7.79f)
//                lineToRelative(0.06f, 0.65f)
//                curveToRelative(0.06f, 0.88f, 0.11f, 1.65f, 0.78f, 2.08f)
//                curveToRelative(0.8f, 0.51f, 0.84f, 0.78f, 0.92f, 1.36f)
//                curveToRelative(0.0f, 0.07f, 0.02f, 0.15f, 0.04f, 0.23f)
//                curveToRelative(0.1f, 0.52f, 0.27f, 1.04f, 0.49f, 1.52f)
//                curveToRelative(0.02f, 0.04f, 2.48f, 4.21f, 3.33f, 5.73f)
//                curveToRelative(0.63f, 1.07f, 1.33f, 2.09f, 2.12f, 3.05f)
//                curveToRelative(0.03f, 0.03f, 0.02f, 0.08f, -0.01f, 0.11f)
//                lineToRelative(-0.06f, -0.01f)
//                close()
//            }
//            path(fill = SolidColor(Color(0xFF1C6B9A)), stroke = null, strokeLineWidth = 0.0f,
//                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
//                    pathFillType = NonZero) {
//                moveTo(30.1f, 50.54f)
//                reflectiveCurveToRelative(0.14f, 1.56f, 0.76f, 2.05f)
//                curveToRelative(0.62f, 0.49f, 2.47f, 0.93f, 5.0f, 0.44f)
//                curveToRelative(2.53f, -0.49f, 5.31f, -2.65f, 5.56f, -3.4f)
//                reflectiveCurveToRelative(-1.01f, -2.69f, -1.01f, -2.69f)
//                reflectiveCurveToRelative(-1.46f, 2.07f, -5.53f, 2.75f)
//                curveToRelative(-4.07f, 0.68f, -4.78f, 0.85f, -4.78f, 0.85f)
//                close()
//            }
//            path(fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
//                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
//                    pathFillType = NonZero) {
//                moveTo(33.71f, 53.36f)
//                curveToRelative(-1.49f, 0.0f, -2.52f, -0.35f, -2.93f, -0.67f)
//                curveToRelative(-0.65f, -0.52f, -0.79f, -2.06f, -0.8f, -2.13f)
//                curveToRelative(0.0f, -0.05f, 0.03f, -0.1f, 0.08f, -0.12f)
//                curveToRelative(0.03f, 0.0f, 0.75f, -0.18f, 4.78f, -0.85f)
//                curveToRelative(3.97f, -0.66f, 5.45f, -2.69f, 5.46f, -2.71f)
//                curveToRelative(0.02f, -0.03f, 0.05f, -0.05f, 0.09f, -0.05f)
//                curveToRelative(0.04f, 0.0f, 0.07f, 0.02f, 0.09f, 0.05f)
//                curveToRelative(0.13f, 0.2f, 1.28f, 2.02f, 1.02f, 2.78f)
//                curveToRelative(-0.27f, 0.81f, -3.11f, 2.97f, -5.64f, 3.47f)
//                curveToRelative(-0.7f, 0.15f, -1.42f, 0.22f, -2.15f, 0.23f)
//                close()
//                moveToRelative(-3.49f, -2.73f)
//                curveToRelative(0.04f, 0.34f, 0.22f, 1.49f, 0.71f, 1.88f)
//                curveToRelative(0.55f, 0.44f, 2.32f, 0.92f, 4.91f, 0.41f)
//                curveToRelative(2.55f, -0.5f, 5.25f, -2.66f, 5.47f, -3.32f)
//                curveToRelative(0.17f, -0.52f, -0.54f, -1.85f, -0.92f, -2.46f)
//                curveToRelative(-0.39f, 0.47f, -1.97f, 2.08f, -5.51f, 2.67f)
//                curveToRelative(-3.27f, 0.54f, -4.37f, 0.75f, -4.66f, 0.82f)
//                close()
//            }
//            path(fill = SolidColor(Color(0xFF079FFF)), stroke = null, strokeLineWidth = 0.0f,
//                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
//                    pathFillType = NonZero) {
//                moveTo(46.37f, 35.41f)
//                curveToRelative(-1.01f, -0.66f, -8.85f, -6.77f, -9.59f, -7.04f)
//                curveToRelative(-0.74f, -0.27f, -2.2f, 0.0f, -2.2f, 0.0f)
//                reflectiveCurveToRelative(-4.55f, 0.56f, -5.5f, 0.94f)
//                curveToRelative(-0.09f, 0.04f, -2.14f, 1.21f, -2.2f, 1.27f)
//                curveToRelative(-0.74f, 0.6f, -3.97f, 2.09f, -4.84f, 3.97f)
//                curveToRelative(-0.99f, 2.13f, 7.68f, 14.92f, 8.08f, 15.99f)
//                curveToRelative(0.4f, 1.07f, 2.52f, 1.34f, 4.46f, 1.07f)
//                reflectiveCurveToRelative(3.65f, -0.66f, 5.06f, -2.27f)
//                curveToRelative(0.26f, -0.32f, 0.47f, -0.67f, 0.64f, -1.05f)
//                curveToRelative(0.2f, -0.42f, 0.25f, -0.89f, 0.15f, -1.34f)
//                curveToRelative(-0.5f, -2.09f, -1.79f, -8.13f, -2.63f, -12.13f)
//                curveToRelative(1.41f, 0.91f, 4.35f, 2.76f, 6.05f, 3.41f)
//                curveToRelative(2.28f, 0.88f, 4.02f, 0.27f, 4.02f, -0.47f)
//                curveToRelative(-0.01f, -0.74f, -0.5f, -1.68f, -1.5f, -2.35f)
//                close()
//            }
//            path(fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
//                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
//                    pathFillType = NonZero) {
//                moveTo(33.15f, 51.82f)
//                curveToRelative(-1.49f, 0.0f, -2.82f, -0.35f, -3.16f, -1.24f)
//                curveToRelative(-0.1f, -0.26f, -0.75f, -1.32f, -1.58f, -2.66f)
//                curveToRelative(-3.51f, -5.7f, -7.2f, -11.91f, -6.5f, -13.42f)
//                curveToRelative(0.66f, -1.43f, 2.62f, -2.61f, 3.91f, -3.39f)
//                curveToRelative(0.33f, -0.19f, 0.65f, -0.39f, 0.95f, -0.62f)
//                curveToRelative(0.08f, -0.06f, 2.13f, -1.25f, 2.24f, -1.29f)
//                curveToRelative(0.96f, -0.39f, 5.34f, -0.92f, 5.53f, -0.95f)
//                curveToRelative(0.06f, -0.01f, 1.51f, -0.27f, 2.26f, 0.0f)
//                curveToRelative(0.49f, 0.18f, 3.84f, 2.72f, 6.54f, 4.76f)
//                curveToRelative(1.46f, 1.1f, 2.72f, 2.06f, 3.08f, 2.3f)
//                curveToRelative(1.12f, 0.75f, 1.53f, 1.75f, 1.53f, 2.44f)
//                curveToRelative(-0.02f, 0.26f, -0.16f, 0.49f, -0.39f, 0.62f)
//                curveToRelative(-0.65f, 0.44f, -2.07f, 0.61f, -3.79f, -0.05f)
//                curveToRelative(-1.2f, -0.46f, -3.22f, -1.59f, -5.85f, -3.28f)
//                curveToRelative(0.88f, 4.2f, 2.09f, 9.86f, 2.58f, 11.87f)
//                curveToRelative(0.11f, 0.48f, 0.06f, 0.98f, -0.15f, 1.42f)
//                curveToRelative(-0.17f, 0.38f, -0.39f, 0.75f, -0.66f, 1.07f)
//                curveToRelative(-1.47f, 1.68f, -3.27f, 2.05f, -5.13f, 2.31f)
//                curveToRelative(-0.46f, 0.07f, -0.94f, 0.1f, -1.41f, 0.11f)
//                close()
//                moveToRelative(2.73f, -23.46f)
//                curveToRelative(-0.43f, 0.01f, -0.87f, 0.05f, -1.29f, 0.12f)
//                curveToRelative(-0.05f, 0.0f, -4.55f, 0.56f, -5.48f, 0.93f)
//                curveToRelative(-0.12f, 0.06f, -2.09f, 1.19f, -2.19f, 1.26f)
//                curveToRelative(-0.31f, 0.23f, -0.64f, 0.44f, -0.98f, 0.63f)
//                curveToRelative(-1.27f, 0.77f, -3.19f, 1.93f, -3.82f, 3.31f)
//                curveToRelative(-0.71f, 1.54f, 3.97f, 9.13f, 6.48f, 13.21f)
//                curveToRelative(0.9f, 1.46f, 1.49f, 2.43f, 1.6f, 2.7f)
//                curveToRelative(0.39f, 1.04f, 2.52f, 1.25f, 4.34f, 0.99f)
//                curveToRelative(1.82f, -0.25f, 3.57f, -0.61f, 4.99f, -2.24f)
//                curveToRelative(0.25f, -0.31f, 0.46f, -0.66f, 0.62f, -1.02f)
//                curveToRelative(0.19f, -0.4f, 0.24f, -0.84f, 0.14f, -1.27f)
//                curveToRelative(-0.49f, -2.05f, -1.74f, -7.91f, -2.63f, -12.13f)
//                curveToRelative(-0.01f, -0.04f, 0.01f, -0.09f, 0.05f, -0.11f)
//                curveToRelative(0.04f, -0.02f, 0.08f, -0.02f, 0.12f, 0.0f)
//                curveToRelative(2.73f, 1.76f, 4.82f, 2.94f, 6.03f, 3.4f)
//                curveToRelative(1.63f, 0.62f, 3.0f, 0.48f, 3.58f, 0.07f)
//                curveToRelative(0.16f, -0.09f, 0.27f, -0.26f, 0.29f, -0.44f)
//                curveToRelative(0.0f, -0.63f, -0.37f, -1.55f, -1.43f, -2.26f)
//                curveToRelative(-0.36f, -0.24f, -1.62f, -1.2f, -3.09f, -2.3f)
//                curveToRelative(-2.54f, -1.92f, -6.02f, -4.56f, -6.48f, -4.73f)
//                curveToRelative(-0.27f, -0.08f, -0.56f, -0.13f, -0.85f, -0.12f)
//                close()
//            }
//            path(fill = SolidColor(Color(0xFF079FFF)), stroke = null, strokeLineWidth = 0.0f,
//                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
//                    pathFillType = NonZero) {
//                moveTo(23.09f, 33.18f)
//                reflectiveCurveToRelative(-0.8f, 0.88f, -1.12f, 1.29f)
//                curveToRelative(-1.68f, 2.16f, -7.03f, 9.08f, -7.09f, 9.63f)
//                curveToRelative(-0.06f, 0.56f, 0.19f, 0.93f, 1.5f, 1.44f)
//                curveToRelative(1.31f, 0.5f, 10.05f, -8.26f, 10.05f, -8.26f)
//            }
//            path(fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
//                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
//                    pathFillType = NonZero) {
//                moveTo(16.49f, 45.66f)
//                lineToRelative(-0.15f, -0.02f)
//                curveToRelative(-1.22f, -0.47f, -1.64f, -0.88f, -1.57f, -1.54f)
//                curveToRelative(0.06f, -0.55f, 4.48f, -6.31f, 7.11f, -9.69f)
//                curveToRelative(0.31f, -0.4f, 1.09f, -1.26f, 1.12f, -1.29f)
//                curveToRelative(0.04f, -0.05f, 0.11f, -0.06f, 0.15f, -0.02f)
//                curveToRelative(0.05f, 0.04f, 0.06f, 0.11f, 0.02f, 0.15f)
//                lineToRelative(-0.01f, 0.01f)
//                reflectiveCurveToRelative(-0.81f, 0.88f, -1.11f, 1.28f)
//                curveToRelative(-4.25f, 5.46f, -7.02f, 9.22f, -7.06f, 9.58f)
//                curveToRelative(-0.05f, 0.47f, 0.17f, 0.84f, 1.43f, 1.32f)
//                curveToRelative(0.91f, 0.35f, 6.44f, -4.74f, 9.94f, -8.24f)
//                curveToRelative(0.04f, -0.04f, 0.11f, -0.04f, 0.16f, 0.0f)
//                curveToRelative(0.04f, 0.04f, 0.04f, 0.11f, 0.0f, 0.16f)
//                curveToRelative(-0.87f, 0.86f, -8.34f, 8.3f, -10.03f, 8.3f)
//                close()
//            }
//            path(fill = SolidColor(Color(0xFF079FFF)), stroke = null, strokeLineWidth = 0.0f,
//                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
//                    pathFillType = NonZero) {
//                moveTo(40.79f, 32.77f)
//                lineToRelative(-3.03f, 2.04f)
//                curveToRelative(0.44f, -0.06f, 2.53f, -0.8f, 2.53f, -0.8f)
//            }
//            path(fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
//                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
//                    pathFillType = NonZero) {
//                moveTo(37.77f, 34.92f)
//                curveToRelative(-0.05f, 0.0f, -0.09f, -0.03f, -0.1f, -0.07f)
//                curveToRelative(-0.02f, -0.05f, 0.0f, -0.1f, 0.04f, -0.13f)
//                lineToRelative(3.03f, -2.04f)
//                curveToRelative(0.05f, -0.03f, 0.12f, -0.02f, 0.15f, 0.03f)
//                reflectiveCurveToRelative(0.02f, 0.12f, -0.03f, 0.15f)
//                lineToRelative(-2.48f, 1.67f)
//                curveToRelative(0.76f, -0.23f, 1.87f, -0.63f, 1.89f, -0.63f)
//                curveToRelative(0.06f, -0.02f, 0.13f, 0.01f, 0.15f, 0.07f)
//                curveToRelative(0.02f, 0.06f, -0.01f, 0.13f, -0.07f, 0.15f)
//                curveToRelative(-0.09f, 0.03f, -2.11f, 0.75f, -2.55f, 0.81f)
//                lineToRelative(-0.03f, -0.01f)
//                close()
//                moveToRelative(2.9f, -0.86f)
//                curveToRelative(-0.05f, 0.0f, -0.1f, -0.04f, -0.11f, -0.09f)
//                curveToRelative(-0.01f, -0.06f, 0.03f, -0.12f, 0.09f, -0.13f)
//                lineToRelative(0.68f, -0.12f)
//                curveToRelative(0.06f, -0.01f, 0.12f, 0.03f, 0.13f, 0.09f)
//                curveToRelative(0.01f, 0.06f, -0.03f, 0.12f, -0.09f, 0.13f)
//                lineToRelative(-0.68f, 0.12f)
//                horizontalLineToRelative(-0.02f)
//                close()
//            }
//            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
//                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
//                    pathFillType = NonZero) {
//                moveTo(18.26f, 41.96f)
//                curveToRelative(-0.47f, -0.01f, -0.93f, 0.07f, -1.36f, 0.26f)
//                close()
//            }
//            path(fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
//                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
//                    pathFillType = NonZero) {
//                moveTo(16.9f, 42.33f)
//                curveToRelative(-0.06f, 0.01f, -0.12f, -0.03f, -0.13f, -0.09f)
//                curveToRelative(-0.01f, -0.06f, 0.03f, -0.12f, 0.09f, -0.13f)
//                curveToRelative(0.45f, -0.19f, 0.93f, -0.28f, 1.41f, -0.27f)
//                curveToRelative(0.06f, 0.0f, 0.11f, 0.06f, 0.1f, 0.12f)
//                curveToRelative(-0.01f, 0.06f, -0.06f, 0.11f, -0.12f, 0.1f)
//                curveToRelative(-0.45f, -0.01f, -0.89f, 0.07f, -1.31f, 0.25f)
//                lineToRelative(-0.04f, 0.02f)
//                close()
//            }
//            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
//                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
//                    pathFillType = NonZero) {
//                moveTo(24.85f, 38.93f)
//                reflectiveCurveToRelative(1.7f, -0.52f, 2.15f, -0.87f)
//                close()
//            }
//            path(fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
//                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
//                    pathFillType = NonZero) {
//                moveTo(24.85f, 39.04f)
//                curveToRelative(-0.06f, 0.01f, -0.12f, -0.03f, -0.13f, -0.09f)
//                curveToRelative(-0.01f, -0.06f, 0.03f, -0.12f, 0.09f, -0.13f)
//                curveToRelative(0.02f, 0.0f, 1.68f, -0.52f, 2.11f, -0.85f)
//                curveToRelative(0.05f, -0.04f, 0.12f, -0.03f, 0.15f, 0.02f)
//                curveToRelative(0.04f, 0.05f, 0.03f, 0.12f, -0.02f, 0.15f)
//                curveToRelative(-0.46f, 0.35f, -2.11f, 0.86f, -2.19f, 0.88f)
//                curveToRelative(0.01f, 0.02f, 0.0f, 0.02f, -0.01f, 0.02f)
//                close()
//            }
//            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
//                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
//                    pathFillType = NonZero) {
//                moveTo(27.42f, 37.9f)
//                reflectiveCurveToRelative(0.28f, -0.24f, 0.38f, -0.24f)
//                close()
//            }
//            path(fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
//                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
//                    pathFillType = NonZero) {
//                moveTo(27.42f, 38.01f)
//                curveToRelative(-0.03f, 0.0f, -0.06f, -0.01f, -0.08f, -0.04f)
//                curveToRelative(-0.04f, -0.04f, -0.04f, -0.11f, 0.0f, -0.16f)
//                curveToRelative(0.12f, -0.13f, 0.28f, -0.22f, 0.45f, -0.27f)
//                curveToRelative(0.06f, 0.0f, 0.11f, 0.05f, 0.11f, 0.11f)
//                reflectiveCurveToRelative(-0.05f, 0.11f, -0.11f, 0.11f)
//                curveToRelative(-0.11f, 0.06f, -0.22f, 0.13f, -0.31f, 0.22f)
//                lineToRelative(-0.06f, 0.03f)
//                close()
//                moveToRelative(10.35f, -3.09f)
//                curveToRelative(-0.06f, 0.0f, -0.1f, -0.04f, -0.11f, -0.1f)
//                lineToRelative(-0.28f, -2.83f)
//                curveToRelative(-0.01f, -0.06f, 0.04f, -0.12f, 0.1f, -0.12f)
//                curveToRelative(0.06f, -0.01f, 0.12f, 0.04f, 0.12f, 0.1f)
//                lineToRelative(0.28f, 2.84f)
//                curveToRelative(0.01f, 0.06f, -0.04f, 0.11f, -0.1f, 0.12f)
//                horizontalLineToRelative(-0.01f)
//                verticalLineToRelative(-0.01f)
//                close()
//            }
//            path(fill = SolidColor(Color(0xFF079FFF)), stroke = null, strokeLineWidth = 0.0f,
//                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
//                    pathFillType = NonZero) {
//                moveTo(14.88f, 44.13f)
//                reflectiveCurveToRelative(-0.39f, 1.49f, 2.11f, 2.11f)
//                lineToRelative(9.05f, 2.2f)
//                reflectiveCurveToRelative(0.7f, -1.51f, 0.3f, -1.51f)
//                curveToRelative(-0.4f, 0.0f, -7.65f, -4.82f, -7.65f, -4.82f)
//            }
//            path(fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
//                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
//                    pathFillType = NonZero) {
//                moveTo(26.05f, 48.57f)
//                horizontalLineToRelative(-0.03f)
//                lineToRelative(-9.05f, -2.2f)
//                curveToRelative(-0.99f, -0.24f, -1.66f, -0.66f, -2.0f, -1.21f)
//                curveToRelative(-0.19f, -0.31f, -0.26f, -0.68f, -0.19f, -1.03f)
//                curveToRelative(0.02f, -0.06f, 0.08f, -0.09f, 0.13f, -0.08f)
//                curveToRelative(0.06f, 0.02f, 0.09f, 0.08f, 0.08f, 0.13f)
//                curveToRelative(-0.05f, 0.3f, 0.01f, 0.61f, 0.18f, 0.87f)
//                curveToRelative(0.3f, 0.51f, 0.93f, 0.88f, 1.86f, 1.1f)
//                curveToRelative(1.1f, 0.28f, 8.1f, 1.98f, 8.96f, 2.19f)
//                curveToRelative(0.27f, -0.6f, 0.44f, -1.18f, 0.36f, -1.27f)
//                curveToRelative(-0.42f, 0.0f, -6.49f, -4.03f, -7.71f, -4.85f)
//                curveToRelative(-0.05f, -0.03f, -0.06f, -0.1f, -0.03f, -0.15f)
//                curveToRelative(0.03f, -0.05f, 0.1f, -0.06f, 0.15f, -0.03f)
//                curveToRelative(2.86f, 1.9f, 7.23f, 4.75f, 7.59f, 4.81f)
//                curveToRelative(0.07f, 0.0f, 0.14f, 0.04f, 0.18f, 0.1f)
//                curveToRelative(0.18f, 0.29f, -0.25f, 1.27f, -0.39f, 1.57f)
//                curveToRelative(-0.01f, 0.03f, -0.05f, 0.05f, -0.09f, 0.05f)
//                close()
//            }
//            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
//                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
//                    pathFillType = NonZero) {
//                moveTo(26.35f, 46.94f)
//                reflectiveCurveToRelative(2.58f, 1.21f, 2.78f, 1.54f)
//                curveToRelative(0.2f, 0.33f, 0.66f, 2.08f, 0.66f, 2.61f)
//                curveToRelative(0.0f, 0.54f, -0.07f, 0.54f, -0.4f, 0.54f)
//                reflectiveCurveToRelative(-1.21f, -1.27f, -1.41f, -1.54f)
//                curveToRelative(-0.2f, -0.27f, -0.66f, -0.27f, -1.27f, -0.66f)
//                curveToRelative(-0.35f, -0.22f, -0.58f, -0.57f, -0.66f, -0.97f)
//                lineToRelative(0.3f, -1.52f)
//                close()
//            }
//            path(fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
//                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
//                    pathFillType = NonZero) {
//                moveTo(29.4f, 51.75f)
//                curveToRelative(-0.29f, 0.0f, -0.77f, -0.58f, -1.39f, -1.44f)
//                lineToRelative(-0.11f, -0.15f)
//                curveToRelative(-0.13f, -0.13f, -0.28f, -0.21f, -0.46f, -0.26f)
//                curveToRelative(-0.28f, -0.1f, -0.54f, -0.23f, -0.79f, -0.39f)
//                curveToRelative(-0.37f, -0.24f, -0.64f, -0.62f, -0.72f, -1.05f)
//                verticalLineToRelative(-0.03f)
//                lineToRelative(0.3f, -1.51f)
//                curveToRelative(0.01f, -0.03f, 0.03f, -0.06f, 0.06f, -0.08f)
//                curveToRelative(0.03f, -0.02f, 0.07f, -0.02f, 0.1f, 0.0f)
//                curveToRelative(0.44f, 0.2f, 2.62f, 1.24f, 2.83f, 1.59f)
//                curveToRelative(0.21f, 0.35f, 0.69f, 2.12f, 0.69f, 2.67f)
//                curveToRelative(0.0f, 0.55f, -0.1f, 0.65f, -0.51f, 0.65f)
//                close()
//                moveToRelative(-3.24f, -3.3f)
//                curveToRelative(0.08f, 0.37f, 0.3f, 0.68f, 0.62f, 0.88f)
//                curveToRelative(0.23f, 0.15f, 0.48f, 0.27f, 0.75f, 0.37f)
//                curveToRelative(0.21f, 0.06f, 0.4f, 0.17f, 0.55f, 0.33f)
//                lineToRelative(0.11f, 0.15f)
//                curveToRelative(0.81f, 1.12f, 1.1f, 1.35f, 1.21f, 1.35f)
//                curveToRelative(0.29f, 0.0f, 0.29f, 0.0f, 0.29f, -0.43f)
//                curveToRelative(0.0f, -0.52f, -0.46f, -2.23f, -0.66f, -2.56f)
//                curveToRelative(-0.13f, -0.22f, -1.62f, -0.97f, -2.61f, -1.44f)
//                lineToRelative(-0.26f, 1.35f)
//                close()
//                moveToRelative(-0.91f, -0.15f)
//                horizontalLineToRelative(-0.03f)
//                curveToRelative(-0.06f, -0.02f, -0.09f, -0.08f, -0.07f, -0.13f)
//                lineToRelative(0.4f, -1.25f)
//                curveToRelative(0.02f, -0.06f, 0.08f, -0.09f, 0.14f, -0.08f)
//                curveToRelative(0.06f, 0.02f, 0.09f, 0.08f, 0.08f, 0.14f)
//                verticalLineToRelative(0.01f)
//                lineToRelative(-0.4f, 1.25f)
//                curveToRelative(-0.03f, 0.04f, -0.07f, 0.06f, -0.12f, 0.06f)
//                close()
//            }
//            path(fill = SolidColor(Color(0xFF079FFF)), stroke = null, strokeLineWidth = 0.0f,
//                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
//                    pathFillType = NonZero) {
//                moveTo(44.83f, 37.55f)
//                reflectiveCurveToRelative(-0.66f, 2.28f, -0.94f, 3.62f)
//                curveToRelative(-0.28f, 1.34f, -2.15f, 6.71f, -2.15f, 6.71f)
//                lineToRelative(1.61f, 1.01f)
//                reflectiveCurveToRelative(3.55f, -7.36f, 4.23f, -8.98f)
//                curveToRelative(0.68f, -1.62f, 0.47f, -2.82f, -0.2f, -3.49f)
//            }
//            path(fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
//                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
//                    pathFillType = NonZero) {
//                moveTo(43.35f, 49.0f)
//                lineToRelative(-0.06f, -0.02f)
//                lineToRelative(-1.61f, -1.01f)
//                curveToRelative(-0.04f, -0.03f, -0.06f, -0.08f, -0.05f, -0.13f)
//                curveToRelative(0.02f, -0.05f, 1.88f, -5.37f, 2.14f, -6.69f)
//                curveToRelative(0.26f, -1.32f, 0.94f, -3.61f, 0.94f, -3.63f)
//                curveToRelative(0.02f, -0.06f, 0.08f, -0.1f, 0.14f, -0.08f)
//                curveToRelative(0.06f, 0.02f, 0.1f, 0.08f, 0.08f, 0.14f)
//                curveToRelative(0.0f, 0.02f, -0.67f, 2.29f, -0.94f, 3.61f)
//                curveToRelative(-0.25f, 1.26f, -1.87f, 5.93f, -2.12f, 6.64f)
//                lineToRelative(1.43f, 0.89f)
//                curveToRelative(0.44f, -0.93f, 3.55f, -7.39f, 4.17f, -8.87f)
//                curveToRelative(0.6f, -1.43f, 0.53f, -2.65f, -0.18f, -3.37f)
//                curveToRelative(-0.04f, -0.04f, -0.04f, -0.11f, 0.0f, -0.15f)
//                curveToRelative(0.04f, -0.04f, 0.11f, -0.04f, 0.15f, 0.0f)
//                curveToRelative(0.78f, 0.77f, 0.86f, 2.09f, 0.22f, 3.61f)
//                curveToRelative(-0.66f, 1.59f, -4.19f, 8.92f, -4.23f, 8.99f)
//                curveToRelative(-0.01f, 0.03f, -0.04f, 0.05f, -0.07f, 0.06f)
//                lineTo(43.35f, 49.0f)
//                close()
//            }
//            path(fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
//                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
//                    pathFillType = NonZero) {
//                moveTo(42.05f, 47.11f)
//                curveToRelative(0.12f, 0.0f, 1.65f, 0.84f, 1.65f, 0.84f)
//                close()
//            }
//            path(fill = SolidColor(Color(0xFF1C6B9A)), stroke = null, strokeLineWidth = 0.0f,
//                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
//                    pathFillType = NonZero) {
//                moveTo(31.47f, 35.0f)
//                curveToRelative(-0.37f, -0.06f, -2.35f, -1.36f, -3.71f, -2.41f)
//                curveToRelative(-1.36f, -1.05f, -2.1f, -1.23f, -2.1f, -1.23f)
//                lineToRelative(-0.93f, 0.62f)
//                curveToRelative(-0.14f, -0.45f, -0.1f, -0.94f, 0.12f, -1.36f)
//                curveToRelative(0.37f, -0.68f, 1.67f, -1.36f, 2.96f, -1.85f)
//                curveToRelative(1.3f, -0.49f, 2.78f, -0.92f, 3.71f, -0.92f)
//                curveToRelative(0.93f, 0.0f, 1.17f, 0.37f, 1.17f, 0.86f)
//                reflectiveCurveToRelative(0.0f, 2.04f, -0.31f, 3.21f)
//                curveTo(32.09f, 33.09f, 31.47f, 35.0f, 31.47f, 35.0f)
//                close()
//            }
//            path(fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
//                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
//                    pathFillType = NonZero) {
//                moveTo(31.47f, 35.11f)
//                horizontalLineToRelative(-0.02f)
//                curveToRelative(-0.41f, -0.07f, -2.44f, -1.42f, -3.75f, -2.43f)
//                curveToRelative(-1.14f, -0.88f, -1.84f, -1.14f, -2.02f, -1.2f)
//                lineToRelative(-0.88f, 0.59f)
//                curveToRelative(-0.03f, 0.02f, -0.06f, 0.02f, -0.1f, 0.01f)
//                curveToRelative(-0.03f, -0.01f, -0.06f, -0.04f, -0.07f, -0.07f)
//                curveToRelative(-0.15f, -0.48f, -0.11f, -1.0f, 0.13f, -1.45f)
//                curveToRelative(0.44f, -0.82f, 2.09f, -1.54f, 3.02f, -1.9f)
//                curveToRelative(0.74f, -0.28f, 2.58f, -0.93f, 3.75f, -0.93f)
//                curveToRelative(0.86f, 0.0f, 1.28f, 0.32f, 1.28f, 0.97f)
//                curveToRelative(0.0f, 0.51f, 0.0f, 2.05f, -0.31f, 3.24f)
//                curveToRelative(-0.31f, 1.19f, -0.92f, 3.07f, -0.93f, 3.09f)
//                curveToRelative(0.0f, 0.05f, -0.05f, 0.08f, -0.1f, 0.08f)
//                close()
//                moveToRelative(-5.8f, -3.87f)
//                horizontalLineToRelative(0.03f)
//                curveToRelative(0.03f, 0.0f, 0.78f, 0.2f, 2.14f, 1.25f)
//                curveToRelative(1.28f, 0.99f, 3.06f, 2.16f, 3.57f, 2.36f)
//                curveToRelative(0.13f, -0.41f, 0.63f, -1.98f, 0.88f, -2.98f)
//                curveToRelative(0.31f, -1.16f, 0.31f, -2.68f, 0.31f, -3.18f)
//                curveToRelative(0.0f, -0.37f, -0.13f, -0.75f, -1.06f, -0.75f)
//                curveToRelative(-0.8f, 0.0f, -2.13f, 0.34f, -3.67f, 0.92f)
//                curveToRelative(-1.53f, 0.58f, -2.6f, 1.24f, -2.91f, 1.8f)
//                curveToRelative(-0.18f, 0.35f, -0.24f, 0.75f, -0.15f, 1.13f)
//                lineToRelative(0.8f, -0.53f)
//                lineToRelative(0.06f, -0.02f)
//                close()
//            }
//            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
//                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
//                    pathFillType = NonZero) {
//                moveTo(25.97f, 27.16f)
//                curveToRelative(0.72f, 0.8f, 1.23f, 1.77f, 1.48f, 2.82f)
//                curveToRelative(0.4f, 1.74f, 2.92f, 3.79f, 3.53f, 3.79f)
//                curveToRelative(0.61f, 0.0f, 0.56f, -2.99f, 0.36f, -3.86f)
//                curveToRelative(-0.2f, -0.87f, -1.01f, -3.22f, -1.01f, -3.22f)
//                reflectiveCurveToRelative(-3.21f, -1.54f, -4.36f, 0.47f)
//                close()
//            }
//            path(fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
//                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
//                    pathFillType = NonZero) {
//                moveTo(30.99f, 33.88f)
//                curveToRelative(-0.65f, 0.0f, -3.23f, -2.11f, -3.64f, -3.88f)
//                curveToRelative(-0.24f, -1.03f, -0.74f, -1.98f, -1.45f, -2.76f)
//                curveToRelative(-0.03f, -0.04f, -0.04f, -0.09f, -0.02f, -0.13f)
//                curveToRelative(1.18f, -2.08f, 4.47f, -0.53f, 4.5f, -0.51f)
//                curveToRelative(0.03f, 0.01f, 0.05f, 0.04f, 0.06f, 0.06f)
//                curveToRelative(0.03f, 0.09f, 0.81f, 2.36f, 1.01f, 3.23f)
//                curveToRelative(0.17f, 0.76f, 0.26f, 3.27f, -0.21f, 3.85f)
//                curveToRelative(-0.05f, 0.09f, -0.15f, 0.14f, -0.25f, 0.14f)
//                close()
//                moveToRelative(-4.87f, -6.74f)
//                curveToRelative(0.71f, 0.8f, 1.2f, 1.77f, 1.44f, 2.81f)
//                curveToRelative(0.4f, 1.73f, 2.91f, 3.71f, 3.42f, 3.71f)
//                curveToRelative(0.0f, 0.0f, 0.04f, 0.0f, 0.09f, -0.06f)
//                curveToRelative(0.37f, -0.47f, 0.35f, -2.87f, 0.17f, -3.67f)
//                curveToRelative(-0.18f, -0.8f, -0.88f, -2.83f, -0.99f, -3.16f)
//                curveToRelative(-0.37f, -0.16f, -3.09f, -1.3f, -4.13f, 0.37f)
//                close()
//            }
//            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
//                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
//                    pathFillType = NonZero) {
//                moveTo(25.97f, 27.16f)
//                curveToRelative(0.72f, 0.8f, 1.23f, 1.77f, 1.48f, 2.82f)
//                curveToRelative(0.4f, 1.74f, 2.92f, 3.79f, 3.53f, 3.79f)
//                curveToRelative(0.61f, 0.0f, 0.56f, -2.99f, 0.36f, -3.86f)
//                curveToRelative(-0.2f, -0.87f, -1.01f, -3.22f, -1.01f, -3.22f)
//                reflectiveCurveToRelative(-3.21f, -1.54f, -4.36f, 0.47f)
//                close()
//            }
//            path(fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
//                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
//                    pathFillType = NonZero) {
//                moveTo(30.99f, 33.88f)
//                curveToRelative(-0.65f, 0.0f, -3.23f, -2.11f, -3.64f, -3.88f)
//                curveToRelative(-0.24f, -1.03f, -0.74f, -1.98f, -1.45f, -2.76f)
//                curveToRelative(-0.03f, -0.04f, -0.04f, -0.09f, -0.02f, -0.13f)
//                curveToRelative(1.18f, -2.08f, 4.47f, -0.53f, 4.5f, -0.51f)
//                curveToRelative(0.03f, 0.01f, 0.05f, 0.04f, 0.06f, 0.06f)
//                curveToRelative(0.03f, 0.09f, 0.81f, 2.36f, 1.01f, 3.23f)
//                curveToRelative(0.17f, 0.76f, 0.26f, 3.27f, -0.21f, 3.85f)
//                curveToRelative(-0.05f, 0.09f, -0.15f, 0.14f, -0.25f, 0.14f)
//                close()
//                moveToRelative(-4.87f, -6.74f)
//                curveToRelative(0.71f, 0.8f, 1.2f, 1.77f, 1.44f, 2.81f)
//                curveToRelative(0.4f, 1.73f, 2.91f, 3.71f, 3.42f, 3.71f)
//                curveToRelative(0.0f, 0.0f, 0.04f, 0.0f, 0.09f, -0.06f)
//                curveToRelative(0.37f, -0.47f, 0.35f, -2.87f, 0.17f, -3.67f)
//                curveToRelative(-0.18f, -0.8f, -0.88f, -2.83f, -0.99f, -3.16f)
//                curveToRelative(-0.37f, -0.16f, -3.09f, -1.3f, -4.13f, 0.37f)
//                close()
//            }
//            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
//                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
//                    pathFillType = NonZero) {
//                moveTo(23.86f, 23.93f)
//                curveToRelative(0.47f, 1.29f, 1.06f, 2.53f, 1.75f, 3.71f)
//                curveToRelative(1.02f, 1.67f, 2.99f, 2.62f, 4.08f, 2.19f)
//                curveToRelative(1.09f, -0.44f, 1.83f, -1.85f, 1.54f, -4.03f)
//                curveToRelative(-0.06f, -0.48f, -0.48f, -0.68f, -0.62f, -1.1f)
//                curveToRelative(-0.48f, -1.54f, -0.97f, -3.03f, -1.14f, -3.6f)
//                curveToRelative(-0.22f, -0.73f, -1.97f, -1.46f, -3.79f, -0.95f)
//                reflectiveCurveToRelative(-2.12f, 2.03f, -1.82f, 3.78f)
//                close()
//            }
//            path(fill = SolidColor(Color(0xFFEABECE)), stroke = null, fillAlpha = 0.7f,
//                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
//                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
//                moveTo(29.9f, 22.59f)
//                reflectiveCurveToRelative(-0.66f, 0.49f, -2.15f, 0.21f)
//                curveToRelative(-1.49f, -0.28f, -2.51f, -0.22f, -2.45f, 0.17f)
//                curveToRelative(0.06f, 0.39f, 0.17f, 0.91f, 0.17f, 0.91f)
//                reflectiveCurveToRelative(-1.78f, -1.54f, -0.17f, -1.95f)
//                curveToRelative(1.16f, -0.3f, 1.84f, 0.16f, 2.12f, 0.22f)
//                lineToRelative(2.48f, 0.44f)
//                close()
//            }
//            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, fillAlpha = 0.5f,
//                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
//                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
//                moveTo(29.9f, 22.59f)
//                reflectiveCurveToRelative(-0.66f, 0.49f, -2.15f, 0.21f)
//                curveToRelative(-1.49f, -0.28f, -2.51f, -0.22f, -2.45f, 0.17f)
//                curveToRelative(0.06f, 0.39f, 0.17f, 0.91f, 0.17f, 0.91f)
//                reflectiveCurveToRelative(-1.78f, -1.54f, -0.17f, -1.95f)
//                curveToRelative(1.16f, -0.3f, 1.84f, 0.16f, 2.12f, 0.22f)
//                lineToRelative(2.48f, 0.44f)
//                close()
//            }
//            path(fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
//                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
//                    pathFillType = NonZero) {
//                moveTo(29.07f, 30.05f)
//                curveToRelative(-1.18f, 0.0f, -2.73f, -0.97f, -3.56f, -2.35f)
//                curveToRelative(-0.7f, -1.19f, -1.29f, -2.44f, -1.76f, -3.74f)
//                verticalLineToRelative(-0.02f)
//                curveToRelative(-0.36f, -2.17f, 0.26f, -3.45f, 1.9f, -3.91f)
//                curveToRelative(1.9f, -0.53f, 3.69f, 0.25f, 3.92f, 1.02f)
//                curveToRelative(0.08f, 0.27f, 0.22f, 0.73f, 0.42f, 1.32f)
//                lineToRelative(0.73f, 2.28f)
//                curveToRelative(0.06f, 0.16f, 0.16f, 0.31f, 0.28f, 0.44f)
//                curveToRelative(0.18f, 0.19f, 0.3f, 0.42f, 0.34f, 0.68f)
//                curveToRelative(0.33f, 2.45f, -0.62f, 3.75f, -1.61f, 4.15f)
//                curveToRelative(-0.22f, 0.09f, -0.44f, 0.13f, -0.66f, 0.13f)
//                close()
//                moveToRelative(-5.11f, -6.15f)
//                curveToRelative(0.47f, 1.28f, 1.05f, 2.51f, 1.73f, 3.68f)
//                curveToRelative(1.03f, 1.68f, 2.96f, 2.53f, 3.94f, 2.14f)
//                curveToRelative(0.92f, -0.37f, 1.78f, -1.59f, 1.47f, -3.91f)
//                curveToRelative(-0.04f, -0.21f, -0.14f, -0.41f, -0.29f, -0.57f)
//                curveToRelative(-0.14f, -0.15f, -0.25f, -0.33f, -0.32f, -0.53f)
//                lineToRelative(-0.73f, -2.28f)
//                lineToRelative(-0.42f, -1.32f)
//                curveToRelative(-0.19f, -0.61f, -1.81f, -1.39f, -3.65f, -0.88f)
//                curveToRelative(-1.49f, 0.44f, -2.06f, 1.63f, -1.73f, 3.67f)
//                close()
//            }
//            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
//                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
//                    pathFillType = NonZero) {
//                moveTo(25.17f, 26.33f)
//                reflectiveCurveToRelative(-1.17f, -0.51f, -1.24f, 0.0f)
//                curveToRelative(-0.07f, 0.51f, 0.44f, 0.88f, 0.95f, 1.1f)
//                curveToRelative(0.26f, 0.14f, 0.57f, 0.11f, 0.8f, -0.07f)
//            }
//            path(fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
//                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
//                    pathFillType = NonZero) {
//                moveTo(25.24f, 27.63f)
//                curveToRelative(-0.14f, 0.0f, -0.28f, -0.03f, -0.41f, -0.09f)
//                curveToRelative(-0.72f, -0.31f, -1.08f, -0.74f, -1.01f, -1.21f)
//                curveToRelative(0.01f, -0.11f, 0.08f, -0.21f, 0.17f, -0.26f)
//                curveToRelative(0.35f, -0.2f, 1.13f, 0.13f, 1.22f, 0.17f)
//                curveToRelative(0.05f, 0.03f, 0.07f, 0.1f, 0.05f, 0.15f)
//                curveToRelative(-0.03f, 0.05f, -0.08f, 0.07f, -0.14f, 0.05f)
//                curveToRelative(-0.29f, -0.13f, -0.83f, -0.29f, -1.02f, -0.18f)
//                curveToRelative(-0.04f, 0.02f, -0.06f, 0.06f, -0.06f, 0.1f)
//                curveToRelative(-0.07f, 0.49f, 0.52f, 0.82f, 0.88f, 0.98f)
//                curveToRelative(0.22f, 0.12f, 0.48f, 0.1f, 0.68f, -0.05f)
//                curveToRelative(0.05f, -0.04f, 0.12f, -0.03f, 0.16f, 0.01f)
//                curveToRelative(0.04f, 0.04f, 0.03f, 0.1f, 0.0f, 0.14f)
//                curveToRelative(-0.15f, 0.12f, -0.33f, 0.19f, -0.52f, 0.19f)
//                close()
//            }
//            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
//                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
//                    pathFillType = NonZero) {
//                moveTo(29.93f, 23.45f)
//                reflectiveCurveToRelative(-1.3f, -0.31f, -0.74f, 1.42f)
//                curveToRelative(0.11f, 0.34f, 0.87f, 0.74f, 0.87f, 0.74f)
//                reflectiveCurveToRelative(-0.06f, 0.56f, -0.37f, 0.62f)
//            }
//            path(fill = SolidColor(Color(0xFF2E353A)), stroke = null, strokeLineWidth = 0.0f,
//                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
//                    pathFillType = NonZero) {
//                moveTo(29.68f, 26.34f)
//                curveToRelative(-0.05f, 0.0f, -0.1f, -0.04f, -0.11f, -0.09f)
//                curveToRelative(-0.01f, -0.06f, 0.03f, -0.12f, 0.09f, -0.13f)
//                curveToRelative(0.16f, -0.03f, 0.24f, -0.3f, 0.27f, -0.44f)
//                curveToRelative(-0.2f, -0.11f, -0.75f, -0.44f, -0.85f, -0.77f)
//                curveToRelative(-0.21f, -0.64f, -0.19f, -1.1f, 0.05f, -1.36f)
//                curveToRelative(0.3f, -0.32f, 0.8f, -0.2f, 0.82f, -0.2f)
//                curveToRelative(0.06f, 0.01f, 0.1f, 0.07f, 0.08f, 0.13f)
//                curveToRelative(-0.01f, 0.06f, -0.07f, 0.1f, -0.13f, 0.08f)
//                curveToRelative(0.0f, 0.0f, -0.4f, -0.09f, -0.61f, 0.13f)
//                curveToRelative(-0.21f, 0.22f, -0.18f, 0.59f, 0.0f, 1.14f)
//                curveToRelative(0.07f, 0.22f, 0.54f, 0.53f, 0.81f, 0.68f)
//                curveToRelative(0.04f, 0.02f, 0.06f, 0.07f, 0.06f, 0.11f)
//                curveToRelative(0.0f, 0.07f, -0.08f, 0.64f, -0.46f, 0.71f)
//                lineToRelative(-0.02f, 0.01f)
//                close()
//            }
//            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
//                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
//                    pathFillType = NonZero) {
//                moveTo(29.0f, 27.46f)
//                reflectiveCurveToRelative(-0.93f, 0.19f, -1.3f, -0.25f)
//                close()
//            }
//            path(fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
//                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
//                    pathFillType = NonZero) {
//                moveTo(28.56f, 27.63f)
//                curveToRelative(-0.34f, 0.03f, -0.68f, -0.09f, -0.94f, -0.33f)
//                curveToRelative(-0.04f, -0.05f, -0.03f, -0.12f, 0.01f, -0.16f)
//                curveToRelative(0.05f, -0.04f, 0.12f, -0.03f, 0.16f, 0.01f)
//                curveToRelative(0.32f, 0.38f, 1.18f, 0.22f, 1.19f, 0.22f)
//                curveToRelative(0.06f, -0.01f, 0.11f, 0.02f, 0.13f, 0.08f)
//                verticalLineToRelative(0.01f)
//                curveToRelative(0.01f, 0.06f, -0.03f, 0.12f, -0.09f, 0.13f)
//                curveToRelative(-0.15f, 0.03f, -0.31f, 0.04f, -0.46f, 0.04f)
//                close()
//            }
//            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
//                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
//                    pathFillType = NonZero) {
//                moveTo(27.64f, 24.56f)
//                reflectiveCurveToRelative(-0.68f, -0.25f, -1.05f, 0.06f)
//                curveToRelative(-0.2f, 0.14f, -0.35f, 0.33f, -0.44f, 0.56f)
//            }
//            path(fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
//                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
//                    pathFillType = NonZero) {
//                moveTo(26.16f, 25.29f)
//                horizontalLineToRelative(-0.03f)
//                curveToRelative(-0.06f, -0.02f, -0.09f, -0.08f, -0.08f, -0.13f)
//                curveToRelative(0.09f, -0.25f, 0.25f, -0.46f, 0.47f, -0.61f)
//                curveToRelative(0.41f, -0.34f, 1.13f, -0.09f, 1.16f, -0.08f)
//                curveToRelative(0.06f, 0.02f, 0.09f, 0.08f, 0.07f, 0.14f)
//                curveToRelative(-0.02f, 0.06f, -0.08f, 0.09f, -0.14f, 0.07f)
//                curveToRelative(0.0f, 0.0f, -0.62f, -0.22f, -0.94f, 0.04f)
//                curveToRelative(-0.17f, 0.13f, -0.31f, 0.3f, -0.39f, 0.5f)
//                curveToRelative(-0.03f, 0.04f, -0.07f, 0.07f, -0.12f, 0.07f)
//                close()
//                moveToRelative(1.46f, 0.33f)
//                curveToRelative(0.09f, 0.21f, 0.07f, 0.41f, -0.04f, 0.45f)
//                curveToRelative(-0.11f, 0.04f, -0.27f, -0.08f, -0.36f, -0.28f)
//                curveToRelative(-0.09f, -0.21f, -0.07f, -0.41f, 0.04f, -0.45f)
//                curveToRelative(0.11f, -0.04f, 0.28f, 0.08f, 0.36f, 0.28f)
//                close()
//                moveToRelative(2.22f, -1.08f)
//                curveToRelative(0.09f, 0.2f, 0.07f, 0.41f, -0.04f, 0.45f)
//                curveToRelative(-0.11f, 0.04f, -0.27f, -0.08f, -0.36f, -0.28f)
//                curveToRelative(-0.09f, -0.2f, -0.07f, -0.41f, 0.04f, -0.45f)
//                curveToRelative(0.12f, -0.05f, 0.28f, 0.08f, 0.36f, 0.28f)
//                close()
//            }
//            path(fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
//                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
//                    pathFillType = NonZero) {
//                moveTo(24.84f, 26.62f)
//                reflectiveCurveToRelative(0.74f, -0.54f, 0.6f, -1.01f)
//                curveToRelative(-0.13f, -0.47f, -0.4f, -0.47f, -0.13f, -0.74f)
//                reflectiveCurveToRelative(0.47f, -0.4f, 0.4f, -0.8f)
//                curveToRelative(-0.07f, -0.4f, -1.14f, -1.07f, -0.8f, -1.48f)
//                curveToRelative(0.34f, -0.4f, 0.2f, -0.88f, 2.95f, -0.2f)
//                curveToRelative(2.75f, 0.68f, 4.49f, -0.4f, 3.69f, -1.41f)
//                curveToRelative(-0.8f, -1.01f, -1.48f, -1.14f, -1.48f, -1.14f)
//                reflectiveCurveToRelative(1.54f, -0.66f, 0.27f, -1.34f)
//                reflectiveCurveToRelative(-4.16f, -0.66f, -5.77f, 0.6f)
//                curveToRelative(-1.61f, 1.26f, -1.27f, 2.34f, -1.27f, 2.34f)
//                reflectiveCurveToRelative(-0.87f, 0.13f, -0.94f, 1.48f)
//                curveToRelative(-0.07f, 1.35f, 2.48f, 3.7f, 2.48f, 3.7f)
//                close()
//            }
//            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
//                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
//                    pathFillType = NonZero) {
//                moveTo(29.23f, 22.13f)
//                curveToRelative(-0.59f, -0.02f, -1.16f, -0.15f, -1.7f, -0.38f)
//                curveToRelative(-0.42f, -0.18f, -0.88f, -0.29f, -1.34f, -0.32f)
//                curveToRelative(-1.06f, 0.0f, -1.29f, 0.6f, -1.29f, 0.63f)
//                curveToRelative(-0.01f, 0.04f, -0.05f, 0.06f, -0.09f, 0.05f)
//                curveToRelative(-0.04f, -0.01f, -0.06f, -0.05f, -0.05f, -0.09f)
//                curveToRelative(0.01f, -0.03f, 0.26f, -0.73f, 1.44f, -0.73f)
//                curveToRelative(0.48f, 0.03f, 0.95f, 0.14f, 1.39f, 0.33f)
//                curveToRelative(0.69f, 0.24f, 1.4f, 0.5f, 2.29f, 0.3f)
//                curveToRelative(0.49f, -0.11f, 0.77f, -0.28f, 0.84f, -0.51f)
//                curveToRelative(0.09f, -0.3f, -0.19f, -0.61f, -0.2f, -0.61f)
//                curveToRelative(-0.03f, -0.03f, -0.03f, -0.08f, 0.0f, -0.11f)
//                reflectiveCurveToRelative(0.08f, -0.03f, 0.11f, 0.0f)
//                curveToRelative(0.01f, 0.02f, 0.35f, 0.38f, 0.23f, 0.76f)
//                curveToRelative(-0.09f, 0.29f, -0.41f, 0.5f, -0.95f, 0.62f)
//                curveToRelative(-0.23f, 0.03f, -0.45f, 0.06f, -0.68f, 0.06f)
//                close()
//                moveToRelative(-5.31f, 1.46f)
//                curveToRelative(-0.03f, 0.0f, -0.06f, -0.02f, -0.07f, -0.04f)
//                curveToRelative(-0.11f, -0.2f, -0.13f, -0.44f, -0.05f, -0.66f)
//                curveToRelative(0.1f, -0.21f, 0.27f, -0.38f, 0.49f, -0.46f)
//                curveToRelative(0.04f, -0.02f, 0.08f, 0.0f, 0.1f, 0.04f)
//                curveToRelative(0.02f, 0.04f, 0.0f, 0.08f, -0.04f, 0.1f)
//                curveToRelative(-0.18f, 0.07f, -0.32f, 0.21f, -0.4f, 0.38f)
//                curveToRelative(-0.06f, 0.18f, -0.05f, 0.37f, 0.04f, 0.54f)
//                curveToRelative(0.02f, 0.04f, 0.0f, 0.08f, -0.04f, 0.1f)
//                horizontalLineToRelative(-0.03f)
//                close()
//            }
//        }
//        .build()
//        return _icQuestion!!
//    }
//
//private var _icQuestion: ImageVector? = null
