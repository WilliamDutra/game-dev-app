package com.br.gamedatabase.ui.components

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
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.Icon
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.br.gamedatabase.R
import com.br.gamedatabase.ui.theme.GameDatabaseTheme
import com.br.gamedatabase.ui.theme.SecondaryColor
import com.br.gamedatabase.ui.theme.poppinsRegular
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun TrendingCard(
    modifier: Modifier = Modifier,
    thumbUrl: String,
    title: String,
    category: String,
    rating: Float,
    onClick: ()-> Unit
) {
    Card(
        modifier =Modifier
            .width(142.dp)
            .height(188.dp),
        onClick = onClick,
        colors = CardColors(
            containerColor = SecondaryColor,
            contentColor = SecondaryColor,
            disabledContainerColor = SecondaryColor,
            disabledContentColor = SecondaryColor
        ),
        content = {

            Box {

                Box {
                    GlideImage(
                        modifier = Modifier.fillMaxSize(),
                        model = thumbUrl,
                        contentDescription = "image",
                        requestBuilderTransform = { it ->
                            it.placeholder(R.drawable.ic_no_image_gallery)
                        },
                        contentScale = ContentScale.FillBounds
                    )
                }

                Box(
                    modifier = Modifier
                        .align(Alignment.BottomStart)
                        .padding(6.dp)
                        .fillMaxWidth()
                ) {
                    Column {
                        Text(
                            text = title,
                            fontFamily = poppinsRegular,
                            color = Color.White,
                            fontSize = 20.sp
                        )
                        Text(
                            text = category,
                            fontFamily = poppinsRegular,
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
                                Text(
                                    text = rating.toString(),
                                    fontFamily = poppinsRegular,
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
                                fontFamily = poppinsRegular,
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

@Preview
@Composable
private fun TrendingCardPreview() {
    GameDatabaseTheme {
        TrendingCard(
            modifier = Modifier,
            thumbUrl = "https://fastly.picsum.photos/id/807/200/300.jpg?hmac=9ZZk1Nj28qIecGuVvozSN7I4LW0zotTPqeYfdGR3YdE",
            title = "New Game",
            category = "Adventure",
            rating = 4.8F,
            onClick = { }
        )
    }
}