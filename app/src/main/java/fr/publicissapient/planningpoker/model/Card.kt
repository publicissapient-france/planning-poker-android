package fr.publicissapient.planningpoker.model

import androidx.annotation.DrawableRes
import androidx.compose.ui.text.AnnotatedString

data class Card(
    val id: String,
    val name: String,
    @DrawableRes val imageResourceId: Int,
    val description: AnnotatedString,
)
