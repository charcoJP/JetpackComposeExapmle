package jp.co.charco.composeexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.setContent
import androidx.ui.graphics.Color
import androidx.ui.material.surface.Surface
import jp.co.charco.composeexample.home.HomeScreen
import jp.co.charco.composeexample.list.ListExampleScreen
import jp.co.charco.composeexample.list.MinimumListExampleScreen

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp {
                when (NavigationManager.currentScreen) {
                    is Screen.Home -> HomeScreen()
                    is Screen.ListExample -> ListExampleScreen()
                    is Screen.MinimumListExample -> MinimumListExampleScreen()
                }
            }
        }
    }
}

@Composable
fun MyApp(children: @Composable() () -> Unit) {
    CustomTheme {
        Surface(color = Color.White) {
            children()
        }
    }
}
