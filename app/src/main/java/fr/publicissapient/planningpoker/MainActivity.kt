package fr.publicissapient.planningpoker

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.setContent
import androidx.ui.tooling.preview.Preview
import fr.publicissapient.planningpoker.data.CARDS
import fr.publicissapient.planningpoker.ui.CardScreen

class MainActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContent {
			CardScreen(
				imageResourceId = CARDS.red[0].imageResourceId,
				description = CARDS.red[0].description
			)
		}
	}
}

@Composable
fun Greeting(name: String) {
	Text(text = "Hello $name")
}

@Preview
@Composable
fun PreviewGreeting() {
	Greeting("Android")
}