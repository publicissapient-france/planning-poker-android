package fr.publicissapient.planningpoker.ui.screen

import androidx.compose.animation.rememberSplineBasedDecay
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
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
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.google.accompanist.insets.LocalWindowInsets
import com.google.accompanist.insets.navigationBarsPadding
import com.google.accompanist.insets.rememberInsetsPaddingValues
import fr.publicissapient.planningpoker.R
import fr.publicissapient.planningpoker.data.CardRepository
import fr.publicissapient.planningpoker.model.Card
import fr.publicissapient.planningpoker.model.CardSuitType
import fr.publicissapient.planningpoker.ui.body.BodyWithBlop
import fr.publicissapient.planningpoker.ui.card.CardContent
import fr.publicissapient.planningpoker.ui.design.LargeTopAppBar
import fr.publicissapient.planningpoker.ui.fab.AnimatedSpeedDialFloatingActionButton
import fr.publicissapient.planningpoker.common.compose.theme.PlanningPokerTheme
import fr.publicissapient.planningpoker.model.CardSuitType.Fibonacci

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CardListScreen(
    cardSuitType: CardSuitType,
    navigateToCard: (String) -> Unit = {},
    onBackClick: () -> Unit = {},
    onFabDialClick: (colors: ColorScheme) -> Unit = {}
) {
    val decayAnimationSpec = rememberSplineBasedDecay<Float>()
    val scrollBehavior = remember(decayAnimationSpec) {
        TopAppBarDefaults.exitUntilCollapsedScrollBehavior(decayAnimationSpec)
    }
    Scaffold(
        modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = {
            LargeTopAppBar(
                title = {
                    Text("Choisissez votre carte")
                },
                scrollBehavior = scrollBehavior,
                contentPadding = rememberInsetsPaddingValues(
                    LocalWindowInsets.current.statusBars,
                    applyBottom = false,
                ),
                navigationIcon = {
                    IconButton(onClick = onBackClick) {
                        Icon(
                            Icons.Default.ArrowBack,
                            contentDescription = stringResource(R.string.a11y_navigate_up)
                        )
                    }
                }
            )
        },
        floatingActionButton = {
            AnimatedSpeedDialFloatingActionButton(
                modifier = Modifier.navigationBarsPadding(),
                onFabDialClick = onFabDialClick
            )
        }) {
        BodyWithBlop {
            val cards = CardRepository().allCards(
                MaterialTheme.colorScheme.secondary,
                MaterialTheme.colorScheme.onSecondary
            )[cardSuitType]
            cards?.let {
                CardListContent(cards, navigateToCard)
            } ?: error("Unknown card suit!")
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
private fun CardListContent(cards: List<Card>, navigateToCard: (String) -> Unit) {
    BoxWithConstraints(
        contentAlignment = Alignment.Center
    ) {
        Column {
            LazyVerticalGrid(
                cells = GridCells.Fixed(3),
                contentPadding = PaddingValues(16.dp),
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
    PlanningPokerTheme {
        CardListScreen(cardSuitType = Fibonacci) {}
    }
}
