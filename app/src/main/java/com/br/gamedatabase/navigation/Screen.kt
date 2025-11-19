package com.br.gamedatabase.navigation

import kotlinx.serialization.Serializable

@Serializable
sealed class Screen(val route: String) {
    @Serializable
    object Splash : Screen("splash")
    @Serializable
    object Game: Screen("game")
}