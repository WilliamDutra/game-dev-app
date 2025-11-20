package com.br.gamedatabase.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Explore
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.br.gamedatabase.ui.theme.GameDatabaseTheme

@Composable
fun NavigationBarBottom(modifier: Modifier = Modifier) {
    BottomAppBar(
        modifier = Modifier.background(Color.Red),
        containerColor = Color(0xFF282828),
        content = {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {

                IconButton(onClick = { /* do something */ }) {
                    Icon(Icons.Filled.Explore, contentDescription = "explore games", tint = Color.White)
                }
                IconButton(onClick = { /* do something */ }) {
                    Icon(Icons.Filled.Settings, contentDescription = "settings", tint = Color.White)
                }

            }
        }
    )
}

@Preview
@Composable
private fun NavigationBarBattomPreview() {
    GameDatabaseTheme {
        NavigationBarBottom()
    }
}