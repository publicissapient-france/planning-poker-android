package planningpoker.compose.illustrations

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
import planningpoker.compose.illustrations.Illu.Cards


public val Illu.Cards.Two: ImageVector
    @Composable get() {
        if (_two != null) {
            return _two!!
        }
        _two = Builder(
            name = "Two", defaultWidth = 156.0.dp, defaultHeight = 226.0.dp,
            viewportWidth = 156.0f, viewportHeight = 226.0f
        ).apply {
            addPath(
                pathData = addPathNodes("M34 90.71c0-17.22-2.92-21.78 7.64-36.33C52.2 39.82 78.12 36.6 97.7 47.4c19.59 10.8 24.87 24.67 24.87 24.67s7.1 16.21-2.88 32.54c-9.13 14.92-27.12 23.41-42.73 30.4h-39.9c-2.36-1.76-4.42-3.89-6.1-6.38-8.13-12.08 3.02-20.7 3.03-37.92z"),
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
                pathData = addPathNodes("M111.06 68.61c-0.13 0-0.18-0.15-0.26-0.46-0.02-0.07 0.02-0.13 0.09-0.15 0.06-0.02 0.13 0.02 0.15 0.09v0.01l0.06-0.59c0.08-0.83 0.21-2.07 0.51-3.45 0.27-1.23 0.66-1.92 1.16-2.05 0.44-0.12 0.78 0.24 0.8 0.25 0.05 0.05 0.04 0.13-0.01 0.17-0.05 0.05-0.13 0.04-0.17-0.01 0 0-0.26-0.27-0.56-0.18-0.28 0.08-0.68 0.46-0.99 1.87-0.3 1.36-0.42 2.6-0.51 3.42-0.09 0.89-0.11 1.05-0.27 1.07v0.01z"),
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M110.71 65.25c-0.05 0-0.09-0.03-0.11-0.08-0.03-0.06 0-0.13 0.07-0.16l2.02-0.83c0.06-0.03 0.13 0 0.16 0.07 0.03 0.06 0 0.13-0.07 0.16l-2.02 0.83-0.05 0.01zm4.31 1.74l-0.06-0.02c-1.9-1.11-0.67-3.69-0.66-3.72 0.03-0.06 0.1-0.09 0.16-0.06s0.09 0.1 0.06 0.16c-0.05 0.1-1.14 2.41 0.57 3.4 0.06 0.03 0.08 0.11 0.04 0.17-0.03 0.04-0.07 0.07-0.11 0.07zm1.85-0.76l-0.06-0.01c-0.06-0.03-0.08-0.1-0.05-0.16 1.18-2.27-0.62-3.3-0.7-3.35-0.06-0.03-0.08-0.11-0.05-0.17 0.03-0.06 0.11-0.08 0.17-0.05 0.02 0.01 2.08 1.19 0.79 3.67-0.01 0.04-0.06 0.07-0.1 0.07z"),
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M116.19 65.31l-0.07-0.02-1.43-1.04c-0.05-0.04-0.07-0.12-0.03-0.17 0.04-0.05 0.12-0.07 0.17-0.03l1.43 1.04c0.05 0.04 0.07 0.12 0.03 0.17-0.03 0.04-0.07 0.05-0.1 0.05z"),
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M114.76 65.59l-0.06-0.02c-0.06-0.04-0.07-0.11-0.04-0.17l1.12-1.78c0.04-0.06 0.11-0.07 0.17-0.04 0.06 0.04 0.07 0.11 0.04 0.17l-1.12 1.78c-0.03 0.04-0.07 0.06-0.11 0.06zM67.8 41.08c-0.07 0-0.12-0.05-0.12-0.12 0-1.64 0.52-2.97 1.54-3.98 2.03-2.01 5.32-1.98 5.46-1.98 0.07 0 0.12 0.06 0.12 0.12 0 0.07-0.05 0.12-0.12 0.12-0.03 0-3.33-0.02-5.29 1.91-0.97 0.96-1.46 2.23-1.47 3.8 0 0.07-0.06 0.13-0.12 0.13z"),
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes(
                    "M73.35 41.79c-0.03 0-0.06-0.01-0.08-0.03-0.11-0.1-0.17-0.22-0.17-0.38-0.01-0.46 0.46-1.13 0.9-1.66-1.06 0.58-2.56 1.06-3.29 0.64-0.26-0.15-0.53-0.48-0.37-1.22 0.22-0.94 0.9-1.47 1.87-1.44 0.95 0.03 1.93 0.58 2.02 1.14 0.01 0.07-0.03 0.13-0.1 0.14-0.07 0.01-0.13-0.03-0.14-0.1-0.06-0.39-0.92-0.91-1.79-0.94-0.5-0.01-1.37 0.13-1.63 1.25-0.11 0.47-0.02 0.79 0.25 0.95 0.8 0.46 3.05-0.44 3.9-1.22 0.05-0.05 0.12-0.04 0.17 0.01 0.05 0.05 0.04 0.12 0 0.17-0.44 0.43-1.57 1.67-1.55 2.27 0 0.09 0.03 0.16 0.09 0.21 0.05 0.04 0.06 0.12 0.01 0.17-0.03 0.03-0.06 0.04-0.09 0.04zm-0.15 1.4c-0.19 0-0.4-0.05-0.6-0.16-0.06-0.03-0.08-0.11-0.05-0.17 0.03-0.06 0.11-0.08 0.17-0.05 0.88 0.48 1.69-0.52 1.73-0.56 0.04-0.05 0.12-0.06 0.17-0.02 0.05 0.04 0.06 0.12 0.02 0.17-0.01 0.01-0.64 0.79-1.44 0.79zm5.25 1.28c-0.56 0-1.12-0.26-1.61-0.75-0.05-0.05-0.05-0.12 0-0.17 0.05-0.05 0.12-0.05 0.17 0 0.61 0.61 1.33 0.82 2 0.57 0.57-0.2 0.99-0.71 1.03-1.22 0.03-0.4-0.19-0.75-0.61-0.98-1.42-0.78-3.92 1.74-3.95 1.77-0.05 0.05-0.12 0.05-0.17 0-0.05-0.05-0.05-0.12 0-0.17l5.15-5.26c0.05-0.05 0.12-0.05 0.17 0 0.05 0.05 0.05 0.12 0 0.17l-3.7 3.78c0.84-0.53 1.84-0.93 2.61-0.5 0.51 0.28 0.77 0.71 0.73 1.21-0.04 0.6-0.53 1.19-1.18 1.43-0.2 0.08-0.42 0.12-0.64 0.12z"
                ),
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M77.46 46.39c-0.07 0-0.12-0.05-0.12-0.12 0-0.07 0.05-0.12 0.12-0.13 2.16-0.07 3.73-0.72 4.67-1.92 1.44-1.84 0.91-4.39 0.9-4.42-0.01-0.07 0.03-0.13 0.09-0.14 0.07-0.01 0.13 0.03 0.14 0.09 0.02 0.11 0.56 2.69-0.95 4.62-0.97 1.27-2.61 1.95-4.85 2.02 0 0 0.01 0 0 0zm-33.7 20.46h-0.03c-0.05-0.01-0.09-0.06-0.09-0.12l-0.03-5.36-2.3-0.38c-0.07-0.01-0.11-0.07-0.1-0.14 0.01-0.07 0.07-0.11 0.14-0.1l2.4 0.4c0.06 0.01 0.1 0.06 0.1 0.12l0.03 5 5.04-9.2c0.02-0.05 0.08-0.07 0.13-0.06l8.31 1.37c0.07 0.01 0.11 0.07 0.1 0.14-0.01 0.07-0.07 0.11-0.14 0.1l-8.23-1.35-5.22 9.53c-0.03 0.03-0.07 0.05-0.11 0.05z"),
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M53.59 67.91c-0.04 0-0.08-0.02-0.11-0.06l-3.66-6.45c-0.03-0.06-0.01-0.13 0.05-0.17 0.06-0.03 0.13-0.01 0.17 0.05l3.66 6.45c0.03 0.06 0.01 0.13-0.05 0.17l-0.06 0.01z"),
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes(
                    "M47.99 66.98c-0.04 0-0.07-0.02-0.1-0.05-0.04-0.05-0.03-0.13 0.03-0.17l6.54-4.77c0.05-0.04 0.13-0.03 0.17 0.03 0.04 0.05 0.03 0.13-0.03 0.17l-6.54 4.77c-0.02 0.02-0.05 0.02-0.07 0.02zm0.4-19.86h-0.03c-0.13-0.03-0.24-0.11-0.32-0.24-0.21-0.36-0.14-1.09-0.02-1.71-0.6 0.93-1.58 1.95-2.35 1.95h-0.02c-0.28-0.01-0.66-0.16-0.85-0.83-0.25-0.87 0.07-1.6 0.88-2.02 0.79-0.4 1.84-0.39 2.16 0.03 0.04 0.05 0.03 0.13-0.02 0.17-0.05 0.04-0.13 0.03-0.17-0.02-0.22-0.29-1.15-0.32-1.86 0.04-0.41 0.21-1.05 0.71-0.76 1.73 0.12 0.43 0.33 0.65 0.62 0.66h0.01c0.86 0 2.26-1.72 2.6-2.73 0.02-0.06 0.09-0.1 0.15-0.08 0.06 0.02 0.1 0.09 0.08 0.15-0.17 0.54-0.53 2.05-0.25 2.54 0.04 0.07 0.09 0.11 0.16 0.12 0.07 0.01 0.11 0.08 0.09 0.14 0.01 0.06-0.04 0.1-0.1 0.1zm0.96-2.42h-0.03c-0.06-0.02-0.1-0.07-0.09-0.13v-0.02l0.65-2.33c0.02-0.06 0.09-0.1 0.15-0.08 0.06 0.02 0.1 0.09 0.08 0.15l-0.35 1.24c0.13-0.13 0.29-0.22 0.47-0.22 0.22 0 0.4 0.1 0.48 0.28 0.1 0.21 0.05 0.49-0.13 0.69-0.2 0.23-0.5 0.3-0.84 0.2-0.06-0.02-0.1-0.09-0.08-0.15 0.02-0.06 0.09-0.1 0.15-0.08 0.33 0.1 0.51-0.04 0.58-0.13 0.11-0.12 0.14-0.3 0.09-0.43-0.04-0.09-0.13-0.14-0.26-0.14-0.39 0-0.7 0.78-0.78 1.08 0.01 0.03-0.04 0.07-0.09 0.07zm10.69 87.32c-0.03 0-0.07-0.01-0.09-0.04l-1.86-2.04c-0.03-0.03-0.04-0.07-0.03-0.11l0.85-3.08c0.02-0.06 0.09-0.1 0.15-0.08 0.06 0.02 0.1 0.09 0.08 0.15l-0.84 3.02 1.82 1.99c0.05 0.05 0.04 0.13-0.01 0.17l-0.07 0.02zm2.19-2.09c-0.03 0-0.06-0.01-0.08-0.03l-2.13-1.79c-0.06-0.03-0.06-0.11-0.02-0.16 0.04-0.05 0.12-0.06 0.17-0.02l2.13 1.79c0.05 0.04 0.06 0.12 0.02 0.17-0.02 0.03-0.06 0.04-0.09 0.04z"
                ),
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M60.64 129.98l-0.05-0.01c-0.06-0.03-0.09-0.1-0.07-0.16l0.92-2.27c0.03-0.06 0.1-0.09 0.16-0.07 0.06 0.03 0.09 0.1 0.07 0.16l-0.92 2.27c-0.02 0.05-0.06 0.08-0.11 0.08zm2.17 0.43c-0.05 0-0.1-0.03-0.12-0.09-0.02-0.06 0.02-0.13 0.08-0.15 0.12-0.04 0.18-0.38 0.17-0.61 0-0.07 0.05-0.12 0.12-0.13 0.07 0 0.12 0.05 0.13 0.12 0 0.12 0 0.74-0.35 0.85l-0.03 0.01zm1.81-2.01l-0.07-0.02-1.29-0.96c-0.05-0.04-0.07-0.12-0.03-0.17 0.04-0.05 0.12-0.07 0.17-0.03l1.29 0.96c0.05 0.04 0.07 0.12 0.03 0.17-0.02 0.03-0.06 0.05-0.1 0.05z"),
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M63.83 131.23H63.8c-0.06-0.02-0.1-0.09-0.08-0.15l1.27-4.58c0.02-0.06 0.08-0.1 0.15-0.08 0.06 0.02 0.1 0.09 0.08 0.15l-1.27 4.58c-0.02 0.05-0.07 0.08-0.12 0.08zm2.52-1.27l-0.04-0.01c-0.06-0.02-0.1-0.09-0.08-0.15l0.86-2.49-2.02-2.28c-0.04-0.05-0.04-0.13 0.01-0.17 0.05-0.04 0.13-0.04 0.17 0.01l2.07 2.34c0.03 0.03 0.04 0.08 0.02 0.12l-0.88 2.56c-0.01 0.04-0.06 0.07-0.11 0.07zm46.58-1.23h-0.08c-0.05-0.02-0.09-0.06-0.09-0.11l-0.41-22.11c0-0.04 0.02-0.08 0.06-0.11 0.04-0.02 0.08-0.02 0.12 0l11.25 6.11c0.03 0.02 0.05 0.04 0.06 0.08 0.01 0.03 0 0.07-0.02 0.1l-10.84 16.01c-0.01 0.01-0.03 0.03-0.05 0.03zm-0.33-22.02l0.4 21.52 10.55-15.58-10.95-5.94z"),
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M122.31 114.88c-0.03 0.01-0.07 0.01-0.1-0.01l-2.39-1.34c-0.03-0.02-0.05-0.04-0.06-0.07-0.01-0.03 0-0.06 0.01-0.09l1.25-2.21c0.03-0.06 0.11-0.08 0.17-0.05 0.06 0.03 0.08 0.11 0.05 0.17l-1.19 2.11 2.29 1.28c0.06 0.03 0.08 0.11 0.05 0.17l-0.08 0.04zm-11.89-25.07c-2.32 0-4.21-1.89-4.21-4.21 0-2.32 1.89-4.21 4.21-4.21 2.32 0 4.21 1.89 4.21 4.21 0 2.32-1.89 4.21-4.21 4.21zm0-8.18c-2.19 0-3.97 1.78-3.97 3.97 0 2.19 1.78 3.97 3.97 3.97 2.19 0 3.97-1.78 3.97-3.97 0-2.19-1.79-3.97-3.97-3.97z"),
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M114.95 86.68c-2.57 0-4.66-2.09-4.66-4.66 0-2.57 2.09-4.66 4.66-4.66 2.57 0 4.66 2.09 4.66 4.66 0 2.57-2.09 4.66-4.66 4.66zm0-9.08c-2.44 0-4.42 1.98-4.42 4.42s1.98 4.42 4.42 4.42 4.42-1.98 4.42-4.42-1.98-4.42-4.42-4.42z"),
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes(
                    "M110.67 83.63h-0.03c-0.06-0.02-0.1-0.09-0.08-0.15l0.55-1.92c0.02-0.06 0.09-0.1 0.15-0.08 0.06 0.02 0.1 0.09 0.08 0.15l-0.55 1.92c-0.02 0.05-0.07 0.08-0.12 0.08zm0.55 1.09h-0.03c-0.06-0.02-0.1-0.09-0.08-0.15l0.78-2.77c0.02-0.06 0.09-0.1 0.15-0.08 0.06 0.02 0.1 0.09 0.08 0.15l-0.78 2.77c-0.02 0.05-0.06 0.08-0.12 0.08zm0.79 0.83h-0.03c-0.07-0.02-0.1-0.08-0.09-0.15l0.82-3.13c0.02-0.07 0.08-0.1 0.15-0.09 0.07 0.02 0.1 0.08 0.09 0.15l-0.82 3.13c-0.02 0.05-0.07 0.09-0.12 0.09zm1.14 0.76h-0.02c-0.07-0.01-0.11-0.08-0.1-0.14l0.58-2.97c0.01-0.07 0.08-0.11 0.14-0.1 0.07 0.01 0.11 0.08 0.1 0.14l-0.58 2.97c-0.01 0.06-0.06 0.1-0.12 0.1zm0.59 0.2h-0.03c-0.07-0.02-0.11-0.08-0.09-0.15l0.52-2.21c0.02-0.07 0.08-0.11 0.15-0.09 0.07 0.02 0.11 0.08 0.09 0.15l-0.52 2.21c-0.02 0.05-0.07 0.09-0.12 0.09zm-7.5-4.45c-0.11 0-0.24-0.04-0.39-0.17-0.35-0.28-0.42-0.67-0.21-1.07 0.21-0.39 0.64-0.66 0.9-0.58l0.07 0.05-0.03-0.14c-0.02-0.06 0.02-0.13 0.08-0.15 0.06-0.02 0.13 0.02 0.15 0.08 0.11 0.36 0.35 0.9 0.53 0.98h0.04c0.06-0.03 0.13 0 0.16 0.07 0.03 0.06 0 0.13-0.07 0.16s-0.16 0.03-0.23-0.01c-0.13-0.06-0.26-0.23-0.36-0.41-0.02 0.46-0.15 0.95-0.41 1.12-0.06 0.04-0.13 0.07-0.23 0.07zm0.2-1.59c-0.14 0-0.43 0.19-0.58 0.47-0.11 0.2-0.17 0.5 0.15 0.77 0.2 0.16 0.29 0.1 0.33 0.08 0.24-0.16 0.35-0.89 0.29-1.4v0.01c-0.02 0.06-0.09 0.1-0.15 0.08l-0.04-0.01zm6.65-2.85c-0.04 0-0.08-0.02-0.11-0.06l-1.3-2.38c-0.03-0.06-0.01-0.13 0.05-0.17 0.06-0.03 0.13-0.01 0.17 0.05l0.72 1.31c-0.01-0.23 0.04-0.44 0.2-0.6 0.17-0.17 0.39-0.22 0.59-0.14 0.24 0.09 0.41 0.35 0.43 0.64 0.02 0.33-0.17 0.62-0.51 0.8-0.06 0.03-0.13 0.01-0.16-0.05-0.03-0.06-0.01-0.13 0.05-0.16 0.35-0.18 0.38-0.44 0.38-0.57-0.01-0.19-0.13-0.37-0.27-0.42-0.11-0.04-0.23-0.01-0.33 0.09-0.32 0.31 0.04 1.18 0.21 1.49 0.03 0.06 0.01 0.13-0.05 0.17-0.03-0.01-0.05 0-0.07 0zm12.28 19.39c-0.03 0-0.06-0.01-0.08-0.03l-2.55-2.42c-0.05-0.05-0.05-0.12 0-0.17 0.05-0.05 0.12-0.05 0.17 0l2.55 2.42c0.05 0.05 0.05 0.12 0 0.17-0.02 0.02-0.06 0.03-0.09 0.03z"
                ),
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes(
                    "M123.23 97.16l-0.07-0.02c-0.06-0.04-0.07-0.11-0.03-0.17l2.14-3.19c0.04-0.06 0.11-0.07 0.17-0.03 0.06 0.04 0.07 0.11 0.03 0.17l-2.14 3.19c-0.02 0.03-0.06 0.05-0.1 0.05zm4.65-2.28c-0.05 0-0.1-0.03-0.11-0.08-0.02-0.06 0.01-0.13 0.07-0.16l2.55-0.95c0.06-0.02 0.13 0.01 0.16 0.07 0.02 0.06-0.01 0.13-0.07 0.16l-2.55 0.95-0.05 0.01zm5.34-2.24c-0.03 0-0.06-0.01-0.08-0.03l-1.55-1.37c-0.05-0.04-0.06-0.12-0.01-0.17 0.04-0.05 0.12-0.05 0.17-0.01l1.55 1.37c0.05 0.04 0.06 0.12 0.01 0.17-0.03 0.03-0.06 0.04-0.09 0.04zm-0.78 3.72h-0.03c-0.06-0.02-0.1-0.09-0.08-0.15l1.97-6.75c0.02-0.06 0.09-0.1 0.15-0.08 0.06 0.02 0.1 0.09 0.08 0.15l-1.97 6.75c-0.02 0.05-0.07 0.08-0.12 0.08zm-40.49 36.29c-0.11 0-0.22-0.01-0.34-0.04-0.74-0.17-1.34-0.89-1.8-2.16-1.02-2.86 0.52-4.47 1.23-5.03h-4.51l0.13 6.52c0 0.07-0.05 0.12-0.12 0.12-0.06 0-0.12-0.05-0.12-0.12l-0.14-6.64 0.03-0.09c0.02-0.02 0.05-0.04 0.09-0.04h5.02c0.06 0 0.1 0.04 0.12 0.09 0.01 0.05-0.01 0.11-0.06 0.14-0.11 0.06-2.68 1.53-1.45 4.96 0.42 1.18 0.97 1.85 1.62 2 0.8 0.18 1.52-0.51 1.52-0.52 0.05-0.05 0.12-0.05 0.17 0 0.05 0.05 0.05 0.12 0 0.17 0 0.06-0.61 0.64-1.39 0.64zm12.34-82.17s-0.01 0 0 0l-4.52-0.33c-0.06 0-0.1-0.05-0.11-0.1l-0.89-6.36c-0.01-0.05 0.01-0.09 0.05-0.12l3.76-2.59c0.02-0.02 0.05-0.02 0.08-0.02l4.98 0.35c0.06 0 0.11 0.05 0.11 0.12l0.31 6.31c0 0.04-0.02 0.08-0.05 0.11l-3.65 2.61-0.07 0.02zm-4.4-0.57l4.37 0.32 3.56-2.55-0.3-6.14-4.83-0.34-3.66 2.52 0.86 6.19z"
                ),
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M99.78 50.15c-0.04 0-0.08-0.02-0.1-0.05-0.04-0.05-0.03-0.13 0.03-0.17l3.64-2.62c0.02-0.02 0.05-0.03 0.08-0.02l4.52 0.34c0.07 0 0.12 0.06 0.11 0.13 0 0.07-0.06 0.12-0.13 0.11l-4.48-0.33-3.6 2.59-0.07 0.02z"),
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M103.42 47.53c-0.06 0-0.11-0.05-0.12-0.11l-0.77-6.32c-0.01-0.07 0.04-0.13 0.11-0.14 0.07-0.01 0.13 0.04 0.14 0.11l0.77 6.32c0.01 0.07-0.04 0.13-0.11 0.14h-0.02z"),
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M103.86 44.36h-0.01l-4.97-0.58c-0.07-0.01-0.11-0.07-0.11-0.13 0.01-0.07 0.07-0.11 0.13-0.11l4.92 0.57 3.73-2.78c0.05-0.04 0.13-0.03 0.17 0.02 0.04 0.05 0.03 0.13-0.02 0.17l-3.77 2.81c-0.02 0.03-0.04 0.03-0.07 0.03z"),
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M104.29 50.48c-0.06 0-0.12-0.05-0.12-0.11l-0.43-6.11c0-0.07 0.05-0.13 0.11-0.13 0.07 0 0.13 0.05 0.13 0.11l0.43 6.11c0 0.06-0.05 0.12-0.12 0.13zM66.61 95.39l-0.07-0.02c-0.03-0.02-0.06-0.06-0.05-0.1l0.17-8.97c0-0.05 0.03-0.09 0.07-0.11 0.04-0.02 0.09-0.02 0.13 0.01l7.69 5.4c0.04 0.03 0.06 0.07 0.05 0.11 0 0.04-0.03 0.08-0.07 0.1l-7.86 3.57-0.06 0.01zm0.29-8.86l-0.16 8.55 7.49-3.4-7.33-5.15z"),
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M70.52 93.56c-0.04 0-0.09-0.02-0.11-0.07l-3.74-7.14c-0.03-0.06-0.01-0.13 0.05-0.16 0.06-0.03 0.13-0.01 0.16 0.05l3.74 7.14c0.03 0.06 0.01 0.13-0.05 0.16l-0.05 0.02z"),
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M71.45 93.19c-0.04 0-0.09-0.02-0.11-0.07l-0.56-1.11-0.8 0.39c-0.06 0.03-0.13 0-0.16-0.06s0-0.13 0.06-0.16l0.91-0.44c0.06-0.03 0.13 0 0.16 0.06l0.61 1.22c0.03 0.06 0.01 0.13-0.05 0.16l-0.06 0.01zm55.62-40.57c-0.03 0-0.07-0.01-0.09-0.04l-4.73-5.07c-0.05-0.05-0.04-0.13 0.01-0.17 0.05-0.05 0.13-0.04 0.17 0.01l4.73 5.07c0.05 0.05 0.04 0.13-0.01 0.17-0.02 0.01-0.05 0.03-0.08 0.03z"),
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M123.13 52.31l-0.07-0.02c-0.05-0.04-0.07-0.12-0.03-0.17l3.97-5.44c0.04-0.05 0.12-0.07 0.17-0.03 0.05 0.04 0.07 0.12 0.03 0.17l-3.97 5.44c-0.02 0.03-0.06 0.05-0.1 0.05zm8.27-4.76h-2.67c-0.05 0-0.1-0.03-0.11-0.08-0.02-0.05 0-0.1 0.04-0.14 0.02-0.01 1.81-1.45 1.6-2.5-0.06-0.3-0.19-0.5-0.38-0.6-0.34-0.19-0.79-0.02-0.79-0.02-0.06 0.02-0.13-0.01-0.16-0.07-0.03-0.07 0-0.14 0.07-0.17 0.02-0.01 0.55-0.21 0.99 0.03 0.26 0.14 0.43 0.4 0.5 0.77 0.19 0.94-0.91 2.06-1.43 2.53h2.34c0.07 0 0.12 0.05 0.12 0.12 0.01 0.07-0.05 0.13-0.12 0.13z"),
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M147.35 135.24H7.17c-0.1 0-0.17-0.05-0.17-0.12 0-0.07 0.08-0.12 0.17-0.12h140.18c0.1 0 0.17 0.05 0.17 0.12 0 0.06-0.07 0.12-0.17 0.12z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M28.84 54.81H14.47c-1.06 0-1.91 0.86-1.91 1.91v12.34c0 1.06 0.86 1.91 1.91 1.91h6.37l3.65 4.4-0.91-4.4h5.27c1.06 0 1.91-0.86 1.91-1.91V56.73c-0.01-1.06-0.86-1.92-1.92-1.92z"),
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M24.49 75.52c-0.04 0-0.08-0.02-0.11-0.05l-3.61-4.35h-6.3c-1.13 0-2.05-0.92-2.05-2.05V56.73c0-1.13 0.92-2.05 2.05-2.05h14.37c1.13 0 2.05 0.92 2.05 2.05v12.34c0 1.13-0.92 2.05-2.05 2.05h-5.1l0.88 4.23c0.01 0.06-0.02 0.13-0.08 0.15l-0.05 0.02zM14.47 54.95c-0.98 0-1.77 0.8-1.77 1.77v12.34c0 0.98 0.8 1.77 1.77 1.77h6.37c0.04 0 0.08 0.02 0.11 0.05l3.29 3.97-0.8-3.85c-0.01-0.04 0-0.08 0.03-0.12 0.03-0.03 0.07-0.05 0.11-0.05h5.27c0.98 0 1.77-0.8 1.77-1.77V56.73c0-0.98-0.8-1.77-1.77-1.77H14.47v-0.01z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes(
                    "M22.8 61.59v-1.31l-0.98-0.08c-0.06-0.21-0.14-0.4-0.24-0.59l0.63-0.75-0.92-0.92-0.75 0.63c-0.18-0.1-0.38-0.18-0.59-0.24l-0.08-0.98h-1.31l-0.08 0.98c-0.21 0.06-0.4 0.14-0.59 0.24l-0.75-0.63-0.92 0.92 0.63 0.75c-0.1 0.18-0.18 0.38-0.24 0.59l-0.98 0.08v1.31l0.98 0.08c0.06 0.21 0.14 0.4 0.24 0.59l-0.63 0.75 0.92 0.92 0.75-0.63c0.18 0.1 0.38 0.18 0.59 0.24l0.08 0.98h1.31l0.08-0.98c0.21-0.06 0.4-0.14 0.59-0.24l0.75 0.63 0.92-0.92-0.63-0.75c0.1-0.18 0.18-0.38 0.24-0.59l0.98-0.08zm-3.59 0.86c-0.84 0-1.52-0.68-1.52-1.52s0.68-1.52 1.52-1.52 1.52 0.68 1.52 1.52-0.68 1.52-1.52 1.52zm7.92 2.06v-0.93l-0.7-0.06c-0.04-0.15-0.1-0.29-0.17-0.42l0.45-0.53-0.66-0.66-0.53 0.45c-0.13-0.07-0.27-0.13-0.42-0.17l-0.06-0.7h-0.93l-0.06 0.7c-0.15 0.04-0.29 0.1-0.42 0.17l-0.53-0.45-0.66 0.66 0.45 0.53c-0.07 0.13-0.13 0.27-0.17 0.42l-0.7 0.06v0.93l0.7 0.06c0.04 0.15 0.1 0.29 0.17 0.42l-0.45 0.53 0.66 0.66 0.53-0.45c0.13 0.07 0.27 0.13 0.42 0.17l0.06 0.7h0.93l0.06-0.7c0.15-0.04 0.29-0.1 0.42-0.17l0.53 0.45 0.66-0.66-0.45-0.53c0.07-0.13 0.13-0.27 0.17-0.42l0.7-0.06zm-2.56 0.61c-0.6 0-1.08-0.48-1.08-1.08 0-0.6 0.48-1.08 1.08-1.08 0.6 0 1.08 0.48 1.08 1.08 0 0.6-0.48 1.08-1.08 1.08zm-1.99 1.55v-0.66l-0.5-0.04-0.12-0.3 0.32-0.38-0.47-0.47-0.38 0.32c-0.09-0.05-0.19-0.09-0.3-0.12l-0.04-0.5h-0.66l-0.04 0.5-0.3 0.12-0.38-0.32-0.47 0.47 0.32 0.38c-0.05 0.09-0.09 0.19-0.12 0.3l-0.5 0.04v0.66l0.5 0.04 0.12 0.3-0.32 0.38 0.47 0.47 0.38-0.32c0.09 0.05 0.19 0.09 0.3 0.12l0.04 0.5h0.66l0.04-0.5 0.3-0.12 0.38 0.32 0.47-0.47-0.32-0.38c0.05-0.09 0.09-0.19 0.12-0.3l0.5-0.04zm-1.82 0.44c-0.42 0-0.77-0.34-0.77-0.77s0.34-0.77 0.77-0.77c0.42 0 0.77 0.34 0.77 0.77s-0.34 0.77-0.77 0.77z"
                ),
                fill = SolidColor(MaterialTheme.colorScheme.primary),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M50.76 95.93l-10.47 38.94h-1.57l10.47-38.94h1.57z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M38.62 134.95c-0.02-0.03-0.03-0.07-0.02-0.11L49.07 95.9c0.02-0.06 0.07-0.1 0.13-0.1h1.57c0.04 0 0.08 0.02 0.1 0.05 0.02 0.03 0.03 0.07 0.02 0.11L40.41 134.9c-0.02 0.06-0.07 0.1-0.13 0.1h-1.57c-0.03 0-0.07-0.02-0.09-0.05zm11.97-38.89h-1.3l-10.4 38.68h1.3l10.4-38.68z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M27.18 125.22h19.85v-1.62H27.18v1.62z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M27.04 125.22v-1.62c0-0.07 0.06-0.13 0.13-0.13h19.85c0.07 0 0.13 0.06 0.13 0.13v1.62c0 0.07-0.06 0.13-0.13 0.13H27.17c-0.07 0-0.13-0.06-0.13-0.13zm19.85-1.48H27.3v1.36h19.59v-1.36z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M16.59 87.28l12.82 47.59h1.57l-12.82-47.6c-0.47-1.74 0.61-3.17 2.42-3.17h11.05c1.8 0 3.66 1.43 4.13 3.18l12.82 47.59h1.57l-12.82-47.6c-0.7-2.59-3.43-4.69-6.11-4.69H20.16c-2.67 0-4.27 2.1-3.57 4.7z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M29.28 134.9L16.46 87.33l0.13-0.03-0.13 0.03c-0.35-1.3-0.16-2.52 0.54-3.44 0.7-0.93 1.82-1.43 3.16-1.43h11.05c2.72 0 5.52 2.15 6.23 4.8l12.82 47.59c0.01 0.04 0 0.08-0.02 0.11s-0.06 0.05-0.1 0.05h-1.57c-0.06 0-0.11-0.04-0.13-0.1L35.62 87.3c-0.46-1.7-2.26-3.09-4.01-3.09H20.57c-0.83 0-1.53 0.31-1.96 0.89-0.43 0.56-0.55 1.32-0.33 2.13l12.82 47.59c0.01 0.04 0 0.08-0.02 0.11s-0.06 0.05-0.1 0.05h-1.57c-0.06 0.02-0.11-0.02-0.13-0.08zM18.03 87.33c-0.24-0.89-0.11-1.73 0.38-2.36 0.48-0.64 1.25-1 2.17-1h11.05c1.86 0 3.77 1.48 4.26 3.29l12.8 47.5h1.3l-12.8-47.43c-0.68-2.54-3.37-4.6-5.98-4.6H20.16c-1.25 0-2.3 0.46-2.95 1.32-0.65 0.85-0.83 2-0.5 3.2l12.8 47.5h1.3L18.03 87.33z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M16.38 87.27l3.18 11.75c0.26 0.97 1.29 1.75 2.29 1.75h18.16c1 0 1.6-0.79 1.34-1.75l-3.18-11.75c-0.26-0.97-1.29-1.75-2.29-1.75H17.72c-1-0.01-1.6 0.78-1.34 1.75z"),
                fill = SolidColor(MaterialTheme.colorScheme.primary),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M19.44 99.05L16.26 87.3c-0.14-0.51-0.06-0.99 0.22-1.35 0.28-0.36 0.72-0.57 1.25-0.57h18.15c1.06 0 2.14 0.83 2.42 1.85l3.18 11.75c0.14 0.51 0.06 0.99-0.22 1.35-0.28 0.36-0.72 0.56-1.25 0.56H21.86c-1.06 0.01-2.14-0.82-2.42-1.84zm-1.72-13.41c-0.44 0-0.81 0.16-1.04 0.46-0.23 0.3-0.29 0.7-0.17 1.13l3.18 11.75c0.25 0.91 1.22 1.66 2.17 1.66h18.16c0.44 0 0.81-0.16 1.04-0.46 0.23-0.3 0.29-0.7 0.17-1.13L38.04 87.3c-0.25-0.91-1.22-1.66-2.17-1.66H17.72z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M16.38 87.27l3.18 11.75c0.26 0.97 1.29 1.75 2.29 1.75h18.16c1 0 1.6-0.79 1.34-1.75l-3.18-11.75c-0.26-0.97-1.29-1.75-2.29-1.75h-9.39c-4.06 4.17-3.54 11.83-3.28 14.14-0.83-0.2-1.59-0.88-1.81-1.69l-3.18-11.75c-0.07-0.25-0.08-0.49-0.04-0.7h-0.45c-1.01-0.01-1.61 0.78-1.35 1.75z"),
                fill = SolidColor(Color(0xB3010202)), stroke = null, fillAlpha = 0.2f,
                strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M27.06 112.66l-5.94 21.9h-1.57l5.94-21.9h1.57z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M19.45 134.64c-0.02-0.03-0.03-0.07-0.02-0.11l5.94-21.9c0.02-0.06 0.07-0.1 0.13-0.1h1.57c0.04 0 0.08 0.02 0.1 0.05 0.02 0.03 0.03 0.07 0.02 0.11l-5.94 21.9c-0.02 0.06-0.07 0.1-0.13 0.1h-1.57c-0.04 0-0.07-0.02-0.1-0.05zm7.44-21.85h-1.3l-5.87 21.64h1.3l5.87-21.64z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M25.48 110.14v2.14h23.38v-2.14c0-0.87-0.7-1.58-1.58-1.58H27.06c-0.73 0-1.34 0.49-1.52 1.16-0.04 0.14-0.06 0.28-0.06 0.42z"),
                fill = SolidColor(Color(0xFF1C6B9A)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M25.35 112.29v-2.14c0-0.16 0.02-0.31 0.06-0.45 0.2-0.74 0.88-1.26 1.65-1.26h20.22c0.94 0 1.71 0.77 1.71 1.71v2.14c0 0.07-0.06 0.13-0.13 0.13H25.48c-0.07 0-0.13-0.06-0.13-0.13zm23.38-2.15c0-0.8-0.65-1.45-1.45-1.45H27.06c-0.65 0-1.23 0.44-1.4 1.07-0.03 0.12-0.05 0.25-0.05 0.38v2.01h23.12v-2.01z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M25.54 109.73c0.76 0.89 2.11 1.79 4.45 2.56h18.87v-2.14c0-0.87-0.7-1.58-1.58-1.58H27.06c-0.73 0-1.34 0.49-1.52 1.16z"),
                fill = SolidColor(Color(0xB31C6B9A)), stroke = null, fillAlpha = 0.2f,
                strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M25.19 113.64h23.76c0.52 0 0.94-0.42 0.94-0.94v-0.13c0-0.52-0.42-0.94-0.94-0.94H25.19c-0.52 0-0.94 0.42-0.94 0.94v0.13c0 0.52 0.42 0.94 0.94 0.94z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M24.12 113.2v-1.12c0-0.32 0.26-0.57 0.57-0.57h24.76c0.32 0 0.57 0.26 0.57 0.57v1.12c0 0.32-0.26 0.57-0.57 0.57H24.69c-0.32 0-0.57-0.26-0.57-0.57zm0.57-1.44c-0.17 0-0.31 0.14-0.31 0.31v1.12c0 0.17 0.14 0.31 0.31 0.31h24.76c0.17 0 0.31-0.14 0.31-0.31v-1.12c0-0.17-0.14-0.31-0.31-0.31H24.69z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M49.62 111.7c1.12 1.14-4.31 19.07-4.31 19.07 0.59 0.51 1.47 0.76 2.29 0.87 1.2 0.16 2.29 0.03 2.29 0.03s7.78-18.88 5.64-23.56c-2.14-4.68-15.43-6.83-15.43-6.83l-0.57-1.4-6.88-0.97-1.14 8.42s1.13 0.11 2.83 0.33c4.56 0.59 13.22 1.95 15.28 4.04z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M47.58 131.77c-1.04-0.14-1.83-0.44-2.36-0.9-0.04-0.03-0.05-0.09-0.04-0.14 2.17-7.18 5.12-18.15 4.34-18.94-2.01-2.04-10.38-3.38-15.2-4-1.68-0.22-2.81-0.33-2.82-0.33-0.04 0-0.07-0.02-0.09-0.05-0.02-0.03-0.03-0.06-0.03-0.1l1.14-8.42c0-0.03 0.02-0.07 0.05-0.09 0.03-0.02 0.06-0.03 0.1-0.03l6.88 0.97c0.05 0.01 0.09 0.04 0.1 0.08l0.54 1.34c1.17 0.19 13.37 2.33 15.46 6.89 2.14 4.68-5.32 22.89-5.64 23.67-0.02 0.04-0.06 0.07-0.11 0.08-0.03 0-0.43 0.05-1.01 0.05-0.38 0.01-0.83-0.01-1.31-0.08zm7.84-23.6c-2.09-4.57-15.2-6.73-15.34-6.75-0.04-0.01-0.08-0.04-0.1-0.08L39.44 100l-6.67-0.94-1.1 8.16c0.35 0.04 1.35 0.14 2.7 0.31 4.85 0.62 13.29 1.98 15.35 4.08 1.13 1.15-3.59 16.93-4.25 19.12 0.49 0.4 1.22 0.66 2.16 0.78 0.99 0.13 1.92 0.06 2.18 0.04 0.51-1.27 7.63-18.94 5.61-23.38z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M45.31 130.78c0.59 0.51 1.47 0.76 2.29 0.87 1.51-5.62 5.36-20.6 3.9-22.43-1.8-2.26-10.69-4.32-10.69-4.32-0.04-1.15-3.15-2.19-3.15-2.19l-3.31 4.96c4.55 0.58 13.21 1.94 15.27 4.04 1.12 1.13-4.31 19.07-4.31 19.07z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, fillAlpha = 0.3f,
                strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M53.47 94.72c1.14-0.2-6.98-7.32-6.98-7.32l-3.92 2.64s6.67 4.69 7.71 4.82c1.05 0.13 3.19-0.14 3.19-0.14z"),
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M50.26 94.99c-1.07-0.13-7.5-4.65-7.77-4.85-0.03-0.02-0.06-0.06-0.06-0.11 0-0.04 0.02-0.08 0.06-0.11l3.92-2.64c0.05-0.03 0.11-0.03 0.16 0.01 1.23 1.08 7.37 6.51 7.13 7.37-0.02 0.05-0.06 0.15-0.21 0.17h-0.01c-0.07 0.01-1.42 0.18-2.49 0.18-0.27 0.02-0.52 0.01-0.73-0.02zm-3.79-7.42l-3.68 2.48c1.96 1.37 6.69 4.59 7.5 4.69 1 0.12 3.07-0.13 3.15-0.14 0.07-0.52-3.46-3.96-6.97-7.03z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M53.47 94.72c1.14-0.2-6.98-7.32-6.98-7.32l-3.92 2.64s6.67 4.69 7.71 4.82c1.05 0.13 3.19-0.14 3.19-0.14z"),
                fill = SolidColor(Color(0xB3010202)), stroke = null, fillAlpha = 0.2f,
                strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M52.03 91.72s-1.7 0.42-2.22 0.79c-0.52 0.36-0.37 1.64-0.37 1.64s2.27-0.64 2.59-2.43z"),
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M49.36 94.26c-0.03-0.02-0.05-0.06-0.06-0.09-0.01-0.06-0.15-1.36 0.43-1.77 0.53-0.37 2.2-0.79 2.27-0.81 0.04-0.01 0.09 0 0.12 0.03s0.05 0.07 0.04 0.12c-0.33 1.84-2.59 2.51-2.69 2.53h-0.04c-0.02 0.02-0.04 0.01-0.07-0.01zm0.52-1.64c-0.32 0.23-0.35 0.95-0.33 1.36 0.48-0.17 1.94-0.79 2.31-2.08-0.47 0.13-1.59 0.45-1.98 0.72z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M53.13 88.46l-3.17 6.07h-0.37l3-6.37 0.54 0.3z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M50.27 92.85s2-1.42 2.48-1.42c0.49 0 1.95 1.73 1.95 2.6 0 0.87-3.19 1.35-3.82 0.61-0.31-0.37 0.31-1.25 0.31-1.25S50.26 94.35 50 94.5c-0.27 0.14-0.75-0.04-0.75-0.04l1.02-1.61z"),
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M50.79 94.72c-0.15-0.18-0.14-0.43-0.06-0.68-0.25 0.25-0.53 0.49-0.66 0.57-0.31 0.17-0.81-0.02-0.86-0.04-0.04-0.01-0.06-0.04-0.08-0.08-0.01-0.04-0.01-0.08 0.01-0.11 0.01-0.01 0.67-1.07 1.02-1.6l0.03-0.03c0.21-0.15 2.05-1.44 2.56-1.44 0.59 0 2.08 1.82 2.08 2.73 0 0.32-0.3 0.6-0.88 0.81-0.47 0.17-1.14 0.29-1.76 0.29-0.6-0.01-1.15-0.13-1.4-0.42zm-0.42-1.78l-0.92 1.43c0.16 0.04 0.37 0.07 0.49 0 0.18-0.1 0.79-0.7 1.16-1.08 0.05-0.05 0.12-0.05 0.18-0.01 0.05 0.04 0.06 0.12 0.02 0.17-0.18 0.26-0.5 0.87-0.31 1.09 0.37 0.44 1.92 0.39 2.88 0.04 0.44-0.16 0.71-0.37 0.71-0.56 0-0.86-1.45-2.47-1.82-2.47-0.33 0.01-1.63 0.85-2.39 1.39z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M51.2 94.97c0.04 0 0.08-0.02 0.1-0.05 0.01-0.01 0.75-0.97 1.62-1.42 0.06-0.03 0.09-0.11 0.06-0.18-0.03-0.06-0.11-0.09-0.18-0.06-0.92 0.48-1.68 1.45-1.71 1.49-0.04 0.06-0.03 0.14 0.02 0.18 0.03 0.04 0.06 0.04 0.09 0.04zm0-1.45l0.09-0.03c0.01-0.01 0.68-0.59 1.11-0.71 0.07-0.02 0.11-0.09 0.09-0.16-0.02-0.07-0.09-0.11-0.16-0.09-0.49 0.14-1.18 0.74-1.21 0.76-0.05 0.05-0.06 0.13-0.01 0.18 0.02 0.03 0.05 0.05 0.09 0.05zm0.78 1.6l0.09-0.03c0.22-0.2 1.06-0.66 1.37-0.82 0.06-0.03 0.09-0.11 0.05-0.18-0.03-0.06-0.11-0.09-0.18-0.05-0.05 0.02-1.14 0.6-1.42 0.86-0.05 0.05-0.06 0.13-0.01 0.18 0.03 0.03 0.06 0.04 0.1 0.04z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M43.94 84.29c1.02 0.71 5.61 5.43 5.61 5.43s-2.15 2.45-4.03 2.8l-5.11-2.48 3.53-5.75z"),
                fill = SolidColor(MaterialTheme.colorScheme.primary),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M45.46 92.64l-5.11-2.48c-0.03-0.02-0.06-0.05-0.07-0.08-0.01-0.04-0.01-0.07 0.01-0.1l3.53-5.75c0.02-0.03 0.05-0.05 0.08-0.06 0.03-0.01 0.07 0 0.1 0.02 1.02 0.71 5.44 5.25 5.63 5.45 0.05 0.05 0.05 0.13 0 0.18-0.09 0.1-2.2 2.48-4.11 2.84H45.5l-0.04-0.02zm-1.49-8.16l-3.38 5.51 4.94 2.4c1.61-0.33 3.43-2.23 3.84-2.66-0.61-0.63-4.3-4.41-5.4-5.25z"),
                fill = SolidColor(Color(0xFF263239)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M43.94 84.29c1.02 0.71 5.61 5.43 5.61 5.43s-2.15 2.45-4.03 2.8l-5.11-2.48 3.53-5.75z"),
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, fillAlpha = 0.16f,
                strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M45.46 92.64l-5.11-2.48c-0.03-0.02-0.06-0.05-0.07-0.08-0.01-0.04-0.01-0.07 0.01-0.1l3.53-5.75c0.02-0.03 0.05-0.05 0.08-0.06 0.03-0.01 0.07 0 0.1 0.02 1.02 0.71 5.44 5.25 5.63 5.45 0.05 0.05 0.05 0.13 0 0.18-0.09 0.1-2.2 2.48-4.11 2.84H45.5l-0.04-0.02zm-1.49-8.16l-3.38 5.51 4.94 2.4c1.61-0.33 3.43-2.23 3.84-2.66-0.61-0.63-4.3-4.41-5.4-5.25z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, fillAlpha = 0.16f,
                strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M46.41 128.87l-2.16 5.68s-0.36 1.46 6.17 1l3.6-0.31-7.61-6.37z"),
                fill = SolidColor(MaterialTheme.colorScheme.primary),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M44.27 134.97c-0.19-0.23-0.15-0.42-0.14-0.46l2.16-5.68c0.01-0.04 0.05-0.07 0.09-0.08 0.04-0.01 0.08 0 0.12 0.03l7.61 6.38c0.04 0.03 0.06 0.09 0.04 0.14-0.02 0.05-0.06 0.09-0.11 0.09l-3.6 0.31c-0.89 0.06-1.66 0.09-2.32 0.09-2.56-0.01-3.52-0.42-3.85-0.82zm2.19-5.88l-2.09 5.49s-0.02 0.1 0.11 0.24c0.33 0.36 1.53 0.92 5.92 0.61l3.29-0.28-7.23-6.06z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M46.41 128.87l-2.16 5.68s-0.36 1.46 6.17 1l3.6-0.31-7.61-6.37z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, fillAlpha = 0.3f,
                strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M47.23 131.6s-0.46 2.21 0 3.86c0 0 6.89 1.08 8.43 0.67 1.54-0.41 2.48-1.18 2.52-1.57 0 0-0.06-1.06-1.6-1.36-1.54-0.3-4.62-0.51-5.83-2.26-1.21-1.75-3.52 0.66-3.52 0.66z"),
                fill = SolidColor(MaterialTheme.colorScheme.primary),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M47.21 135.58c-0.05-0.01-0.09-0.04-0.1-0.09-0.47-1.66-0.02-3.83 0-3.92l0.03-0.06c0.06-0.06 1.39-1.44 2.61-1.34 0.45 0.04 0.83 0.27 1.12 0.69 0.99 1.42 3.25 1.79 4.9 2.06l0.85 0.15c1.62 0.32 1.7 1.44 1.7 1.51-0.06 0.49-1.08 1.27-2.62 1.68-0.26 0.07-0.66 0.1-1.14 0.1-2.45-0.01-7.12-0.74-7.35-0.78zm0.14-3.92c-0.06 0.29-0.4 2.21-0.02 3.68 0.79 0.12 6.89 1.03 8.3 0.66 1.55-0.41 2.39-1.16 2.43-1.43 0-0.04-0.08-0.96-1.49-1.24l-0.84-0.15c-1.7-0.28-4.02-0.66-5.07-2.17-0.25-0.36-0.55-0.55-0.93-0.58h-0.1c-1 0-2.1 1.05-2.28 1.23z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M38.13 99.66c-2.2-3.14-12.32 0.64-12.32 0.64s-0.97 7.56 3.07 9.58c4.03 2.02 9.84 1.91 11.42 3.54l6.39 18.87s2.29 0.96 5.63-0.55c0 0-4.06-14.25-5.25-19.31-1.18-5.01-8.8-8.4-8.8-8.4s0.64-0.73 0.88-1.58"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M48.61 132.73c0.97 0 2.26-0.19 3.75-0.87 0.06-0.03 0.09-0.09 0.07-0.15-0.04-0.14-4.07-14.3-5.25-19.3-1.1-4.67-7.6-7.9-8.72-8.42 0.2-0.25 0.61-0.83 0.8-1.5 0.02-0.07-0.02-0.14-0.09-0.16-0.07-0.02-0.14 0.02-0.16 0.09-0.23 0.82-0.84 1.52-0.85 1.53-0.03 0.03-0.04 0.07-0.03 0.11 0.01 0.04 0.04 0.07 0.07 0.09 0.08 0.03 7.58 3.43 8.73 8.32 1.12 4.77 4.84 17.87 5.22 19.21-2.92 1.29-5.02 0.65-5.37 0.52l-6.37-18.81-0.03-0.05c-0.83-0.86-2.76-1.25-4.99-1.69-2.11-0.42-4.5-0.9-6.46-1.88-3.69-1.84-3.09-8.56-3-9.36 0.93-0.33 10.08-3.54 12.1-0.66 0.04 0.06 0.12 0.07 0.18 0.03 0.06-0.04 0.07-0.12 0.03-0.18-2.23-3.19-12.06 0.44-12.48 0.59-0.05 0.02-0.08 0.06-0.08 0.11-0.04 0.31-0.93 7.67 3.14 9.71 1.99 0.99 4.4 1.47 6.52 1.9 2.17 0.43 4.05 0.81 4.84 1.6l6.38 18.84c0.01 0.04 0.04 0.06 0.07 0.08 0.05 0 0.78 0.3 1.98 0.3z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M28.91 107.82c0.04 0 0.08-0.02 0.11-0.06 0.04-0.06 0.03-0.14-0.03-0.18-0.35-0.25-0.69-0.51-1.01-0.79-0.05-0.05-0.14-0.04-0.18 0.01-0.05 0.05-0.04 0.14 0.01 0.18 0.32 0.29 0.67 0.56 1.03 0.81 0.01 0.02 0.04 0.03 0.07 0.03zm-1.59-1.47l0.07-0.02c0.06-0.04 0.07-0.12 0.03-0.18-1.04-1.49-1.14-3.69-0.26-5.6 0.03-0.07 0-0.14-0.06-0.17s-0.14 0-0.17 0.06c-0.92 2-0.81 4.3 0.28 5.86 0.03 0.03 0.07 0.05 0.11 0.05z"),
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M26.45 103.66h0.02c0.08-0.01 1.94-0.29 2.57-0.86 0.66-0.59 0.46-1.99 0.45-2.05-0.01-0.07-0.08-0.12-0.15-0.11-0.07 0.01-0.12 0.08-0.11 0.15 0 0.01 0.19 1.32-0.36 1.81-0.58 0.52-2.42 0.79-2.44 0.8-0.07 0.01-0.12 0.08-0.11 0.15 0.01 0.06 0.07 0.11 0.13 0.11zm12.27-0.83c0.08 0 0.13-0.06 0.13-0.14 0-0.01-0.02-0.35-0.25-0.55-0.13-0.11-0.29-0.15-0.48-0.13-0.05 0.01-0.09-0.01-0.13-0.04-0.19-0.18-0.22-0.79-0.2-1.13 0-0.07-0.05-0.13-0.12-0.14-0.07 0-0.13 0.05-0.14 0.12-0.01 0.1-0.05 1.02 0.28 1.34 0.09 0.09 0.21 0.13 0.34 0.11 0.12-0.01 0.21 0.01 0.28 0.07 0.14 0.12 0.16 0.36 0.16 0.36 0 0.08 0.06 0.13 0.13 0.13z"),
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M43.8 85.35c0.08-0.37 0.13-0.72 0.13-1.06 0 0-3.13-2.63-7.13-2.62-4.78 0.02-7.71 1.52-8.88 3.61-1.85 3.31-2.11 15.02-2.11 15.02s12 1.85 13.72-0.42c0.3-0.39 0.07-3.18 0.07-3.18s1.34-3.52 1.63-6.26c0 0 0.52-0.7 1.1-1.69 0.38-0.66 0.8-1.44 1.11-2.24"),
                fill = SolidColor(MaterialTheme.colorScheme.primary),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M34.29 101.14c2.46 0 4.66-0.28 5.35-1.18 0.31-0.4 0.14-2.71 0.1-3.24 0.13-0.34 1.35-3.64 1.62-6.23 0.1-0.14 0.57-0.8 1.09-1.67 0.47-0.8 0.85-1.56 1.12-2.26 0.03-0.07-0.01-0.14-0.07-0.17-0.07-0.03-0.14 0.01-0.17 0.07-0.27 0.68-0.64 1.43-1.1 2.22-0.57 0.97-1.09 1.67-1.09 1.68l-0.03 0.06c-0.28 2.69-1.61 6.19-1.62 6.23l-0.01 0.06c0.09 1.14 0.14 2.85-0.04 3.1-1.57 2.07-12.26 0.57-13.49 0.39 0.03-1.22 0.37-11.78 2.09-14.84 1.27-2.27 4.39-3.53 8.77-3.54h0.03c3.64 0 6.57 2.23 6.97 2.55-0.01 0.29-0.05 0.62-0.13 0.97-0.02 0.07 0.03 0.14 0.1 0.16 0.07 0.02 0.14-0.03 0.16-0.1 0.09-0.39 0.14-0.76 0.14-1.09 0-0.04-0.02-0.07-0.05-0.1-0.03-0.03-3.19-2.65-7.19-2.65h-0.03c-4.48 0.02-7.67 1.32-8.99 3.68-1.85 3.3-2.12 14.6-2.13 15.08 0 0.07 0.05 0.12 0.11 0.13 0.29 0.03 4.69 0.69 8.49 0.69z"),
                fill = SolidColor(Color(0xFF263239)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M43.8 85.35c0.08-0.37 0.13-0.72 0.13-1.06 0 0-3.13-2.63-7.13-2.62-4.78 0.02-7.71 1.52-8.88 3.61-1.85 3.31-2.11 15.02-2.11 15.02s12 1.85 13.72-0.42c0.3-0.39 0.07-3.18 0.07-3.18s1.34-3.52 1.63-6.26c0 0 0.52-0.7 1.1-1.69 0.38-0.66 0.8-1.44 1.11-2.24"),
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, fillAlpha = 0.36f,
                strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M34.29 101.14c2.46 0 4.66-0.28 5.35-1.18 0.31-0.4 0.14-2.71 0.1-3.24 0.13-0.34 1.35-3.64 1.62-6.23 0.1-0.14 0.57-0.8 1.09-1.67 0.47-0.8 0.85-1.56 1.12-2.26 0.03-0.07-0.01-0.14-0.07-0.17-0.07-0.03-0.14 0.01-0.17 0.07-0.27 0.68-0.64 1.43-1.1 2.22-0.57 0.97-1.09 1.67-1.09 1.68l-0.03 0.06c-0.28 2.69-1.61 6.19-1.62 6.23l-0.01 0.06c0.09 1.14 0.14 2.85-0.04 3.1-1.57 2.07-12.26 0.57-13.49 0.39 0.03-1.22 0.37-11.78 2.09-14.84 1.27-2.27 4.39-3.53 8.77-3.54h0.03c3.64 0 6.57 2.23 6.97 2.55-0.01 0.29-0.05 0.62-0.13 0.97-0.02 0.07 0.03 0.14 0.1 0.16 0.07 0.02 0.14-0.03 0.16-0.1 0.09-0.39 0.14-0.76 0.14-1.09 0-0.04-0.02-0.07-0.05-0.1-0.03-0.03-3.19-2.65-7.19-2.65h-0.03c-4.48 0.02-7.67 1.32-8.99 3.68-1.85 3.3-2.12 14.6-2.13 15.08 0 0.07 0.05 0.12 0.11 0.13 0.29 0.03 4.69 0.69 8.49 0.69z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, fillAlpha = 0.36f,
                strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M37.66 100.46c0.05 0 0.09-0.03 0.12-0.07 0.51-0.98-0.04-1.77-0.23-2 0.1-0.23 0.36-0.91 0.24-1.58-0.27-1.52 1.53-8.55 1.55-8.62 0.02-0.07-0.02-0.14-0.09-0.16-0.07-0.02-0.14 0.02-0.16 0.09-0.08 0.29-1.84 7.16-1.55 8.73 0.13 0.72-0.25 1.49-0.26 1.5-0.03 0.05-0.02 0.11 0.02 0.15 0.03 0.03 0.76 0.77 0.24 1.77-0.03 0.06-0.01 0.14 0.06 0.18l0.06 0.01zm-3.31-6.28h0.01c0.42-0.04 0.75-0.14 0.99-0.32l0.05-0.08 0.54-2.38c0.01-0.04 0-0.08-0.03-0.12-0.03-0.03-0.07-0.05-0.11-0.04-0.02 0-1.67 0.18-3.17-0.22-0.03-0.01-0.07 0-0.1 0.01-0.03 0.02-0.05 0.05-0.06 0.08l-0.58 2.61c-0.01 0.07 0.02 0.13 0.09 0.15 0.02 0.01 0.45 0.13 1.01 0.22 0.07 0.01 0.14-0.04 0.15-0.11 0.01-0.07-0.04-0.14-0.11-0.15-0.38-0.06-0.7-0.14-0.86-0.18l0.53-2.35c1.23 0.3 2.49 0.25 2.95 0.21l-0.49 2.16c-0.19 0.13-0.47 0.21-0.82 0.24-0.07 0.01-0.12 0.07-0.12 0.14s0.06 0.13 0.13 0.13z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M40.51 89.09s1.55-6.64-2.38-7.42c-3.92-0.77-4.74 1.07-4.51 2.31 0.31 1.66 3.57 5.73 3.57 5.73l2.02-1.55 1.3 0.93z"),
                fill = SolidColor(MaterialTheme.colorScheme.primary),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M37.09 89.8c-0.13-0.17-3.28-4.12-3.6-5.79-0.13-0.71 0.07-1.39 0.56-1.87 0.54-0.53 1.69-1.07 4.11-0.59 0.85 0.17 1.52 0.62 1.99 1.34 1.41 2.18 0.52 6.07 0.49 6.23-0.01 0.04-0.04 0.08-0.08 0.09-0.04 0.02-0.09 0.01-0.12-0.02l-1.22-0.87-1.94 1.5c-0.02 0.02-0.05 0.03-0.08 0.03-0.05 0-0.08-0.02-0.11-0.05zm2.19-1.74l1.14 0.81c0.16-0.81 0.69-4.02-0.49-5.84-0.43-0.66-1.04-1.07-1.82-1.23-2.31-0.46-3.38 0.03-3.88 0.52-0.6 0.6-0.54 1.35-0.48 1.64 0.27 1.47 2.97 4.94 3.46 5.58l1.91-1.48c0.02-0.02 0.05-0.03 0.08-0.03s0.06 0.01 0.08 0.03z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M40.51 89.09s1.55-6.64-2.38-7.42c-3.92-0.77-4.74 1.07-4.51 2.31 0.31 1.66 3.57 5.73 3.57 5.73l2.02-1.55 1.3 0.93z"),
                fill = SolidColor(MaterialTheme.colorScheme.primary),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M37.09 89.8c-0.13-0.17-3.28-4.12-3.6-5.79-0.13-0.71 0.07-1.39 0.56-1.87 0.54-0.53 1.69-1.07 4.11-0.59 0.85 0.17 1.52 0.62 1.99 1.34 1.41 2.18 0.52 6.07 0.49 6.23-0.01 0.04-0.04 0.08-0.08 0.09-0.04 0.02-0.09 0.01-0.12-0.02l-1.22-0.87-1.94 1.5c-0.02 0.02-0.05 0.03-0.08 0.03-0.05 0-0.08-0.02-0.11-0.05zm2.19-1.74l1.14 0.81c0.16-0.81 0.69-4.02-0.49-5.84-0.43-0.66-1.04-1.07-1.82-1.23-2.31-0.46-3.38 0.03-3.88 0.52-0.6 0.6-0.54 1.35-0.48 1.64 0.27 1.47 2.97 4.94 3.46 5.58l1.91-1.48c0.02-0.02 0.05-0.03 0.08-0.03s0.06 0.01 0.08 0.03z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M45.67 109.73l0.09-0.03c0.05-0.05 0.06-0.13 0.01-0.18-0.03-0.03-2.53-2.87-8.01-5.06 0.47-0.18 1.31-0.55 1.56-1.02 0.03-0.06 0.01-0.14-0.05-0.18-0.06-0.03-0.14-0.01-0.18 0.05-0.25 0.47-1.34 0.89-1.74 1.01-0.05 0.02-0.09 0.06-0.09 0.12s0.03 0.11 0.08 0.13c5.64 2.18 8.21 5.09 8.23 5.12 0.03 0.03 0.07 0.04 0.1 0.04zm5.32 17.43h0.03c0.07-0.02 0.11-0.09 0.09-0.16l-2.33-8.44c-0.02-0.07-0.09-0.11-0.16-0.09-0.07 0.02-0.11 0.09-0.09 0.16l2.33 8.44c0.02 0.06 0.07 0.09 0.13 0.09z"),
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M30.71 94.27s-1.05 1.76-5.32 1.59c0 0 1.17-1.34 2.92-1.81 1.74-0.47 2.4 0.22 2.4 0.22z"),
                fill = SolidColor(MaterialTheme.colorScheme.primary),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M25.38 96c-0.05 0-0.09-0.03-0.11-0.08-0.02-0.05-0.01-0.1 0.02-0.14 0.05-0.06 1.22-1.37 2.99-1.85 1.8-0.49 2.5 0.22 2.53 0.26 0.04 0.04 0.05 0.11 0.02 0.16-0.04 0.07-1.04 1.67-4.88 1.67L25.38 96zm2.96-1.82c-1.28 0.35-2.25 1.18-2.66 1.57 3.34 0.06 4.56-1.11 4.84-1.45-0.21-0.15-0.88-0.47-2.18-0.12z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M47.32 94.98s-0.99-1.54-1.9-1.85c-0.91-0.31-3.58-0.34-3.99-0.35-0.41-0.01-7.76 1.86-11.2 3l0.3-5.75-4.63 0.36s0.19 7.02 0.91 8.88c0.72 1.86 1.75 1.41 3.51 0.65 6.92-2.98 10.98-5.06 11.36-4.95 0.35 0.12 5.64 0.01 5.64 0.01z"),
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M27.69 100.62c-0.42-0.18-0.75-0.59-1.02-1.29-0.72-1.86-0.91-8.63-0.92-8.92 0-0.07 0.05-0.13 0.12-0.13l4.63-0.36c0.04 0 0.07 0.01 0.1 0.04s0.04 0.06 0.04 0.1l-0.29 5.56c3.5-1.15 10.6-2.95 11.06-2.95h0.15c0.75 0.02 3.03 0.06 3.88 0.35 0.94 0.32 1.93 1.84 1.97 1.9 0.03 0.04 0.03 0.09 0.01 0.13-0.02 0.04-0.06 0.07-0.11 0.07-0.54 0.01-5.32 0.11-5.69 0-0.22-0.03-1.73 0.66-3.83 1.62-1.85 0.84-4.38 2-7.46 3.33-0.86 0.37-1.54 0.66-2.11 0.66-0.19-0.01-0.36-0.04-0.53-0.11zm14-5.76c0.25 0.07 3.27 0.04 5.38 0-0.3-0.42-1.03-1.37-1.7-1.6-0.54-0.18-1.82-0.3-3.8-0.34h-0.15c-0.39 0-7.67 1.83-11.16 3-0.04 0.01-0.09 0.01-0.12-0.02s-0.05-0.07-0.05-0.11l0.29-5.6-4.36 0.34c0.03 0.95 0.24 7.03 0.89 8.71 0.24 0.63 0.52 0.99 0.88 1.14 0.58 0.24 1.36-0.09 2.46-0.57 3.07-1.32 5.6-2.48 7.44-3.32 2.64-1.2 3.61-1.64 3.94-1.64l0.06 0.01z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M31.67 86.7c0.12 0.5 0.17 1.01 0.11 1.46-0.21 1.8-1.08 6.12-1.08 6.12s-4.32 0.62-5.32 1.59c0 0-0.71-5.73 0.74-8.62 1.45-2.9 2.95-3.22 2.95-3.22 0.95-0.23 1.81 0.65 2.3 1.79"),
                fill = SolidColor(MaterialTheme.colorScheme.primary),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M25.38 96c0.03 0 0.07-0.01 0.09-0.04 0.96-0.94 5.21-1.55 5.25-1.56 0.05-0.01 0.1-0.05 0.11-0.1 0.01-0.04 0.88-4.35 1.08-6.13 0.05-0.45 0.01-0.97-0.12-1.51-0.02-0.07-0.09-0.11-0.16-0.1-0.07 0.02-0.11 0.09-0.1 0.16 0.12 0.5 0.16 0.99 0.11 1.41-0.19 1.63-0.93 5.39-1.06 6.02-0.61 0.09-3.93 0.62-5.11 1.46-0.11-1.11-0.5-5.81 0.75-8.31 1.4-2.79 2.85-3.15 2.86-3.16 0.94-0.23 1.75 0.78 2.15 1.71 0.03 0.07 0.11 0.1 0.17 0.07 0.07-0.03 0.1-0.11 0.07-0.17-0.47-1.08-1.36-2.13-2.45-1.86-0.06 0.01-1.58 0.37-3.04 3.29-1.45 2.9-0.78 8.46-0.75 8.7 0.01 0.05 0.04 0.09 0.09 0.11L25.38 96z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M31.67 86.7c0.12 0.5 0.17 1.01 0.11 1.46-0.21 1.8-1.08 6.12-1.08 6.12s-4.32 0.62-5.32 1.59c0 0-0.71-5.73 0.74-8.62 1.45-2.9 2.95-3.22 2.95-3.22 0.95-0.23 1.81 0.65 2.3 1.79"),
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, fillAlpha = 0.16f,
                strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M25.38 96c0.03 0 0.07-0.01 0.09-0.04 0.96-0.94 5.21-1.55 5.25-1.56 0.05-0.01 0.1-0.05 0.11-0.1 0.01-0.04 0.88-4.35 1.08-6.13 0.05-0.45 0.01-0.97-0.12-1.51-0.02-0.07-0.09-0.11-0.16-0.1-0.07 0.02-0.11 0.09-0.1 0.16 0.12 0.5 0.16 0.99 0.11 1.41-0.19 1.63-0.93 5.39-1.06 6.02-0.61 0.09-3.93 0.62-5.11 1.46-0.11-1.11-0.5-5.81 0.75-8.31 1.4-2.79 2.85-3.15 2.86-3.16 0.94-0.23 1.75 0.78 2.15 1.71 0.03 0.07 0.11 0.1 0.17 0.07 0.07-0.03 0.1-0.11 0.07-0.17-0.47-1.08-1.36-2.13-2.45-1.86-0.06 0.01-1.58 0.37-3.04 3.29-1.45 2.9-0.78 8.46-0.75 8.7 0.01 0.05 0.04 0.09 0.09 0.11L25.38 96z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, fillAlpha = 0.16f,
                strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M42.15 90.17h0.03c1.38-0.36 2.23-1.12 2.27-1.15 0.05-0.05 0.06-0.13 0.01-0.18-0.05-0.05-0.13-0.06-0.18-0.01-0.01 0.01-0.84 0.75-2.16 1.09-0.08 0.01-0.12 0.08-0.1 0.15 0.02 0.06 0.07 0.1 0.13 0.1z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M40.41 112.76c0.06 0 0.12-0.05 0.13-0.11 0.1-0.71 0.35-0.92 0.36-0.92 0.05-0.04 0.06-0.13 0.02-0.18-0.04-0.06-0.12-0.07-0.18-0.02-0.03 0.03-0.33 0.27-0.45 1.09-0.01 0.07 0.04 0.14 0.11 0.15-0.01-0.01 0-0.01 0.01-0.01zm0.2 0.74c0.04 0 0.08-0.02 0.11-0.06 0.44-0.63 1.17-0.68 1.17-0.68 0.07 0 0.13-0.07 0.12-0.14 0-0.07-0.07-0.12-0.14-0.12-0.04 0-0.86 0.06-1.37 0.79-0.04 0.06-0.03 0.14 0.03 0.18 0.03 0.02 0.05 0.03 0.08 0.03zm9.21-2.16h0.02c0.07-0.01 0.12-0.08 0.11-0.15-0.16-1.08 0.55-1.46 0.58-1.48 0.06-0.03 0.09-0.11 0.06-0.17-0.03-0.06-0.11-0.09-0.17-0.06-0.01 0-0.91 0.48-0.72 1.75 0.01 0.07 0.06 0.11 0.12 0.11zm0.32 0.69c0.06 0 0.12-0.05 0.13-0.11 0.06-0.44 0.85-1.01 1.15-1.18 0.06-0.04 0.08-0.12 0.05-0.18-0.04-0.06-0.12-0.08-0.18-0.05-0.12 0.07-1.19 0.72-1.28 1.37-0.01 0.07 0.04 0.14 0.11 0.15h0.02zM39.21 87.88s0.32-0.77 0.27-1.93c-0.01-0.21-0.03-0.43-0.07-0.66l0.44-0.7 0.56-0.9-0.65-2.61s-4.15 0.8-4.47 1.96c-0.32 1.16 3.92 4.84 3.92 4.84z"),
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M39.12 87.98c-0.44-0.38-4.29-3.76-3.97-4.97 0.33-1.2 4.14-1.97 4.57-2.05 0.07-0.01 0.13 0.03 0.15 0.1l0.65 2.61c0.01 0.03 0 0.07-0.02 0.1l-0.98 1.55c0.03 0.2 0.05 0.41 0.06 0.63 0.06 1.18-0.26 1.96-0.28 1.99-0.02 0.04-0.05 0.07-0.09 0.08h-0.03l-0.06-0.04zm0.54-6.75c-1.21 0.25-4.02 0.99-4.25 1.84-0.23 0.86 2.5 3.48 3.74 4.58 0.09-0.28 0.23-0.9 0.2-1.7-0.01-0.23-0.03-0.44-0.07-0.65-0.01-0.03 0-0.06 0.02-0.09l0.97-1.55-0.61-2.43z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M39.47 85.95c-0.01-0.21-0.03-0.43-0.07-0.66l0.44-0.7c-0.72-0.14-1.51-0.46-2.03-1.14 0 0-0.14 1.8 1.66 2.5z"),
                fill = SolidColor(Color(0xB3010202)), stroke = null, fillAlpha = 0.2f,
                strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M36.6 81.31c-1.29-3.39-0.44-9.13 5.8-8.03 3.67 0.65 4.1 5.07 2.87 7.04-1.23 1.96 0.08 2.03-1.76 3.49-0.74 0.59-1.35 1.59-2.24 1.65-1.06 0.07-2.41-0.93-3.42-2.01"),
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M41.16 85.59h0.12c0.66-0.05 1.16-0.56 1.65-1.06 0.21-0.22 0.43-0.44 0.66-0.62 1.08-0.85 1.12-1.28 1.18-1.81 0.04-0.41 0.09-0.87 0.61-1.71 0.78-1.25 0.85-3.26 0.17-4.78-0.42-0.94-1.3-2.13-3.13-2.45-2.32-0.41-4.13 0.09-5.26 1.45-1.53 1.85-1.43 4.8-0.69 6.76 0.03 0.07 0.1 0.1 0.17 0.08 0.07-0.03 0.1-0.1 0.08-0.17-0.72-1.89-0.82-4.73 0.65-6.5 1.06-1.28 2.79-1.75 5.01-1.36 1.72 0.3 2.55 1.42 2.94 2.3 0.65 1.45 0.58 3.36-0.16 4.54-0.55 0.88-0.61 1.4-0.65 1.82-0.05 0.51-0.09 0.85-1.08 1.63-0.24 0.19-0.46 0.42-0.68 0.64-0.47 0.49-0.92 0.95-1.48 0.99-0.87 0.06-2.11-0.67-3.32-1.97-0.05-0.05-0.13-0.06-0.18-0.01-0.05 0.05-0.06 0.13-0.01 0.18 0.46 0.49 2.03 2.05 3.4 2.05z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes(
                    "M42.74 80.45c0.04 0 0.07-0.01 0.1-0.04 0.05-0.05 0.04-0.14-0.01-0.18-0.04-0.04-0.99-0.88-2.14-0.52-0.07 0.02-0.11 0.09-0.08 0.16 0.02 0.07 0.09 0.11 0.16 0.08 1.01-0.32 1.88 0.45 1.89 0.46 0.02 0.03 0.05 0.04 0.08 0.04zm1.73 0c0.05 0 0.09-0.03 0.12-0.07 0.01-0.02 0.3-0.6 1.1-0.73 0.07-0.01 0.12-0.08 0.11-0.15-0.01-0.07-0.08-0.12-0.15-0.11-0.94 0.15-1.27 0.85-1.29 0.88-0.03 0.06 0 0.14 0.06 0.17l0.05 0.01zm-1.42 2.76c-0.07-0.06-0.06-0.14-0.04-0.19 0.03-0.06 0.11-0.09 0.18-0.05 0.03 0.01 0.05 0.04 0.06 0.06 0.12 0.07 0.58 0.17 0.75 0.06 0.02-0.02 0.07-0.05 0.04-0.18-0.17-0.68-0.31-1.36-0.31-1.36-0.01-0.07 0.03-0.14 0.1-0.15 0.07-0.01 0.14 0.03 0.15 0.1 0 0.01 0.13 0.68 0.3 1.35 0.07 0.29-0.07 0.42-0.17 0.48s-0.23 0.08-0.36 0.08c-0.28-0.01-0.6-0.11-0.7-0.2zm-0.57 0.87c0.06 0 0.11-0.04 0.13-0.1 0.02-0.07-0.03-0.14-0.1-0.16-0.01 0-0.77-0.19-1.3-0.85-0.04-0.06-0.13-0.07-0.18-0.02-0.06 0.04-0.07 0.13-0.02 0.18 0.58 0.73 1.41 0.93 1.44 0.94l0.03 0.01zm-1.01-2.91c-0.05 0.19 0.03 0.37 0.17 0.42 0.15 0.04 0.31-0.08 0.36-0.27 0.05-0.19-0.03-0.37-0.17-0.42-0.15-0.04-0.31 0.08-0.36 0.27zm2.78-0.06c-0.05 0.19-0.01 0.36 0.08 0.39 0.1 0.03 0.22-0.1 0.27-0.29 0.05-0.19 0.01-0.36-0.08-0.39-0.1-0.03-0.22 0.11-0.27 0.29z"
                ),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M40.44 76.84s0.97 2.53 3.36 2.47c0 0-0.83-0.63-1.06-1.24 0 0 1.84 1.82 3.68 0.9 1.84-0.93 0.95-5.23-1.88-6.93-2.83-1.7-5.71-1.25-6.68 0.38 0 0-1.98-0.18-2.85 2.72-0.78 2.59 0.47 6.54 1.69 6.58 1.89 0.07 2.27-1.98 2.27-1.98s1.13-1.01 1.47-2.9z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M36.69 81.85c-0.32-0.01-0.63-0.23-0.93-0.65-0.9-1.26-1.49-4.08-0.88-6.11 0.79-2.63 2.5-2.81 2.9-2.82 0.52-0.81 1.5-1.33 2.71-1.44 1.31-0.11 2.77 0.27 4.12 1.08 1.97 1.19 2.97 3.57 2.91 5.2-0.04 0.95-0.4 1.64-1.03 1.96-1.22 0.62-2.45 0.06-3.18-0.41 0.28 0.3 0.57 0.53 0.58 0.53 0.04 0.03 0.06 0.09 0.04 0.14-0.02 0.05-0.07 0.09-0.12 0.09-1.9 0.05-2.94-1.49-3.32-2.2-0.38 1.53-1.23 2.4-1.41 2.57-0.07 0.3-0.55 2.05-2.29 2.05-0.03 0.02-0.06 0.02-0.1 0.01zm3.88-5.06c0.01 0.02 0.86 2.18 2.87 2.38-0.27-0.25-0.66-0.65-0.81-1.05-0.02-0.06 0-0.12 0.05-0.16 0.05-0.03 0.12-0.03 0.16 0.02 0.02 0.02 1.79 1.75 3.53 0.87 0.54-0.27 0.86-0.89 0.89-1.73 0.06-1.56-0.9-3.83-2.78-4.97-1.3-0.78-2.7-1.15-3.96-1.04-1.15 0.1-2.08 0.6-2.55 1.37-0.03 0.04-0.07 0.07-0.12 0.06-0.08-0.01-1.88-0.13-2.71 2.63-0.57 1.9-0.02 4.67 0.84 5.88 0.25 0.34 0.5 0.53 0.72 0.54 1.75 0.07 2.12-1.8 2.14-1.88l0.04-0.07c0.01-0.01 1.1-1 1.44-2.83 0.01-0.06 0.06-0.1 0.12-0.11h0.01c0.05 0.01 0.1 0.04 0.12 0.09z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M38.37 81.32s0.06-2.39-1.29-2.1c-1.35 0.29-0.37 3.05 0.65 3.02"),
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M37.71 82.37h0.02c0.07 0 0.13-0.06 0.13-0.13s-0.06-0.13-0.13-0.13c-0.52 0.01-1.07-0.9-1.16-1.67-0.03-0.29-0.05-0.96 0.54-1.09 0.24-0.05 0.44-0.01 0.6 0.13 0.56 0.46 0.53 1.83 0.53 1.84 0 0.07 0.06 0.13 0.13 0.13 0.08 0 0.13-0.06 0.13-0.13 0-0.06 0.03-1.5-0.63-2.05-0.23-0.19-0.5-0.25-0.82-0.18-0.56 0.12-0.84 0.63-0.75 1.38 0.11 0.91 0.74 1.9 1.41 1.9z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M42.89 96.3h20.33c0.41 0 0.74-0.33 0.74-0.74v-0.1c0-0.41-0.33-0.74-0.74-0.74H42.89c-0.41 0-0.74 0.33-0.74 0.74v0.1c0 0.41 0.33 0.74 0.74 0.74z"),
                fill = SolidColor(MaterialTheme.colorScheme.primary),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M42.02 95.87v-0.73c0-0.31 0.25-0.55 0.55-0.55h20.96c0.31 0 0.55 0.25 0.55 0.55v0.73c0 0.31-0.25 0.55-0.55 0.55H42.57c-0.3 0.01-0.55-0.24-0.55-0.55zm0.55-1.02c-0.16 0-0.29 0.13-0.29 0.29v0.73c0 0.16 0.13 0.29 0.29 0.29h20.96c0.16 0 0.29-0.13 0.29-0.29v-0.73c0-0.16-0.13-0.29-0.29-0.29H42.57z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M24.42 118.96s3.22 1.9 5.51 5.72c2.29 3.82 4.1 9.2 1.28 9.87l-2.68-0.1-5.16-1.77 0.54-1.05s4.52 2.39 5.29 2.39c0.77 0 1.78 0.19 2.2-0.12 0.42-0.31-1.49-7.26-5.57-9.57-4.07-2.31-1.41-5.37-1.41-5.37z"),
                fill = SolidColor(Color(0xFF1C6B9A)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M31.21 134.69l-2.68-0.1-0.04-0.01-5.16-1.77c-0.04-0.01-0.06-0.04-0.08-0.07-0.01-0.04-0.01-0.07 0.01-0.11l0.54-1.05c0.02-0.03 0.04-0.05 0.08-0.06 0.03-0.01 0.07-0.01 0.1 0.01 1.25 0.66 4.62 2.38 5.23 2.38l0.69 0.03c0.57 0.04 1.17 0.07 1.42-0.11 0.29-0.52-1.64-7.16-5.54-9.37-1.34-0.76-2.12-1.69-2.3-2.75-0.26-1.53 0.8-2.77 0.84-2.82 0.04-0.05 0.11-0.06 0.16-0.03 0.03 0.02 3.28 1.96 5.56 5.77 1.84 3.07 3.33 7.03 2.51 8.96-0.25 0.58-0.69 0.95-1.31 1.1h-0.03zm-7.48-13.03c0.17 0.98 0.9 1.84 2.17 2.57 3.67 2.08 5.61 7.87 5.69 9.35 0.01 0.24-0.02 0.38-0.11 0.45-0.34 0.25-0.96 0.21-1.61 0.17l-0.67-0.03c-0.74 0-4.42-1.92-5.23-2.35l-0.41 0.8 5 1.72 2.64 0.1c0.53-0.13 0.9-0.45 1.11-0.95 0.77-1.84-0.75-5.81-2.49-8.72-2.02-3.38-4.82-5.27-5.37-5.62-0.23 0.28-0.92 1.32-0.72 2.51z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M24.42 118.96s3.22 1.9 5.51 5.72c2.29 3.82 4.1 9.2 1.28 9.87l-2.68-0.1-5.16-1.77 0.54-1.05s4.52 2.39 5.29 2.39c0.77 0 1.78 0.19 2.2-0.12 0.42-0.31-1.49-7.26-5.57-9.57-4.07-2.31-1.41-5.37-1.41-5.37z"),
                fill = SolidColor(Color(0xB3010202)), stroke = null, fillAlpha = 0.5f,
                strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M21.49 116.46s0-1.12-1.7-1.27c-1.7-0.15-1.94 1.48-1.94 1.48h0.58s-0.01-0.98 1.23-1.06c1.25-0.08 1.2 1.06 1.2 1.06l0.63-0.21z"),
                fill = SolidColor(Color(0xFF1C6B9A)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M17.75 116.76c-0.02-0.03-0.04-0.07-0.03-0.1 0-0.02 0.28-1.76 2.08-1.59 1.8 0.16 1.82 1.39 1.82 1.4 0 0.06-0.04 0.11-0.09 0.12l-0.62 0.21c-0.04 0.01-0.08 0.01-0.12-0.02-0.03-0.03-0.05-0.07-0.05-0.11 0 0 0.01-0.42-0.26-0.69-0.18-0.18-0.45-0.25-0.8-0.23-1.1 0.07-1.11 0.89-1.11 0.92 0 0.03-0.01 0.07-0.04 0.09-0.02 0.02-0.06 0.04-0.09 0.04h-0.58c-0.05 0-0.08-0.01-0.11-0.04zm1.91-1.27c0.43-0.02 0.76 0.08 1 0.31 0.23 0.22 0.3 0.51 0.33 0.7l0.36-0.12c-0.05-0.25-0.29-0.94-1.57-1.05-1.28-0.12-1.66 0.84-1.76 1.22h0.31c0.03-0.3 0.26-1 1.33-1.06z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M24 134.56c3.59 0 2.91-16.1 2.5-16.9-0.41-0.8-10.83-1.2-11.86-0.86-1.03 0.34-5.15 16.39-2.87 17.66l12.23 0.1z"),
                fill = SolidColor(MaterialTheme.colorScheme.primary),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M24 134.69l-12.23-0.1-0.06-0.02c-0.67-0.38-0.89-1.88-0.64-4.47 0.47-4.86 2.65-13.14 3.53-13.43 1.05-0.35 11.54 0 12.01 0.92 0.36 0.7 0.9 12.68-1.2 16.11-0.39 0.66-0.87 0.99-1.41 0.99zm-9.32-17.77c-0.59 0.21-2.92 8.12-3.38 13.46-0.19 2.21-0.01 3.61 0.5 3.94l12.2 0.1c0.45 0 0.85-0.29 1.19-0.86 2.07-3.38 1.54-15.16 1.19-15.86-0.27-0.52-6.41-0.91-9.72-0.91-1 0.01-1.74 0.05-1.98 0.13z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M24 134.56c3.59 0 2.91-16.1 2.5-16.9-0.41-0.8-10.83-1.2-11.86-0.86-1.03 0.34-5.15 16.39-2.87 17.66l12.23 0.1z"),
                fill = SolidColor(Color(0xB3010202)), stroke = null, fillAlpha = 0.2f,
                strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            )
            addPath(
                pathData =
                addPathNodes("M26.49 117.65c-1.3 0.28-2.05 5.55-3.8 6.89-1.75 1.34-10 1.05-10.93 0-0.93-1.05 0.89-6.97 2.22-7.87 1.33-0.9 2.27-0.03 6-0.44 5.53-0.61 6.51 1.42 6.51 1.42z"),
                fill = SolidColor(Color(0xFF1C6B9A)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M11.67 124.63c-0.28-0.31-0.36-0.97-0.23-1.96 0.27-2.17 1.47-5.41 2.47-6.1 0.77-0.52 1.4-0.48 2.45-0.41 0.82 0.06 1.94 0.13 3.61-0.05 5.56-0.62 6.6 1.41 6.64 1.49 0.02 0.04 0.02 0.08 0 0.11s-0.05 0.06-0.09 0.07c-0.57 0.12-1.1 1.54-1.62 2.92-0.57 1.52-1.21 3.25-2.13 3.95-0.83 0.64-3.13 0.92-5.43 0.92-2.57-0.01-5.16-0.36-5.67-0.94zm8.32-8.27c-1.69 0.19-2.83 0.11-3.66 0.05-1.03-0.07-1.59-0.11-2.28 0.36-0.86 0.59-2.08 3.63-2.36 5.92-0.11 0.89-0.05 1.51 0.17 1.76 0.91 1.02 9.11 1.25 10.76-0.02 0.85-0.66 1.49-2.34 2.04-3.83 0.54-1.44 1.01-2.7 1.63-3.02-0.33-0.41-1.75-1.72-6.3-1.22z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M17.03 120.68l-1.53 1.25c-0.09 0.07-0.1 0.21-0.02 0.3l1.19 1.28c0.08 0.08 0.21 0.09 0.29 0.01l1.52-1.44c0.09-0.08 0.08-0.22 0-0.3l-1.18-1.09c-0.08-0.07-0.2-0.07-0.27-0.01z"),
                fill = SolidColor(MaterialTheme.colorScheme.primary),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M16.8 123.71c-0.09 0-0.17-0.04-0.23-0.11l-1.19-1.28c-0.06-0.07-0.09-0.16-0.09-0.25 0.01-0.09 0.05-0.18 0.12-0.23l1.53-1.25c0.13-0.1 0.32-0.1 0.44 0.01l1.18 1.09c0.07 0.06 0.11 0.15 0.11 0.24s-0.04 0.18-0.1 0.24l-1.52 1.44c-0.06 0.06-0.14 0.09-0.23 0.09l-0.02 0.01zm0.31-2.93l-1.53 1.25-0.03 0.05c0 0.01 0 0.03 0.02 0.05l1.19 1.28 0.05 0.02 0.05-0.02 1.52-1.44c0.02-0.02 0.02-0.04 0.02-0.05 0-0.01 0-0.03-0.02-0.05l-1.18-1.09-0.05-0.02-0.04 0.02z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M17.03 120.68l-1.53 1.25c-0.09 0.07-0.1 0.21-0.02 0.3l1.19 1.28c0.08 0.08 0.21 0.09 0.29 0.01l1.52-1.44c0.09-0.08 0.08-0.22 0-0.3l-1.18-1.09c-0.08-0.07-0.2-0.07-0.27-0.01z"),
                fill = SolidColor(Color(0xB3010202)), stroke = null, fillAlpha = 0.2f,
                strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M22.07 127.24s-6.91 0.57-10.3-0.31c0 0-0.66 0.46-0.97 1.39-0.31 0.93-0.95 4.09 0.97 4.9 1.92 0.81 8.83 0.66 9.76-0.27 0.92-0.93 0.54-5.71 0.54-5.71z"),
                fill = SolidColor(Color(0xFF1C6B9A)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M11.71 133.34c-1.97-0.83-1.42-3.94-1.04-5.06 0.32-0.96 0.99-1.44 1.02-1.46 0.03-0.02 0.07-0.03 0.11-0.02 3.33 0.86 10.19 0.31 10.26 0.31 0.03 0 0.07 0.01 0.09 0.03 0.03 0.02 0.04 0.05 0.05 0.09 0.02 0.2 0.38 4.86-0.58 5.82-0.56 0.56-2.93 0.83-5.26 0.83-1.93-0.01-3.82-0.19-4.65-0.54zm0.08-6.27c-0.15 0.12-0.63 0.55-0.88 1.29-0.33 0.99-0.88 3.99 0.9 4.74 1.91 0.81 8.74 0.63 9.62-0.24 0.7-0.7 0.62-4.08 0.51-5.48-0.96 0.07-7.01 0.47-10.15-0.31z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M22.07 127.24s-6.91 0.57-10.3-0.31c0 0-0.66 0.46-0.97 1.39-0.31 0.93-0.95 4.09 0.97 4.9 1.92 0.81 8.83 0.66 9.76-0.27 0.92-0.93 0.54-5.71 0.54-5.71z"),
                fill = SolidColor(Color(0xB3010202)), stroke = null, fillAlpha = 0.4f,
                strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M22.07 127.24s-0.81 2.19-1.24 2.52c-0.42 0.33-9.4 0.33-10.39-0.48-1-0.81 0.36-2.28 1.32-2.35 0 0 6.29 0.73 10.31 0.31z"),
                fill = SolidColor(MaterialTheme.colorScheme.primary),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M10.35 129.38c-0.36-0.29-0.48-0.7-0.34-1.14 0.22-0.7 1.05-1.39 1.76-1.44 0.06 0.01 6.32 0.73 10.27 0.31 0.04 0 0.09 0.01 0.12 0.05s0.03 0.08 0.02 0.12c-0.08 0.23-0.84 2.23-1.28 2.58-0.22 0.17-1.65 0.26-3.4 0.26-2.84 0-6.53-0.24-7.15-0.74zm1.42-2.32c-0.59 0.05-1.32 0.66-1.51 1.26-0.11 0.35-0.02 0.64 0.25 0.87 0.99 0.81 9.83 0.72 10.23 0.47 0.27-0.21 0.79-1.41 1.12-2.27-3.98 0.37-10.05-0.33-10.09-0.33z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M24.96 126.77s-0.23 4.59-0.69 5.64c0 0 1.06 0.62 2.23 0s0.98-4.58 0.75-4.57c-0.24 0.01-2.29-1.07-2.29-1.07z"),
                fill = SolidColor(Color(0xFF1C6B9A)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M24.2 132.52c-0.06-0.03-0.08-0.1-0.05-0.17 0.45-1.01 0.68-5.54 0.68-5.59 0-0.04 0.03-0.08 0.07-0.11 0.04-0.02 0.09-0.02 0.12 0 0.97 0.51 2.06 1.04 2.21 1.06 0.14 0 0.19 0.16 0.2 0.22 0.2 0.72 0.26 3.99-0.88 4.59-0.41 0.22-0.81 0.29-1.16 0.29-0.67 0.01-1.16-0.27-1.19-0.29zm0.88-5.54c-0.05 0.88-0.26 4.27-0.65 5.36 0.28 0.13 1.11 0.42 2-0.05 0.26-0.14 0.48-0.51 0.63-1.07 0.32-1.21 0.23-2.97 0.11-3.26-0.34-0.08-1.45-0.64-2.09-0.98z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M24.96 126.77s-0.23 4.59-0.69 5.64c0 0 1.06 0.62 2.23 0s0.98-4.58 0.75-4.57c-0.24 0.01-2.29-1.07-2.29-1.07z"),
                fill = SolidColor(Color(0xB3010202)), stroke = null, fillAlpha = 0.4f,
                strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M24.96 126.77l1.74 0.35s1.66 1.27 0.92 1.7c-0.73 0.42-2.62-0.62-2.66-2.05z"),
                fill = SolidColor(MaterialTheme.colorScheme.primary),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M26.18 128.74c-0.64-0.36-1.33-1.06-1.35-1.96 0-0.04 0.02-0.08 0.05-0.1 0.03-0.03 0.07-0.04 0.11-0.03l1.74 0.35 0.05 0.02c0.12 0.09 1.2 0.94 1.16 1.53-0.01 0.11-0.06 0.27-0.25 0.38-0.13 0.08-0.29 0.11-0.47 0.11-0.31 0-0.67-0.1-1.04-0.3zm-1.08-1.81c0.1 0.71 0.67 1.28 1.21 1.58 0.49 0.27 0.98 0.35 1.25 0.2 0.1-0.06 0.12-0.13 0.12-0.17 0.02-0.34-0.61-0.96-1.04-1.29l-1.54-0.32zm78.33-6.11H52l16.32-17c11.65-12.07 17.17-21 17.17-27.29 0-4.68-3.4-8.33-7.48-8.33-4 0-6.8 3.23-6.8 7.82 0 0.59 0.08 1.44 0.25 2.64H53.1c0-6.89 2.55-12.58 6.38-17.17C63.9 56.21 70.28 54 77.93 54c14.28 0 24.82 9.61 24.82 23.12 0 7.48-2.89 13.43-9.52 19.55l-10.8 10.03h21v14.12z"),
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            )
        }
            .build()
        return _two!!
    }

private var _two: ImageVector? = null

@Preview
@Composable
fun TwoPreview() {
    Box {
        Image(
            imageVector = Cards.Two,
            contentDescription = null,
        )
    }
}
