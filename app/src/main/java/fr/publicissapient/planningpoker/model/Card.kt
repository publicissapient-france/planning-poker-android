package fr.publicissapient.planningpoker.model

import androidx.annotation.DrawableRes
import androidx.compose.ui.text.AnnotatedString

data class Card(
    @DrawableRes val imageResId: Int,
    val description: AnnotatedString,
    val pointValue: Int,
)
