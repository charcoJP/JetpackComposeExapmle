package jp.co.charco.composeexample.list

import androidx.compose.Composable
import androidx.ui.foundation.VerticalScroller
import androidx.ui.layout.Column
import androidx.ui.material.Divider
import androidx.ui.material.ListItem
import androidx.ui.tooling.preview.Preview

@Composable
fun MinimumListExampleScreen() {
    VerticalScroller {
        Column {
            (0..20).map {
                ListItem(
                    text = it.toString(),
                    onClick = { /** TODO: タップ時の処理 **/ }
                )
                Divider()
            }
        }
    }
}

@Preview
@Composable
fun MinimumListExampleScreenPreview() {
    MinimumListExampleScreen()
}

