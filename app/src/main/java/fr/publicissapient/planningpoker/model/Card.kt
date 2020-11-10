package fr.publicissapient.planningpoker.model

import androidx.annotation.DrawableRes
import androidx.compose.ui.text.AnnotatedString

data class Card(
    val name: String,
    @DrawableRes val imageResourceId: Int,
    val description: AnnotatedString,
)
