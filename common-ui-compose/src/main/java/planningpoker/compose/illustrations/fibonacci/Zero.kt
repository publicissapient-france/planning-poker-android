@file:Suppress("NOTHING_TO_INLINE", "MagicNumber", "MaxLineLength")

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

val Illu.Cards.Zero: ImageVector
    @Composable get() {
        if (_zero != null) {
            return _zero!!
        }
        _zero = Builder(
            name = "Zero",
            defaultWidth = 132.0.dp,
            defaultHeight = 105.0.dp,
            viewportWidth = 132.0f,
            viewportHeight = 105.0f
        ).apply {
            addPath(
                fill = SolidColor(MaterialTheme.colorScheme.secondaryContainer),
                fillAlpha = 0.7f,
                pathFillType = NonZero,
                pathData = addPathNodes("M25.01 88.06s9.58 12.96 27.27 14.8c17.7 1.83 34.22-7.21 47.83-14.21 13.6-7 18.77-20.03 12.96-31.54-5.81-11.51-17.91-8.64-31.63-17.46-13.73-8.83-15.98-13.09-32.53-13.64-16.55-0.55-31.28 14.77-31.88 33.12-0.6 18.35 7.98 28.93 7.98 28.93z")
            )
            addPath(
                fill = SolidColor(Color(0xFF010202)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
                pathData = addPathNodes("M30.28 94.49l-14.35 8.05c-1.06 0.51-2.78-0.1-3.1-1.38L0.16 50.02c-0.32-1.28 0.31-2.44 2.04-2.51l16.4-0.16c0.86-0.03 1.77 0.82 2.03 1.89l10.56 42.62c0.27 1.08-0.14 2.25-0.91 2.63z")
            )
            addPath(
                fill = SolidColor(Color(0xFF010202)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
                pathData = addPathNodes("M15.61 102.74c-0.51 0.13-1.12 0.06-1.65-0.19-0.62-0.29-1.06-0.79-1.2-1.37L0.08 50.04c-0.17-0.69-0.07-1.33 0.28-1.8 0.38-0.5 1.01-0.78 1.83-0.81l16.4-0.16c0.89-0.03 1.84 0.85 2.11 1.95l10.56 42.62c0.27 1.11-0.15 2.32-0.96 2.71l-14.35 8.05c-0.1 0.07-0.22 0.11-0.34 0.14zM1.57 47.68c-0.46 0.11-0.83 0.34-1.07 0.66-0.33 0.43-0.42 1.02-0.26 1.66l12.67 51.14c0.13 0.53 0.54 0.99 1.11 1.26 0.63 0.29 1.34 0.32 1.87 0.07l14.35-8.05c0.74-0.36 1.13-1.49 0.87-2.53L20.55 49.26c-0.26-1.04-1.13-1.86-1.95-1.83L2.2 47.59c-0.23 0.01-0.44 0.04-0.63 0.09z")
            )
            addPath(
                fill = SolidColor(MaterialTheme.colorScheme.primary),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
                pathData = addPathNodes("M31.11 94.28l-14.94 8.06c-1.06 0.51-2.19-0.11-2.5-1.39L0.99 49.81c-0.32-1.28 0.39-2.35 1.57-2.4l16.87-0.28c0.86-0.03 1.77 0.82 2.03 1.89l10.56 42.62c0.27 1.09-0.14 2.26-0.91 2.64z")
            )
            addPath(
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero,
                pathData = addPathNodes("M15.83 102.55c-0.38 0.1-0.77 0.06-1.13-0.11-0.54-0.25-0.95-0.79-1.12-1.47L0.91 49.83c-0.17-0.68-0.06-1.34 0.3-1.82 0.31-0.42 0.79-0.66 1.34-0.68l16.87-0.28c0.89-0.03 1.84 0.85 2.11 1.95L32.1 91.64c0.27 1.11-0.15 2.32-0.96 2.71l-14.94 8.07c-0.12 0.06-0.25 0.1-0.37 0.13zm-13.63-55c-0.35 0.09-0.64 0.28-0.86 0.56-0.33 0.44-0.43 1.05-0.27 1.68l12.67 51.14c0.16 0.63 0.53 1.13 1.03 1.36 0.43 0.2 0.91 0.19 1.36-0.03l14.94-8.06c0.74-0.36 1.13-1.49 0.87-2.53L21.38 49.05c-0.26-1.04-1.13-1.86-1.95-1.83L2.56 47.5c-0.12 0-0.24 0.02-0.36 0.05z")
            )
            addPath(
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero,
                pathData = addPathNodes("M24.86 97.2c-0.14 0.04-0.29 0.02-0.43-0.04-0.22-0.1-0.39-0.33-0.46-0.62-0.13-0.53 0.1-1.11 0.51-1.3 0.18-0.08 0.38-0.08 0.55 0 0.22 0.11 0.39 0.33 0.46 0.62 0.13 0.52-0.1 1.1-0.5 1.29-0.04 0.03-0.09 0.04-0.13 0.05zm-0.21-1.84l-0.09 0.03c-0.34 0.16-0.53 0.66-0.42 1.11 0.06 0.24 0.2 0.43 0.37 0.51 0.13 0.06 0.28 0.06 0.42 0 0.34-0.16 0.52-0.66 0.41-1.1-0.06-0.24-0.19-0.42-0.37-0.51-0.11-0.05-0.22-0.07-0.32-0.04z")
            )
            addPath(
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero,
                pathData = addPathNodes("M31.06 91.19L14.49 99.5 2.52 51.19l18.41-0.89 10.13 40.89z")
            )
            addPath(
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero,
                pathData = addPathNodes("M14.51 99.58l-0.05-0.01-0.05-0.05L2.44 51.21c-0.01-0.02 0-0.05 0.01-0.07 0.01-0.02 0.04-0.03 0.06-0.03l18.41-0.89c0.04 0 0.07 0.02 0.08 0.06l10.13 40.89c0.01 0.04-0.01 0.08-0.04 0.09l-16.57 8.31-0.01 0.01zM2.62 51.26l11.92 48.12 16.42-8.24-10.1-40.76-18.24 0.88z")
            )
            addPath(
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero,
                pathData = addPathNodes("M20.91 83.42c-2.26 5.49-2.82 10.75-2.87 14.3l11.42-5.73c-0.37-2.41-0.3-4.88 0.01-7.22l-2.82-11.4c-1.99 2.72-4.13 6.15-5.74 10.05zM2.52 51.19l7.26 29.3c1.53-4.38 4.2-9.17 7.63-15.96 2.74-5.43 3.82-9.13 4.19-11.55l-0.66-2.68-18.42 0.89z")
            )
            addPath(
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero,
                pathData = addPathNodes("M20.7 51.76l-1.46 0.11-0.25-1.01 1.46-0.1 0.25 1z")
            )
            addPath(
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero,
                pathData = addPathNodes("M20.21 51.62l-0.88 0.09-0.17-0.69 0.88-0.08 0.17 0.68z")
            )
            addPath(
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero,
                pathData = addPathNodes("M20.83 51.47l-0.21 0.01-0.11-0.44 0.21-0.01 0.11 0.44zM3.62 51.98l-0.36 0.03 0.17 0.67 0.35-0.03-0.16-0.67zm0.5-0.27l-0.36 0.03 0.22 0.89 0.36-0.02-0.22-0.9zM4.6 51.4l-0.35 0.03 0.29 1.16 0.35-0.02L4.6 51.4z")
            )
            addPath(
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero,
                pathData = addPathNodes("M101.48 64.51l14.35 8.05c1.06 0.51 2.78-0.1 3.1-1.38l12.67-51.14c0.32-1.28-0.31-2.44-2.04-2.51l-16.4-0.16c-0.86-0.03-1.77 0.82-2.03 1.89l-10.56 42.62c-0.27 1.08 0.13 2.25 0.91 2.63z")
            )
            addPath(
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero,
                pathData = addPathNodes("M115.79 72.63l-14.35-8.05c-0.8-0.39-1.23-1.61-0.96-2.71l10.56-42.62c0.27-1.11 1.22-1.99 2.11-1.95l16.4 0.16c0.82 0.03 1.46 0.31 1.83 0.81 0.35 0.47 0.45 1.11 0.28 1.8L119 71.2c-0.14 0.58-0.58 1.07-1.2 1.37-0.54 0.25-1.14 0.32-1.65 0.19-0.13-0.03-0.25-0.07-0.36-0.13zm13.76-55.02l-16.4-0.16c-0.82-0.03-1.69 0.79-1.95 1.83L100.64 61.9c-0.26 1.04 0.13 2.17 0.87 2.53l14.35 8.05c0.52 0.25 1.24 0.23 1.87-0.07 0.58-0.27 0.98-0.73 1.11-1.26l12.67-51.14c0.16-0.64 0.07-1.23-0.25-1.66-0.24-0.32-0.61-0.55-1.07-0.66-0.2-0.04-0.41-0.07-0.64-0.08z")
            )
            addPath(
                fill = SolidColor(MaterialTheme.colorScheme.primary),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
                pathData = addPathNodes("M100.65 64.3l14.94 8.06c1.06 0.51 2.19-0.11 2.5-1.39l12.67-51.14c0.32-1.28-0.39-2.35-1.57-2.4l-16.87-0.28c-0.86-0.03-1.77 0.82-2.03 1.89L99.73 61.68c-0.26 1.07 0.14 2.24 0.92 2.62z")
            )
            addPath(
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero,
                pathData = addPathNodes("M115.55 72.44l-14.94-8.06c-0.8-0.39-1.23-1.61-0.96-2.71l10.56-42.62c0.27-1.11 1.22-1.99 2.11-1.95l16.87 0.28c0.55 0.02 1.03 0.26 1.34 0.68 0.36 0.48 0.47 1.14 0.3 1.82L118.17 71c-0.17 0.68-0.58 1.22-1.12 1.47-0.35 0.17-0.74 0.2-1.13 0.11-0.12-0.04-0.25-0.08-0.37-0.14zm13.64-54.92l-16.87-0.28c-0.82-0.03-1.69 0.79-1.95 1.83L99.81 61.7c-0.26 1.04 0.13 2.17 0.87 2.53l14.94 8.06c0.45 0.22 0.93 0.23 1.36 0.03 0.5-0.23 0.87-0.73 1.03-1.36l12.67-51.14c0.16-0.63 0.06-1.25-0.27-1.68-0.21-0.28-0.51-0.48-0.86-0.56-0.11-0.04-0.23-0.05-0.36-0.06z")
            )
            addPath(
                fill = SolidColor(Color(0xFF263239)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero,
                pathData = addPathNodes("M106.76 67.18c-0.41-0.19-0.63-0.77-0.5-1.29 0.07-0.29 0.24-0.51 0.46-0.62 0.18-0.08 0.37-0.09 0.55 0 0.41 0.19 0.64 0.77 0.51 1.3-0.07 0.29-0.24 0.51-0.46 0.62-0.14 0.06-0.28 0.08-0.43 0.04l-0.13-0.05zm0.03-1.76c-0.18 0.08-0.31 0.27-0.37 0.51-0.11 0.45 0.07 0.94 0.41 1.1 0.14 0.07 0.28 0.07 0.42 0 0.18-0.08 0.31-0.27 0.37-0.51 0.11-0.45-0.08-0.95-0.42-1.11l-0.09-0.03c-0.11-0.02-0.22-0.01-0.32 0.04z")
            )
            addPath(
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero,
                pathData = addPathNodes("M100.69 61.21l16.58 8.31 11.97-48.31-18.42-0.89-10.13 40.89z")
            )
            addPath(
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero,
                pathData = addPathNodes("M117.23 69.59l-16.57-8.31c-0.03-0.02-0.05-0.06-0.04-0.09l10.12-40.89c0.01-0.04 0.04-0.06 0.08-0.06l18.41 0.89c0.02 0 0.05 0.01 0.06 0.03 0.01 0.02 0.02 0.05 0.01 0.07l-11.97 48.31c-0.01 0.02-0.02 0.04-0.05 0.05l-0.05 0.01v-0.01zm-6.34-49.18l-10.1 40.76 16.42 8.24 11.92-48.12-18.24-0.88z")
            )
            addPath(
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero,
                pathData = addPathNodes("M110.84 53.44c2.26 5.49 2.82 10.75 2.87 14.3l-11.42-5.73c0.37-2.41 0.3-4.88-0.01-7.22l2.82-11.4c2 2.72 4.14 6.15 5.74 10.05zm18.4-32.23l-7.26 29.3c-1.53-4.38-4.2-9.17-7.63-15.96-2.74-5.43-3.82-9.13-4.19-11.55l0.66-2.68 18.42 0.89z")
            )
            addPath(
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero,
                pathData = addPathNodes("M111.06 21.78l1.45 0.11 0.25-1.01-1.45-0.1-0.25 1z")
            )
            addPath(
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero,
                pathData = addPathNodes("M111.55 21.64l0.87 0.09 0.17-0.69-0.88-0.07-0.16 0.67z")
            )
            addPath(
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero,
                pathData = addPathNodes("M110.93 21.49l0.2 0.01 0.11-0.44-0.2-0.01-0.11 0.44zm17.21 0.52l0.35 0.02-0.16 0.67-0.36-0.03 0.17-0.66zm-0.5-0.28l0.35 0.03-0.22 0.9-0.35-0.03 0.22-0.9zm-0.48-0.31l0.35 0.03-0.29 1.16-0.35-0.02 0.29-1.17z")
            )
            addPath(
                fill = SolidColor(Color(0xFF010202)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero,
                pathData = addPathNodes("M65.2 16c15.9 0 27.12 13.77 27.12 34.51S81.18 84.94 65.2 84.94C48.97 84.94 38 70.74 38 50c0-20.06 11.05-34 27.2-34zm0 54.4c6.29 0 10.63-8.33 10.63-19.72 0-11.39-4.34-19.81-10.63-19.81-6.29 0-10.71 8.5-10.71 19.55 0 11.57 4.25 19.98 10.71 19.98z")
            )
            addPath(
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero,
                pathData = addPathNodes("M24.77 34.25c-0.55 0-1.11-0.06-1.66-0.18-2.01-0.44-3.74-1.64-4.85-3.37-1.11-1.73-1.5-3.8-1.05-5.8 0.44-2.02 1.64-3.75 3.37-4.86 3.58-2.3 8.36-1.26 10.66 2.32 1.1 1.73 1.49 3.8 1.05 5.81-0.44 2.01-1.64 3.74-3.37 4.85-1.26 0.81-2.7 1.23-4.15 1.23zM24.74 19.1c-1.38 0-2.77 0.38-4.01 1.18-1.67 1.07-2.83 2.74-3.25 4.68-0.42 1.94-0.06 3.93 1 5.61 1.08 1.67 2.75 2.83 4.69 3.25 1.94 0.42 3.93 0.06 5.6-1 1.68-1.08 2.84-2.75 3.26-4.69 0.42-1.94 0.06-3.93-1.01-5.6-1.43-2.22-3.83-3.43-6.28-3.43z")
            )
            addPath(
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero,
                pathData = addPathNodes("M21.96 28.8h-0.13c-0.15 0-0.26-0.14-0.26-0.29 0-0.15 0.13-0.27 0.28-0.26 0.2 0.01 4.94 0.2 6.6-4.26 0.06-0.14 0.22-0.2 0.36-0.16 0.14 0.05 0.2 0.21 0.16 0.35-1.64 4.42-6.18 4.62-7.01 4.62zm4.01-5.98c0.27 0.38 0.34 0.8 0.15 0.93-0.18 0.13-0.55-0.07-0.82-0.46-0.27-0.38-0.34-0.8-0.15-0.93 0.18-0.12 0.55 0.08 0.82 0.46zm-3.31 2.12c0.27 0.38 0.34 0.8 0.15 0.93-0.18 0.13-0.55-0.07-0.82-0.46-0.27-0.38-0.34-0.8-0.15-0.93 0.19-0.12 0.55 0.08 0.82 0.46zm84.82 56.3c-1.38 0-2.7-0.5-3.72-1.45-1.08-1-1.71-2.35-1.77-3.82-0.13-3.03 2.24-5.6 5.27-5.72 1.47-0.06 2.87 0.45 3.95 1.45s1.7 2.35 1.77 3.82c0.06 1.47-0.45 2.87-1.45 3.95s-2.35 1.71-3.82 1.77h-0.23zm-5.22-5.28c0.06 1.4 0.66 2.7 1.68 3.63 1.03 0.95 2.36 1.44 3.76 1.38 1.4-0.06 2.69-0.66 3.63-1.68 0.95-1.03 1.44-2.36 1.38-3.76-0.06-1.4-0.66-2.69-1.68-3.63-1.03-0.95-2.36-1.44-3.76-1.38-2.9 0.11-5.13 2.55-5.01 5.44z")
            )
            addPath(
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero,
                pathData = addPathNodes("M106.79 77.05c-0.86 0-1.8-0.23-2.76-0.88-0.12-0.08-0.16-0.25-0.07-0.38 0.08-0.12 0.25-0.16 0.38-0.07 2.73 1.87 5.36-0.14 5.47-0.22 0.12-0.09 0.29-0.07 0.38 0.05 0.09 0.12 0.07 0.3-0.05 0.38-0.01 0.01-1.45 1.12-3.35 1.12zm-1.23-2.37c0.16 0 0.29-0.27 0.29-0.6 0-0.33-0.13-0.6-0.3-0.6-0.15 0-0.28 0.27-0.28 0.6 0 0.33 0.13 0.6 0.29 0.6zm2.49-0.71c0 0.33 0.13 0.6 0.29 0.6 0.16 0 0.29-0.27 0.29-0.6 0-0.33-0.13-0.6-0.3-0.6-0.15 0-0.28 0.27-0.28 0.6zM10.68 43.13c-1.91 0-3.71-1.18-4.4-3.09-0.42-1.17-0.36-2.44 0.17-3.57s1.47-1.98 2.64-2.4c1.17-0.43 2.44-0.37 3.57 0.16s1.98 1.47 2.4 2.64c0.43 1.17 0.37 2.44-0.16 3.57s-1.47 1.98-2.64 2.41c-0.52 0.2-1.06 0.28-1.58 0.28zm0-9.17c-0.51 0-1.03 0.1-1.53 0.27-1.13 0.41-2.03 1.23-2.54 2.32-0.52 1.1-0.57 2.31-0.17 3.44 0.84 2.33 3.43 3.55 5.76 2.7 2.33-0.84 3.55-3.42 2.7-5.76-0.41-1.13-1.23-2.03-2.32-2.54-0.6-0.28-1.25-0.43-1.9-0.43z")
            )
            addPath(
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero,
                pathData = addPathNodes("M10.98 41.88c-1.81 0-2.95-1.85-2.96-1.87l-0.05-0.08 0.08-0.04c0.03-0.02 2.99-1.7 5.82-2.1h0.07l0.02 0.06c0 0.03 0.8 2.78-1.95 3.83-0.36 0.14-0.71 0.2-1.03 0.2zM8.2 40c0.28 0.41 1.7 2.3 3.73 1.52 2.39-0.92 1.98-3.1 1.87-3.55-2.5 0.4-5.11 1.77-5.6 2.03zm0.47-1.33c-0.1 0-0.2-0.05-0.24-0.15l-0.67-1.29c-0.07-0.13-0.02-0.29 0.12-0.36C8 36.8 8.17 36.85 8.24 37l0.67 1.3c0.07 0.12 0.02 0.28-0.12 0.35-0.03 0.02-0.08 0.03-0.12 0.03zm3.57-1.29c-0.12 0-0.24-0.09-0.26-0.2l-0.32-1.49c-0.03-0.15 0.06-0.29 0.2-0.32 0.15-0.03 0.3 0.06 0.33 0.21l0.3 1.47c0.04 0.15-0.05 0.3-0.2 0.32l-0.05 0.01z")
            )
            addPath(
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero,
                pathData = addPathNodes("M9.86 41.51L9.7 41.42c0.22-0.37 0.6-0.69 1.07-0.85 0.89-0.32 1.8-0.06 2.06 0.6l-0.16 0.07c-0.23-0.56-1.06-0.79-1.84-0.5-0.42 0.15-0.78 0.43-0.98 0.77zm111.76 46.46c-0.5 0-0.98-0.08-1.46-0.26-2.24-0.8-3.4-3.29-2.6-5.53 0.39-1.09 1.18-1.95 2.23-2.44 1.04-0.49 2.22-0.54 3.3-0.15 2.24 0.81 3.4 3.3 2.6 5.53-0.63 1.75-2.3 2.85-4.07 2.85zm0-8.37c-0.58 0-1.16 0.13-1.71 0.4-0.98 0.45-1.72 1.26-2.1 2.28-0.75 2.1 0.34 4.42 2.44 5.18 2.1 0.76 4.42-0.33 5.18-2.43 0.76-2.1-0.33-4.42-2.43-5.18-0.45-0.17-0.91-0.25-1.37-0.25z")
            )
            addPath(
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero,
                pathData = addPathNodes("M121.35 86.82c-0.3 0-0.62-0.06-0.96-0.18-2.57-0.98-1.82-3.54-1.82-3.57l0.03-0.1 0.12 0.01c2.59 0.37 5.3 1.91 5.33 1.92l0.12 0.07-0.07 0.12c-0.01 0.02-1.07 1.73-2.75 1.73zm-2.55-3.56c-0.11 0.48-0.38 2.33 1.68 3.12 1.76 0.68 2.99-0.86 3.3-1.32-0.54-0.29-2.8-1.45-4.98-1.8zm4.66 0.57c0.09 0 0.17-0.05 0.22-0.13l0.6-1.18c0.07-0.12 0.03-0.27-0.1-0.33-0.12-0.06-0.27-0.02-0.33 0.11l-0.61 1.18c-0.06 0.12-0.02 0.27 0.1 0.33 0.04 0.02 0.08 0.02 0.12 0.02zm-3.26-1.17c0.1 0 0.22-0.08 0.24-0.19l0.28-1.34c0.03-0.13-0.06-0.26-0.2-0.29-0.12-0.03-0.25 0.06-0.28 0.2l-0.28 1.33c-0.03 0.13 0.06 0.26 0.19 0.3 0.02-0.02 0.04 0 0.05 0z")
            )
            addPath(
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero,
                pathData = addPathNodes("M122.32 86.46c-0.17-0.3-0.5-0.55-0.87-0.68-0.7-0.25-1.41-0.06-1.61 0.43l-0.25-0.1c0.26-0.63 1.1-0.88 1.96-0.58 0.44 0.16 0.8 0.45 1 0.8l-0.23 0.13zM34.52 74.1c-0.45 0-0.9-0.07-1.34-0.19-1.3-0.36-2.37-1.19-3.03-2.36-0.66-1.16-0.83-2.52-0.48-3.8 0.36-1.3 1.19-2.38 2.36-3.04 1.16-0.66 2.52-0.83 3.8-0.48 1.3 0.36 2.38 1.2 3.04 2.36 0.66 1.16 0.83 2.52 0.48 3.81-0.36 1.3-1.2 2.37-2.36 3.03-0.76 0.44-1.61 0.66-2.47 0.66zm-0.01-9.78c-0.81 0-1.61 0.21-2.34 0.62-1.1 0.63-1.9 1.64-2.23 2.87-0.34 1.22-0.18 2.5 0.45 3.6s1.64 1.9 2.87 2.23c1.22 0.34 2.5 0.18 3.6-0.45s1.89-1.64 2.23-2.87c0.34-1.22 0.18-2.5-0.45-3.6S37 64.83 35.77 64.5c-0.41-0.1-0.84-0.17-1.26-0.17z")
            )
            addPath(
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero,
                pathData = addPathNodes("M38.3 68.24c0.08 0.02 0.17 0 0.22-0.09 0.05-0.09 0.02-0.2-0.08-0.26l-1.22-0.66 0.8-0.03c0.1 0 0.2-0.09 0.19-0.19 0-0.1-0.1-0.19-0.2-0.18l-1.5 0.05c-0.1 0-0.16 0.06-0.18 0.15-0.02 0.08 0.02 0.17 0.09 0.21l1.83 1h0.05zm-6.51-1.79l0.04 0.01 1.99 0.06c0.09 0 0.16-0.05 0.19-0.13 0.02-0.08-0.01-0.17-0.08-0.2l-1.34-0.85c-0.1-0.06-0.2-0.03-0.26 0.06-0.06 0.1-0.03 0.2 0.06 0.26l0.75 0.47-1.3-0.04c-0.1 0-0.18 0.08-0.18 0.18-0.01 0.08 0.05 0.16 0.13 0.18zm2.83 5.41c-0.28 0-0.56-0.04-0.84-0.1-1.72-0.48-2.82-2.35-2.73-4.65v-0.14l0.8 0.08c2.12 0.22 4.16 0.78 6.08 1.68l0.64 0.3-0.07 0.13c-0.93 1.7-2.41 2.7-3.88 2.7zm-3.3-4.6c-0.04 2.11 0.97 3.8 2.53 4.23 1.56 0.43 3.29-0.5 4.34-2.34l-0.38-0.18c-1.9-0.89-3.9-1.44-5.98-1.66l-0.51-0.05z")
            )
            addPath(
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero,
                pathData = addPathNodes("M36.26 71.38l-0.27-0.04 0.02-0.27c0-1.03-0.92-1.87-2.05-1.87-0.8 0-1.51 0.42-1.85 1.06l-0.24-0.13c0.39-0.74 1.19-1.2 2.09-1.2 1.28 0 2.33 0.96 2.33 2.14l-0.03 0.31zM98.47 29.6c-1.94 0-3.78-0.73-5.22-2.05-1.52-1.4-2.4-3.3-2.48-5.36-0.1-2.06 0.64-4.03 2.03-5.54 1.4-1.52 3.3-2.4 5.36-2.48 2.06-0.09 4.03 0.64 5.54 2.03 1.52 1.4 2.4 3.3 2.48 5.36 0.09 2.06-0.64 4.03-2.03 5.54-1.4 1.51-3.3 2.4-5.36 2.48l-0.32 0.01zm0-15.17l-0.3 0.01c-2 0.08-3.82 0.93-5.17 2.4-1.35 1.46-2.04 3.36-1.96 5.35 0.08 2 0.93 3.82 2.4 5.17 1.46 1.35 3.36 2.04 5.35 1.96 1.99-0.08 3.82-0.93 5.17-2.4 1.35-1.46 2.04-3.36 1.96-5.35-0.08-1.99-0.93-3.82-2.4-5.17-1.4-1.27-3.17-1.97-5.04-1.97z")
            )
            addPath(
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero,
                pathData = addPathNodes(
                    "M95.35 19.54c0 0.47 0.18 0.84 0.4 0.84 0.24 0 0.42-0.38 0.42-0.84 0-0.47-0.18-0.84-0.41-0.84-0.23 0-0.41 0.37-0.41 0.84zm3.92-0.17c0 0.47 0.18 0.84 0.4 0.84 0.24 0 0.42-0.38 0.42-0.84 0-0.47-0.18-0.84-0.41-0.84-0.22 0-0.41 0.38-0.41 0.84zm-2.47 0.04c-0.06 0-0.14-0.03-0.2-0.09l-1.84-2c-0.1-0.1-0.1-0.28 0-0.38 0.12-0.1 0.29-0.1 0.39 0.01l1.85 2c0.1 0.11 0.1 0.28-0.01 0.38-0.04 0.06-0.11 0.08-0.18 0.08zm1.42-0.05c-0.06 0-0.12-0.02-0.17-0.06-0.12-0.09-0.13-0.27-0.04-0.38l1.7-2.1c0.09-0.12 0.27-0.13 0.38-0.04 0.12 0.1 0.13 0.27 0.04 0.38l-1.7 2.1c-0.06 0.07-0.13 0.1-0.21 0.1zm-3.42 4.56c-0.05 0-0.11-0.02-0.17-0.06-0.11-0.1-0.13-0.27-0.03-0.38 0.03-0.03 2.66-3.07 6.18-0.6 0.12 0.1 0.15 0.26 0.07 0.38-0.1 0.12-0.26 0.15-0.38 0.07-3.11-2.18-5.35 0.4-5.45 0.5-0.06 0.06-0.13 0.1-0.21 0.1zm-45.7-7.26c-1.06 0-2.11-0.23-3.1-0.7-1.77-0.83-3.11-2.3-3.77-4.13-0.4-1.1-0.52-2.24-0.38-3.39l0.27 0.03c-0.14 1.11-0.02 2.21 0.36 3.27 0.64 1.77 1.93 3.18 3.63 3.98 1.7 0.8 3.6 0.9 5.38 0.25 1.77-0.64 3.18-1.93 3.98-3.63 0.8-1.7 0.89-3.6 0.25-5.38-0.44-1.2-1.2-2.28-2.2-3.08l0.18-0.2c1.04 0.83 1.82 1.93 2.28 3.2 1.37 3.78-0.6 7.98-4.4 9.35-0.8 0.28-1.64 0.43-2.48 0.43zM46.83 2.68l-0.1-0.26c0.37-0.12 0.75-0.22 1.12-0.29L47.9 2.4c-0.36 0.07-0.72 0.16-1.07 0.28z"
                )
            )
            addPath(
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero,
                pathData = addPathNodes("M49.59 14.7c-2.83 0-4.62-2.9-4.64-2.94l-0.07-0.12 0.12-0.07c0.05-0.03 4.69-2.65 9.1-3.29l0.13-0.02 0.03 0.11c0 0.04 1.26 4.34-3.06 6-0.57 0.22-1.11 0.32-1.61 0.32zm-4.33-2.96c0.44 0.64 2.67 3.6 5.84 2.4 3.75-1.44 3.09-4.88 2.92-5.56-3.92 0.6-8 2.74-8.76 3.16z")
            )
            addPath(
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero,
                pathData = addPathNodes(
                    "M47.84 14.11l-0.24-0.14c0.34-0.59 0.95-1.07 1.68-1.34 1.39-0.5 2.8-0.09 3.23 0.94l-0.25 0.1c-0.36-0.88-1.65-1.23-2.9-0.79-0.65 0.25-1.21 0.7-1.52 1.23zm-1.47-4.64h-0.08c-0.2-0.02-4.9-0.33-5.94-2.07-0.65-1.09-0.3-2.5 0.79-3.16 0.62-0.37 1.37-0.43 2.04-0.16 0.08-0.72 0.48-1.35 1.1-1.72 0.54-0.32 1.16-0.4 1.76-0.26 0.6 0.15 1.1 0.52 1.42 1.05 1.33 2.21-0.94 6.08-1.03 6.24l-0.06 0.08zM42.32 4.2c-0.36 0-0.72 0.1-1.04 0.3-0.96 0.57-1.28 1.82-0.7 2.78 0.9 1.5 5 1.87 5.64 1.92 0.3-0.54 2.14-3.98 0.99-5.89-0.28-0.47-0.72-0.8-1.25-0.93s-1.07-0.05-1.54 0.23c-0.6 0.36-0.97 1-1 1.7v0.21l-0.2-0.1c-0.27-0.15-0.6-0.22-0.9-0.22zm8.28 1.78l-0.06-0.05c-0.12-0.1-3-2.6-2.82-4.25 0.12-1.03 1.05-1.78 2.09-1.67 0.58 0.06 1.09 0.4 1.39 0.88 0.4-0.4 0.97-0.6 1.55-0.55 0.5 0.06 0.95 0.3 1.27 0.7 0.3 0.4 0.46 0.9 0.4 1.4L54.29 2.4l0.13 0.02c-0.23 2.1-3.6 3.47-3.74 3.53L50.6 5.98zm-1.01-5.72c-0.81 0-1.51 0.61-1.61 1.44-0.15 1.38 2.24 3.58 2.66 3.96 0.5-0.22 3.3-1.5 3.49-3.27 0.05-0.43-0.07-0.85-0.34-1.19-0.27-0.34-0.65-0.55-1.08-0.6-0.55-0.06-1.1 0.16-1.44 0.6l-0.13 0.17-0.1-0.19c-0.23-0.5-0.71-0.84-1.26-0.9-0.06-0.02-0.13-0.02-0.2-0.02zm37.4 104.56c-0.86 0-1.71-0.15-2.54-0.45-3.87-1.4-5.9-5.69-4.5-9.56 0.47-1.29 1.28-2.42 2.34-3.27l0.23 0.28c-1.01 0.81-1.77 1.9-2.21 3.11-1.33 3.7 0.59 7.77 4.27 9.1 1.79 0.64 3.72 0.56 5.43-0.25 1.72-0.8 3.02-2.23 3.66-4.02 0.39-1.07 0.5-2.18 0.37-3.3l0.36-0.05c0.15 1.18 0.02 2.35-0.4 3.47-0.67 1.88-2.04 3.38-3.84 4.23-1.01 0.47-2.1 0.71-3.17 0.71zm2.3-14.2c-0.35-0.12-0.72-0.2-1.08-0.28L88.27 90c0.38 0.07 0.77 0.17 1.14 0.3l-0.12 0.33z"
                )
            )
            addPath(
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero,
                pathData = addPathNodes("M86.5 102.82c-0.52 0-1.07-0.09-1.65-0.32-4.42-1.69-3.14-6.1-3.13-6.15l0.05-0.15 0.15 0.02c4.5 0.65 9.22 3.32 9.27 3.34l0.16 0.1-0.1 0.15c-0.02 0.05-1.85 3.01-4.75 3.01zm-4.48-6.2c-0.18 0.76-0.75 4.13 2.95 5.55 3.18 1.22 5.37-1.64 5.86-2.37-0.86-0.47-4.9-2.58-8.81-3.18z")
            )
            addPath(
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero,
                pathData = addPathNodes(
                    "M88.24 102.21c-0.31-0.53-0.87-0.97-1.54-1.22-1.23-0.44-2.52-0.1-2.88 0.78l-0.34-0.14c0.43-1.07 1.9-1.5 3.34-0.98 0.75 0.27 1.38 0.77 1.73 1.38l-0.31 0.18zm1.5-4.69l-0.06-0.1c-0.1-0.17-2.41-4.12-1.05-6.39 0.33-0.55 0.85-0.93 1.47-1.09 0.62-0.16 1.26-0.06 1.8 0.27 0.64 0.38 1.05 1.01 1.15 1.73 0.68-0.25 1.43-0.19 2.06 0.2 1.13 0.67 1.5 2.13 0.82 3.26-1.07 1.8-5.87 2.1-6.07 2.11l-0.12 0.01zm-0.8-6.29c-1.13 1.9 0.66 5.31 1 5.92 0.74-0.06 4.79-0.44 5.68-1.93 0.57-0.96 0.26-2.2-0.7-2.78-0.6-0.36-1.33-0.38-1.95-0.07L92.7 92.5l-0.01-0.29c-0.02-0.7-0.4-1.33-0.98-1.69-0.46-0.28-1.01-0.36-1.53-0.23-0.53 0.15-0.97 0.47-1.24 0.94zm-3.46 2.75l-0.1-0.04c-0.15-0.06-3.58-1.47-3.82-3.62-0.06-0.52 0.09-1.03 0.42-1.44 0.33-0.4 0.79-0.67 1.32-0.73 0.58-0.06 1.16 0.13 1.57 0.53 0.32-0.48 0.83-0.8 1.42-0.87 1.08-0.12 2.05 0.66 2.17 1.73 0.19 1.7-2.75 4.25-2.88 4.36l-0.1 0.08zM83.5 88.5l-0.18 0.01c-0.42 0.05-0.81 0.26-1.07 0.6-0.27 0.32-0.4 0.74-0.34 1.17 0.19 1.74 2.93 3.03 3.5 3.28 0.48-0.43 2.82-2.6 2.67-3.97-0.1-0.88-0.9-1.5-1.77-1.4-0.55 0.05-1.02 0.38-1.26 0.88l-0.13 0.26-0.18-0.22c-0.3-0.39-0.76-0.6-1.24-0.6z"
                )
            )
        }.build()
        return _zero!!
    }

private var _zero: ImageVector? = null

@Preview
@Composable
private fun ImagePreview() {
    Box {
        Image(
            imageVector = Illu.Cards.Zero,
            contentDescription = null,
        )
    }
}
