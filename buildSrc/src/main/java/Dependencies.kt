object AndroidX {

    private const val core_version = "1.3.1"
    private const val appcompat_version = "1.2.0"
    private const val material_version = "1.2.1"

    val core = "androidx.core:core-ktx:$core_version"
    val appcompat = "androidx.appcompat:appcompat:$appcompat_version"
    val material = "com.google.android.material:material:$material_version"
}

object Compose {

    private const val compose_version = "1.0.0-alpha04"

    val ui = "androidx.compose.ui:ui:$compose_version"

    // Tooling support (Previews, etc.)
    val tooling = "androidx.ui:ui-tooling:$compose_version"

    // Foundation (Border, Background, Box, Image, Scroll, shapes, animations, etc.)
    val foundation = "androidx.compose.foundation:foundation:$compose_version"

    // Material Design
    val material = "androidx.compose.material:material:$compose_version"

    // Material design icons
    val material_icon = "androidx.compose.material:material-icons-core:$compose_version"
    val material_icons_extended =
        "androidx.compose.material:material-icons-extended:$compose_version"

    // Integration with observables
    val runtime_livedata = "androidx.compose.runtime:runtime-livedata:$compose_version"
    val runtime_rxjava2 = "androidx.compose.runtime:runtime-rxjava2:$compose_version"
}

object Test {
    private const val junit_version = "4.13"
    private const val mockito_version = "2.24.0"

    val junit = "junit:junit:$junit_version"
    val mockito_core = "org.mockito:mockito-core:$mockito_version"
}
