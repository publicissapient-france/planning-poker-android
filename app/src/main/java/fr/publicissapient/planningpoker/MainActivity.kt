package fr.publicissapient.planningpoker

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.ui.platform.setContent
import fr.publicissapient.planningpoker.ui.PlanningPokerApp

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PlanningPokerApp()
        }
    }
}