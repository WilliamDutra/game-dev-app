package com.br.gamedatabase.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.rememberCoroutineScope
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController
import com.br.gamedatabase.ui.game.GameScreen
import com.br.gamedatabase.ui.splash.SplashScreen
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun AppNavHost() {
    val navController = rememberNavController()
    val coroutineScope = rememberCoroutineScope()


    NavHost(navController = navController, startDestination = "splash"){
        composable(Screen.Splash.route) {

            SplashScreen()

            LaunchedEffect(Unit) {
                delay(3000)
                navController.navigate("game"){
                    popUpTo("splash"){
                        inclusive = true
                    }
                }
            }
        }
        composable(Screen.Game.route) {
            GameScreen()
        }
    }

}