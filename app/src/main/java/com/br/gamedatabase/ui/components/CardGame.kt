package com.br.gamedatabase.ui.components

import android.graphics.drawable.Icon
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.Icon
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.br.gamedatabase.R
import com.br.gamedatabase.ui.theme.GameDatabaseTheme

@Composable
fun CardGame() {
    Card(
        modifier =Modifier.width(142.dp)
            .height(188.dp),
        colors = CardColors(
            containerColor =  Color(0xFF636363),
            contentColor = Color(0xFF636363),
            disabledContainerColor = Color(0xFF636363),
            disabledContentColor = Color(0xFF636363)
        ),
        content = {

            Box {

                Box {
                    Image(
                        modifier = Modifier.fillMaxSize(),
                        painter = painterResource(R.drawable.ic_no_image_gallery),
                        contentDescription = "icone",
                    )
                }

                Box(
                    modifier = Modifier.align(Alignment.BottomStart)
                        .padding(6.dp)
                        .fillMaxWidth()
                ) {
                    Column {
                        Text(
                            text = "New Game",
                            fontFamily = poppis,
                            color = Color.White,
                            fontSize = 20.sp
                        )
                        Text(
                            text ="Action",
                            fontFamily = poppis,
                            color = Color.White,
                            fontSize = 12.sp
                        )
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Row(
                                horizontalArrangement = Arrangement.Center,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text(text ="4.5",
                                    fontFamily = poppis,
                                    color = Color.White,
                                    fontSize = 10.sp,
                                )
                                Icon(
                                    modifier = Modifier.size(16.dp),
                                    imageVector = Icons.Default.Star,
                                    contentDescription = "Star icon",
                                    tint = Color.Yellow
                                )
                            }
                            Text(
                                text ="Install",
                                fontFamily = poppis,
                                color = Color.White,
                                fontSize = 10.sp
                            )
                        }
                    }
                }
            }
        }
    )
}

val poppis = FontFamily(
    Font(R.font.poppinsregular)
)

@Preview
@Composable
private fun CardGamePreview() {
    GameDatabaseTheme {
        CardGame()
    }
}