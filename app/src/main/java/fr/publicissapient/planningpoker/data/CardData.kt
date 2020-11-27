package fr.publicissapient.planningpoker.data

import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle

fun fibo0(spanStyle: SpanStyle) =
    with(AnnotatedString.Builder("En 1991, le taux de couverture du marché du téléphone mobile dans le monde était de ")) {
        pushStyle(spanStyle)
        append("0.6%")
        pop()
        append(".")
        toAnnotatedString()
    }

fun fibo1(spanStyle: SpanStyle) = with(AnnotatedString.Builder("C‘est le ")) {
    pushStyle(spanStyle)
    append("1er")
    pop()
    append(" avril 1976 que la startup Apple Computer est née, dans la maison d'enfance de Steve Jobs à Los Altos, en Californie.")
    toAnnotatedString()
}

fun fibo2(spanStyle: SpanStyle) = with(AnnotatedString.Builder("La racine carrée de ")) {
    pushStyle(spanStyle)
    append("2")
    pop()
    append(" a été le premier nombre irrationnel connu par les pythagoriciens. Sa valeur approchée est 1,414 213 562.")
    toAnnotatedString()
}

fun fibo3(spanStyle: SpanStyle) = with(AnnotatedString.Builder("Android ")) {
    pushStyle(spanStyle)
    append("3.0")
    pop()
    append(" n'a jamais été utilisé sur des téléphones : Android 3.0 Honeycomb était construit uniquement pour les tablettes.")
    toAnnotatedString()
}

fun fibo5(spanStyle: SpanStyle) =
    with(AnnotatedString.Builder("En alchimie, les 4 éléments, terre, eau, air, feu sont complétés d’un ")) {
        pushStyle(spanStyle)
        append("cinquième")
        pop()
        append(" élément ou “quintessence” : l’éther, qui est au centre de tout et dans lequel baignerait le cosmos.")
        toAnnotatedString()
    }

fun fibo8(spanStyle: SpanStyle) = with(AnnotatedString.Builder("")) {
    pushStyle(spanStyle)
    append("8")
    pop()
    append(" pouces étaient la première génération de disquettes. Lancées en 1967 par IBM, elles pouvaient stocker 80 000 caractères.")
    toAnnotatedString()
}

fun fibo13(spanStyle: SpanStyle) = with(AnnotatedString.Builder()) {
    pushStyle(spanStyle)
    append("13")
    pop()
    append(" est le code ASCII et Unicode exprimé en base 10 pour le retour chariot.")
    toAnnotatedString()
}

fun fibo21(spanStyle: SpanStyle) = with(AnnotatedString.Builder("Le binaire de ")) {
    pushStyle(spanStyle)
    append("21")
    pop()
    append(" est 10101 qui est palindrome.")
    toAnnotatedString()
}

fun fibo40(spanStyle: SpanStyle) = with(
    AnnotatedString.Builder(
        "En 1996, le tout premier serveur des créateurs\n" +
            "de Google représentait un stockage de "
    )
) {
    pushStyle(spanStyle)
    append("40")
    pop()
    append("Go et il était installé sur des briques de Lego.")
    toAnnotatedString()
}

fun fibo100(spanStyle: SpanStyle) = with(
    AnnotatedString.Builder(
        "Le nom « Google » vient du mot « Googol »" +
            "(ou « Gogol » en français), un terme mathématique qui vaut 10 puissance 100, c’est-à-dire un 1 suivi de "
    )
) {
    pushStyle(spanStyle)
    append("100")
    pop()
    append(" zéros.")
    toAnnotatedString()
}

fun fiboQuestion(spanStyle: SpanStyle) =
    with(AnnotatedString.Builder("Aux échecs, en notation algébrique : « ")) {
        pushStyle(spanStyle)
        append("?")
        pop()
        append(" » signale un mauvais coup, « ?? » une erreur grossière, « ?! » un coup douteux, « !? » un coup intéressant.")
        toAnnotatedString()
    }