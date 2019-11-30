package jp.co.charco.composeexample.home

import androidx.compose.Composable
import androidx.compose.Model
import androidx.compose.unaryPlus
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.graphics.Color
import androidx.ui.layout.Column
import androidx.ui.layout.CrossAxisAlignment
import androidx.ui.layout.ExpandedHeight
import androidx.ui.layout.Spacing
import androidx.ui.material.Button
import androidx.ui.material.ContainedButtonStyle
import androidx.ui.material.Divider
import androidx.ui.material.themeTextStyle
import androidx.ui.tooling.preview.Preview
import jp.co.charco.composeexample.NavigationManager
import jp.co.charco.composeexample.Screen

@Composable
fun HomeScreen() {
    MyScreenContent()
}

@Composable
private fun MyScreenContent(
    names: List<String> = listOf("Android", "there"),
    counterState: CounterState = CounterState()
) {
    Column(crossAxisAlignment = CrossAxisAlignment.Center) {
        Column(crossAxisAlignment = CrossAxisAlignment.Center) {
            for (name in names) {
                HelloWorld(name = name)
                Divider(color = Color.Black)
            }
            Divider(color = Color.Transparent, height = 32.dp)
        }
        Buttons(counterState = counterState)
    }
}

@Composable
private fun HelloWorld(name: String) {
    Text(
        text = "Hello $name!",
        modifier = Spacing(24.dp),
        style = +themeTextStyle { h1 })
}

@Composable
private fun Buttons(counterState: CounterState) {
    CounterButton(state = counterState)
    Button(text = "ListExampleScreen", onClick = {
        NavigationManager.navigateTo(Screen.ListExample)
    })
    Button(text = "MinimumListExampleScreen", onClick = {
        NavigationManager.navigateTo(Screen.MinimumListExample)
    })
}

@Composable
private fun CounterButton(state: CounterState) {
    // state は MyScreenContent で生成されているが、再描画は実際に利用している
    // このスコープだけ行われる
    Button(
        text = "I've been clicked ${state.count} times",
        onClick = {
            state.count++
        },
        style = ContainedButtonStyle(color = if (state.count % 2 == 0) Color.Green else Color.White)
    )
}

@Model
private class CounterState(var count: Int = 0)

@Preview
@Composable
fun DefaultPreview() {
    MyScreenContent()
}

