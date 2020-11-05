package fr.publicissapient.planningpoker.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.font.FontWeight

val highlightSpanStyle = SpanStyle(color = Color.White, fontWeight = FontWeight.Bold)
val fibo0 =
    with(AnnotatedString.Builder("En 1991, le taux de couverture du marché du téléphone mobile dans le monde était de ")) {
        pushStyle(highlightSpanStyle)
        append("0.6%")
        pop()
        append(".")
        toAnnotatedString()
    }
val fibo1 = with(AnnotatedString.Builder("C‘est le ")) {
    pushStyle(highlightSpanStyle)
    append("1er")
    pop()
    append(" avril 1976 que la startup Apple Computer est née, dans la maison d'enfance de Steve Jobs à Los Altos, en Californie.")
    toAnnotatedString()
}
val fibo2 = with(AnnotatedString.Builder("La racine carrée de ")) {
    pushStyle(highlightSpanStyle)
    append("2")
    pop()
    append(" a été le premier nombre irrationnel connu par les pythagoriciens. Sa valeur approchée est 1,414 213 562.")
    toAnnotatedString()
}
val fibo3 = with(AnnotatedString.Builder("Android ")) {
    pushStyle(highlightSpanStyle)
    append("3.0")
    pop()
    append(" n'a jamais été utilisé sur des téléphones : Android 3.0 Honeycomb était construit uniquement pour les tablettes.")
    toAnnotatedString()
}
val fibo5 =
    with(AnnotatedString.Builder("En alchimie, les 4 éléments, terre, eau, air, feu sont complétés d’un ")) {
        pushStyle(highlightSpanStyle)
        append("cinquième")
        pop()
        append(" élément ou “quintessence” : l’éther, qui est au centre de tout et dans lequel baignerait le cosmos.")
        toAnnotatedString()
    }
val fibo8 = with(AnnotatedString.Builder("")) {
    pushStyle(highlightSpanStyle)
    append("8")
    pop()
    append(" pouces étaient la première génération de disquettes. Lancées en 1967 par IBM, elles pouvaient stocker 80 000 caractères.")
    toAnnotatedString()
}
val fibo13 = with(AnnotatedString.Builder()) {
    pushStyle(highlightSpanStyle)
    append("13")
    pop()
    append(" est le code ASCII et Unicode exprimé en base 10 pour le retour chariot.")
    toAnnotatedString()
}
val fibo21 = with(AnnotatedString.Builder("Le binaire de ")) {
    pushStyle(highlightSpanStyle)
    append("21")
    pop()
    append(" est 10101 qui est palindrome.")
    toAnnotatedString()
}
val fibo40 =
    with(AnnotatedString.Builder("En 1996, le tout premier serveur des créateurs de Google représentait un stockage de ")) {
        pushStyle(highlightSpanStyle)
        append("40")
        pop()
        append("Go et il était installé sur des briques de Lego.")
        toAnnotatedString()
    }
val fibo100 =
    with(AnnotatedString.Builder("Le nom « Google » vient du mot « Googol » (ou « Gogol » en français), un terme mathématique qui vaut 10 puissance 100, \nc’est-à-dire un 1 suivi de ")) {
        pushStyle(highlightSpanStyle)
        append("100")
        pop()
        append(" zéros.")
        toAnnotatedString()
    }
val fiboQuestion = with(AnnotatedString.Builder("Aux échecs, en notation algébrique : « ")) {
    pushStyle(highlightSpanStyle)
    append("?")
    pop()
    append(" » signale un mauvais coup, « ?? » une erreur grossière, « ?! » un coup douteux, « !? » un coup intéressant.")
    toAnnotatedString()
}