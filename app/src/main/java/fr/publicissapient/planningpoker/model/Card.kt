package fr.publicissapient.planningpoker.model

import androidx.annotation.DrawableRes
import androidx.compose.ui.text.AnnotatedString

data class Card(
    @DrawableRes val imageResourceId: Int,
    val description: AnnotatedString,
    val pointValue: Int,
)
