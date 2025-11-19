package com.br.gamedatabase.ui.game

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.br.gamedatabase.ui.theme.GameDatabaseTheme

@Composable
fun GameScreen(modifier: Modifier = Modifier) {
    Scaffold { innerPadding ->
        Column(
            modifier = Modifier.padding(innerPadding)
        ) {
            
        }
    }
}

@Preview
@Composable
private fun GameScreenPreview() {
    GameDatabaseTheme {
        GameScreen()
    }
}