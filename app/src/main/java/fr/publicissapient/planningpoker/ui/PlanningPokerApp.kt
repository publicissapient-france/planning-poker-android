package fr.publicissapient.planningpoker.ui

import android.content.Context
import android.content.ContextWrapper
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import planningpoker.compose.theme.PlanningPokerTheme
import planningpoker.compose.theme.Theme
import planningpoker.compose.theme.ThemeSaver

@Composable
fun PlanningPokerApp() {

    var theme by rememberSaveable(stateSaver = ThemeSaver) { mutableStateOf(Theme()) }
    PlanningPokerTheme(theme = theme) {
        NavGraph(
            onThemeChange = { theme = it }
        )
    }
}

inline fun <reified T : Context> Context.findBaseContext(): T? {
    var ctx: Context? = this
    do {
        if (ctx is T) {
            return ctx
        }
        if (ctx is ContextWrapper) {
            ctx = ctx.baseContext
        }
    } while (ctx != null)

    // If we reach here, there's not an Context of type T in our Context hierarchy
    return null
}
