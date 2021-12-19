package fr.publicissapient.planningpoker.model

import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.AnnotatedString

data class Card(
    val name: String,
    val image: ImageVector,
    val description: AnnotatedString? = null,
)
