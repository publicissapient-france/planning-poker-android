package fr.publicissapient.planningpoker.ui.components

import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CardPoint(
    pointValue: Int,
    modifier: Modifier = Modifier
) = Row(
    modifier = Modifier
        .fillMaxWidth()
        .padding(start = 8.dp, end = 8.dp),
    horizontalArrangement = Arrangement.SpaceBetween
) {
    val style = MaterialTheme.typography.body1.copy(
        fontSize = 40.sp,
        fontWeight = FontWeight.Bold
    )
    Text(
        text = pointValue.toString(),
        color = Color.White,
        style = style,
        modifier = modifier
    )
    Text(
        text = pointValue.toString(),
        color = Color.White,
        style = style,
        modifier = modifier
    )
}