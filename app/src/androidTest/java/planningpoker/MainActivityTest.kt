package planningpoker

import androidx.ui.test.createAndroidComposeRule
import fr.publicissapient.planningpoker.MainActivity
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class MainActivityTest {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()

    @Before
    fun setUp() {
    }

    @Test
    fun shouldGreetByName() {
        composeTestRule.setContent {
            // TODO
        }

        // TODO
//        composeTestRule
//            .onNodeWithText("")
//            .assertIsDisplayed()
    }
}