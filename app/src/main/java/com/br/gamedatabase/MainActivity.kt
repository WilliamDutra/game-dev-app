package com.br.gamedatabase

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.br.gamedatabase.navigation.AppNavHost
import com.br.gamedatabase.ui.theme.GameDatabaseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GameDatabaseTheme {
                AppNavHost()
            }
        }
    }
}
