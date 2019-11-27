package jp.co.charco.composeexample

import androidx.compose.Model

sealed class Screen {
    object Home : Screen()
}

@Model
object NavigationManager {
    private var _currentScreen: Screen = Screen.Home

    val currentScreen: Screen
        get() = _currentScreen

    fun navigateTo(destination: Screen) {
        _currentScreen = destination
    }
}