package planningpoker.compose.toolbars

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

/**
 * A wrapper around [TopAppBar] which supports the setting of [contentPadding] to add
 * internal padding. This is especially useful in conjunction with insets.
 *
 * For an edge-to-edge layout, typically you would use the
 * [com.google.accompanist.insets.WindowInsets.systemBars] insets like so below:
 *
 * @sample com.google.accompanist.sample.insets.TopAppBar_Insets
 */
@Composable
@Suppress("LongParameterList")
fun LargeTopAppBar(
    title: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    contentPadding: PaddingValues = PaddingValues(0.dp),
    navigationIcon: @Composable (() -> Unit) = {},
    actions: @Composable RowScope.() -> Unit = {},
    colors: TopAppBarColors = TopAppBarDefaults.largeTopAppBarColors(),
    scrollBehavior: TopAppBarScrollBehavior? = null
) {
    val scrollFraction = scrollBehavior?.scrollFraction ?: 0f
    val appBarContainerColor by colors.containerColor(scrollFraction)
    Surface(
        color = appBarContainerColor,
        modifier = modifier
    ) {
        androidx.compose.material3.LargeTopAppBar(
            title = title,
            navigationIcon = navigationIcon,
            actions = actions,
            colors = colors,
            scrollBehavior = scrollBehavior,
            modifier = Modifier.padding(contentPadding)
        )
    }
}


/**
 * A wrapper around [TopAppBar] which supports the setting of [contentPadding] to add
 * internal padding. This is especially useful in conjunction with insets.
 *
 * For an edge-to-edge layout, typically you would use the
 * [com.google.accompanist.insets.WindowInsets.systemBars] insets like so below:
 *
 * @sample com.google.accompanist.sample.insets.TopAppBar_Insets
 */
@Composable
@Suppress("LongParameterList")
fun MediumTopAppBar(
    title: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    contentPadding: PaddingValues = PaddingValues(0.dp),
    navigationIcon: @Composable (() -> Unit) = {},
    actions: @Composable RowScope.() -> Unit = {},
    colors: TopAppBarColors = TopAppBarDefaults.largeTopAppBarColors(),
    scrollBehavior: TopAppBarScrollBehavior? = null
) {
    val scrollFraction = scrollBehavior?.scrollFraction ?: 0f
    val appBarContainerColor by colors.containerColor(scrollFraction)
    Surface(
        color = appBarContainerColor,
        modifier = modifier
    ) {
        androidx.compose.material3.MediumTopAppBar(
            title = title,
            navigationIcon = navigationIcon,
            actions = actions,
            colors = colors,
            scrollBehavior = scrollBehavior,
            modifier = Modifier.padding(contentPadding)
        )
    }
}

@Composable
@Suppress("LongParameterList")
fun SmallTopAppBar(
    title: @Composable () -> Unit = {},
    modifier: Modifier = Modifier,
    contentPadding: PaddingValues = PaddingValues(0.dp),
    navigationIcon: @Composable (() -> Unit) = {},
    actions: @Composable RowScope.() -> Unit = {},
    colors: TopAppBarColors = TopAppBarDefaults.largeTopAppBarColors(),
    scrollBehavior: TopAppBarScrollBehavior? = null
) {
    val scrollFraction = scrollBehavior?.scrollFraction ?: 0f
    val appBarContainerColor by colors.containerColor(scrollFraction)
    Surface(
        color = appBarContainerColor,
        modifier = modifier
    ) {
        androidx.compose.material3.SmallTopAppBar(
            title = title,
            navigationIcon = navigationIcon,
            actions = actions,
            colors = colors,
            scrollBehavior = scrollBehavior,
            modifier = Modifier.padding(contentPadding)
        )
    }
}
