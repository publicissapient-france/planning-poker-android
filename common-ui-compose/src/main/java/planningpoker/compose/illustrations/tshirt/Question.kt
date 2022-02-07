package planningpoker.compose.illustrations.tshirt

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


public val Illu.Cards.Question: ImageVector
    @Composable get() {
        if (_question != null) {
            return _question!!
        }
        _question = Builder(
            name = "Question", defaultWidth = 133.0.dp, defaultHeight = 88.0.dp,
            viewportWidth = 133.0f, viewportHeight = 88.0f
        ).apply {
            addPath(
                pathData = addPathNodes("M27.11 66.12s9.62 12.62 27.32 14.47c17.69 1.85 34.18-6.86 47.74-13.6 13.57-6.74 18.68-19.36 12.83-30.55-5.85-11.19-17.93-8.45-31.69-17.07C69.57 10.76 67.29 6.62 50.75 6.02c-16.54-0.6-31.2 14.2-31.73 32.01-0.53 17.81 8.09 28.09 8.09 28.09z"),
                fill = SolidColor(MaterialTheme.colorScheme.secondaryContainer), fillAlpha = 0.7f
            )
            addPath(
                pathData = addPathNodes("M58.45 47.37V30.8c1.36 0.25 2.46 0.42 3.49 0.42 6.21 0 11.05-3.48 11.05-8.5 0-3.4-2.47-6.29-6.29-6.29-3.49 0-5.78 2.64-5.78 6.46H44C44 11.42 53.86 3 67.04 3c13.35 0 22.44 9.61 22.44 20.15 0 8.5-5.1 14.54-15.39 18.11v6.12H58.45v-0.01zm8.25 3.4c5.53 0 9.95 4.42 9.95 9.95 0 5.53-4.42 9.95-9.95 9.95-5.53 0-9.95-4.42-9.95-9.95 0-5.53 4.42-9.95 9.95-9.95z"),
                fill = SolidColor(Color(0xFF010202))
            )
            addPath(
                pathData = addPathNodes("M132.1 46.47c-0.21-0.9-1.01-1.51-1.9-1.52 0-0.18-0.02-0.35-0.08-0.54-0.09-0.29-0.26-0.56-0.46-0.79-0.52-0.59-1.3-0.86-2.05-1.12-0.79-0.28-1.59-0.6-2.23-1.15-1.2-1.06-0.78-2.64-1.61-3.87-0.6-0.88-1.25-1.01-2.03-0.94l-0.26-0.74c2.18-0.45 3.81-0.84 3.93-1.03 0.11-0.16 0.02-1.19-0.3-2.75l2.63-1.28c0.84-0.42-2.84-9.81-3.24-10.65-1.98-4.15-5.32-7.34-9.35-9.2-1.86-0.86-3.87-1.43-5.96-1.68-0.28-0.03-1.96 0.21-2.05 0.13l-3.71-3.15c-0.19-0.17-0.52-0.03-0.47 0.2l0.86 4.35c-3.4 1.79-5.49 4-5.49 4l1.4 1.82c0.98 1.28-1.45 8.67-1.45 8.67l3.7 3.31s2.47-0.55 2.37-1.82c-0.11-1.27 0.43-2.46 0.43-2.46l6.67-3 0.07 1.22-4.64 11.91c-0.07 0.17-0.04 0.37 0.07 0.52l2.13 2.86c0.12 0.16 0.32 0.24 0.52 0.21l3.67-0.64 0.13 0.96c-0.71 0.31-1.26 0.8-1.39 1.73-0.2 1.47 0.88 2.71 0.26 4.19-0.32 0.78-0.9 1.41-1.49 2.02-0.55 0.56-1.14 1.15-1.34 1.91-0.17 0.64-0.11 1.17 0.13 1.59-0.81 0.39-1.27 1.3-1.05 2.21l0.01 0.04c0.25 1.06 1.3 1.72 2.36 1.47l19.76-4.59c1.06-0.25 1.72-1.3 1.47-2.36l-0.02-0.04z"),
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = SolidColor(Color(0xFF010202)),
                strokeLineWidth = 0.25f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 10.0f, pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M113.27 37.35l8.21-1.55 0.26 0.74-8.41 1.08-0.06-0.27zm11.85-5.33c0.18-0.08-1.53-4.66-1.71-5.12-0.66-1.73-1.42-3.42-2.34-5.03-1.88-3.28-4.46-6.28-7.93-7.91-2.41-1.13-5.3-1.95-7.97-1.3 2.01-0.48 4.18-0.72 6.23-0.54 3.67 0.32 6.71 3.05 9.01 5.72 2.15 2.49 3.82 5.38 4.91 8.48 0.12 0.35 1.73 4.72 1.52 4.86l-1.72 0.84z"),
                fill = SolidColor(Color(0xFF8C8E90)), fillAlpha = 0.16f
            )
            addPath(
                pathData = addPathNodes("M103.69 75.92c0.05-0.07 0.1-0.16 0.13-0.25 0.05-0.15 0.06-0.32 0.04-0.48-0.04-0.41-0.3-0.77-0.53-1.11-0.25-0.36-0.5-0.74-0.6-1.17-0.1-0.44 0.38-3.05 0.85-5.36l1.22 0.51c0.25 0.1 0.52-0.12 0.45-0.38-0.15-0.61-0.39-1.17-0.7-1.65 1.02-0.31 1.89-1.05 2.33-2.11 0.78-1.88-0.11-4.04-1.99-4.82-1.88-0.78-4.04 0.11-4.82 1.99-0.44 1.06-0.35 2.2 0.14 3.14-0.56 0.12-1.12 0.35-1.66 0.67-0.23 0.14-0.21 0.48 0.04 0.59l1.15 0.48c-1.27 1.95-2.72 4.11-3.1 4.34-0.38 0.23-0.82 0.33-1.26 0.4-0.41 0.07-0.84 0.14-1.16 0.4-0.27 0.22-0.4 0.46-0.43 0.72-0.47-0.08-0.94 0.17-1.13 0.62l-0.01 0.02c-0.22 0.53 0.03 1.13 0.56 1.35l9.45 3.92c0.53 0.22 1.13-0.03 1.35-0.56l0.01-0.02c0.21-0.45 0.05-0.96-0.33-1.24z"),
                fill = SolidColor(MaterialTheme.colorScheme.primary),
                stroke = SolidColor(Color(0xFF010202)),
                strokeLineWidth = 0.25f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 10.0f,
                pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M100.34 64.3s1.52 2.21 4.11 1.69c-0.46 0.27-2.8 1.51-4.11-1.69zm-0.53 1.61l3.6 2.31 0.16-0.79-3.76-1.52z"),
                fill = SolidColor(Color(0xFF8C8E90)), fillAlpha = 0.16f
            )
            addPath(
                pathData = addPathNodes("M55.12 85.06c0 1.56-12.35 2.81-27.56 2.81C12.35 87.87 0 86.61 0 85.06s12.35-2.8 27.56-2.8c15.21 0 27.56 1.25 27.56 2.8z"),
                fill = SolidColor(Color(0xFF1C6B9A))
            )
            addPath(
                pathData = addPathNodes("M29.3 81.01c0.05-0.19 0.07-0.39 0.06-0.61-0.02-0.34-0.14-0.67-0.3-0.97-0.41-0.78-1.2-1.27-1.94-1.75-0.79-0.51-1.58-1.07-2.13-1.83-0.48-0.68-2.1-13.05-2.45-19.31h3.06v-1.77h1.71l0.63-9.75h-4.27l-0.64 2.91h-2.34v-2.91h-5.68v2.91h-2.33l-0.64-2.91H7.33l1.07 9.75h1.71v1.77h3.2c-0.49 6.32-1.9 18.34-2.39 19.01-0.56 0.76-1.36 1.3-2.15 1.8-0.75 0.47-1.54 0.95-1.96 1.72-0.36 0.65-0.43 1.24-0.28 1.76-0.98 0.21-1.72 1.08-1.73 2.12v0.04c0 1.22 0.98 2.21 2.2 2.22l21.76 0.17c1.22 0.01 2.21-0.96 2.22-2.18v-0.04c0-1.04-0.71-1.91-1.68-2.15z"),
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = SolidColor(Color(0xFF010202)),
                strokeLineWidth = 0.25f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 10.0f, pathFillType = NonZero
            )
            addPath(
                pathData = addPathNodes("M13.34 56.55l9.31 1.46-0.1-1.47-9.21 0.01z"),
                fill = SolidColor(Color(0xFF8C8E90)), fillAlpha = 0.16f,
            )
            addPath(
                pathData = addPathNodes("M41.74 47.88l-0.76 1.4c-0.1 0.17-0.45 1.1-0.35 1.32 0.11 0.22 0.21 0.35 0.42 0.38 0.21 0.03 0.38 0.42 0.73 0.49 0.22 0.04 0.44 0.07 0.66 0.07 0.11 0.08 0.25 0.11 0.38 0.07 0.21-0.07 0.38-0.17 0.52-0.76 0.08-0.29 0.11-0.6 0.07-0.9l-0.06-1.19-1.61-0.88z"),
                fill = SolidColor(Color(0xFFFFFFFF))
            )
            addPath(
                pathData = addPathNodes("M42.7 51.74c-0.1 0-0.21-0.03-0.3-0.09-0.22-0.01-0.43-0.03-0.65-0.07-0.2-0.05-0.38-0.17-0.51-0.32-0.06-0.07-0.14-0.13-0.22-0.16-0.23-0.05-0.42-0.22-0.5-0.44-0.14-0.28 0.27-1.3 0.35-1.42l0.76-1.4c0.01-0.03 0.04-0.04 0.07-0.05h0.08l1.61 0.87c0.03 0.02 0.06 0.05 0.06 0.09l0.06 1.19c0.04 0.31 0.02 0.63-0.07 0.93-0.14 0.59-0.32 0.75-0.59 0.84l-0.15 0.03zm-0.91-3.71l-0.71 1.31c-0.12 0.2-0.41 1.08-0.34 1.21 0.11 0.22 0.19 0.3 0.34 0.32 0.13 0.04 0.25 0.12 0.33 0.22 0.1 0.13 0.24 0.22 0.4 0.26 0.21 0.04 0.42 0.06 0.64 0.07l0.07 0.02c0.08 0.06 0.18 0.08 0.28 0.05 0.15-0.05 0.31-0.1 0.44-0.68 0.08-0.28 0.1-0.57 0.07-0.86l-0.06-1.15-1.46-0.77z"),
                fill = SolidColor(Color(0xFF010202))
            )
            addPath(
                pathData = addPathNodes("M45.56 81.01s-0.94 1.53-0.94 1.9c0 0.37 1.3 1.05 1.85 1.3 0.56 0.25 1.54 0.44 2.35 0.56 0.8 0.11 2.47 0.44 1.98-0.19-0.49-0.63-3.47-2.28-3.59-2.47-0.15-0.18-0.32-0.35-0.51-0.5l-1.14-0.6z"),
                fill = SolidColor(Color(0xFFFFFFFF))
            )
            addPath(
                pathData = addPathNodes("M50.4 85.06c-0.47-0.02-0.94-0.07-1.4-0.16l-0.2-0.03c-1.12-0.17-1.92-0.36-2.37-0.56-0.08-0.04-1.92-0.86-1.92-1.4 0-0.39 0.86-1.8 0.96-1.96 0.03-0.05 0.09-0.07 0.15-0.04l1.14 0.6c0.2 0.16 0.39 0.34 0.55 0.54 0.05 0.06 0.54 0.37 1.01 0.66 1 0.62 2.24 1.4 2.57 1.8 0.12 0.15 0.15 0.27 0.08 0.37-0.07 0.11-0.26 0.18-0.57 0.18zm-4.8-3.9c-0.36 0.59-0.87 1.52-0.87 1.76s0.94 0.82 1.79 1.2c0.44 0.19 1.22 0.38 2.32 0.55l0.2 0.03c0.41 0.06 1.64 0.26 1.74 0.09 0 0 0-0.04-0.07-0.13-0.3-0.37-1.58-1.17-2.51-1.76-0.75-0.47-1.02-0.64-1.08-0.72-0.15-0.17-0.31-0.33-0.49-0.47l-1.03-0.55z"),
                fill = SolidColor(Color(0xFF010202))
            )
            addPath(
                pathData = addPathNodes("M47.04 83.42l0.33 0.49c0.36 0.54 0.84 0.98 1.41 1.29 0.88 0.48 2.24 1.02 3.43 0.69 1.94-0.54-2.95-3.49-2.95-3.49s-1.75 1.23-2.22 1.02z"),
                fill = SolidColor(Color(0xFFFFFFFF))
            )
            addPath(
                pathData = addPathNodes("M51.43 86.11c-0.98 0-1.98-0.41-2.71-0.81-0.58-0.32-1.08-0.77-1.45-1.32l-0.33-0.5c-0.03-0.04-0.03-0.09 0-0.13 0.03-0.04 0.08-0.05 0.13-0.03 0.28 0.12 1.4-0.51 2.11-1 0.04-0.02 0.08-0.02 0.12 0 0.37 0.22 3.6 2.2 3.46 3.21-0.03 0.22-0.22 0.39-0.53 0.48-0.26 0.07-0.53 0.11-0.8 0.1zm-4.17-2.56l0.21 0.31c0.35 0.52 0.82 0.95 1.37 1.25 0.9 0.49 2.2 1 3.35 0.69 0.34-0.1 0.37-0.25 0.37-0.3 0.1-0.72-2.29-2.34-3.29-2.95-0.36 0.23-1.42 0.93-2.01 1z"),
                fill = SolidColor(Color(0xFF010202))
            )
            addPath(
                pathData = addPathNodes("M47.6 83.66c0.54 0.81 1.35 1.4 2.28 1.66 1.6 0.46 2.06 0.34 2.4-0.11"),
                fill = SolidColor(Color(0xFFFFFFFF))
            )
            addPath(
                pathData = addPathNodes("M51.41 85.71c-0.53-0.03-1.05-0.13-1.55-0.3-0.97-0.26-1.8-0.87-2.35-1.71-0.03-0.05-0.01-0.12 0.04-0.15s0.12-0.01 0.15 0.04c0.52 0.78 1.31 1.35 2.22 1.61 1.56 0.44 1.98 0.33 2.28-0.07 0.04-0.05 0.11-0.06 0.15-0.02 0.05 0.04 0.06 0.11 0.02 0.15-0.22 0.31-0.58 0.48-0.96 0.45z"),
                fill = SolidColor(Color(0xFF010202))
            )
            addPath(
                pathData = addPathNodes("M44.74 82.63s1.76 1.26 2.63 1.29z"),
                fill = SolidColor(Color(0xFFFFFFFF))
            )
            addPath(
                pathData = addPathNodes("M47.36 84.03c-0.88-0.02-2.61-1.26-2.69-1.31-0.05-0.04-0.06-0.1-0.02-0.15 0.03-0.05 0.1-0.06 0.15-0.03 0.02 0.01 1.75 1.25 2.56 1.27 0.06 0 0.11 0.05 0.11 0.11s-0.05 0.11-0.11 0.11zM40.91 48.3s1.57 2.6 1.9 3.2c0.33 0.6 4.56 5.43 6.24 9.59 1.68 4.16 3.29 7.91 3.22 9.12-0.07 1.21-5.57 11.4-5.57 11.4l-1.14-0.6s1.74-9.59 1.54-10.6c-0.2-1.01-6.36-11-6.36-11s-2.88-2.01-4.09-4.36"),
                fill = SolidColor(Color(0xFF010202))
            )
            addPath(
                pathData = addPathNodes("M41.14 54.79s-0.87 1.88-0.87 2.15 4.89 14.69 6.3 17.97c0.89 2.1 1.67 4.25 2.35 6.44 0 0 0.54 0.66 0.13 1.34-0.4 0.68-2.01 1.14-2.35 0.54-0.34-0.6-3.62-3.75-5.03-6.91-1.41-3.16-3.42-8.52-4.56-10.53-1.5-2.57-2.85-5.24-4.02-7.98-1.48-3.49-3-7.27-3-7.27 1.99 0.17 4-0.06 5.9-0.66 3.09-1.01 4.41-2.93 4.41-2.93s0.78 2.01 0.99 2.39"),
                fill = SolidColor(Color(0xFF010202))
            )
            addPath(
                pathData = addPathNodes("M41.6 60.45c-0.03 0-0.06-0.02-0.07-0.05l-1.54-4.01c-0.01-0.03 0-0.06 0.02-0.09l1.73-1.48c0.03-0.03 0.08-0.03 0.11 0s0.03 0.08 0 0.11l-1.69 1.45 1.52 3.97c0.02 0.04 0 0.08-0.04 0.1H41.6z"),
                fill = SolidColor(Color(0xFFFFFFFF))
            )
            addPath(
                pathData = addPathNodes("M40.05 56.44L40 56.42c-0.02-0.01-0.02-0.03-0.02-0.06 0-0.01 0-1.22-0.54-1.98l-0.33-0.48c-0.28-0.4-0.37-0.52-0.42-0.72-0.03-0.23-0.03-0.47 0-0.71 0.01-0.04 0.05-0.07 0.09-0.06 0.04 0.01 0.07 0.04 0.06 0.08-0.03 0.22-0.03 0.43 0 0.65 0.04 0.17 0.12 0.28 0.4 0.67l0.33 0.48c0.49 0.7 0.56 1.71 0.57 2l3.13-0.12c0.04 0 0.08 0.03 0.08 0.07 0 0.04-0.03 0.07-0.07 0.08l-3.23 0.12zm10.5 14.27c-1.4 0-3.17-0.9-3.25-0.94-0.04-0.02-0.05-0.06-0.03-0.1 0.02-0.04 0.06-0.05 0.1-0.03 0.02 0.01 2.04 1.04 3.42 0.92 0.04 0 0.08 0.03 0.08 0.07 0 0.04-0.03 0.08-0.07 0.08h-0.25zm-0.19 1.16h-0.02c-1.24-0.31-2.63-1.45-2.69-1.5-0.03-0.03-0.03-0.08 0-0.11s0.07-0.04 0.11-0.01c0.01 0.01 1.42 1.17 2.63 1.47 0.04 0.01 0.06 0.05 0.05 0.09 0 0.05-0.04 0.07-0.08 0.06z"),
                fill = SolidColor(Color(0xFFFFFFFF))
            )
            addPath(
                pathData = addPathNodes("M39.99 55.26c-0.02 0-0.05-0.01-0.06-0.03-0.02-0.03-0.02-0.08 0.02-0.1 0.3-0.21 0.77-0.61 0.77-0.8 0-0.13-0.16-0.28-0.33-0.44-0.19-0.16-0.35-0.35-0.46-0.57-0.11-0.26-0.52-1.29-0.44-1.54 0.01-0.04 0.05-0.06 0.09-0.05 0.04 0.01 0.06 0.06 0.05 0.1-0.05 0.13 0.19 0.88 0.43 1.43 0.11 0.2 0.25 0.38 0.43 0.52 0.21 0.2 0.38 0.36 0.38 0.56 0 0.34-0.75 0.87-0.84 0.93l-0.04-0.01zm-7.35 0.44c-0.04 0-0.08-0.03-0.08-0.07 0-0.02 0.01-0.05 0.03-0.06l0.62-0.49c0.59-0.47 0.96-1.68 0.96-1.69 0.01-0.04 0.05-0.06 0.09-0.05 0.04 0.01 0.06 0.05 0.05 0.09-0.02 0.05-0.39 1.26-1.01 1.76l-0.62 0.49-0.04 0.02z"),
                fill = SolidColor(Color(0xFFFFFFFF))
            )
            addPath(
                pathData = addPathNodes("M47.3 83.52l-0.06-0.03c-0.79-0.97-1.5-2-2.13-3.07-0.85-1.53-3.31-5.7-3.33-5.73-0.23-0.5-0.4-1.03-0.5-1.57l-0.04-0.22c-0.08-0.56-0.12-0.78-0.86-1.26s-0.78-1.31-0.85-2.19l-0.05-0.64c-0.1-0.88-2.44-4.85-4.15-7.73l-1.03-1.74c-1.53-2.63-2.59-6.09-2.6-6.13-0.01-0.04 0.01-0.08 0.05-0.09 0.04-0.01 0.08 0.01 0.09 0.05 0.01 0.04 1.06 3.48 2.59 6.1l1.03 1.74c1.72 2.9 4.07 6.87 4.17 7.79l0.06 0.65c0.06 0.88 0.11 1.65 0.78 2.08 0.8 0.51 0.84 0.78 0.92 1.36 0 0.07 0.02 0.15 0.04 0.23 0.1 0.52 0.27 1.04 0.49 1.52 0.02 0.04 2.48 4.21 3.33 5.73 0.63 1.07 1.33 2.09 2.12 3.05 0.03 0.03 0.02 0.08-0.01 0.11l-0.06-0.01z"),
                fill = SolidColor(Color(0xFFFFFFFF))
            )
            addPath(
                pathData = addPathNodes("M30.1 50.54s0.14 1.56 0.76 2.05c0.62 0.49 2.47 0.93 5 0.44 2.53-0.49 5.31-2.65 5.56-3.4s-1.01-2.69-1.01-2.69-1.46 2.07-5.53 2.75c-4.07 0.68-4.78 0.85-4.78 0.85z"),
                fill = SolidColor(Color(0xFF1C6B9A))
            )
            addPath(
                pathData = addPathNodes("M33.71 53.36c-1.49 0-2.52-0.35-2.93-0.67-0.65-0.52-0.79-2.06-0.8-2.13 0-0.05 0.03-0.1 0.08-0.12 0.03 0 0.75-0.18 4.78-0.85 3.97-0.66 5.45-2.69 5.46-2.71 0.02-0.03 0.05-0.05 0.09-0.05 0.04 0 0.07 0.02 0.09 0.05 0.13 0.2 1.28 2.02 1.02 2.78-0.27 0.81-3.11 2.97-5.64 3.47-0.7 0.15-1.42 0.22-2.15 0.23zm-3.49-2.73c0.04 0.34 0.22 1.49 0.71 1.88 0.55 0.44 2.32 0.92 4.91 0.41 2.55-0.5 5.25-2.66 5.47-3.32 0.17-0.52-0.54-1.85-0.92-2.46-0.39 0.47-1.97 2.08-5.51 2.67-3.27 0.54-4.37 0.75-4.66 0.82z"),
                fill = SolidColor(Color(0xFF010202))
            )
            addPath(
                pathData = addPathNodes("M46.37 35.41c-1.01-0.66-8.85-6.77-9.59-7.04-0.74-0.27-2.2 0-2.2 0s-4.55 0.56-5.5 0.94c-0.09 0.04-2.14 1.21-2.2 1.27-0.74 0.6-3.97 2.09-4.84 3.97-0.99 2.13 7.68 14.92 8.08 15.99 0.4 1.07 2.52 1.34 4.46 1.07s3.65-0.66 5.06-2.27c0.26-0.32 0.47-0.67 0.64-1.05 0.2-0.42 0.25-0.89 0.15-1.34-0.5-2.09-1.79-8.13-2.63-12.13 1.41 0.91 4.35 2.76 6.05 3.41 2.28 0.88 4.02 0.27 4.02-0.47-0.01-0.74-0.5-1.68-1.5-2.35z"),
                fill = SolidColor(MaterialTheme.colorScheme.primary)
            )
            addPath(
                pathData = addPathNodes(
                    "M33.15 51.82c-1.49 0-2.82-0.35-3.16-1.24-0.1-0.26-0.75-1.32-1.58-2.66-3.51-5.7-7.2-11.91-6.5-13.42 0.66-1.43 2.62-2.61 3.91-3.39 0.33-0.19 0.65-0.39 0.95-0.62 0.08-0.06 2.13-1.25 2.24-1.29 0.96-0.39 5.34-0.92 5.53-0.95 0.06-0.01 1.51-0.27 2.26 0 0.49 0.18 3.84 2.72 6.54 4.76 1.46 1.1 2.72 2.06 3.08 2.3 1.12 0.75 1.53 1.75 1.53 2.44-0.02 0.26-0.16 0.49-0.39 0.62-0.65 0.44-2.07 0.61-3.79-0.05-1.2-0.46-3.22-1.59-5.85-3.28 0.88 4.2 2.09 9.86 2.58 11.87 0.11 0.48 0.06 0.98-0.15 1.42-0.17 0.38-0.39 0.75-0.66 1.07-1.47 1.68-3.27 2.05-5.13 2.31-0.46 0.07-0.94 0.1-1.41 0.11zm2.73-23.46c-0.43 0.01-0.87 0.05-1.29 0.12-0.05 0-4.55 0.56-5.48 0.93-0.12 0.06-2.09 1.19-2.19 1.26-0.31 0.23-0.64 0.44-0.98 0.63-1.27 0.77-3.19 1.93-3.82 3.31-0.71 1.54 3.97 9.13 6.48 13.21 0.9 1.46 1.49 2.43 1.6 2.7 0.39 1.04 2.52 1.25 4.34 0.99 1.82-0.25 3.57-0.61 4.99-2.24 0.25-0.31 0.46-0.66 0.62-1.02 0.19-0.4 0.24-0.84 0.14-1.27-0.49-2.05-1.74-7.91-2.63-12.13-0.01-0.04 0.01-0.09 0.05-0.11 0.04-0.02 0.08-0.02 0.12 0 2.73 1.76 4.82 2.94 6.03 3.4 1.63 0.62 3 0.48 3.58 0.07 0.16-0.09 0.27-0.26 0.29-0.44 0-0.63-0.37-1.55-1.43-2.26-0.36-0.24-1.62-1.2-3.09-2.3-2.54-1.92-6.02-4.56-6.48-4.73-0.27-0.08-0.56-0.13-0.85-0.12z"
                ),
                fill = SolidColor(Color(0xFF010202))
            )
            addPath(
                pathData = addPathNodes("M23.09 33.18s-0.8 0.88-1.12 1.29c-1.68 2.16-7.03 9.08-7.09 9.63-0.06 0.56 0.19 0.93 1.5 1.44 1.31 0.5 10.05-8.26 10.05-8.26"),
                fill = SolidColor(MaterialTheme.colorScheme.primary)
            )
            addPath(
                pathData = addPathNodes("M16.49 45.66l-0.15-0.02c-1.22-0.47-1.64-0.88-1.57-1.54 0.06-0.55 4.48-6.31 7.11-9.69 0.31-0.4 1.09-1.26 1.12-1.29 0.04-0.05 0.11-0.06 0.15-0.02 0.05 0.04 0.06 0.11 0.02 0.15l-0.01 0.01s-0.81 0.88-1.11 1.28c-4.25 5.46-7.02 9.22-7.06 9.58-0.05 0.47 0.17 0.84 1.43 1.32 0.91 0.35 6.44-4.74 9.94-8.24 0.04-0.04 0.11-0.04 0.16 0 0.04 0.04 0.04 0.11 0 0.16-0.87 0.86-8.34 8.3-10.03 8.3z"),
                fill = SolidColor(Color(0xFF010202))
            )
            addPath(
                pathData = addPathNodes("M40.79 32.77l-3.03 2.04c0.44-0.06 2.53-0.8 2.53-0.8"),
                fill = SolidColor(MaterialTheme.colorScheme.primary)
            )
            addPath(
                pathData = addPathNodes("M37.77 34.92c-0.05 0-0.09-0.03-0.1-0.07-0.02-0.05 0-0.1 0.04-0.13l3.03-2.04c0.05-0.03 0.12-0.02 0.15 0.03s0.02 0.12-0.03 0.15l-2.48 1.67c0.76-0.23 1.87-0.63 1.89-0.63 0.06-0.02 0.13 0.01 0.15 0.07 0.02 0.06-0.01 0.13-0.07 0.15-0.09 0.03-2.11 0.75-2.55 0.81l-0.03-0.01zm2.9-0.86c-0.05 0-0.1-0.04-0.11-0.09-0.01-0.06 0.03-0.12 0.09-0.13l0.68-0.12c0.06-0.01 0.12 0.03 0.13 0.09 0.01 0.06-0.03 0.12-0.09 0.13l-0.68 0.12h-0.02z"),
                fill = SolidColor(Color(0xFF010202))
            )
            addPath(
                pathData = addPathNodes("M18.26 41.96c-0.47-0.01-0.93 0.07-1.36 0.26z"),
                fill = SolidColor(Color(0xFFFFFFFF))
            )
            addPath(
                pathData = addPathNodes("M16.9 42.33c-0.06 0.01-0.12-0.03-0.13-0.09-0.01-0.06 0.03-0.12 0.09-0.13 0.45-0.19 0.93-0.28 1.41-0.27 0.06 0 0.11 0.06 0.1 0.12-0.01 0.06-0.06 0.11-0.12 0.1-0.45-0.01-0.89 0.07-1.31 0.25l-0.04 0.02z"),
                fill = SolidColor(Color(0xFF010202))
            )
            addPath(
                pathData = addPathNodes("M24.85 38.93s1.7-0.52 2.15-0.87z"),
                fill = SolidColor(Color(0xFFFFFFFF))
            )
            addPath(
                pathData = addPathNodes("M24.85 39.04c-0.06 0.01-0.12-0.03-0.13-0.09-0.01-0.06 0.03-0.12 0.09-0.13 0.02 0 1.68-0.52 2.11-0.85 0.05-0.04 0.12-0.03 0.15 0.02 0.04 0.05 0.03 0.12-0.02 0.15-0.46 0.35-2.11 0.86-2.19 0.88 0.01 0.02 0 0.02-0.01 0.02z"),
                fill = SolidColor(Color(0xFF010202))
            )
            addPath(
                pathData = addPathNodes("M27.42 37.9s0.28-0.24 0.38-0.24z"),
                fill = SolidColor(Color(0xFFFFFFFF))
            )
            addPath(
                pathData = addPathNodes("M27.42 38.01c-0.03 0-0.06-0.01-0.08-0.04-0.04-0.04-0.04-0.11 0-0.16 0.12-0.13 0.28-0.22 0.45-0.27 0.06 0 0.11 0.05 0.11 0.11s-0.05 0.11-0.11 0.11c-0.11 0.06-0.22 0.13-0.31 0.22l-0.06 0.03zm10.35-3.09c-0.06 0-0.1-0.04-0.11-0.1l-0.28-2.83c-0.01-0.06 0.04-0.12 0.1-0.12 0.06-0.01 0.12 0.04 0.12 0.1l0.28 2.84c0.01 0.06-0.04 0.11-0.1 0.12h-0.01v-0.01z"),
                fill = SolidColor(Color(0xFF010202))
            )
            addPath(
                pathData = addPathNodes("M14.88 44.13s-0.39 1.49 2.11 2.11l9.05 2.2s0.7-1.51 0.3-1.51c-0.4 0-7.65-4.82-7.65-4.82"),
                fill = SolidColor(MaterialTheme.colorScheme.primary)
            )
            addPath(
                pathData = addPathNodes("M26.05 48.57h-0.03l-9.05-2.2c-0.99-0.24-1.66-0.66-2-1.21-0.19-0.31-0.26-0.68-0.19-1.03 0.02-0.06 0.08-0.09 0.13-0.08 0.06 0.02 0.09 0.08 0.08 0.13-0.05 0.3 0.01 0.61 0.18 0.87 0.3 0.51 0.93 0.88 1.86 1.1 1.1 0.28 8.1 1.98 8.96 2.19 0.27-0.6 0.44-1.18 0.36-1.27-0.42 0-6.49-4.03-7.71-4.85-0.05-0.03-0.06-0.1-0.03-0.15 0.03-0.05 0.1-0.06 0.15-0.03 2.86 1.9 7.23 4.75 7.59 4.81 0.07 0 0.14 0.04 0.18 0.1 0.18 0.29-0.25 1.27-0.39 1.57-0.01 0.03-0.05 0.05-0.09 0.05z"),
                fill = SolidColor(Color(0xFF010202))
            )
            addPath(
                pathData = addPathNodes("M26.35 46.94s2.58 1.21 2.78 1.54c0.2 0.33 0.66 2.08 0.66 2.61 0 0.54-0.07 0.54-0.4 0.54s-1.21-1.27-1.41-1.54c-0.2-0.27-0.66-0.27-1.27-0.66-0.35-0.22-0.58-0.57-0.66-0.97l0.3-1.52z"),
                fill = SolidColor(Color(0xFFFFFFFF))
            )
            addPath(
                pathData = addPathNodes("M29.4 51.75c-0.29 0-0.77-0.58-1.39-1.44l-0.11-0.15c-0.13-0.13-0.28-0.21-0.46-0.26-0.28-0.1-0.54-0.23-0.79-0.39-0.37-0.24-0.64-0.62-0.72-1.05v-0.03l0.3-1.51c0.01-0.03 0.03-0.06 0.06-0.08 0.03-0.02 0.07-0.02 0.1 0 0.44 0.2 2.62 1.24 2.83 1.59 0.21 0.35 0.69 2.12 0.69 2.67 0 0.55-0.1 0.65-0.51 0.65zm-3.24-3.3c0.08 0.37 0.3 0.68 0.62 0.88 0.23 0.15 0.48 0.27 0.75 0.37 0.21 0.06 0.4 0.17 0.55 0.33l0.11 0.15c0.81 1.12 1.1 1.35 1.21 1.35 0.29 0 0.29 0 0.29-0.43 0-0.52-0.46-2.23-0.66-2.56-0.13-0.22-1.62-0.97-2.61-1.44l-0.26 1.35zm-0.91-0.15h-0.03c-0.06-0.02-0.09-0.08-0.07-0.13l0.4-1.25c0.02-0.06 0.08-0.09 0.14-0.08 0.06 0.02 0.09 0.08 0.08 0.14v0.01l-0.4 1.25c-0.03 0.04-0.07 0.06-0.12 0.06z"),
                fill = SolidColor(Color(0xFF010202))
            )
            addPath(
                pathData = addPathNodes("M44.83 37.55s-0.66 2.28-0.94 3.62c-0.28 1.34-2.15 6.71-2.15 6.71l1.61 1.01s3.55-7.36 4.23-8.98c0.68-1.62 0.47-2.82-0.2-3.49"),
                fill = SolidColor(MaterialTheme.colorScheme.primary)
            )
            addPath(
                pathData = addPathNodes("M43.35 49l-0.06-0.02-1.61-1.01c-0.04-0.03-0.06-0.08-0.05-0.13 0.02-0.05 1.88-5.37 2.14-6.69 0.26-1.32 0.94-3.61 0.94-3.63 0.02-0.06 0.08-0.1 0.14-0.08 0.06 0.02 0.1 0.08 0.08 0.14 0 0.02-0.67 2.29-0.94 3.61-0.25 1.26-1.87 5.93-2.12 6.64l1.43 0.89c0.44-0.93 3.55-7.39 4.17-8.87 0.6-1.43 0.53-2.65-0.18-3.37-0.04-0.04-0.04-0.11 0-0.15 0.04-0.04 0.11-0.04 0.15 0 0.78 0.77 0.86 2.09 0.22 3.61-0.66 1.59-4.19 8.92-4.23 8.99-0.01 0.03-0.04 0.05-0.07 0.06L43.35 49z"),
                fill = SolidColor(Color(0xFF010202))
            )
            addPath(
                pathData = addPathNodes("M42.05 47.11c0.12 0 1.65 0.84 1.65 0.84z"),
                fill = SolidColor(Color(0xFF010202))
            )
            addPath(
                pathData = addPathNodes("M31.47 35c-0.37-0.06-2.35-1.36-3.71-2.41-1.36-1.05-2.1-1.23-2.1-1.23l-0.93 0.62c-0.14-0.45-0.1-0.94 0.12-1.36 0.37-0.68 1.67-1.36 2.96-1.85 1.3-0.49 2.78-0.92 3.71-0.92 0.93 0 1.17 0.37 1.17 0.86s0 2.04-0.31 3.21C32.09 33.09 31.47 35 31.47 35z"),
                fill = SolidColor(Color(0xFF1C6B9A))
            )
            addPath(
                pathData = addPathNodes("M31.47 35.11h-0.02c-0.41-0.07-2.44-1.42-3.75-2.43-1.14-0.88-1.84-1.14-2.02-1.2l-0.88 0.59c-0.03 0.02-0.06 0.02-0.1 0.01-0.03-0.01-0.06-0.04-0.07-0.07-0.15-0.48-0.11-1 0.13-1.45 0.44-0.82 2.09-1.54 3.02-1.9 0.74-0.28 2.58-0.93 3.75-0.93 0.86 0 1.28 0.32 1.28 0.97 0 0.51 0 2.05-0.31 3.24-0.31 1.19-0.92 3.07-0.93 3.09 0 0.05-0.05 0.08-0.1 0.08zm-5.8-3.87h0.03c0.03 0 0.78 0.2 2.14 1.25 1.28 0.99 3.06 2.16 3.57 2.36 0.13-0.41 0.63-1.98 0.88-2.98 0.31-1.16 0.31-2.68 0.31-3.18 0-0.37-0.13-0.75-1.06-0.75-0.8 0-2.13 0.34-3.67 0.92-1.53 0.58-2.6 1.24-2.91 1.8-0.18 0.35-0.24 0.75-0.15 1.13l0.8-0.53 0.06-0.02z"),
                fill = SolidColor(Color(0xFF010202))
            )
            addPath(
                pathData = addPathNodes("M25.97 27.16c0.72 0.8 1.23 1.77 1.48 2.82 0.4 1.74 2.92 3.79 3.53 3.79 0.61 0 0.56-2.99 0.36-3.86-0.2-0.87-1.01-3.22-1.01-3.22s-3.21-1.54-4.36 0.47z"),
                fill = SolidColor(Color(0xFFFFFFFF))
            )
            addPath(
                pathData = addPathNodes("M30.99 33.88c-0.65 0-3.23-2.11-3.64-3.88-0.24-1.03-0.74-1.98-1.45-2.76-0.03-0.04-0.04-0.09-0.02-0.13 1.18-2.08 4.47-0.53 4.5-0.51 0.03 0.01 0.05 0.04 0.06 0.06 0.03 0.09 0.81 2.36 1.01 3.23 0.17 0.76 0.26 3.27-0.21 3.85-0.05 0.09-0.15 0.14-0.25 0.14zm-4.87-6.74c0.71 0.8 1.2 1.77 1.44 2.81 0.4 1.73 2.91 3.71 3.42 3.71 0 0 0.04 0 0.09-0.06 0.37-0.47 0.35-2.87 0.17-3.67-0.18-0.8-0.88-2.83-0.99-3.16-0.37-0.16-3.09-1.3-4.13 0.37z"),
                fill = SolidColor(Color(0xFF010202))
            )
            addPath(
                pathData = addPathNodes("M25.97 27.16c0.72 0.8 1.23 1.77 1.48 2.82 0.4 1.74 2.92 3.79 3.53 3.79 0.61 0 0.56-2.99 0.36-3.86-0.2-0.87-1.01-3.22-1.01-3.22s-3.21-1.54-4.36 0.47z"),
                fill = SolidColor(Color(0xFFFFFFFF))
            )
            addPath(
                pathData = addPathNodes("M30.99 33.88c-0.65 0-3.23-2.11-3.64-3.88-0.24-1.03-0.74-1.98-1.45-2.76-0.03-0.04-0.04-0.09-0.02-0.13 1.18-2.08 4.47-0.53 4.5-0.51 0.03 0.01 0.05 0.04 0.06 0.06 0.03 0.09 0.81 2.36 1.01 3.23 0.17 0.76 0.26 3.27-0.21 3.85-0.05 0.09-0.15 0.14-0.25 0.14zm-4.87-6.74c0.71 0.8 1.2 1.77 1.44 2.81 0.4 1.73 2.91 3.71 3.42 3.71 0 0 0.04 0 0.09-0.06 0.37-0.47 0.35-2.87 0.17-3.67-0.18-0.8-0.88-2.83-0.99-3.16-0.37-0.16-3.09-1.3-4.13 0.37z"),
                fill = SolidColor(Color(0xFF010202))
            )
            addPath(
                pathData = addPathNodes("M23.86 23.93c0.47 1.29 1.06 2.53 1.75 3.71 1.02 1.67 2.99 2.62 4.08 2.19 1.09-0.44 1.83-1.85 1.54-4.03-0.06-0.48-0.48-0.68-0.62-1.1-0.48-1.54-0.97-3.03-1.14-3.6-0.22-0.73-1.97-1.46-3.79-0.95s-2.12 2.03-1.82 3.78z"),
                fill = SolidColor(Color(0xFFFFFFFF))
            )
            addPath(
                pathData = addPathNodes("M29.9 22.59s-0.66 0.49-2.15 0.21c-1.49-0.28-2.51-0.22-2.45 0.17 0.06 0.39 0.17 0.91 0.17 0.91s-1.78-1.54-0.17-1.95c1.16-0.3 1.84 0.16 2.12 0.22l2.48 0.44z"),
                fill = SolidColor(Color(0xFFEABECE)), fillAlpha = 0.7f
            )
            addPath(
                pathData = addPathNodes("M29.9 22.59s-0.66 0.49-2.15 0.21c-1.49-0.28-2.51-0.22-2.45 0.17 0.06 0.39 0.17 0.91 0.17 0.91s-1.78-1.54-0.17-1.95c1.16-0.3 1.84 0.16 2.12 0.22l2.48 0.44z"),
                fill = SolidColor(Color(0xFFFFFFFF)), fillAlpha = 0.5f
            )
            addPath(
                pathData = addPathNodes("M29.07 30.05c-1.18 0-2.73-0.97-3.56-2.35-0.7-1.19-1.29-2.44-1.76-3.74v-0.02c-0.36-2.17 0.26-3.45 1.9-3.91 1.9-0.53 3.69 0.25 3.92 1.02 0.08 0.27 0.22 0.73 0.42 1.32l0.73 2.28c0.06 0.16 0.16 0.31 0.28 0.44 0.18 0.19 0.3 0.42 0.34 0.68 0.33 2.45-0.62 3.75-1.61 4.15-0.22 0.09-0.44 0.13-0.66 0.13zm-5.11-6.15c0.47 1.28 1.05 2.51 1.73 3.68 1.03 1.68 2.96 2.53 3.94 2.14 0.92-0.37 1.78-1.59 1.47-3.91-0.04-0.21-0.14-0.41-0.29-0.57-0.14-0.15-0.25-0.33-0.32-0.53l-0.73-2.28-0.42-1.32c-0.19-0.61-1.81-1.39-3.65-0.88-1.49 0.44-2.06 1.63-1.73 3.67z"),
                fill = SolidColor(Color(0xFF010202))
            )
            addPath(
                pathData = addPathNodes("M25.17 26.33s-1.17-0.51-1.24 0c-0.07 0.51 0.44 0.88 0.95 1.1 0.26 0.14 0.57 0.11 0.8-0.07"),
                fill = SolidColor(Color(0xFFFFFFFF))
            )
            addPath(
                pathData = addPathNodes("M25.24 27.63c-0.14 0-0.28-0.03-0.41-0.09-0.72-0.31-1.08-0.74-1.01-1.21 0.01-0.11 0.08-0.21 0.17-0.26 0.35-0.2 1.13 0.13 1.22 0.17 0.05 0.03 0.07 0.1 0.05 0.15-0.03 0.05-0.08 0.07-0.14 0.05-0.29-0.13-0.83-0.29-1.02-0.18-0.04 0.02-0.06 0.06-0.06 0.1-0.07 0.49 0.52 0.82 0.88 0.98 0.22 0.12 0.48 0.1 0.68-0.05 0.05-0.04 0.12-0.03 0.16 0.01 0.04 0.04 0.03 0.1 0 0.14-0.15 0.12-0.33 0.19-0.52 0.19z"),
                fill = SolidColor(Color(0xFF010202))
            )
            addPath(
                pathData = addPathNodes("M29.93 23.45s-1.3-0.31-0.74 1.42c0.11 0.34 0.87 0.74 0.87 0.74s-0.06 0.56-0.37 0.62"),
                fill = SolidColor(Color(0xFFFFFFFF))
            )
            addPath(
                pathData = addPathNodes("M29.68 26.34c-0.05 0-0.1-0.04-0.11-0.09-0.01-0.06 0.03-0.12 0.09-0.13 0.16-0.03 0.24-0.3 0.27-0.44-0.2-0.11-0.75-0.44-0.85-0.77-0.21-0.64-0.19-1.1 0.05-1.36 0.3-0.32 0.8-0.2 0.82-0.2 0.06 0.01 0.1 0.07 0.08 0.13-0.01 0.06-0.07 0.1-0.13 0.08 0 0-0.4-0.09-0.61 0.13-0.21 0.22-0.18 0.59 0 1.14 0.07 0.22 0.54 0.53 0.81 0.68 0.04 0.02 0.06 0.07 0.06 0.11 0 0.07-0.08 0.64-0.46 0.71l-0.02 0.01z"),
                fill = SolidColor(Color(0xFF2E353A))
            )
            addPath(
                pathData = addPathNodes("M29 27.46s-0.93 0.19-1.3-0.25z"),
                fill = SolidColor(Color(0xFFFFFFFF))
            )
            addPath(
                pathData = addPathNodes("M28.56 27.63c-0.34 0.03-0.68-0.09-0.94-0.33-0.04-0.05-0.03-0.12 0.01-0.16 0.05-0.04 0.12-0.03 0.16 0.01 0.32 0.38 1.18 0.22 1.19 0.22 0.06-0.01 0.11 0.02 0.13 0.08v0.01c0.01 0.06-0.03 0.12-0.09 0.13-0.15 0.03-0.31 0.04-0.46 0.04z"),
                fill = SolidColor(Color(0xFF010202))
            )
            addPath(
                pathData = addPathNodes("M27.64 24.56s-0.68-0.25-1.05 0.06c-0.2 0.14-0.35 0.33-0.44 0.56"),
                fill = SolidColor(Color(0xFFFFFFFF))
            )
            addPath(
                pathData = addPathNodes("M26.16 25.29h-0.03c-0.06-0.02-0.09-0.08-0.08-0.13 0.09-0.25 0.25-0.46 0.47-0.61 0.41-0.34 1.13-0.09 1.16-0.08 0.06 0.02 0.09 0.08 0.07 0.14-0.02 0.06-0.08 0.09-0.14 0.07 0 0-0.62-0.22-0.94 0.04-0.17 0.13-0.31 0.3-0.39 0.5-0.03 0.04-0.07 0.07-0.12 0.07zm1.46 0.33c0.09 0.21 0.07 0.41-0.04 0.45-0.11 0.04-0.27-0.08-0.36-0.28-0.09-0.21-0.07-0.41 0.04-0.45 0.11-0.04 0.28 0.08 0.36 0.28zm2.22-1.08c0.09 0.2 0.07 0.41-0.04 0.45-0.11 0.04-0.27-0.08-0.36-0.28-0.09-0.2-0.07-0.41 0.04-0.45 0.12-0.05 0.28 0.08 0.36 0.28z"),
                fill = SolidColor(Color(0xFF010202))
            )
            addPath(
                pathData = addPathNodes("M24.84 26.62s0.74-0.54 0.6-1.01c-0.13-0.47-0.4-0.47-0.13-0.74s0.47-0.4 0.4-0.8c-0.07-0.4-1.14-1.07-0.8-1.48 0.34-0.4 0.2-0.88 2.95-0.2 2.75 0.68 4.49-0.4 3.69-1.41-0.8-1.01-1.48-1.14-1.48-1.14s1.54-0.66 0.27-1.34-4.16-0.66-5.77 0.6c-1.61 1.26-1.27 2.34-1.27 2.34s-0.87 0.13-0.94 1.48c-0.07 1.35 2.48 3.7 2.48 3.7z"),
                fill = SolidColor(Color(0xFF010202))
            )
            addPath(
                pathData = addPathNodes("M29.23 22.13c-0.59-0.02-1.16-0.15-1.7-0.38-0.42-0.18-0.88-0.29-1.34-0.32-1.06 0-1.29 0.6-1.29 0.63-0.01 0.04-0.05 0.06-0.09 0.05-0.04-0.01-0.06-0.05-0.05-0.09 0.01-0.03 0.26-0.73 1.44-0.73 0.48 0.03 0.95 0.14 1.39 0.33 0.69 0.24 1.4 0.5 2.29 0.3 0.49-0.11 0.77-0.28 0.84-0.51 0.09-0.3-0.19-0.61-0.2-0.61-0.03-0.03-0.03-0.08 0-0.11s0.08-0.03 0.11 0c0.01 0.02 0.35 0.38 0.23 0.76-0.09 0.29-0.41 0.5-0.95 0.62-0.23 0.03-0.45 0.06-0.68 0.06zm-5.31 1.46c-0.03 0-0.06-0.02-0.07-0.04-0.11-0.2-0.13-0.44-0.05-0.66 0.1-0.21 0.27-0.38 0.49-0.46 0.04-0.02 0.08 0 0.1 0.04 0.02 0.04 0 0.08-0.04 0.1-0.18 0.07-0.32 0.21-0.4 0.38-0.06 0.18-0.05 0.37 0.04 0.54 0.02 0.04 0 0.08-0.04 0.1h-0.03z"),
                fill = SolidColor(Color(0xFFFFFFFF))
            )
        }
            .build()
        return _question!!
    }

private var _question: ImageVector? = null

@Preview
@Composable
private fun ImagePreview() {
    Box {
        Image(
            imageVector = Cards.Question,
            contentDescription = null,
        )
    }
}