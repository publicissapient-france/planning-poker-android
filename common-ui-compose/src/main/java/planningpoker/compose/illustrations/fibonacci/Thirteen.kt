package planningpoker.compose.illustrations.fibonacci

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import planningpoker.compose.illustrations.Illu
import planningpoker.compose.illustrations.Illu.Cards


public val Illu.Cards.Thirteen: ImageVector
    @Composable get() {
        if (_thirteen != null) {
            return _thirteen!!
        }
        _thirteen = Builder(
            name = "Thirteen", defaultWidth = 142.0.dp, defaultHeight = 108.0.dp,
            viewportWidth = 142.0f, viewportHeight = 108.0f
        ).apply {
            addPath(
                pathData = addPathNodes("M120.51 37.58c0.49-13.17-4.25-26.51-14.68-32.86-5.15-3.13-11.17-4.97-17.2-4.7-6.46 0.29-12.55 2.92-18.64 5.08C63.89 7.26 57.3 9 51.01 7.46c-4.55-1.11-8.55-3.87-13.06-5.12C20.24-2.57 4.81 17.53 13.49 33.51c2.13 3.92 5.41 7.06 8.16 10.57 2.75 3.51 5.07 7.74 4.7 12.19-0.31 3.68-2.41 6.96-3.27 10.55-1.66 6.87 1.63 14.43 7.33 18.62 5.7 4.19 13.38 5.18 20.24 3.45 6.86-1.72 12.91-5.94 17.68-11.17 2.55-2.8 5.04-6.07 8.7-7.02 3.51-0.91 7.14 0.57 10.7 1.25 6.57 1.25 13.63-0.35 19.01-4.32 8.62-6.36 13.33-18.14 13.77-30.05z"),
                fill = SolidColor(MaterialTheme.colorScheme.secondaryContainer),
                stroke = null,
                fillAlpha = 0.7f,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M36.1 29.58H27V15.46h25.76v64.1H36.1V29.58zm47.85 10.54c0.85 0.09 1.53 0.09 1.96 0.09 4.17 0 7.06-2.98 7.06-7.14 0-3.66-2.72-6.38-6.46-6.38-4.17 0-6.89 2.98-6.89 7.31H64.23c1.7-13.6 10.29-21 23.55-21 12.16 0 20.66 7.31 20.66 18.53 0 5.95-2.21 10.37-6.72 13.35 6.46 2.04 10.46 8.5 10.46 16.41 0 12.5-10.54 21.17-25.08 21.17-10.29 0-18.02-4.25-22.95-12.58-2.21-3.74-3.31-7.4-3.31-10.8h17c0.42 5.7 3.66 8.93 9.18 8.93 5.02 0 8.59-3.57 8.59-8.42 0-4.76-3.83-8.59-8.76-8.59-0.6 0-1.62 0.17-2.89 0.43V40.12h-0.01z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M29.3 71.63H1.69c-0.86 0-1.55-0.7-1.55-1.55V39.67c0-0.86 0.7-1.55 1.55-1.55H29.3c0.86 0 1.55 0.7 1.55 1.55v30.41c0.01 0.85-0.69 1.55-1.55 1.55z"),
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M29.17 71.77H1.83C0.82 71.77 0 70.95 0 69.94V39.8c0-1.01 0.82-1.83 1.83-1.83h27.34c1.01 0 1.83 0.82 1.83 1.83v30.13c0 1.02-0.82 1.84-1.83 1.84zM1.83 38.25c-0.86 0-1.55 0.7-1.55 1.55v30.13c0 0.86 0.7 1.55 1.55 1.55h27.34c0.86 0 1.55-0.7 1.55-1.55V39.8c0-0.86-0.7-1.55-1.55-1.55H1.83z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M30.86 41.56H0.14v-1.97c0-0.82 0.66-1.48 1.48-1.48h27.76c0.82 0 1.48 0.66 1.48 1.48v1.97z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes(
                    "M30.86 41.7H0.14C0.06 41.7 0 41.64 0 41.56V39.8c0-1.01 0.82-1.83 1.83-1.83h27.34c1.01 0 1.83 0.82 1.83 1.83v1.76c0 0.08-0.06 0.14-0.14 0.14zM0.28 41.42h30.44V39.8c0-0.86-0.7-1.55-1.55-1.55H1.83c-0.86 0-1.55 0.7-1.55 1.55v1.62zm13.9 16.32H1.82c-0.08 0-0.14-0.06-0.14-0.14 0-0.08 0.06-0.14 0.14-0.14h12.36c0.08 0 0.14 0.06 0.14 0.14 0 0.08-0.07 0.14-0.14 0.14zm0 1.6H1.82c-0.08 0-0.14-0.06-0.14-0.14 0-0.08 0.06-0.14 0.14-0.14h12.36c0.08 0 0.14 0.06 0.14 0.14 0 0.08-0.07 0.14-0.14 0.14zm0 1.6H1.82c-0.08 0-0.14-0.06-0.14-0.14 0-0.08 0.06-0.14 0.14-0.14h12.36c0.08 0 0.14 0.06 0.14 0.14 0 0.08-0.07 0.14-0.14 0.14zm0 1.59H1.82c-0.08 0-0.14-0.06-0.14-0.14 0-0.08 0.06-0.14 0.14-0.14h12.36c0.08 0 0.14 0.06 0.14 0.14 0 0.08-0.07 0.14-0.14 0.14zm0 1.6H1.82c-0.08 0-0.14-0.06-0.14-0.14 0-0.08 0.06-0.14 0.14-0.14h12.36c0.08 0 0.14 0.06 0.14 0.14 0 0.08-0.07 0.14-0.14 0.14zm0 1.59H1.82c-0.08 0-0.14-0.06-0.14-0.14 0-0.08 0.06-0.14 0.14-0.14h12.36c0.08 0 0.14 0.06 0.14 0.14 0 0.08-0.07 0.14-0.14 0.14zm0 1.6H1.82c-0.08 0-0.14-0.06-0.14-0.14 0-0.08 0.06-0.14 0.14-0.14h12.36c0.08 0 0.14 0.06 0.14 0.14 0 0.08-0.07 0.14-0.14 0.14zm0 1.6H1.82c-0.08 0-0.14-0.06-0.14-0.14 0-0.08 0.06-0.14 0.14-0.14h12.36c0.08 0 0.14 0.06 0.14 0.14 0 0.08-0.07 0.14-0.14 0.14zm14.53-11.18H16.35c-0.08 0-0.14-0.06-0.14-0.14 0-0.08 0.06-0.14 0.14-0.14h12.36c0.08 0 0.14 0.06 0.14 0.14 0 0.08-0.06 0.14-0.14 0.14zm0 1.6H16.35c-0.08 0-0.14-0.06-0.14-0.14 0-0.08 0.06-0.14 0.14-0.14h12.36c0.08 0 0.14 0.06 0.14 0.14 0 0.08-0.06 0.14-0.14 0.14zm0 1.6H16.35c-0.08 0-0.14-0.06-0.14-0.14 0-0.08 0.06-0.14 0.14-0.14h12.36c0.08 0 0.14 0.06 0.14 0.14 0 0.08-0.06 0.14-0.14 0.14zm0 1.59H16.35c-0.08 0-0.14-0.06-0.14-0.14 0-0.08 0.06-0.14 0.14-0.14h12.36c0.08 0 0.14 0.06 0.14 0.14 0 0.08-0.06 0.14-0.14 0.14zm0 1.6H16.35c-0.08 0-0.14-0.06-0.14-0.14 0-0.08 0.06-0.14 0.14-0.14h12.36c0.08 0 0.14 0.06 0.14 0.14 0 0.08-0.06 0.14-0.14 0.14zm0 1.59H16.35c-0.08 0-0.14-0.06-0.14-0.14 0-0.08 0.06-0.14 0.14-0.14h12.36c0.08 0 0.14 0.06 0.14 0.14 0 0.08-0.06 0.14-0.14 0.14zm0 1.6H16.35c-0.08 0-0.14-0.06-0.14-0.14 0-0.08 0.06-0.14 0.14-0.14h12.36c0.08 0 0.14 0.06 0.14 0.14 0 0.08-0.06 0.14-0.14 0.14zm0 1.6H16.35c-0.08 0-0.14-0.06-0.14-0.14 0-0.08 0.06-0.14 0.14-0.14h12.36c0.08 0 0.14 0.06 0.14 0.14 0 0.08-0.06 0.14-0.14 0.14z"
                ),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M21.86 43.62H9.14v11.5h12.72v-11.5z"),
                fill = SolidColor(MaterialTheme.colorScheme.primary),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M22 55.26H9V43.48h13v11.78zM9.28 54.98h12.44V43.76H9.28v11.22z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M21.86 48.42c-0.34 0.02-0.76 0.07-1.27 0.18-1.93 0.42-2.44 3.19-4.62 3.19-1.93 0-2.1-2.6-4.87-2.94-0.84-0.1-1.47 0.07-1.96 0.35v5.91h12.72v-6.69z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M21.86 55.26H9.14C9.06 55.26 9 55.19 9 55.12V49.2c0-0.05 0.03-0.1 0.07-0.12 0.58-0.34 1.27-0.46 2.04-0.37 1.52 0.18 2.28 1.03 2.95 1.77 0.57 0.63 1.06 1.17 1.9 1.17 1.12 0 1.77-0.76 2.45-1.57 0.59-0.7 1.2-1.41 2.14-1.62 0.47-0.1 0.9-0.16 1.29-0.18 0.04 0 0.08 0.01 0.1 0.04 0.03 0.03 0.04 0.06 0.04 0.1v6.69c0.02 0.08-0.04 0.15-0.12 0.15zM9.28 54.98h12.44v-6.4c-0.34 0.03-0.71 0.08-1.1 0.17-0.84 0.18-1.4 0.83-1.98 1.52-0.7 0.82-1.42 1.67-2.67 1.67-0.97 0-1.52-0.61-2.11-1.26-0.64-0.71-1.36-1.51-2.78-1.68-0.69-0.08-1.29 0.01-1.8 0.29v5.69z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M13.37 46.25c0 0.79-0.64 1.43-1.43 1.43-0.79 0-1.43-0.64-1.43-1.43 0-0.79 0.64-1.43 1.43-1.43 0.79 0 1.43 0.64 1.43 1.43z"),
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M11.94 47.82c-0.86 0-1.57-0.7-1.57-1.57 0-0.87 0.7-1.57 1.57-1.57 0.86 0 1.57 0.7 1.57 1.57 0 0.87-0.71 1.57-1.57 1.57zm0-2.86c-0.71 0-1.29 0.58-1.29 1.29 0 0.71 0.58 1.29 1.29 1.29 0.71 0 1.29-0.58 1.29-1.29 0-0.71-0.58-1.29-1.29-1.29z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M139.52 30.67h-13.94c-1.14 0-2.07 0.93-2.07 2.07v7.46c0 1.14 0.93 2.07 2.07 2.07h0.43c-0.43 0.96-1.27 2.42-2.61 3.3 0 0 2.83-0.2 5.78-3.3h10.34c1.14 0 2.07-0.92 2.07-2.07v-7.46c0-1.14-0.92-2.07-2.07-2.07z"),
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M123.41 45.72c-0.07 0-0.13-0.04-0.15-0.11-0.02-0.07 0-0.14 0.06-0.18 1.19-0.77 1.97-2.02 2.44-3h-0.18c-1.23 0-2.23-1-2.23-2.23v-7.46c0-1.23 1-2.23 2.23-2.23h13.95c1.23 0 2.23 1 2.23 2.23v7.46c0 1.23-1 2.23-2.23 2.23h-10.27c-2.94 3.06-5.72 3.29-5.83 3.3l-0.02-0.01zm2.17-14.89c-1.05 0-1.91 0.86-1.91 1.91v7.46c0 1.05 0.86 1.91 1.91 1.91h0.43c0.05 0 0.1 0.03 0.13 0.07 0.03 0.05 0.03 0.1 0.01 0.15-0.4 0.9-1.08 2.08-2.11 2.95 0.99-0.25 2.98-0.99 5.02-3.12 0.03-0.03 0.07-0.05 0.12-0.05h10.34c1.05 0 1.91-0.86 1.91-1.91v-7.46c0-1.05-0.86-1.91-1.91-1.91h-13.94z"),
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M130.15 36.2c0-0.59-0.48-1.06-1.06-1.06-0.59 0-1.06 0.48-1.06 1.06 0 0.59 0.48 1.06 1.06 1.06 0.59 0.01 1.06-0.47 1.06-1.06zm3.62 0c0-0.59-0.48-1.06-1.06-1.06-0.59 0-1.06 0.48-1.06 1.06 0 0.59 0.48 1.06 1.06 1.06 0.58 0.01 1.06-0.47 1.06-1.06zm3.61 0c0-0.59-0.48-1.06-1.06-1.06-0.59 0-1.06 0.48-1.06 1.06 0 0.59 0.48 1.06 1.06 1.06 0.59 0.01 1.06-0.47 1.06-1.06z"),
                fill = SolidColor(MaterialTheme.colorScheme.primary),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M137.99 27.4h-27.91c-0.3 0-0.54-0.24-0.54-0.54V15.71c0-0.3 0.24-0.54 0.54-0.54h27.91c0.3 0 0.54 0.24 0.54 0.54v11.14c0.01 0.3-0.24 0.55-0.54 0.55z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M137.59 27.56h-27.1c-0.62 0-1.12-0.5-1.12-1.12V16.12c0-0.62 0.5-1.12 1.12-1.12h27.1c0.62 0 1.12 0.5 1.12 1.12v10.33c0 0.61-0.5 1.11-1.12 1.11zm-27.1-12.22c-0.43 0-0.78 0.35-0.78 0.78v10.33c0 0.43 0.35 0.78 0.78 0.78h27.1c0.43 0 0.78-0.35 0.78-0.78V16.12c0-0.43-0.35-0.78-0.78-0.78h-27.1z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M112.99 16.83l0.14 0.23c-0.64 0.36-1.23 0.98-1.23 1.72 0 0.64 0.45 1.02 0.91 1.02 0.09 0 0.16-0.05 0.16-0.14 0-0.08-0.05-0.12-0.14-0.14-0.22-0.05-0.41-0.25-0.41-0.59 0-0.45 0.38-0.75 0.83-0.75 0.48 0 0.84 0.39 0.84 0.87 0 0.61-0.5 1.05-1.11 1.05-0.78 0-1.36-0.5-1.36-1.31 0-0.86 0.65-1.55 1.37-1.96zm2.89 0l0.14 0.23c-0.64 0.36-1.23 0.98-1.23 1.72 0 0.64 0.45 1.02 0.91 1.02 0.09 0 0.16-0.05 0.16-0.14 0-0.08-0.05-0.12-0.14-0.14-0.22-0.05-0.41-0.25-0.41-0.59 0-0.45 0.37-0.75 0.83-0.75 0.48 0 0.84 0.39 0.84 0.87 0 0.61-0.5 1.05-1.11 1.05-0.78 0-1.36-0.5-1.36-1.31 0-0.86 0.65-1.55 1.37-1.96z"),
                fill = SolidColor(MaterialTheme.colorScheme.primary),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M135.15 19.49h-16.5c-0.09 0-0.17-0.08-0.17-0.17 0-0.09 0.08-0.17 0.17-0.17h16.5c0.09 0 0.17 0.08 0.17 0.17 0 0.09-0.08 0.17-0.17 0.17zm0 1.42h-16.5c-0.09 0-0.17-0.08-0.17-0.17 0-0.09 0.08-0.17 0.17-0.17h16.5c0.09 0 0.17 0.08 0.17 0.17 0 0.1-0.08 0.17-0.17 0.17zm0 1.42h-16.5c-0.09 0-0.17-0.08-0.17-0.17 0-0.09 0.08-0.17 0.17-0.17h16.5c0.09 0 0.17 0.08 0.17 0.17 0 0.09-0.08 0.17-0.17 0.17zm0 1.42h-16.5c-0.09 0-0.17-0.08-0.17-0.17 0-0.09 0.08-0.17 0.17-0.17h16.5c0.09 0 0.17 0.08 0.17 0.17 0 0.09-0.08 0.17-0.17 0.17z"),
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M110.12 107.95c15.65 0 28.33-2.22 28.33-4.95s-12.68-4.95-28.33-4.95c-15.65 0-28.33 2.22-28.33 4.95s12.68 4.95 28.33 4.95z"),
                fill = SolidColor(Color(0xFF1C6B9A)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M110.12 107.95c15.65 0 28.33-2.22 28.33-4.95s-12.68-4.95-28.33-4.95c-15.65 0-28.33 2.22-28.33 4.95s12.68 4.95 28.33 4.95z"),
                fill = SolidColor(Color(0xFF1C6B9A)), stroke = null, fillAlpha = 0.5f,
                strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M117.28 62.96s2.23 4.76 2.23 5.01-1.98 1.33-2.36 1.55c-0.38 0.23-0.9 0.45-0.9 0.45l0.23 2.21s3.41-0.78 4.84-1.55c1.43-0.78 1.38-1.65 1.05-2.96-0.33-1.31-2.53-6.34-2.53-6.34l-2.56 1.63z"),
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M116.48 72.3l-0.06-0.02c-0.02-0.02-0.04-0.04-0.04-0.07L116.15 70c0-0.05 0.02-0.09 0.06-0.11 0.01 0 0.52-0.23 0.89-0.44l0.32-0.19c0.47-0.27 1.91-1.09 1.99-1.29-0.03-0.21-1.35-3.08-2.22-4.96-0.02-0.05-0.01-0.1 0.04-0.13l2.56-1.63c0.03-0.02 0.06-0.02 0.09-0.01s0.05 0.03 0.07 0.06c0.09 0.21 2.21 5.06 2.54 6.36 0.32 1.28 0.43 2.24-1.1 3.08-1.43 0.78-4.73 1.53-4.87 1.56h-0.04zm-0.11-2.25l0.21 2.01c0.61-0.14 3.44-0.84 4.7-1.52 1.4-0.76 1.31-1.62 1-2.84-0.29-1.17-2.15-5.46-2.48-6.21L117.42 63c0.57 1.21 2.2 4.73 2.2 4.98 0 0.2-0.51 0.56-2.09 1.46l-0.32 0.18c-0.3 0.18-0.68 0.36-0.84 0.43z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M101.19 61.91s-1.63 5.97-1.68 7.02c-0.05 1.05 3.23 3.13 3.36 3.26 0.13 0.13-0.19-3.63-0.19-3.63l1.11-5.45-2.6-1.2z"),
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M102.88 72.3c-0.03 0-0.06-0.01-0.08-0.03l-0.26-0.18c-1.36-0.95-3.17-2.31-3.13-3.16 0.05-1.05 1.62-6.8 1.68-7.04 0.01-0.03 0.03-0.05 0.06-0.07h0.09l2.61 1.2c0.04 0.02 0.07 0.07 0.06 0.12l-1.11 5.44c0.3 3.64 0.22 3.68 0.13 3.72h-0.05zm-1.62-10.24c-0.23 0.85-1.6 5.93-1.64 6.88-0.03 0.55 1 1.55 3.04 2.97l0.14 0.1c0.01-0.53-0.12-2.3-0.22-3.43v-0.03l1.1-5.37-2.42-1.12z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M108.84 55.92s-0.63 0.45-1.86 0.5c-1.23 0.05-1.28-0.83-2.81-0.83-1.85 0.01-4.16 5.84-4.16 5.84s1.15 1.13 2.28 1.6c1.13 0.48 1.96 0.58 1.96 0.58l0.18 3.84h12.44l0.15-3.84 3.89-2.53s-1.91-3.41-2.83-4.69c-0.93-1.28-2.48-0.8-2.96-0.48-0.48 0.33-1.88 0.4-2.41 0.33-0.53-0.08-2.01-0.55-2.01-0.55s-0.81-0.67-1.86 0.23z"),
                fill = SolidColor(Color(0xFF1C6B9A)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M116.96 67.56h-12.64l-0.18-3.85c-0.24-0.04-0.96-0.18-1.9-0.57-1.13-0.48-2.27-1.58-2.31-1.63l-0.05-0.05 0.03-0.06c0.1-0.24 2.36-5.9 4.26-5.91 0.83 0 1.24 0.25 1.61 0.47 0.34 0.2 0.63 0.38 1.19 0.36 1.13-0.05 1.75-0.45 1.8-0.48 1.02-0.87 1.84-0.33 1.97-0.24 0.17 0.05 1.49 0.47 1.97 0.54 0.52 0.07 1.89-0.01 2.33-0.31 0.49-0.33 2.13-0.84 3.1 0.5 0.92 1.27 2.82 4.66 2.84 4.7l0.05 0.09-3.92 2.56-0.15 3.88zm-12.44-0.21h12.23l0.15-3.79 3.85-2.51c-0.3-0.54-1.95-3.45-2.78-4.59-0.88-1.21-2.37-0.75-2.81-0.45-0.52 0.36-1.98 0.41-2.48 0.34-0.53-0.08-1.96-0.54-2.02-0.56l-0.04-0.02c-0.03-0.03-0.75-0.61-1.72 0.22V56c-0.03 0.02-0.67 0.47-1.91 0.52-0.62 0.02-0.96-0.17-1.31-0.39-0.36-0.22-0.74-0.44-1.5-0.44-1.65 0.01-3.78 5.07-4.04 5.71 0.23 0.22 1.23 1.13 2.2 1.53 1.1 0.46 1.92 0.57 1.93 0.57l0.09 0.01 0.16 3.84z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes(
                    "M104.32 63.69c-0.03 0-0.05-0.02-0.05-0.05l0.05-6.37c0-0.03 0.02-0.05 0.05-0.05 0.03 0 0.05 0.02 0.05 0.05l-0.05 6.37c0 0.03-0.02 0.05-0.05 0.05zm1.33-0.95c-0.02 0-0.04-0.01-0.05-0.03-0.65-1.72-0.83-4.82-0.83-4.85 0-0.03 0.02-0.05 0.05-0.06 0.03 0 0.05 0.02 0.06 0.05 0 0.03 0.18 3.12 0.82 4.82 0.01 0.03 0 0.06-0.03 0.07h-0.02zm0.65 1.48l-0.04-0.02c-0.2-0.3-0.52-1.2-0.53-1.24-0.01-0.03 0-0.06 0.03-0.07 0.03-0.01 0.06 0 0.07 0.03 0 0.01 0.33 0.92 0.52 1.22 0.02 0.02 0.01 0.06-0.01 0.07l-0.04 0.01zm-0.07-3.36c-0.02 0-0.04-0.01-0.05-0.03-0.62-1.44-1-3.3-1.01-3.32-0.01-0.03 0.01-0.06 0.04-0.06 0.03-0.01 0.06 0.01 0.06 0.04 0 0.02 0.38 1.87 1 3.3 0.01 0.03 0 0.06-0.03 0.07h-0.01zm8.67 0.8l-0.02-0.01c-0.03-0.01-0.04-0.04-0.02-0.07 0.52-1.09 1.12-3.53 1.12-3.55 0.01-0.03 0.03-0.05 0.06-0.04 0.03 0.01 0.05 0.04 0.04 0.06-0.01 0.02-0.61 2.47-1.13 3.57-0.01 0.03-0.03 0.04-0.05 0.04zm2.11 2.01c-0.03 0-0.05-0.02-0.05-0.05l-0.03-4.96c0-0.03 0.02-0.05 0.05-0.05 0.03 0 0.05 0.02 0.05 0.05l0.03 4.96c0 0.03-0.02 0.05-0.05 0.05zm-1.83-0.08l-0.03-0.01c-0.02-0.02-0.03-0.05-0.01-0.07 1.08-1.63 1.54-4.74 1.55-4.77 0-0.03 0.03-0.05 0.06-0.04 0.03 0 0.05 0.03 0.04 0.06 0 0.03-0.47 3.16-1.56 4.81-0.02 0.02-0.03 0.02-0.05 0.02zm0.15 0.83l-0.03-0.01c-0.02-0.02-0.03-0.05-0.01-0.07 0.35-0.49 0.84-1.44 0.85-1.45 0.01-0.03 0.05-0.04 0.07-0.02 0.03 0.01 0.04 0.05 0.02 0.07-0.01 0.01-0.51 0.96-0.86 1.46l-0.04 0.02z"
                ),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M110.49 60.74c-0.56 0-1.16-0.3-1.55-1.17-0.5-1.1-0.85-3.25-0.86-3.27 0-0.03 0.01-0.06 0.04-0.06 0.03-0.01 0.06 0.01 0.06 0.04 0 0.02 0.36 2.16 0.85 3.25 0.52 1.15 1.41 1.26 2.06 0.98 0.76-0.33 1.27-1.98 1.22-3.94 0-0.03 0.02-0.05 0.05-0.05 0.03 0 0.05 0.02 0.05 0.05 0.05 2.03-0.48 3.69-1.29 4.04-0.18 0.08-0.4 0.13-0.63 0.13zm-4.14-8.96s-0.48-0.83-0.85-0.4c-0.38 0.43 0.3 1.4 0.68 1.73 0.38 0.33 0.65 0.13 0.63-0.23-0.03-0.35-0.46-1.1-0.46-1.1z"),
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M106.53 53.38c-0.13 0-0.28-0.07-0.42-0.19-0.32-0.28-0.79-0.93-0.82-1.43-0.01-0.18 0.03-0.33 0.13-0.45 0.13-0.15 0.26-0.17 0.36-0.16 0.35 0.03 0.63 0.52 0.67 0.57 0.02 0.03 0.44 0.78 0.46 1.15 0.02 0.22-0.07 0.39-0.22 0.47-0.05 0.03-0.1 0.04-0.16 0.04zm-0.79-2.02c-0.04 0-0.1 0.01-0.16 0.09-0.06 0.07-0.09 0.17-0.08 0.3 0.03 0.42 0.46 1.03 0.75 1.28 0.14 0.12 0.27 0.17 0.35 0.12 0.07-0.04 0.11-0.14 0.1-0.26-0.02-0.27-0.32-0.85-0.44-1.06-0.07-0.12-0.3-0.45-0.5-0.47h-0.02z"),
                fill = SolidColor(Color(0xFF263239)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M106.53 53.38c-0.13 0-0.28-0.07-0.42-0.19-0.32-0.28-0.79-0.93-0.82-1.43-0.01-0.18 0.03-0.33 0.13-0.45 0.13-0.15 0.26-0.17 0.36-0.16 0.35 0.03 0.63 0.52 0.67 0.57 0.02 0.03 0.44 0.78 0.46 1.15 0.02 0.22-0.07 0.39-0.22 0.47-0.05 0.03-0.1 0.04-0.16 0.04zm-0.79-2.02c-0.04 0-0.1 0.01-0.16 0.09-0.06 0.07-0.09 0.17-0.08 0.3 0.03 0.42 0.46 1.03 0.75 1.28 0.14 0.12 0.27 0.17 0.35 0.12 0.07-0.04 0.11-0.14 0.1-0.26-0.02-0.27-0.32-0.85-0.44-1.06-0.07-0.12-0.3-0.45-0.5-0.47h-0.02z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M113.94 51.78s0.48-0.83 0.85-0.4c0.38 0.43-0.3 1.4-0.68 1.73-0.38 0.33-0.65 0.13-0.63-0.23 0.04-0.35 0.46-1.1 0.46-1.1z"),
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M113.76 53.38c-0.06 0-0.11-0.01-0.16-0.04-0.15-0.08-0.23-0.25-0.22-0.47 0.03-0.37 0.45-1.12 0.46-1.15 0.03-0.06 0.32-0.54 0.67-0.57 0.09-0.01 0.23 0.01 0.36 0.16 0.1 0.12 0.15 0.27 0.13 0.45-0.03 0.5-0.5 1.15-0.82 1.43-0.14 0.13-0.29 0.19-0.42 0.19zm0.27-1.55c-0.12 0.2-0.42 0.79-0.44 1.06-0.01 0.13 0.03 0.23 0.1 0.26 0.08 0.04 0.22 0 0.35-0.12 0.29-0.25 0.72-0.87 0.75-1.28 0.01-0.13-0.02-0.23-0.08-0.3-0.08-0.09-0.14-0.09-0.18-0.09-0.19 0.03-0.43 0.36-0.5 0.47z"),
                fill = SolidColor(Color(0xFF263239)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M113.76 53.38c-0.06 0-0.11-0.01-0.16-0.04-0.15-0.08-0.23-0.25-0.22-0.47 0.03-0.37 0.45-1.12 0.46-1.15 0.03-0.06 0.32-0.54 0.67-0.57 0.09-0.01 0.23 0.01 0.36 0.16 0.1 0.12 0.15 0.27 0.13 0.45-0.03 0.5-0.5 1.15-0.82 1.43-0.14 0.13-0.29 0.19-0.42 0.19zm0.27-1.55c-0.12 0.2-0.42 0.79-0.44 1.06-0.01 0.13 0.03 0.23 0.1 0.26 0.08 0.04 0.22 0 0.35-0.12 0.29-0.25 0.72-0.87 0.75-1.28 0.01-0.13-0.02-0.23-0.08-0.3-0.08-0.09-0.14-0.09-0.18-0.09-0.19 0.03-0.43 0.36-0.5 0.47z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M108.61 55.74s0.45 2.03 0.9 3.16c0.45 1.13 1.3 1.13 1.65 0.4 0.35-0.73 0.58-3.43 0.58-3.43s-2.35 0.33-3.13-0.13z"),
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M110.48 59.91h-0.03c-0.42-0.01-0.8-0.37-1.04-0.97-0.45-1.12-0.9-3.15-0.91-3.18-0.01-0.04 0.01-0.08 0.04-0.11 0.03-0.02 0.08-0.03 0.11-0.01 0.74 0.43 3.04 0.12 3.07 0.11l0.09 0.03c0.02 0.02 0.03 0.05 0.03 0.08-0.01 0.11-0.23 2.74-0.59 3.47-0.16 0.37-0.45 0.58-0.77 0.58zm-1.72-3.98c0.13 0.54 0.49 2.04 0.85 2.94 0.21 0.51 0.52 0.83 0.85 0.84 0.25 0.01 0.47-0.15 0.61-0.44 0.3-0.61 0.51-2.72 0.56-3.27-0.47 0.05-2.07 0.21-2.87-0.07z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M106.4 52.06s0.65 2.31 1.88 3.66 1.68 1.68 2.33 1.58c0.65-0.1 1.35-0.95 2.33-2.73s1.05-3.13 1.13-3.26c0.08-0.13-0.2-2.63-1.6-3.71-1.4-1.08-2.96-1.55-4.31-0.38-1.36 1.18-2.21 3.11-1.76 4.84z"),
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M110.41 57.42c-0.62 0-1.12-0.44-2.2-1.63-1.23-1.36-1.88-3.61-1.9-3.7-0.43-1.65 0.29-3.64 1.79-4.94 1.21-1.06 2.75-0.93 4.44 0.37 1.42 1.09 1.74 3.66 1.63 3.85l-0.05 0.22c-0.09 0.49-0.31 1.63-1.08 3.04-1.03 1.87-1.73 2.68-2.41 2.79h-0.22zm-3.91-5.39c0.02 0.06 0.67 2.31 1.86 3.62 1.22 1.35 1.64 1.64 2.24 1.55 0.6-0.09 1.27-0.89 2.26-2.68 0.75-1.37 0.97-2.49 1.06-2.97 0.03-0.18 0.05-0.25 0.07-0.29 0.04-0.2-0.24-2.55-1.58-3.57-1.63-1.25-3.03-1.38-4.18-0.38-1.44 1.24-2.14 3.14-1.73 4.72z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes(
                    "M110.39 55.55c-0.26 0-0.49-0.31-0.52-0.35-0.03-0.05-0.02-0.11 0.02-0.15 0.04-0.04 0.11-0.02 0.15 0.02 0.07 0.1 0.25 0.29 0.37 0.26l0.04-0.01-0.02-0.16c-0.02-0.1-0.04-0.24-0.05-0.42-0.03-0.51 0.12-1.46 0.13-1.5 0.01-0.06 0.06-0.1 0.12-0.09 0.06 0.01 0.1 0.06 0.09 0.12 0 0.01-0.15 0.97-0.12 1.46 0.01 0.17 0.03 0.29 0.05 0.39 0.03 0.19 0.07 0.36-0.18 0.42l-0.08 0.01zm-1.74-1.61c-0.26 0-0.48-0.11-0.6-0.19-0.05-0.03-0.06-0.1-0.02-0.15 0.03-0.05 0.1-0.06 0.15-0.02 0.02 0.01 0.45 0.33 0.88 0.02 0.05-0.03 0.11-0.02 0.15 0.03 0.03 0.05 0.02 0.11-0.03 0.15-0.18 0.12-0.37 0.16-0.53 0.16zm3.18 0c-0.26 0-0.48-0.11-0.6-0.19-0.05-0.03-0.06-0.1-0.02-0.15 0.03-0.05 0.1-0.06 0.15-0.02 0.02 0.01 0.45 0.33 0.88 0.02 0.05-0.03 0.11-0.02 0.15 0.03 0.03 0.05 0.02 0.11-0.03 0.15-0.18 0.12-0.36 0.16-0.53 0.16zm-2.12-1.02c-0.04 0-0.08-0.02-0.1-0.07-0.02-0.04-0.46-1.08-1.92-0.57-0.05 0.02-0.11-0.01-0.13-0.06-0.02-0.05 0.01-0.11 0.06-0.13 1.65-0.58 2.18 0.67 2.19 0.69 0.02 0.05 0 0.11-0.06 0.14h-0.04zm1.31-0.14l-0.03-0.01c-0.05-0.02-0.08-0.08-0.06-0.13 0.01-0.02 0.17-0.47 0.64-0.67 0.37-0.16 0.82-0.11 1.33 0.13 0.05 0.02 0.07 0.09 0.05 0.14-0.02 0.05-0.09 0.07-0.14 0.05-0.46-0.22-0.85-0.26-1.16-0.13-0.39 0.16-0.53 0.54-0.53 0.55-0.01 0.04-0.05 0.07-0.1 0.07z"
                ),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M108.36 55.02c-0.97 0-1.76-0.57-1.76-1.27 0-0.65 0.62-1.02 1.71-1.02 1.13 0 1.81 0.38 1.81 1.02 0 0.7-0.79 1.27-1.76 1.27zm-0.05-2.08c-0.45 0-1.5 0.08-1.5 0.81 0 0.59 0.7 1.06 1.55 1.06 0.85 0 1.55-0.48 1.55-1.06 0-0.6-0.83-0.81-1.6-0.81zm3.86 2.08c-0.97 0-1.76-0.57-1.76-1.27 0-0.65 0.62-1.02 1.71-1.02 1.13 0 1.81 0.38 1.81 1.02 0 0.7-0.79 1.27-1.76 1.27zm-0.05-2.08c-0.45 0-1.5 0.08-1.5 0.81 0 0.59 0.7 1.06 1.55 1.06 0.85 0 1.55-0.48 1.55-1.06 0-0.6-0.83-0.81-1.6-0.81z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M92.7 73.85l-0.1 25.4c0 0.17 0.13 0.3 0.3 0.3 0.16 0 0.3-0.13 0.3-0.29l0.72-25.38-1.22-0.03z"),
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M92.89 99.66c-0.11 0-0.21-0.04-0.29-0.12-0.08-0.08-0.12-0.18-0.12-0.29l0.1-25.4c0-0.03 0.01-0.06 0.03-0.07 0.02-0.02 0.05-0.03 0.08-0.03l1.22 0.03c0.06 0 0.1 0.05 0.1 0.11L93.3 99.27c-0.01 0.22-0.19 0.39-0.41 0.39zm-0.09-25.7l-0.1 25.3c0 0.05 0.02 0.1 0.06 0.14 0.04 0.04 0.09 0.06 0.14 0.06 0.11 0 0.19-0.08 0.2-0.19L93.82 74l-1.02-0.04z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M90.98 79.79l-0.1 26.26c0 0.17 0.13 0.3 0.3 0.3 0.16 0 0.3-0.13 0.3-0.29l0.72-26.24-1.22-0.03z"),
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M91.18 106.46c-0.11 0-0.21-0.04-0.29-0.12-0.08-0.08-0.12-0.18-0.12-0.29l0.1-26.26c0-0.03 0.01-0.06 0.03-0.07 0.02-0.02 0.05-0.03 0.08-0.03l1.22 0.03c0.06 0 0.1 0.05 0.1 0.11l-0.72 26.24c0 0.22-0.18 0.39-0.4 0.39zM91.09 79.9l-0.1 26.16c0 0.05 0.02 0.1 0.06 0.14 0.04 0.04 0.09 0.06 0.14 0.06 0.11 0 0.19-0.08 0.2-0.19l0.72-26.14-1.02-0.03z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M127.82 73.85l0.1 25.4c0 0.17-0.13 0.3-0.3 0.3-0.16 0-0.3-0.13-0.3-0.29l-0.72-25.38 1.22-0.03z"),
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M127.62 99.66c-0.22 0-0.4-0.17-0.41-0.39l-0.72-25.38c0-0.06 0.04-0.11 0.1-0.11l1.22-0.03c0.03 0 0.06 0.01 0.08 0.03 0.02 0.02 0.03 0.05 0.03 0.07l0.1 25.4c0 0.11-0.04 0.21-0.12 0.29-0.07 0.08-0.17 0.12-0.28 0.12zm-0.92-25.67l0.72 25.28c0 0.11 0.09 0.19 0.2 0.19 0.05 0 0.1-0.02 0.14-0.06 0.04-0.04 0.06-0.09 0.06-0.14l-0.1-25.3-1.02 0.03z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M129.53 79.79l0.1 26.26c0 0.17-0.13 0.3-0.3 0.3-0.16 0-0.3-0.13-0.3-0.29l-0.72-26.24 1.22-0.03z"),
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M129.33 106.46c-0.22 0-0.4-0.17-0.41-0.39l-0.72-26.24c0-0.06 0.04-0.11 0.1-0.11l1.22-0.03c0.02 0 0.06 0.01 0.08 0.03 0.02 0.02 0.03 0.05 0.03 0.07l0.1 26.26c0 0.11-0.04 0.21-0.12 0.29-0.07 0.08-0.17 0.12-0.28 0.12zm-0.92-26.53l0.72 26.14c0 0.11 0.09 0.19 0.2 0.19 0.05 0 0.1-0.02 0.14-0.06 0.04-0.04 0.06-0.09 0.06-0.14l-0.1-26.16-1.02 0.03z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M102.89 80.88l-0.07 23.31c0 0.14 0.09 0.25 0.19 0.25s0.19-0.11 0.19-0.24l0.46-23.29-0.77-0.03z"),
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M103.02 104.55c-0.07 0-0.14-0.03-0.19-0.08-0.07-0.07-0.11-0.17-0.1-0.27l0.07-23.31c0-0.03 0.01-0.06 0.03-0.08 0.02-0.02 0.05-0.03 0.08-0.03l0.78 0.03c0.06 0 0.1 0.05 0.1 0.11l-0.46 23.29c-0.02 0.19-0.15 0.34-0.31 0.34zM103 80.99l-0.07 23.2c0 0.05 0.02 0.1 0.04 0.12l0.04 0.02c0.04 0 0.08-0.06 0.09-0.14L103.56 81 103 80.99z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M117.65 80.13l0.06 20.34c0 0.12-0.07 0.21-0.16 0.21s-0.16-0.09-0.16-0.2L117 80.15l0.65-0.02z"),
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M117.54 100.79c-0.14 0-0.26-0.13-0.27-0.3l-0.39-20.33c0-0.06 0.04-0.1 0.1-0.11l0.66-0.02c0.03 0 0.06 0.01 0.08 0.03 0.02 0.02 0.03 0.05 0.03 0.08l0.06 20.34c0 0.09-0.03 0.18-0.09 0.24-0.05 0.05-0.11 0.07-0.18 0.07zm-0.44-20.53l0.39 20.23c0 0.06 0.03 0.1 0.06 0.1l0.02-0.01c0.02-0.02 0.03-0.05 0.03-0.09l-0.06-20.24-0.44 0.01z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M102.66 80.13l0.06 20.34c0 0.12-0.07 0.21-0.16 0.21s-0.16-0.09-0.16-0.2l-0.39-20.33 0.65-0.02z"),
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M102.56 100.79c-0.14 0-0.26-0.13-0.27-0.3l-0.39-20.33c0-0.06 0.04-0.1 0.1-0.11l0.66-0.02c0.03 0 0.06 0.01 0.08 0.03 0.02 0.02 0.03 0.05 0.03 0.08l0.06 20.34c0 0.09-0.03 0.18-0.09 0.24-0.06 0.05-0.12 0.07-0.18 0.07zm-0.45-20.53l0.39 20.23c0 0.06 0.03 0.1 0.06 0.1l0.02-0.01c0.02-0.02 0.03-0.05 0.03-0.09l-0.06-20.24-0.44 0.01z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M117.23 80.88l0.07 23.31c0 0.14-0.09 0.25-0.19 0.25s-0.19-0.11-0.19-0.24l-0.46-23.29 0.77-0.03z"),
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M117.1 104.55c-0.16 0-0.29-0.15-0.3-0.34l-0.46-23.29c0-0.06 0.04-0.1 0.1-0.11l0.78-0.03c0.03 0 0.06 0.01 0.08 0.03 0.02 0.02 0.03 0.05 0.03 0.08l0.07 23.31c0 0.11-0.04 0.2-0.1 0.27-0.06 0.05-0.13 0.08-0.2 0.08zm-0.54-23.54l0.46 23.19c0 0.08 0.05 0.14 0.09 0.14l0.04-0.02c0.03-0.03 0.04-0.07 0.04-0.12L117.12 81l-0.56 0.01z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M109.96 82.51c5.15 0 9.33-0.95 9.33-2.13s-4.18-2.13-9.33-2.13-9.33 0.95-9.33 2.13 4.18 2.13 9.33 2.13z"),
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M109.96 82.62c-4.64 0-9.43-0.84-9.43-2.24 0-1.4 4.79-2.24 9.43-2.24s9.43 0.84 9.43 2.24c0 1.4-4.8 2.24-9.43 2.24zm0-4.26c-5.52 0-9.22 1.05-9.22 2.03 0 0.98 3.71 2.03 9.22 2.03 5.52 0 9.22-1.05 9.22-2.03 0-0.98-3.71-2.03-9.22-2.03z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M105.42 98.48s-0.49 0.7-0.14 1.05c0.35 0.35 0.7 0.21 0.66 0.56-0.03 0.35-0.59 1.54-1.08 2.79-0.49 1.25 0.52 2.51 1.47 2.17 0.94-0.35 0.84-3.84 0.98-4.47 0.14-0.63 0.24-0.73 0.21-1.33-0.03-0.59-0.07-1.22-0.52-1.29-0.47-0.08-1.37 0.27-1.58 0.52z"),
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M106 105.21c-0.31 0-0.62-0.14-0.87-0.39-0.49-0.5-0.64-1.28-0.37-1.97l0.53-1.31c0.28-0.67 0.52-1.25 0.54-1.46 0.01-0.12-0.01-0.13-0.18-0.19-0.12-0.05-0.29-0.11-0.46-0.28-0.41-0.41 0.11-1.15 0.13-1.18l0.01-0.01c0.24-0.28 1.19-0.63 1.67-0.56 0.54 0.08 0.58 0.77 0.61 1.38 0.03 0.45-0.02 0.64-0.11 0.94l-0.11 0.42c-0.03 0.15-0.05 0.5-0.08 0.9-0.08 1.34-0.2 3.36-0.97 3.65-0.1 0.04-0.22 0.06-0.34 0.06zm-0.5-6.67c-0.04 0.05-0.42 0.64-0.15 0.91 0.14 0.14 0.27 0.19 0.39 0.23 0.16 0.06 0.33 0.13 0.31 0.41-0.02 0.24-0.25 0.78-0.56 1.52l-0.53 1.3c-0.29 0.75-0.01 1.41 0.32 1.75 0.3 0.3 0.67 0.4 1.01 0.28 0.64-0.24 0.76-2.33 0.83-3.46 0.03-0.43 0.04-0.77 0.08-0.93l0.11-0.43c0.08-0.29 0.12-0.46 0.1-0.86-0.03-0.56-0.07-1.14-0.44-1.19-0.42-0.08-1.28 0.26-1.47 0.47z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M106.91 104.08c-0.63-0.24-1.59-0.19-2.14-0.13 0.18 0.79 0.88 1.35 1.55 1.1 0.28-0.11 0.47-0.48 0.59-0.97z"),
                fill = SolidColor(MaterialTheme.colorScheme.primary),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M106 105.21c-0.18 0-0.36-0.05-0.53-0.14-0.38-0.21-0.68-0.62-0.79-1.1l-0.03-0.12 0.12-0.01c0.53-0.05 1.53-0.11 2.18 0.14l0.09 0.03-0.02 0.09c-0.16 0.59-0.37 0.93-0.66 1.04-0.12 0.04-0.24 0.07-0.36 0.07zm-1.09-1.17c0.11 0.37 0.35 0.68 0.65 0.85 0.24 0.13 0.49 0.15 0.72 0.06 0.2-0.07 0.37-0.34 0.5-0.8-0.56-0.19-1.36-0.16-1.87-0.11z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M104.33 96.94l1.29 2.17c0.28 0.45 1.22 0.31 1.33-0.31 0.1-0.63-0.38-2.38-0.38-2.38l-2.1 0.52h-0.14z"),
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M106.18 99.48c-0.27 0-0.52-0.12-0.64-0.32-0.28-0.45-1.28-2.15-1.29-2.17-0.02-0.03-0.02-0.07 0-0.11 0.02-0.03 0.05-0.05 0.09-0.05h0.13l2.08-0.52c0.05-0.01 0.11 0.02 0.13 0.07 0.02 0.07 0.49 1.78 0.39 2.42-0.05 0.33-0.32 0.58-0.69 0.65l-0.2 0.03zm-1.67-2.44l1.2 2.01c0.12 0.2 0.4 0.24 0.62 0.2 0.22-0.04 0.47-0.19 0.52-0.48 0.09-0.52-0.26-1.86-0.36-2.23l-1.98 0.5z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M101.92 94.22s-0.28 0.45-0.14 0.77c0.14 0.31 0.52 1.22 0.77 1.68 0.24 0.45 1.36 0.73 2.65 0.52 1.29-0.21 2.03-0.8 2.06-1.33 0.03-0.52-0.21-1.22-0.38-2.06-0.17-0.84-0.63-0.8-1.26-0.8-0.62-0.01-3.17 0.73-3.7 1.22z"),
                fill = SolidColor(MaterialTheme.colorScheme.primary),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M104.35 97.36c-0.91 0-1.68-0.24-1.89-0.65-0.2-0.37-0.49-1.04-0.67-1.44l-0.11-0.24c-0.16-0.36 0.13-0.85 0.15-0.87l0.02-0.02c0.57-0.53 3.14-1.25 3.77-1.25h0.07c0.59 0 1.1 0 1.29 0.89 0.05 0.26 0.11 0.5 0.17 0.73 0.13 0.53 0.24 0.98 0.22 1.36-0.04 0.64-0.93 1.23-2.15 1.42-0.29 0.05-0.59 0.07-0.87 0.07zm-2.34-3.08c-0.07 0.12-0.22 0.45-0.13 0.66l0.11 0.25c0.17 0.4 0.46 1.06 0.66 1.42 0.21 0.39 1.28 0.67 2.55 0.47 1.26-0.2 1.94-0.77 1.97-1.23 0.02-0.35-0.09-0.79-0.21-1.3l-0.17-0.73c-0.15-0.72-0.5-0.72-1.08-0.72h-0.07c-0.64 0-3.12 0.73-3.63 1.18z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M105.7 83.95c0.02-0.86 0.52-1.28 0.55-1.87 0.07-1.16-0.1-1.99-0.19-2.33l-0.96-1.31c-2.75 0.04-4.72 0.08-4.75 0.09-0.1 0.03-0.17 0.63-0.24 1.12 0 0-1.17 0.15-0.96 3.4 0.03 0.45 1.21 5.69 1.29 6.28 0.52 3.65 1.69 5.48 1.69 5.48s0.1 0.45 1.47 0.35c1.36-0.1 2.72-1.01 2.72-1.01s-0.69-7.09-0.62-10.2z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M103.22 95.28c-0.96 0-1.15-0.33-1.18-0.43-0.1-0.17-1.2-2.03-1.7-5.51-0.04-0.26-0.29-1.43-0.56-2.67-0.35-1.65-0.72-3.36-0.74-3.62-0.18-2.85 0.69-3.39 0.97-3.49l0.01-0.1c0.11-0.77 0.16-0.99 0.29-1.03 0.07-0.02 3.11-0.08 4.78-0.1 0.03 0 0.07 0.02 0.09 0.04l0.96 1.31 0.02 0.03c0.08 0.31 0.27 1.17 0.19 2.36-0.02 0.28-0.13 0.52-0.25 0.77-0.15 0.31-0.3 0.64-0.31 1.1-0.07 3.07 0.62 10.12 0.63 10.19 0 0.04-0.01 0.08-0.05 0.1-0.06 0.04-1.4 0.92-2.77 1.03l-0.38 0.02zm-0.99-0.49s0.14 0.36 1.36 0.27c1.17-0.09 2.36-0.8 2.62-0.96-0.07-0.72-0.69-7.23-0.62-10.15 0.01-0.5 0.18-0.86 0.33-1.18 0.11-0.24 0.21-0.46 0.23-0.7 0.07-1.14-0.1-1.96-0.18-2.28l-0.91-1.25c-2.58 0.03-4.39 0.08-4.65 0.09-0.06 0.11-0.12 0.56-0.16 0.86l-0.02 0.17c-0.01 0.05-0.04 0.08-0.09 0.09-0.01 0-1.06 0.2-0.87 3.29 0.02 0.25 0.4 2.02 0.73 3.59 0.27 1.25 0.52 2.42 0.56 2.69 0.51 3.59 1.66 5.42 1.68 5.44l-0.01 0.03z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M99.92 79.12s-1.44 0.22-2.33 1.22c-0.88 1-0.13 1.67 1.58 1.5 1.72-0.18 3.7-1.94 3.78-2.03 0.09-0.1-1.78-1.29-3.03-0.69z"),
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M98.65 81.97c-0.76 0-1.28-0.2-1.47-0.56-0.11-0.22-0.15-0.6 0.33-1.14 0.86-0.97 2.21-1.22 2.37-1.25 1.22-0.57 2.97 0.44 3.15 0.69 0.07 0.09 0.01 0.15 0 0.17-0.16 0.18-2.16 1.89-3.85 2.07l-0.53 0.02zm2.06-2.91c-0.26 0-0.52 0.04-0.75 0.15l-0.03 0.01c-0.01 0-1.42 0.22-2.26 1.18-0.31 0.35-0.42 0.67-0.3 0.91 0.18 0.35 0.87 0.51 1.79 0.42 1.56-0.16 3.32-1.64 3.66-1.95-0.23-0.19-1.21-0.72-2.11-0.72z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M102.48 79.76s1.54 0.07 2.72 0.42c1.19 0.35 3.28 1.05 3.77 1.05 0.49 0 0.35-1.82 0.35-2.17 0-0.35-6.29-0.56-7.06-0.56-0.76 0 0.22 1.26 0.22 1.26z"),
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M108.98 81.33c-0.38 0-1.59-0.37-2.76-0.74l-1.04-0.32c-1.16-0.34-2.68-0.41-2.7-0.41-0.03 0-0.06-0.02-0.08-0.04-0.11-0.14-0.67-0.89-0.49-1.24 0.04-0.08 0.14-0.18 0.36-0.18 0.37 0 2.12 0.05 3.82 0.15 3.34 0.19 3.34 0.37 3.34 0.51l0.01 0.21c0.03 0.86 0.02 1.69-0.24 1.96-0.06 0.06-0.14 0.1-0.22 0.1zm-6.44-1.68c0.27 0.02 1.63 0.11 2.7 0.42l1.04 0.32c1.05 0.32 2.35 0.73 2.7 0.73 0.02 0 0.04 0 0.07-0.03 0.24-0.25 0.2-1.38 0.18-1.81l-0.01-0.18c-0.47-0.27-5.97-0.49-6.95-0.49-0.1 0-0.15 0.02-0.18 0.07-0.08 0.16 0.2 0.65 0.45 0.97z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M109.33 79.06s-0.56 0.28-0.77 1.33c-0.21 1.05-0.49 1.61-0.07 1.89 0.42 0.28 2.24 0.49 2.51 0.21 0.28-0.28 1.05-1.68 1.19-2.58 0.14-0.92-2.86-0.85-2.86-0.85z"),
                fill = SolidColor(MaterialTheme.colorScheme.primary),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M110.3 82.72c-0.68 0-1.59-0.17-1.87-0.36-0.38-0.26-0.28-0.69-0.12-1.35 0.05-0.19 0.1-0.4 0.14-0.64 0.22-1.09 0.8-1.39 0.82-1.4l0.04-0.01c0.09 0 2.31-0.05 2.85 0.56 0.1 0.12 0.14 0.25 0.12 0.4-0.14 0.9-0.9 2.33-1.22 2.64-0.1 0.11-0.4 0.16-0.76 0.16zm-0.94-3.56c-0.09 0.06-0.52 0.37-0.7 1.24l-0.15 0.65c-0.16 0.66-0.22 0.96 0.03 1.13 0.42 0.28 2.16 0.45 2.38 0.22 0.26-0.26 1.02-1.63 1.16-2.53 0.01-0.08-0.01-0.16-0.07-0.23-0.38-0.43-2.02-0.49-2.65-0.48z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M111.7 79.41s-0.56 0.63-0.77 1.26c-0.21 0.63-0.35 1.47-0.35 1.47s0.84 0.21 1.96 0.7 3 0.84 4.82 1.26c1.82 0.42 2.31 0.84 2.93 0.84 0.63 0 1.4-0.49 2.38-1.68s0.14-3.7-0.84-4.47c-0.98-0.77-6.22-1.4-6.92-1.19-0.69 0.2-3.21 1.81-3.21 1.81z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M120.29 85.03c-0.33 0-0.61-0.1-1.03-0.26-0.42-0.16-1-0.37-1.92-0.58l-1.18-0.26c-1.43-0.31-2.77-0.61-3.66-1-1.1-0.48-1.93-0.69-1.94-0.69-0.05-0.01-0.09-0.06-0.08-0.12 0.01-0.03 0.14-0.85 0.35-1.48 0.21-0.64 0.77-1.27 0.79-1.29l0.02-0.02c0.1-0.07 2.54-1.62 3.24-1.83 0.72-0.22 6 0.41 7.01 1.21 0.63 0.5 1.17 1.64 1.29 2.71 0.06 0.55 0.03 1.34-0.44 1.91-0.94 1.14-1.74 1.7-2.45 1.7zm-9.59-2.98c0.25 0.07 0.98 0.29 1.88 0.68 0.87 0.38 2.2 0.67 3.62 0.99l1.18 0.26c0.93 0.21 1.52 0.43 1.95 0.59 0.4 0.15 0.67 0.25 0.96 0.25 0.64 0 1.39-0.54 2.29-1.64 0.42-0.51 0.45-1.24 0.39-1.75-0.11-1.01-0.63-2.11-1.21-2.57-0.97-0.76-6.18-1.36-6.82-1.17-0.65 0.2-2.98 1.67-3.17 1.8-0.07 0.08-0.55 0.65-0.74 1.21-0.16 0.49-0.28 1.12-0.33 1.35z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M98.6 81.86c-0.14-0.74-0.55-1.38-0.82-1.72l-0.19 0.19c-0.78 0.89-0.29 1.52 1.01 1.53z"),
                fill = SolidColor(MaterialTheme.colorScheme.primary),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M98.72 81.97h-0.13c-0.76-0.01-1.26-0.22-1.43-0.59-0.1-0.22-0.11-0.59 0.34-1.11l0.19-0.2 0.08-0.08 0.07 0.09c0.25 0.32 0.69 0.98 0.84 1.76l0.04 0.13zm-0.95-1.67l-0.1 0.1c-0.31 0.35-0.41 0.65-0.31 0.88 0.12 0.27 0.52 0.44 1.11 0.46-0.15-0.6-0.48-1.13-0.7-1.44z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M103.01 93.3l-0.04-0.02c-0.02-0.02-0.01-0.06 0.01-0.07 1.47-0.97 2.04-3.46 2.05-3.48 0.01-0.03 0.03-0.05 0.06-0.04 0.03 0.01 0.05 0.03 0.04 0.06-0.01 0.03-0.59 2.56-2.09 3.55h-0.03z"),
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M130.59 78.37l-0.75-0.68-1.74-3.77c-0.16-0.35-0.52-0.57-0.92-0.57H93.31c-0.4 0-0.76 0.22-0.92 0.57l-2.17 4.7-0.36-0.13v1.08l0.02-0.01c0.03 0.28 0.28 0.51 0.6 0.51H130c0.34 0 0.59-0.26 0.6-0.56l-0.01-1.14z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M130 80.17H90.48c-0.33 0-0.62-0.22-0.69-0.53-0.02-0.02-0.03-0.05-0.03-0.08v-1.08c0-0.03 0.02-0.07 0.04-0.09 0.03-0.02 0.06-0.02 0.1-0.01l0.27 0.1 2.13-4.61c0.18-0.38 0.57-0.63 1.01-0.63h33.87c0.44 0 0.83 0.25 1.01 0.63l1.73 3.75 0.74 0.67c0.02 0.02 0.03 0.05 0.03 0.08l0.02 1.14c-0.01 0.37-0.32 0.66-0.71 0.66zm-40.03-0.68l0.02 0.05c0.03 0.24 0.24 0.42 0.5 0.42H130c0.3 0 0.49-0.23 0.5-0.45l-0.02-1.09-0.72-0.65-0.02-0.03-1.74-3.77c-0.14-0.31-0.46-0.51-0.82-0.51H93.31c-0.36 0-0.68 0.2-0.82 0.51l-2.17 4.7c-0.02 0.05-0.08 0.07-0.13 0.05l-0.22-0.08v0.85z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M130 79.08H90.48c-0.44 0-0.73-0.43-0.55-0.81l2.47-5.33c0.16-0.35 0.52-0.57 0.92-0.57h33.87c0.4 0 0.76 0.22 0.92 0.57l2.47 5.33c0.16 0.38-0.14 0.81-0.58 0.81z"),
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M130 79.18H90.48c-0.25 0-0.48-0.12-0.61-0.33-0.12-0.19-0.14-0.42-0.04-0.63l2.47-5.33c0.18-0.38 0.57-0.63 1.01-0.63h33.87c0.44 0 0.83 0.25 1.01 0.63l2.47 5.33c0.1 0.21 0.08 0.44-0.04 0.63-0.14 0.21-0.37 0.33-0.62 0.33zm-36.69-6.71c-0.36 0-0.68 0.2-0.82 0.51l-2.47 5.33c-0.07 0.14-0.05 0.3 0.03 0.43 0.09 0.14 0.25 0.23 0.43 0.23H130c0.18 0 0.34-0.09 0.43-0.23 0.08-0.13 0.1-0.29 0.03-0.43L128 72.98c-0.14-0.31-0.46-0.51-0.82-0.51H93.31z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M92.49 75.5s-0.89 0.62-0.34 0.84c0.56 0.22 6.99 0.06 7.77-0.17 0.78-0.22 1.68-2.29 1.68-2.63 0-0.34-1.13-0.58-1.54-0.6-0.42-0.02-5.9 0.32-5.9 0.32l-1.67 2.24zm17.39 2.23c4.54 0 8.22-0.69 8.22-1.54 0-0.85-3.68-1.54-8.22-1.54-4.54 0-8.22 0.69-8.22 1.54 0 0.85 3.68 1.54 8.22 1.54z"),
                fill = SolidColor(Color(0xFFEABECE)), stroke = null, fillAlpha = 0.7f,
                strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M92.24 73.47l0.02 1.13 7.6 0.07v-1.3l-7.62 0.1z"),
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M99.86 74.78l-7.6-0.08c-0.06 0-0.1-0.05-0.1-0.1l-0.03-1.13c0-0.03 0.01-0.06 0.03-0.08 0.02-0.02 0.05-0.03 0.07-0.03l7.62-0.1c0.03 0 0.06 0.01 0.07 0.03 0.02 0.02 0.03 0.05 0.03 0.07v1.3c0 0.03-0.01 0.05-0.03 0.07-0.01 0.04-0.03 0.05-0.06 0.05zm-7.49-0.29l7.39 0.07v-1.09l-7.41 0.1 0.02 0.92z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M99.86 74.67l1.1-2.38v-0.7l-1.15 2 0.05 1.08z"),
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M99.86 74.78h-0.02c-0.05-0.01-0.08-0.05-0.08-0.1l-0.05-1.08 0.01-0.06 1.15-2.01c0.02-0.04 0.07-0.06 0.12-0.05 0.05 0.01 0.08 0.05 0.08 0.1v0.7l-0.01 0.04-1.1 2.38c-0.02 0.05-0.06 0.08-0.1 0.08zm0.06-1.16l0.03 0.62 0.91-1.97v-0.29l-0.94 1.64z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M92.24 74.5l0.02 1.13 7.6 0.07v-1.3l-7.62 0.1z"),
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M99.86 75.81l-7.6-0.08c-0.06 0-0.1-0.05-0.1-0.1l-0.03-1.13c0-0.03 0.01-0.06 0.03-0.08 0.02-0.02 0.05-0.03 0.07-0.03l7.62-0.1c0.03 0 0.06 0.01 0.07 0.03 0.02 0.02 0.03 0.05 0.03 0.07v1.3c0 0.03-0.01 0.05-0.03 0.07-0.01 0.03-0.03 0.05-0.06 0.05zm-7.49-0.29l7.39 0.07V74.5l-7.41 0.1 0.02 0.92z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M99.86 75.7l1.1-2.38v-0.7l-1.15 2 0.05 1.08z"),
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M99.86 75.81h-0.02c-0.05-0.01-0.08-0.05-0.08-0.1l-0.05-1.08 0.01-0.06 1.15-2.01c0.02-0.04 0.07-0.06 0.12-0.05 0.05 0.01 0.08 0.05 0.08 0.1v0.7l-0.01 0.04-1.1 2.38c-0.02 0.05-0.06 0.08-0.1 0.08zm0.06-1.16l0.03 0.62 0.91-1.97v-0.29l-0.94 1.64z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M95.17 70.61s0.18-0.35-0.08-0.5c-0.25-0.15-0.53 0.2-0.68 0.33-0.15 0.13-3.31 2.21-3.41 2.53-0.1 0.33 0 1.05 0.68 1.13 0.68 0.08 1.28-0.38 1.58-0.45l0.43-0.1 2.08-2.81-0.6-0.13z"),
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M91.84 74.21l-0.17-0.01c-0.27-0.03-0.49-0.16-0.63-0.38-0.19-0.29-0.2-0.66-0.13-0.89 0.06-0.21 0.86-0.82 2.95-2.24l0.49-0.34 0.09-0.08c0.16-0.16 0.44-0.42 0.71-0.25 0.2 0.12 0.21 0.35 0.16 0.51l0.48 0.1c0.03 0.01 0.06 0.03 0.08 0.07 0.01 0.03 0.01 0.07-0.01 0.1l-2.08 2.81c-0.02 0.02-0.04 0.04-0.06 0.04l-0.42 0.1c-0.08 0.02-0.19 0.07-0.32 0.13-0.3 0.14-0.7 0.33-1.14 0.33zm3.13-4.03c-0.11 0-0.24 0.12-0.38 0.25l-0.1 0.09-0.51 0.35c-0.76 0.52-2.77 1.89-2.87 2.13-0.05 0.18-0.04 0.49 0.11 0.71 0.11 0.16 0.27 0.26 0.48 0.28 0.45 0.05 0.88-0.15 1.19-0.3 0.14-0.07 0.26-0.12 0.36-0.15l0.39-0.09 1.96-2.64-0.44-0.09c-0.03-0.01-0.06-0.03-0.07-0.06v-0.09c0.01-0.01 0.13-0.27-0.04-0.37l-0.08-0.02z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M91.69 74.1c0.68 0.08 1.28-0.38 1.58-0.45l0.43-0.1 0.08-0.1-1.96-0.4s-0.35-0.35-0.8-0.08c-0.11 0.32-0.01 1.05 0.67 1.13z"),
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M91.84 74.21l-0.17-0.01c-0.27-0.03-0.49-0.16-0.63-0.38-0.19-0.29-0.2-0.66-0.13-0.89 0.01-0.02 0.02-0.05 0.05-0.06 0.39-0.24 0.75-0.07 0.91 0.07l1.93 0.39c0.04 0.01 0.06 0.03 0.08 0.07 0.01 0.03 0.01 0.07-0.01 0.1l-0.08 0.1c-0.02 0.02-0.04 0.04-0.06 0.04l-0.42 0.1c-0.08 0.02-0.19 0.07-0.32 0.13-0.31 0.15-0.71 0.34-1.15 0.34zm-0.14-0.22c0.45 0.05 0.88-0.15 1.19-0.3 0.14-0.07 0.26-0.12 0.36-0.15l0.23-0.06-1.68-0.34c-0.02 0-0.04-0.01-0.05-0.03-0.01-0.01-0.28-0.27-0.64-0.08-0.04 0.18-0.02 0.47 0.12 0.67 0.1 0.17 0.26 0.27 0.47 0.29z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M91.81 73.04h5.87c1.83 0 2.38-0.1 2.38-0.1l1.13-2.33s-3.56 0.23-4.66 0.15c-1.1-0.08-1.35-0.15-1.35-0.15l-3.37 2.43z"),
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M97.68 73.15h-5.87c-0.05 0-0.09-0.03-0.1-0.07-0.01-0.04 0-0.09 0.04-0.12l3.36-2.43c0.03-0.02 0.06-0.02 0.09-0.02 0 0 0.27 0.07 1.33 0.15 1.08 0.07 4.61-0.15 4.65-0.15 0.04 0 0.07 0.02 0.09 0.05 0.02 0.03 0.02 0.07 0.01 0.1l-1.13 2.33c-0.01 0.03-0.04 0.05-0.08 0.06-0.01 0-0.57 0.1-2.39 0.1zm-5.54-0.21h5.54c1.5 0 2.14-0.07 2.31-0.09l1.03-2.12c-0.74 0.04-3.53 0.2-4.5 0.14-0.85-0.06-1.2-0.12-1.32-0.14l-3.06 2.21z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M91.81 73.04l0.1 0.45 6.02 0.03c1.25 0 2.21 0.05 2.21 0.05l-0.08-0.63-8.25 0.1z"),
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M100.14 73.67c-0.01 0-0.01 0 0 0-0.02 0-0.97-0.05-2.21-0.05l-6.02-0.03c-0.05 0-0.09-0.03-0.1-0.08l-0.1-0.45c-0.01-0.03 0-0.06 0.02-0.09 0.02-0.02 0.05-0.04 0.08-0.04l8.25-0.1c0.06 0 0.1 0.04 0.11 0.09l0.08 0.63c0 0.03-0.01 0.06-0.03 0.08-0.03 0.03-0.06 0.04-0.08 0.04zM92 73.39l5.93 0.02c0.98 0 1.79 0.03 2.09 0.04l-0.05-0.41-8.03 0.1 0.06 0.25z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M100.14 73.57l1.05-2.41v-0.55l-1.13 2.33 0.08 0.63z"),
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M100.14 73.67h-0.02c-0.05-0.01-0.08-0.04-0.09-0.09l-0.08-0.63 0.01-0.06 1.13-2.33c0.02-0.04 0.07-0.07 0.12-0.06 0.05 0.01 0.08 0.05 0.08 0.1v0.55l-0.01 0.04-1.05 2.41c-0.02 0.05-0.05 0.07-0.09 0.07zm0.03-0.71l0.03 0.21 0.89-2.03v-0.07l-0.92 1.89z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M117.06 76.39h-14.37c-0.13 0-0.24-0.11-0.24-0.24s0.11-0.24 0.24-0.24h14.37c0.13 0 0.24 0.11 0.24 0.24s-0.11 0.24-0.24 0.24z"),
                fill = SolidColor(MaterialTheme.colorScheme.primary),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M117.06 76.49h-14.37c-0.19 0-0.35-0.16-0.35-0.35 0-0.19 0.16-0.35 0.35-0.35h14.37c0.19 0 0.35 0.16 0.35 0.35 0 0.2-0.16 0.35-0.35 0.35zm-14.37-0.48c-0.08 0-0.14 0.06-0.14 0.14 0 0.08 0.06 0.14 0.14 0.14h14.37c0.08 0 0.14-0.06 0.14-0.14 0-0.08-0.06-0.14-0.14-0.14h-14.37z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M117.18 75.9h-14.61c-0.11 0-0.21-0.09-0.22-0.2l-0.8-9.54c-0.01-0.13 0.09-0.23 0.22-0.23h16.2c0.13 0 0.23 0.11 0.22 0.23l-0.8 9.54c0 0.11-0.1 0.2-0.21 0.2z"),
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M117.18 76.01h-14.61c-0.17 0-0.31-0.13-0.32-0.29l-0.8-9.54c-0.01-0.09 0.02-0.18 0.08-0.24 0.06-0.07 0.15-0.1 0.24-0.1h16.2c0.09 0 0.18 0.04 0.24 0.1 0.06 0.07 0.09 0.16 0.08 0.24l-0.8 9.54c0 0.16-0.14 0.29-0.31 0.29zm-15.4-9.98c-0.03 0-0.06 0.01-0.08 0.04-0.02 0.02-0.03 0.05-0.03 0.09l0.8 9.54c0 0.06 0.05 0.1 0.11 0.1h14.61c0.06 0 0.11-0.04 0.11-0.1l0.8-9.54-0.03-0.09c-0.02-0.02-0.05-0.04-0.08-0.04h-16.21z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M111.26 71.08c0 0.57-0.62 1.03-1.38 1.03-0.76 0-1.38-0.46-1.38-1.03 0-0.57 0.62-1.03 1.38-1.03 0.76 0 1.38 0.46 1.38 1.03z"),
                fill = SolidColor(MaterialTheme.colorScheme.primary),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M109.88 72.21c-0.82 0-1.48-0.51-1.48-1.14 0-0.63 0.67-1.14 1.48-1.14 0.82 0 1.48 0.51 1.48 1.14 0 0.63-0.67 1.14-1.48 1.14zm0-2.06c-0.7 0-1.27 0.42-1.27 0.93s0.57 0.93 1.27 0.93c0.7 0 1.27-0.42 1.27-0.93s-0.57-0.93-1.27-0.93zm2.45-24.71c0.25-0.05 0.78-0.26 1.15-1.09 0.02-0.05 0-0.11-0.05-0.14-0.05-0.02-0.11 0-0.14 0.05-0.33 0.77-0.81 0.94-1 0.97 0.35-0.43 0.55-0.95 0.55-1.52 0-1.45-1.35-2.63-3.01-2.63-1.66 0-3.01 1.18-3.01 2.63 0 0.54 0.19 1.04 0.5 1.46-0.32-0.02-0.85 0.12-1.53 0.91-0.04 0.04-0.03 0.11 0.01 0.15 0.02 0.02 0.04 0.03 0.07 0.03 0.03 0 0.06-0.01 0.08-0.04 0.86-1.01 1.44-0.84 1.55-0.79-0.22 0.12-0.4 0.25-0.55 0.38-0.97 0.87-1.55 2.51-1.48 3.89 0.08 1.38 0.95 2.51 0.95 2.51s0.98-0.63 1.7-1.91c0.38-0.66 0.66-1.27 0.84-1.71 0 0.61 0.08 1.36 0.4 1.88 0.72 1.18 1.75 1.38 2.35 1.38 0.29 0 0.49-0.05 0.49-0.05l0.07-0.05c0.81 0.17 1.61 0.16 1.74-0.01 0.2-0.28 0.48-1.13 0.58-2.18 0.17-1.76-0.95-3.31-2.26-4.12z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M113.41 50.49c-0.61 0-1.5-0.15-2.41-0.86-1.62-1.25-1.47-2.51-1.46-2.57 0-0.03 0.03-0.05 0.06-0.04 0.03 0 0.05 0.03 0.04 0.06 0 0.01-0.15 1.26 1.42 2.47 1.57 1.22 3.08 0.75 3.09 0.74 0.03-0.01 0.06 0.01 0.07 0.03 0.01 0.03-0.01 0.06-0.03 0.07-0.01 0-0.31 0.1-0.78 0.1zm-6.12-2.98h-0.02c-0.03-0.01-0.04-0.04-0.03-0.07 0-0.01 0.12-0.25 0.57-0.7 0.47-0.47 1.2-0.28 1.23-0.27 0.03 0.01 0.04 0.04 0.04 0.06-0.01 0.03-0.04 0.05-0.06 0.04-0.01 0-0.71-0.18-1.13 0.24-0.44 0.44-0.55 0.67-0.55 0.67-0.01 0.02-0.03 0.03-0.05 0.03z"),
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
        }.build()
        return _thirteen!!
    }

private var _thirteen: ImageVector? = null

@Preview
@Composable
private fun ImagePreview() {
    Box {
        Image(
            imageVector = Cards.Thirteen,
            contentDescription = null,
        )
    }
}
