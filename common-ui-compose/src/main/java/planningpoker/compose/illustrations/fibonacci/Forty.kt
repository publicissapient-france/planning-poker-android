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
import planningpoker.compose.theme.PlanningPokerTheme
import planningpoker.compose.theme.RedThemeColors


public val Illu.Cards.Forty: ImageVector
    @Composable get() {
        if (_forty != null) {
            return _forty!!
        }
        _forty = Builder(
            name = "Forty", defaultWidth = 145.0.dp, defaultHeight = 101.0.dp,
            viewportWidth = 145.0f, viewportHeight = 101.0f
        ).apply {
            addPath(
                pathData = addPathNodes(
                    "M40.12 82.85c14.47 0 25.99-11.27 36.05-11.81 10.05-0.54 35.57 13.14 46.34 5.9 10.77-7.24 11.52-21.2 11.52-30.86s-7.11-26.57-19.62-29.25c-2.25-0.48-4.28-0.79-6.17-1 0.02 0.08 0.04 0.17 0.04 0.26 0 0.5-0.4 0.9-0.9 0.9-0.44 0-0.8-0.31-0.88-0.73H95.53v-1.23c-3.04-0.32-6.14-0.96-9.8-2.49-0.67-0.28-1.32-0.57-1.94-0.85v1.86h-7.63v-0.34h7.29v-1.68C74.84 7.47 71.09 2.98 63.17 1c-8.1-2.03-18.39-2.14-31.07 11.18h16.75c0.01-0.4 0.28-0.73 0.65-0.83V7.37h-7.95c-0.08 0.41-0.44 0.73-0.88 0.73-0.5 0-0.9-0.4-0.9-0.9s0.4-0.9 0.9-0.9c0.44 0 0.8 0.31 0.88 0.73h18.58v5.14h11.74v9.69h-0.34v-9.35H59.79V7.37h-9.95v3.94c0.45 0.04 0.81 0.42 0.81 0.89 0 0.5-0.4 0.9-0.9 0.9-0.38 0-0.71-0.24-0.84-0.58H31.78c-0.65 0.69-1.3 1.41-1.96 2.17-5.76 6.65-10.25 13.84-11.88 23-3.36 18.83 1.92 45.16 22.18 45.16zm-8.8-28.32h-0.34v-6h-5.4v-9.32c-0.41-0.08-0.73-0.44-0.73-0.88 0-0.5 0.4-0.9 0.9-0.9s0.9 0.4 0.9 0.9c0 0.44-0.31 0.8-0.73 0.88v8.98h5.4v6.34zm19.46-24.68H39.49c-0.08 0.41-0.44 0.73-0.88 0.73-0.5 0-0.9-0.4-0.9-0.9s0.4-0.9 0.9-0.9c0.44 0 0.8 0.31 0.88 0.73h11.29v0.34zm61.26-0.17c0 0.5-0.4 0.9-0.9 0.9-0.41 0-0.75-0.28-0.86-0.66h-16.7v-0.34h16.67c0.05-0.45 0.42-0.8 0.89-0.8 0.5 0.01 0.9 0.41 0.9 0.9zm-17.8 36.97h6.01v2.7c0.36 0.07 0.64 0.35 0.71 0.71h10.53V64.4h4.94c0.05-0.45 0.42-0.81 0.89-0.81 0.46 0 0.84 0.36 0.89 0.81h6.87c0.05-0.45 0.42-0.81 0.89-0.81 0.5 0 0.9 0.4 0.9 0.9s-0.4 0.9-0.9 0.9c-0.41 0-0.75-0.27-0.86-0.65h-6.93c-0.09 0.32-0.36 0.57-0.69 0.63v8.29h4.99c0.01-0.48 0.41-0.87 0.89-0.87 0.5 0 0.9 0.4 0.9 0.9s-0.4 0.9-0.9 0.9c-0.38 0-0.71-0.24-0.84-0.58h-5.38v-8.63c-0.33-0.06-0.6-0.31-0.69-0.63h-4.63v5.66h-10.86c-0.08 0.41-0.44 0.73-0.88 0.73-0.5 0-0.9-0.4-0.9-0.9 0-0.44 0.31-0.8 0.73-0.88V67h-5.68v-0.35zM24.57 54.96c-0.08 0.41-0.44 0.73-0.88 0.73-0.5 0-0.9-0.4-0.9-0.9s0.4-0.9 0.9-0.9c0.44 0 0.8 0.31 0.88 0.73h91.26c0.06-0.31 0.27-0.55 0.55-0.66v-2.94h8.13c0.12-0.36 0.45-0.62 0.85-0.62 0.5 0 0.9 0.4 0.9 0.9s-0.4 0.9-0.9 0.9c-0.47 0-0.86-0.37-0.89-0.84h-7.75v2.54c0.43 0.01 0.79 0.32 0.87 0.73h2.97c0.08-0.41 0.44-0.73 0.88-0.73 0.5 0 0.9 0.4 0.9 0.9s-0.4 0.9-0.9 0.9c-0.44 0-0.8-0.31-0.88-0.73h-2.97c-0.08 0.41-0.44 0.73-0.88 0.73s-0.8-0.31-0.88-0.73H24.57v-0.01zM36.9 70.82v-3.06c-0.39-0.04-0.71-0.34-0.78-0.72h-11.8c-0.08 0.41-0.44 0.73-0.88 0.73-0.5 0-0.9-0.4-0.9-0.9s0.4-0.9 0.9-0.9c0.44 0 0.8 0.31 0.88 0.73h11.8c0.08-0.41 0.44-0.73 0.88-0.73s0.8 0.31 0.88 0.73h14.36v0.34H37.88c-0.06 0.34-0.32 0.6-0.64 0.69v3.42H24.3c-0.1 0.39-0.45 0.68-0.87 0.68-0.5 0-0.9-0.4-0.9-0.9s0.4-0.9 0.9-0.9c0.45 0 0.83 0.34 0.88 0.78H36.9v0.01z"
                ),
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
                pathData = addPathNodes("M63.41 49.63h7.74v12.75h-7.74v13.18H47.94V62.38H17V51.67l24.65-40.21h21.76v38.17zm-15.47 0V24.9L32.9 49.63h15.04zM101.66 9c15.9 0 27.12 13.77 27.12 34.51s-11.14 34.43-27.12 34.43c-16.24 0-27.2-14.2-27.2-34.94 0-20.06 11.05-34 27.2-34zm0 54.4c6.29 0 10.63-8.33 10.63-19.72 0-11.39-4.34-19.81-10.63-19.81-6.29 0-10.71 8.5-10.71 19.55 0 11.57 4.25 19.98 10.71 19.98zM17.61 93.83H3.72v6.11h13.89v-6.11z"),
                fill = SolidColor(Color(0xFF010202))
            )
            addPath(
                pathData = addPathNodes("M8.68 95.1h-2.4c-0.17 0-0.32-0.14-0.32-0.32v-1.7c0-0.17 0.14-0.32 0.32-0.32h2.4C8.85 92.76 9 92.9 9 93.08v1.7c-0.01 0.18-0.15 0.32-0.32 0.32zm6.38 0h-2.4c-0.17 0-0.32-0.14-0.32-0.32v-1.7c0-0.17 0.14-0.32 0.32-0.32h2.4c0.17 0 0.32 0.14 0.32 0.32v1.7c0 0.18-0.15 0.32-0.32 0.32zm37.04-1.27H38.21v6.11H52.1v-6.11zm17.25 0H55.46v6.11h13.89v-6.11z"),
                fill = SolidColor(Color(0xFF010202))
            )
            addPath(
                pathData = addPathNodes("M60.41 95.1h-2.4c-0.17 0-0.32-0.14-0.32-0.32v-1.7c0-0.17 0.14-0.32 0.32-0.32h2.4c0.17 0 0.32 0.14 0.32 0.32v1.7c0 0.18-0.14 0.32-0.32 0.32zm6.39 0h-2.4c-0.17 0-0.32-0.14-0.32-0.32v-1.7c0-0.17 0.14-0.32 0.32-0.32h2.4c0.17 0 0.32 0.14 0.32 0.32v1.7c-0.01 0.18-0.15 0.32-0.32 0.32zm-23.65 0h-2.4c-0.17 0-0.32-0.14-0.32-0.32v-1.7c0-0.17 0.14-0.32 0.32-0.32h2.4c0.17 0 0.32 0.14 0.32 0.32v1.7c-0.01 0.18-0.15 0.32-0.32 0.32zm6.38 0h-2.4c-0.17 0-0.32-0.14-0.32-0.32v-1.7c0-0.17 0.14-0.32 0.32-0.32h2.4c0.17 0 0.32 0.14 0.32 0.32v1.7c-0.01 0.18-0.15 0.32-0.32 0.32z"),
                fill = SolidColor(Color(0xFF010202))
            )
            addPath(
                pathData = addPathNodes("M60.87 87.67v-0.69c0-0.17-0.14-0.32-0.32-0.32h-2.4c-0.17 0-0.32 0.14-0.32 0.32v0.69h-3.35v-0.69c0-0.17-0.14-0.32-0.32-0.32h-2.4c-0.17 0-0.32 0.14-0.32 0.32v0.69H49.2v6.11h13.89v-6.11h-2.22zm62.65 6.01v-0.69c0-0.17-0.14-0.32-0.32-0.32h-2.4c-0.17 0-0.32 0.14-0.32 0.32v0.69h-3.35v-0.69c0-0.17-0.14-0.32-0.32-0.32h-2.4c-0.17 0-0.32 0.14-0.32 0.32v0.69h-2.24v6.11h13.89v-6.11h-2.22z"),
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = SolidColor(Color(0xFF010202)),
                strokeLineWidth = 0.25f, strokeLineMiter = 10.0f
            )
            addPath(
                pathData = addPathNodes("M125.9 87.74h-14.17v6.11h14.17v-6.11z"),
                fill = SolidColor(Color(0xFF010202))
            )
            addPath(
                pathData = addPathNodes("M116.79 89.01h-2.46c-0.17 0-0.32-0.14-0.32-0.32V87c0-0.17 0.14-0.32 0.32-0.32h2.46c0.17 0 0.32 0.14 0.32 0.32v1.7c0 0.17-0.15 0.31-0.32 0.31zm6.51 0h-2.46c-0.17 0-0.32-0.14-0.32-0.32V87c0-0.17 0.14-0.32 0.32-0.32h2.46c0.17 0 0.32 0.14 0.32 0.32v1.7c0 0.17-0.14 0.31-0.32 0.31z"),
                fill = SolidColor(Color(0xFF010202))
            )
            addPath(
                pathData = addPathNodes("M34.86 93.68H20.97v6.11h13.89v-6.11z"),
                fill = SolidColor(Color(0xFFFFFFFF)), stroke = SolidColor(Color(0xFF010202)),
                strokeLineWidth = 0.25f, strokeLineMiter = 10.0f,
            )
            addPath(
                pathData = addPathNodes("M41.01 72.01H39.9v2.94h1.11v-2.94z"),
                fill = SolidColor(Color(0xFF010202))
            )
            addPath(
                pathData = addPathNodes("M41.13 75.07h-1.35v-3.18h1.35v3.18zm-1.11-0.23h0.88v-2.71h-0.88v2.71zm0.19-24.71h-29.2v6.37h29.2v-6.37z"),
                fill = SolidColor(Color(0xFF010202))
            )
            addPath(
                pathData = addPathNodes("M40.32 56.61H10.89v-6.6h29.43v6.6zm0.69 32.77H39.9v2.94h1.11v-2.94z"),
                fill = SolidColor(Color(0xFF010202))
            )
            addPath(
                pathData = addPathNodes("M41.13 92.44h-1.35v-3.18h1.35v3.18zm-1.11-0.23h0.88V89.5h-0.88v2.71zm-28.8-2.83h-1.11v2.94h1.11v-2.94z"),
                fill = SolidColor(Color(0xFF010202))
            )
            addPath(
                pathData = addPathNodes("M11.34 92.44H9.99v-3.18h1.35v3.18zm-1.11-0.23h0.88V89.5h-0.88v2.71zm0.83-37.24H9.95v2.94h1.11v-2.94z"),
                fill = SolidColor(Color(0xFF010202))
            )
            addPath(
                pathData = addPathNodes("M11.18 58.04H9.83v-3.18h1.35v3.18zm-1.11-0.24h0.88v-2.71h-0.88v2.71zm0.99 23.01H9.95v2.94h1.11v-2.94z"),
                fill = SolidColor(Color(0xFF010202))
            )
            addPath(
                pathData = addPathNodes("M11.18 83.87H9.83v-3.18h1.35v3.18zm-1.11-0.24h0.88v-2.71h-0.88v2.71zm0.99-11.64H9.95v2.94h1.11v-2.94z"),
                fill = SolidColor(Color(0xFF010202))
            )
            addPath(
                pathData = addPathNodes("M11.18 75.05H9.83v-3.18h1.35v3.18zm-1.11-0.23h0.88v-2.71h-0.88v2.71zM41.3 54.97h-1.11v2.94h1.11v-2.94z"),
                fill = SolidColor(Color(0xFF010202))
            )
            addPath(
                pathData = addPathNodes("M41.42 58.04h-1.35v-3.18h1.35v3.18zM40.3 57.8h0.88v-2.71H40.3v2.71zm1 23.01h-1.11v2.94h1.11v-2.94z"),
                fill = SolidColor(Color(0xFF010202))
            )
            addPath(
                pathData = addPathNodes("M41.42 83.87h-1.35v-3.18h1.35v3.18zm-1.12-0.24h0.88v-2.71H40.3v2.71zM11.06 63.47H9.95v2.94h1.11v-2.94z"),
                fill = SolidColor(Color(0xFF010202))
            )
            addPath(
                pathData = addPathNodes("M11.18 66.53H9.83v-3.18h1.35v3.18zm-1.11-0.24h0.88v-2.71h-0.88v2.71zm31.23-2.82h-1.11v2.94h1.11v-2.94z"),
                fill = SolidColor(Color(0xFF010202))
            )
            addPath(
                pathData = addPathNodes("M41.42 66.53h-1.35v-3.18h1.35v3.18zm-1.12-0.24h0.88v-2.71H40.3v2.71z"),
                fill = SolidColor(Color(0xFF010202))
            )
            addPath(
                pathData = addPathNodes("M40.27 53.35H10.96v6.35h29.31v-6.35z"),
                fill = SolidColor(Color(0xFFFFFFFF))
            )
            addPath(
                pathData = addPathNodes("M40.38 59.81H10.84v-6.58h29.54v6.58zm-29.31-0.23h29.08v-6.12H11.07v6.12z"),
                fill = SolidColor(Color(0xFF010202))
            )
            addPath(
                pathData = addPathNodes("M18.83 54.96h-1.67v3.11h1.67v-3.11z"),
                fill = SolidColor(MaterialTheme.colorScheme.primary)
            )
            addPath(
                pathData = addPathNodes("M18.95 58.19h-1.91v-3.34h1.91v3.34zm-1.67-0.23h1.44v-2.88h-1.44v2.88zm-1.02-3h-1.67v3.11h1.67v-3.11z"),
                fill = SolidColor(MaterialTheme.colorScheme.primary)
            )
            addPath(
                pathData = addPathNodes("M16.38 58.19h-1.91v-3.34h1.91v3.34zm-1.67-0.23h1.44v-2.88h-1.44v2.88zm-1.01-3h-1.33v3.11h1.33v-3.11z"),
                fill = SolidColor(MaterialTheme.colorScheme.primary)
            )
            addPath(
                pathData = addPathNodes("M13.82 58.19h-1.57v-3.34h1.57v3.34zm-1.34-0.23h1.1v-2.88h-1.1v2.88zm8.91-3h-1.67v3.11h1.67v-3.11z"),
                fill = SolidColor(MaterialTheme.colorScheme.primary)
            )
            addPath(
                pathData = addPathNodes("M21.52 58.19h-1.91v-3.34h1.91v3.34zm-1.68-0.23h1.44v-2.88h-1.44v2.88zm12.73-3H22.29v3.11h10.28v-3.11z"),
                fill = SolidColor(MaterialTheme.colorScheme.primary)
            )
            addPath(
                pathData = addPathNodes("M32.68 58.19H22.17v-3.34h10.51v3.34zm-10.27-0.23h10.04v-2.88H22.41v2.88z"),
                fill = SolidColor(MaterialTheme.colorScheme.primary)
            )
            addPath(
                pathData = addPathNodes("M35.3 57.16c0.43 0 0.78-0.35 0.78-0.78 0-0.43-0.35-0.78-0.78-0.78-0.43 0-0.78 0.35-0.78 0.78 0 0.43 0.35 0.78 0.78 0.78z"),
                fill = SolidColor(Color(0xFFFFFFFF))
            )
            addPath(
                pathData = addPathNodes("M35.3 57.29c-0.5 0-0.9-0.4-0.9-0.9s0.4-0.9 0.9-0.9 0.9 0.4 0.9 0.9-0.4 0.9-0.9 0.9zm0-1.57c-0.37 0-0.67 0.3-0.67 0.67 0 0.37 0.3 0.67 0.67 0.67 0.37 0 0.67-0.3 0.67-0.67 0-0.37-0.3-0.67-0.67-0.67z"),
                fill = SolidColor(Color(0xFF010202))
            )
            addPath(
                pathData = addPathNodes("M39.15 56.38c0-0.43-0.35-0.78-0.78-0.78-0.43 0-0.78 0.35-0.78 0.78 0 0.43 0.35 0.78 0.78 0.78 0.43 0.01 0.78-0.34 0.78-0.78z"),
                fill = SolidColor(MaterialTheme.colorScheme.primary)
            )
            addPath(
                pathData = addPathNodes("M38.37 57.29c-0.5 0-0.9-0.4-0.9-0.9s0.4-0.9 0.9-0.9 0.9 0.4 0.9 0.9-0.4 0.9-0.9 0.9zm0-1.57c-0.37 0-0.67 0.3-0.67 0.67 0 0.37 0.3 0.67 0.67 0.67 0.37 0 0.67-0.3 0.67-0.67 0-0.37-0.3-0.67-0.67-0.67z"),
                fill = SolidColor(Color(0xFF010202))
            )
            addPath(
                pathData = addPathNodes("M30.73 57.16c0.43 0 0.78-0.35 0.78-0.78 0-0.43-0.35-0.78-0.78-0.78-0.43 0-0.78 0.35-0.78 0.78 0 0.43 0.35 0.78 0.78 0.78z"),
                fill = SolidColor(Color(0xFFFFFFFF))
            )
            addPath(
                pathData = addPathNodes("M30.73 57.29c-0.5 0-0.9-0.4-0.9-0.9s0.4-0.9 0.9-0.9 0.9 0.4 0.9 0.9-0.4 0.9-0.9 0.9zm0-1.57c-0.37 0-0.67 0.3-0.67 0.67 0 0.37 0.3 0.67 0.67 0.67 0.37 0 0.67-0.3 0.67-0.67 0-0.37-0.3-0.67-0.67-0.67zm8.43 3.97H12.07v2.17h27.09v-2.17z"),
                fill = SolidColor(Color(0xFF010202))
            )
            addPath(
                pathData = addPathNodes("M39.27 61.99H11.95v-2.41h27.32v2.41zm-27.08-0.24h26.85v-1.94H12.19v1.94z"),
                fill = SolidColor(Color(0xFF010202))
            )
            addPath(
                pathData = addPathNodes("M40.27 61.87H10.96v6.35h29.31v-6.35z"),
                fill = SolidColor(Color(0xFFFFFFFF))
            )
            addPath(
                pathData = addPathNodes("M40.38 68.33H10.84v-6.58h29.54v6.58zM11.07 68.1h29.08v-6.11H11.07v6.11z"),
                fill = SolidColor(Color(0xFF010202))
            )
            addPath(
                pathData = addPathNodes("M35.3 65.69c0.43 0 0.78-0.35 0.78-0.78 0-0.43-0.35-0.78-0.78-0.78-0.43 0-0.78 0.35-0.78 0.78 0 0.43 0.35 0.78 0.78 0.78z"),
                fill = SolidColor(MaterialTheme.colorScheme.primary)
            )
            addPath(
                pathData = addPathNodes("M35.3 65.81c-0.5 0-0.9-0.4-0.9-0.9s0.4-0.9 0.9-0.9 0.9 0.4 0.9 0.9-0.4 0.9-0.9 0.9zm0-1.57c-0.37 0-0.67 0.3-0.67 0.67 0 0.37 0.3 0.67 0.67 0.67 0.37 0 0.67-0.3 0.67-0.67 0-0.37-0.3-0.67-0.67-0.67z"),
                fill = SolidColor(Color(0xFF010202))
            )
            addPath(
                pathData = addPathNodes("M39.15 64.91c0-0.43-0.35-0.78-0.78-0.78-0.43 0-0.78 0.35-0.78 0.78 0 0.43 0.35 0.78 0.78 0.78 0.43 0 0.78-0.35 0.78-0.78z"),
                fill = SolidColor(Color(0xFFFFFFFF))
            )
            addPath(
                pathData = addPathNodes("M38.37 65.81c-0.5 0-0.9-0.4-0.9-0.9s0.4-0.9 0.9-0.9 0.9 0.4 0.9 0.9-0.4 0.9-0.9 0.9zm0-1.57c-0.37 0-0.67 0.3-0.67 0.67 0 0.37 0.3 0.67 0.67 0.67 0.37 0 0.67-0.3 0.67-0.67 0-0.37-0.3-0.67-0.67-0.67z"),
                fill = SolidColor(Color(0xFF010202))
            )
            addPath(
                pathData = addPathNodes("M30.73 65.69c0.43 0 0.78-0.35 0.78-0.78 0-0.43-0.35-0.78-0.78-0.78-0.43 0-0.78 0.35-0.78 0.78 0 0.43 0.35 0.78 0.78 0.78z"),
                fill = SolidColor(Color(0xFFFFFFFF))
            )
            addPath(
                pathData = addPathNodes("M30.73 65.81c-0.5 0-0.9-0.4-0.9-0.9s0.4-0.9 0.9-0.9 0.9 0.4 0.9 0.9-0.4 0.9-0.9 0.9zm0-1.57c-0.37 0-0.67 0.3-0.67 0.67 0 0.37 0.3 0.67 0.67 0.67 0.37 0 0.67-0.3 0.67-0.67 0-0.37-0.3-0.67-0.67-0.67zm8.43 3.98H12.07v2.17h27.09v-2.17z"),
                fill = SolidColor(Color(0xFF010202))
            )
            addPath(
                pathData = addPathNodes("M39.27 70.51H11.95V68.1h27.32v2.41zm-27.08-0.24h26.85v-1.94H12.19v1.94z"),
                fill = SolidColor(Color(0xFF010202))
            )
            addPath(
                pathData = addPathNodes("M40.27 70.39H10.96v6.35h29.31v-6.35z"),
                fill = SolidColor(Color(0xFFFFFFFF))
            )
            addPath(
                pathData = addPathNodes("M40.38 76.86H10.84v-6.58h29.54v6.58zm-29.31-0.24h29.08v-6.11H11.07v6.11z"),
                fill = SolidColor(Color(0xFF010202))
            )
            addPath(
                pathData = addPathNodes("M18.83 72.01h-1.67v3.11h1.67v-3.11z"),
                fill = SolidColor(MaterialTheme.colorScheme.primary)
            )
            addPath(
                pathData = addPathNodes("M18.95 75.24h-1.91V71.9h1.91v3.34zM17.28 75h1.44v-2.88h-1.44V75zm4.11-2.99h-1.67v3.11h1.67v-3.11z"),
                fill = SolidColor(MaterialTheme.colorScheme.primary)
            )
            addPath(
                pathData = addPathNodes("M21.52 75.24h-1.91V71.9h1.91v3.34zM19.84 75h1.44v-2.88h-1.44V75zm-3.58-2.99h-1.67v3.11h1.67v-3.11z"),
                fill = SolidColor(MaterialTheme.colorScheme.primary)
            )
            addPath(
                pathData = addPathNodes("M16.38 75.24h-1.91V71.9h1.91v3.34zM14.71 75h1.44v-2.88h-1.44V75zm17.86-2.99H22.29v3.11h10.28v-3.11z"),
                fill = SolidColor(MaterialTheme.colorScheme.primary)
            )
            addPath(
                pathData = addPathNodes("M32.68 75.24H22.17V71.9h10.51v3.34zM22.41 75h10.04v-2.88H22.41V75zm-8.71-2.99h-1.33v3.11h1.33v-3.11z"),
                fill = SolidColor(MaterialTheme.colorScheme.primary)
            )
            addPath(
                pathData = addPathNodes("M13.82 75.24h-1.57V71.9h1.57v3.34zM12.48 75h1.1v-2.88h-1.1V75zm6.35-11.54h-1.67v3.11h1.67v-3.11z"),
                fill = SolidColor(MaterialTheme.colorScheme.primary)
            )
            addPath(
                pathData = addPathNodes("M18.95 66.69h-1.91v-3.34h1.91v3.34zm-1.67-0.24h1.44v-2.88h-1.44v2.88zm4.11-2.99h-1.67v3.11h1.67v-3.11z"),
                fill = SolidColor(MaterialTheme.colorScheme.primary)
            )
            addPath(
                pathData = addPathNodes("M21.52 66.69h-1.91v-3.34h1.91v3.34zm-1.68-0.24h1.44v-2.88h-1.44v2.88zm-3.58-2.99h-1.67v3.11h1.67v-3.11z"),
                fill = SolidColor(MaterialTheme.colorScheme.primary)
            )
            addPath(
                pathData = addPathNodes("M16.38 66.69h-1.91v-3.34h1.91v3.34zm-1.67-0.24h1.44v-2.88h-1.44v2.88zm17.86-2.99H22.29v3.11h10.28v-3.11z"),
                fill = SolidColor(MaterialTheme.colorScheme.primary)
            )
            addPath(
                pathData = addPathNodes("M32.68 66.69H22.17v-3.34h10.51v3.34zm-10.27-0.24h10.04v-2.88H22.41v2.88zm-8.71-2.99h-1.33v3.11h1.33v-3.11z"),
                fill = SolidColor(MaterialTheme.colorScheme.primary)
            )
            addPath(
                pathData = addPathNodes("M13.82 66.69h-1.57v-3.34h1.57v3.34zm-1.34-0.24h1.1v-2.88h-1.1v2.88z"),
                fill = SolidColor(MaterialTheme.colorScheme.primary)
            )
            addPath(
                pathData = addPathNodes("M35.3 74.21c0.43 0 0.78-0.35 0.78-0.78 0-0.43-0.35-0.78-0.78-0.78-0.43 0-0.78 0.35-0.78 0.78 0 0.43 0.35 0.78 0.78 0.78z"),
                fill = SolidColor(Color(0xFFFFFFFF))
            )
            addPath(
                pathData = addPathNodes("M35.3 74.33c-0.5 0-0.9-0.4-0.9-0.9s0.4-0.9 0.9-0.9 0.9 0.4 0.9 0.9-0.4 0.9-0.9 0.9zm0-1.57c-0.37 0-0.67 0.3-0.67 0.67 0 0.37 0.3 0.67 0.67 0.67 0.37 0 0.67-0.3 0.67-0.67 0-0.37-0.3-0.67-0.67-0.67z"),
                fill = SolidColor(Color(0xFF010202))
            )
            addPath(
                pathData = addPathNodes("M39.15 73.43c0-0.43-0.35-0.78-0.78-0.78-0.43 0-0.78 0.35-0.78 0.78 0 0.43 0.35 0.78 0.78 0.78 0.43 0 0.78-0.35 0.78-0.78z"),
                fill = SolidColor(MaterialTheme.colorScheme.primary)
            )
            addPath(
                pathData = addPathNodes("M38.37 74.33c-0.5 0-0.9-0.4-0.9-0.9s0.4-0.9 0.9-0.9 0.9 0.4 0.9 0.9-0.4 0.9-0.9 0.9zm0-1.57c-0.37 0-0.67 0.3-0.67 0.67 0 0.37 0.3 0.67 0.67 0.67 0.37 0 0.67-0.3 0.67-0.67 0-0.37-0.3-0.67-0.67-0.67z"),
                fill = SolidColor(Color(0xFF010202))
            )
            addPath(
                pathData = addPathNodes("M30.73 74.21c0.43 0 0.78-0.35 0.78-0.78 0-0.43-0.35-0.78-0.78-0.78-0.43 0-0.78 0.35-0.78 0.78 0 0.43 0.35 0.78 0.78 0.78z"),
                fill = SolidColor(Color(0xFFFFFFFF))
            )
            addPath(
                pathData = addPathNodes("M30.73 74.33c-0.5 0-0.9-0.4-0.9-0.9s0.4-0.9 0.9-0.9 0.9 0.4 0.9 0.9-0.4 0.9-0.9 0.9zm0-1.57c-0.37 0-0.67 0.3-0.67 0.67 0 0.37 0.3 0.67 0.67 0.67 0.37 0 0.67-0.3 0.67-0.67 0-0.37-0.3-0.67-0.67-0.67zm8.43 3.98H12.07v2.17h27.09v-2.17z"),
                fill = SolidColor(Color(0xFF010202))
            )
            addPath(
                pathData = addPathNodes("M39.27 79.03H11.95v-2.41h27.32v2.41zM12.19 78.8h26.85v-1.94H12.19v1.94z"),
                fill = SolidColor(Color(0xFF010202))
            )
            addPath(
                pathData = addPathNodes("M40.27 78.91H10.96v6.35h29.31v-6.35z"),
                fill = SolidColor(Color(0xFFFFFFFF))
            )
            addPath(
                pathData = addPathNodes("M40.38 85.38H10.84V78.8h29.54v6.58zm-29.31-0.23h29.08v-6.11H11.07v6.11z"),
                fill = SolidColor(Color(0xFF010202))
            )
            addPath(
                pathData = addPathNodes("M21.39 80.53h-1.67v3.11h1.67v-3.11z"),
                fill = SolidColor(MaterialTheme.colorScheme.primary)
            )
            addPath(
                pathData = addPathNodes("M21.52 83.76h-1.91v-3.34h1.91v3.34zm-1.68-0.23h1.44v-2.88h-1.44v2.88zm-3.58-3h-1.67v3.11h1.67v-3.11z"),
                fill = SolidColor(MaterialTheme.colorScheme.primary)
            )
            addPath(
                pathData = addPathNodes("M16.38 83.76h-1.91v-3.34h1.91v3.34zm-1.67-0.23h1.44v-2.88h-1.44v2.88zm4.12-3h-1.67v3.11h1.67v-3.11z"),
                fill = SolidColor(MaterialTheme.colorScheme.primary)
            )
            addPath(
                pathData = addPathNodes("M18.95 83.76h-1.91v-3.34h1.91v3.34zm-1.67-0.23h1.44v-2.88h-1.44v2.88zm-3.58-3h-1.33v3.11h1.33v-3.11z"),
                fill = SolidColor(MaterialTheme.colorScheme.primary)
            )
            addPath(
                pathData = addPathNodes("M13.82 83.76h-1.57v-3.34h1.57v3.34zm-1.34-0.23h1.1v-2.88h-1.1v2.88zm20.09-3H22.29v3.11h10.28v-3.11z"),
                fill = SolidColor(MaterialTheme.colorScheme.primary)
            )
            addPath(
                pathData = addPathNodes("M32.68 83.76H22.17v-3.34h10.51v3.34zm-10.27-0.23h10.04v-2.88H22.41v2.88zm12.89-0.8c0.43 0 0.78-0.35 0.78-0.78 0-0.43-0.35-0.78-0.78-0.78-0.43 0-0.78 0.35-0.78 0.78 0 0.43 0.35 0.78 0.78 0.78z"),
                fill = SolidColor(MaterialTheme.colorScheme.primary)
            )
            addPath(
                pathData = addPathNodes("M35.3 82.85c-0.5 0-0.9-0.4-0.9-0.9s0.4-0.9 0.9-0.9 0.9 0.4 0.9 0.9-0.4 0.9-0.9 0.9zm0-1.56c-0.37 0-0.67 0.3-0.67 0.67 0 0.37 0.3 0.67 0.67 0.67 0.37 0 0.67-0.3 0.67-0.67 0-0.37-0.3-0.67-0.67-0.67z"),
                fill = SolidColor(Color(0xFF010202))
            )
            addPath(
                pathData = addPathNodes("M39.15 81.95c0-0.43-0.35-0.78-0.78-0.78-0.43 0-0.78 0.35-0.78 0.78 0 0.43 0.35 0.78 0.78 0.78 0.43 0.01 0.78-0.34 0.78-0.78z"),
                fill = SolidColor(Color(0xFFFFFFFF))
            )
            addPath(
                pathData = addPathNodes("M38.37 82.85c-0.5 0-0.9-0.4-0.9-0.9s0.4-0.9 0.9-0.9 0.9 0.4 0.9 0.9-0.4 0.9-0.9 0.9zm0-1.56c-0.37 0-0.67 0.3-0.67 0.67 0 0.37 0.3 0.67 0.67 0.67 0.37 0 0.67-0.3 0.67-0.67 0-0.37-0.3-0.67-0.67-0.67z"),
                fill = SolidColor(Color(0xFF010202))
            )
            addPath(
                pathData = addPathNodes("M30.73 82.73c0.43 0 0.78-0.35 0.78-0.78 0-0.43-0.35-0.78-0.78-0.78-0.43 0-0.78 0.35-0.78 0.78 0 0.43 0.35 0.78 0.78 0.78z"),
                fill = SolidColor(Color(0xFFFFFFFF))
            )
            addPath(
                pathData = addPathNodes("M30.73 82.85c-0.5 0-0.9-0.4-0.9-0.9s0.4-0.9 0.9-0.9 0.9 0.4 0.9 0.9-0.4 0.9-0.9 0.9zm0-1.56c-0.37 0-0.67 0.3-0.67 0.67 0 0.37 0.3 0.67 0.67 0.67 0.37 0 0.67-0.3 0.67-0.67 0-0.37-0.3-0.67-0.67-0.67zm8.43 3.97H12.07v2.17h27.09v-2.17z"),
                fill = SolidColor(Color(0xFF010202))
            )
            addPath(
                pathData = addPathNodes("M39.27 87.55H11.95v-2.41h27.32v2.41zm-27.08-0.23h26.85v-1.94H12.19v1.94z"),
                fill = SolidColor(Color(0xFF010202))
            )
            addPath(
                pathData = addPathNodes("M40.27 87.44H10.96v6.35h29.31v-6.35z"),
                fill = SolidColor(Color(0xFFFFFFFF))
            )
            addPath(
                pathData = addPathNodes("M40.38 93.9H10.84v-6.58h29.54v6.58zm-29.31-0.23h29.08v-6.11H11.07v6.11z"),
                fill = SolidColor(Color(0xFF010202))
            )
            addPath(
                pathData = addPathNodes("M16.26 89.06h-1.67v3.11h1.67v-3.11z"),
                fill = SolidColor(MaterialTheme.colorScheme.primary)
            )
            addPath(
                pathData = addPathNodes("M16.38 92.28h-1.91v-3.34h1.91v3.34zm-1.67-0.23h1.44v-2.88h-1.44v2.88zm4.12-2.99h-1.67v3.11h1.67v-3.11z"),
                fill = SolidColor(MaterialTheme.colorScheme.primary)
            )
            addPath(
                pathData = addPathNodes("M18.95 92.28h-1.91v-3.34h1.91v3.34zm-1.67-0.23h1.44v-2.88h-1.44v2.88zm4.11-2.99h-1.67v3.11h1.67v-3.11z"),
                fill = SolidColor(MaterialTheme.colorScheme.primary)
            )
            addPath(
                pathData = addPathNodes("M21.52 92.28h-1.91v-3.34h1.91v3.34zm-1.68-0.23h1.44v-2.88h-1.44v2.88zm-6.14-2.99h-1.33v3.11h1.33v-3.11z"),
                fill = SolidColor(MaterialTheme.colorScheme.primary)
            )
            addPath(
                pathData = addPathNodes("M13.82 92.28h-1.57v-3.34h1.57v3.34zm-1.34-0.23h1.1v-2.88h-1.1v2.88zm20.09-2.99H22.29v3.11h10.28v-3.11z"),
                fill = SolidColor(MaterialTheme.colorScheme.primary)
            )
            addPath(
                pathData = addPathNodes("M32.68 92.28H22.17v-3.34h10.51v3.34zm-10.27-0.23h10.04v-2.88H22.41v2.88z"),
                fill = SolidColor(MaterialTheme.colorScheme.primary)
            )
            addPath(
                pathData = addPathNodes("M35.3 91.26c0.43 0 0.78-0.35 0.78-0.78 0-0.43-0.35-0.78-0.78-0.78-0.43 0-0.78 0.35-0.78 0.78 0 0.43 0.35 0.78 0.78 0.78z"),
                fill = SolidColor(Color(0xFFFFFFFF))
            )
            addPath(
                pathData = addPathNodes("M35.3 91.38c-0.5 0-0.9-0.4-0.9-0.9s0.4-0.9 0.9-0.9 0.9 0.4 0.9 0.9c0 0.49-0.4 0.9-0.9 0.9zm0-1.57c-0.37 0-0.67 0.3-0.67 0.67 0 0.37 0.3 0.67 0.67 0.67 0.37 0 0.67-0.3 0.67-0.67 0-0.37-0.3-0.67-0.67-0.67z"),
                fill = SolidColor(Color(0xFF010202))
            )
            addPath(
                pathData = addPathNodes("M39.15 90.48c0-0.43-0.35-0.78-0.78-0.78-0.43 0-0.78 0.35-0.78 0.78 0 0.43 0.35 0.78 0.78 0.78 0.43 0 0.78-0.35 0.78-0.78z"),
                fill = SolidColor(MaterialTheme.colorScheme.primary)
            )
            addPath(
                pathData = addPathNodes("M38.37 91.38c-0.5 0-0.9-0.4-0.9-0.9s0.4-0.9 0.9-0.9 0.9 0.4 0.9 0.9c0 0.49-0.4 0.9-0.9 0.9zm0-1.57c-0.37 0-0.67 0.3-0.67 0.67 0 0.37 0.3 0.67 0.67 0.67 0.37 0 0.67-0.3 0.67-0.67 0-0.37-0.3-0.67-0.67-0.67z"),
                fill = SolidColor(Color(0xFF010202))
            )
            addPath(
                pathData = addPathNodes("M30.73 91.26c0.43 0 0.78-0.35 0.78-0.78 0-0.43-0.35-0.78-0.78-0.78-0.43 0-0.78 0.35-0.78 0.78 0 0.43 0.35 0.78 0.78 0.78z"),
                fill = SolidColor(Color(0xFFFFFFFF))
            )
            addPath(
                pathData = addPathNodes("M30.73 91.38c-0.5 0-0.9-0.4-0.9-0.9s0.4-0.9 0.9-0.9 0.9 0.4 0.9 0.9c0 0.49-0.4 0.9-0.9 0.9zm0-1.57c-0.37 0-0.67 0.3-0.67 0.67 0 0.37 0.3 0.67 0.67 0.67 0.37 0 0.67-0.3 0.67-0.67 0-0.37-0.3-0.67-0.67-0.67z"),
                fill = SolidColor(Color(0xFF010202))
            )
            addPath(
                pathData = addPathNodes("M31.86 64.91c0-0.43-0.35-0.78-0.78-0.78-0.43 0-0.78 0.35-0.78 0.78 0 0.43 0.35 0.78 0.78 0.78 0.43 0 0.78-0.35 0.78-0.78z"),
                fill = SolidColor(Color(0xFFFFFFFF))
            )
            addPath(
                pathData = addPathNodes("M31.07 65.81c-0.5 0-0.9-0.4-0.9-0.9s0.4-0.9 0.9-0.9 0.9 0.4 0.9 0.9-0.4 0.9-0.9 0.9zm0-1.57c-0.37 0-0.67 0.3-0.67 0.67 0 0.37 0.3 0.67 0.67 0.67 0.37 0 0.67-0.3 0.67-0.67 0-0.37-0.3-0.67-0.67-0.67z"),
                fill = SolidColor(Color(0xFF010202))
            )
            addPath(
                pathData = addPathNodes("M10.89 50.13h29.43"),
                fill = null, stroke = SolidColor(Color(0xFFFFFFFF)),
                strokeLineWidth = 0.25f, strokeLineMiter = 10.0f
            )
            addPath(
                pathData = addPathNodes("M144.16 100.18h-3.4c-0.11 0-0.2-0.06-0.2-0.14 0-0.08 0.09-0.14 0.2-0.14h3.4c0.11 0 0.2 0.06 0.2 0.14 0 0.08-0.09 0.14-0.2 0.14zm-7.73 0H0.2c-0.11 0-0.2-0.06-0.2-0.14 0-0.08 0.09-0.14 0.2-0.14h136.24c0.11 0 0.2 0.06 0.2 0.14 0 0.08-0.1 0.14-0.21 0.14z"),
                fill = SolidColor(Color(0xFF010202))
            )
        }
            .build()
        return _forty!!
    }

private var _forty: ImageVector? = null

@Preview
@Composable
private fun ImagePreview() {
    PlanningPokerTheme(RedThemeColors) {
        Box {
            Image(
                imageVector = Cards.Forty,
                contentDescription = null,
            )
        }
    }
}
