package fr.publicissapient.planningpoker.ui.screen

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.google.accompanist.insets.LocalWindowInsets
import com.google.accompanist.insets.navigationBarsPadding
import com.google.accompanist.insets.rememberInsetsPaddingValues
import fr.publicissapient.planningpoker.R.string
import fr.publicissapient.planningpoker.data.CardRepository
import fr.publicissapient.planningpoker.model.Card
import fr.publicissapient.planningpoker.model.CardSuitType
import fr.publicissapient.planningpoker.model.CardSuitType.Fibonacci
import fr.publicissapient.planningpoker.ui.body.BodyWithBlop
import fr.publicissapient.planningpoker.ui.card.CardContent
import planningpoker.compose.toolbars.LargeTopAppBar
import fr.publicissapient.planningpoker.ui.fab.AnimatedSpeedDialFloatingActionButton
import planningpoker.compose.Layout
import planningpoker.compose.theme.PlanningPokerTheme
import planningpoker.compose.theme.Theme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CardListScreen(
    cardSuitType: CardSuitType,
    navigateToCard: (String) -> Unit = {},
    onBackClick: () -> Unit = {},
    onThemeChange: (theme: Theme) -> Unit,
) {
    // TODO-Scott (19 déc. 2021): ScrollBehavior is VERY Laggy currently, wait b/207957336
//    val decayAnimationSpec = rememberSplineBasedDecay<Float>()
//    val scrollBehavior = remember(decayAnimationSpec) {
//        TopAppBarDefaults.exitUntilCollapsedScrollBehavior(decayAnimationSpec)
//    }
    Scaffold(
//        modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = {
            CardListToolbar(onBackClick)
        },
        floatingActionButton = {
            AnimatedSpeedDialFloatingActionButton(
                modifier = Modifier.navigationBarsPadding(),
                onFabDialClick = onThemeChange
            )
        }) {
        BodyWithBlop {
            val cards =
                CardRepository.allCards()[cardSuitType]
            cards?.let {
                CardListContent(cards, navigateToCard)
            } ?: error("Unknown card suit!")
        }
    }
}

@Composable
private fun CardListToolbar(
//    scrollBehavior: TopAppBarScrollBehavior,
    onBackClick: () -> Unit
) {
    LargeTopAppBar(
        title = {
            Text("Choisissez votre carte")
        },
//        scrollBehavior = scrollBehavior,
        contentPadding = rememberInsetsPaddingValues(
            LocalWindowInsets.current.statusBars,
            applyBottom = false,
        ),
        navigationIcon = {
            IconButton(onClick = onBackClick) {
                Icon(
                    Icons.Default.ArrowBack,
                    contentDescription = stringResource(string.a11y_navigate_up)
                )
            }
        }
    )
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
private fun CardListContent(cards: List<Card>, navigateToCard: (String) -> Unit) {
    BoxWithConstraints(
        contentAlignment = Alignment.Center,
    ) {
        Column {
            LazyVerticalGrid(
                cells = GridCells.Fixed(Layout.columns),
                contentPadding = rememberInsetsPaddingValues(
                    insets = LocalWindowInsets.current.systemBars,
                    applyTop = false,
                    applyBottom = true,
                    additionalStart = Layout.bodyMargin,
                    additionalEnd = Layout.bodyMargin,
                ),
                modifier = Modifier.fillMaxSize(),
                horizontalArrangement = Arrangement.SpaceEvenly,
            ) {
                items(cards) { card ->
                    CardContent(
                        modifier = Modifier.padding(6.dp),
                        card = card,
                        width = this@BoxWithConstraints.maxWidth * .28f
                    ) {
                        navigateToCard(card.name)
                    }
                }
            }
            Spacer(modifier = Modifier.height(64.dp))
        }
    }
}

@Preview
@Composable
fun CardListScreenPreview() {
    PlanningPokerTheme() {
        CardListScreen(cardSuitType = Fibonacci) {}
    }
}
