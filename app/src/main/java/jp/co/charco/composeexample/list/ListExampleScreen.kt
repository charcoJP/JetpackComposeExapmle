package jp.co.charco.composeexample.list

import androidx.compose.Composable
import androidx.compose.ambient
import androidx.compose.unaryPlus
import androidx.ui.core.ContextAmbient
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.foundation.VerticalScroller
import androidx.ui.graphics.imageFromResource
import androidx.ui.layout.Column
import androidx.ui.layout.FlexColumn
import androidx.ui.layout.Padding
import androidx.ui.material.AppBarIcon
import androidx.ui.material.ListItem
import androidx.ui.material.TopAppBar
import androidx.ui.material.surface.Card
import androidx.ui.material.themeTextStyle
import androidx.ui.tooling.preview.Preview
import jp.co.charco.composeexample.NavigationManager
import jp.co.charco.composeexample.R
import jp.co.charco.composeexample.Screen

@Composable
fun ListExampleScreen() {
    Content()
}

@Composable
private fun Content() {
    val context = +ambient(ContextAmbient)

    // LinearLayout (orientation: Vertical)
    FlexColumn {
        // height: wrap_content
        inflexible {
            TopAppBar(
                title = {
                    Text(
                        text = "リスト",
                        style = +themeTextStyle { subtitle1 }
                    )
                },
                navigationIcon = {
                    AppBarIcon(
                        imageFromResource(context.resources, R.drawable.arrow_back)
                    ) {
                        NavigationManager.navigateTo(Screen.Home)
                    }
                }
            )
        }
        // height: 0dp + weight: 1
        flexible(1f) {
            VerticalScroller {
                Column {
                    ListItems()
                }
            }
        }
    }
}

@Composable
private fun ListItems() {
    (0..20).map {
        Padding(padding = 8.dp) {
            Card(elevation = 4.dp) {
                Column {
                    ListItem(
                        text = it.toString(),
                        onClick = {

                        })
                }
            }
        }
    }
}

@Preview
@Composable
fun Preview() {
    ListExampleScreen()
}

