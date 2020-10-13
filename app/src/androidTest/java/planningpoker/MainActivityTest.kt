package planningpoker

import androidx.ui.test.assertIsDisplayed
import androidx.ui.test.createAndroidComposeRule
import androidx.ui.test.onNodeWithText
import fr.publicissapient.planningpoker.Greeting
import fr.publicissapient.planningpoker.MainActivity
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class MainActivityTest {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>(disableTransitions = true)

    @Before
    fun setUp() {
    }

    @Test
    fun shouldGreetByName() {
        composeTestRule.setContent {
            Greeting(name = "John")
        }

        composeTestRule
            .onNodeWithText("Hello John")
            .assertIsDisplayed()
    }
}