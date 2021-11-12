package fr.publicissapient.planningpoker

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import fr.publicissapient.planningpoker.ui.PlanningPokerApp

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PlanningPokerApp()
        }
    }
}
