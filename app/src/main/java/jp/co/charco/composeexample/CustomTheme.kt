package jp.co.charco.composeexample

import androidx.compose.Composable
import androidx.ui.core.CurrentTextStyleProvider
import androidx.ui.graphics.Color
import androidx.ui.material.MaterialColors
import androidx.ui.material.MaterialTheme
import androidx.ui.text.TextStyle

//val green = Color(0xFF1EB980.toInt())
//val grey = Color(0xFF26282F.toInt())
//private val themeColors = MaterialColors(
//    primary = green,
//    surface = grey,
//    onSurface = Color.White
//)

@Composable
fun CustomTheme(children: @Composable() () -> Unit) {
    MaterialTheme(/**colors = themeColors**/) {
        children()
//        val textStyle = TextStyle(color = Color.Red)
//        CurrentTextStyleProvider(value = textStyle) {
//            children()
//        }
    }
}