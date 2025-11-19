package com.br.gamedatabase.ui.splash

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.br.gamedatabase.R
import com.br.gamedatabase.ui.theme.GameDatabaseTheme

@Composable
fun SplashScreen(modifier: Modifier = Modifier) {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
    ) { innerPadding ->
        Column(
            modifier = Modifier.padding(innerPadding)
                .fillMaxSize()
                .background(Color(0xFF171717)),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier.padding(innerPadding)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "GAME ",
                    fontFamily = poppinsBold,
                    fontSize = 36.sp,
                    color = Color.White
                )
                Text(
                    text = "Database",
                    fontFamily = poppinsBold,
                    fontSize = 36.sp,
                    color = Color.White
                )
            }
        }
    }

}

val poppinsBold = FontFamily(
    Font(R.font.poppinsbold)
)

@Preview
@Composable
private fun SplashScreenPreview() {
    GameDatabaseTheme {
        SplashScreen()
    }
}