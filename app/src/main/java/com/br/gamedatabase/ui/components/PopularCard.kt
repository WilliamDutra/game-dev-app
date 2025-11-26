package com.br.gamedatabase.ui.components

import android.view.RoundedCorner
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.br.gamedatabase.R
import com.br.gamedatabase.ui.theme.GameDatabaseTheme
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun PopularCard(
    modifier: Modifier = Modifier,
    thumbUrl: String,
    name: String,
    category: String,
    downloads: Int,
    rating: Float,
    reviews: Int
) {
    Card(
        modifier = Modifier.height(118.dp)
            .width(374.dp),
        shape = RoundedCornerShape(25.dp),
        colors = CardDefaults.cardColors(
            contentColor = Color.White,
            containerColor = Color.White,
            disabledContainerColor = Color.White,
            disabledContentColor = Color.White
        )
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
                .padding(8.dp),
            verticalArrangement = Arrangement.Center
        ) {

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {

                GlideImage(
                    modifier = Modifier.height(90.dp)
                        .width(160.dp),
                    model = thumbUrl,
                    contentDescription = "image",
                    contentScale = ContentScale.Crop,
                    requestBuilderTransform = {
                        it.apply(RequestOptions.bitmapTransform(RoundedCorners(25)))
                        it.placeholder(R.drawable.ic_no_image_gallery)
                    }
                )

                Column() {

                    Text(
                        text = name,
                        fontFamily = poppisSemiBold,
                        color = Color.Black
                    )

                    Text(
                        text = category,
                        fontFamily = poppis,
                        fontSize = 10.sp,
                        color = Color.Black
                    )
                    
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        Column {

                            Text(
                                text = "$downloads +",
                                fontFamily = poppisSemiBold,
                                fontSize = 10.sp,
                                color = Color.Black
                            )

                            Text(
                                text = "Downloads",
                                fontFamily = poppis,
                                fontSize = 8.sp,
                                color = Color.Black
                            )
                        }

                        Column {
                            Text(
                                text = rating.toString(),
                                fontFamily = poppisSemiBold,
                                fontSize = 10.sp,
                                color = Color.Black
                            )

                            Text(
                                text ="$reviews Reviews",
                                fontFamily = poppis,
                                fontSize = 8.sp,
                                color = Color.Black)
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true, backgroundColor = 0xFF00FF00)
@Composable
private fun PopularCardPreview() {
    GameDatabaseTheme {
        PopularCard(
            thumbUrl = "",
            name = "Minecraft",
            category = "Adventure, Online",
            downloads = 100000,
            rating = 5.0F,
            reviews = 40000
        )
    }
}