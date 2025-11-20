package com.br.gamedatabase.ui.game

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.br.gamedatabase.R
import com.br.gamedatabase.ui.components.CardGame
import com.br.gamedatabase.ui.components.NavigationBarBottom
import com.br.gamedatabase.ui.components.Pill
import com.br.gamedatabase.ui.components.PopularCard
import com.br.gamedatabase.ui.components.SearchTextField
import com.br.gamedatabase.ui.theme.GameDatabaseTheme

@Composable
fun GameScreen(modifier: Modifier = Modifier) {

    val scrollState = rememberScrollState()
    val verticalScrollState = rememberScrollState()
    val popularScrollState = rememberScrollState()

    Scaffold(
        containerColor = Color(0xFF171717),
        bottomBar = {
            NavigationBarBottom()
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .padding(16.dp)
                .verticalScroll(verticalScrollState)
                .fillMaxSize()
        ) {
            Row() {



            }

            Spacer(Modifier.size(100.dp))

            Row(

            ) {
                SearchTextField(
                    modifier = Modifier,
                    placeholder = "Search games",
                )
            }

            Row(
                modifier = Modifier.padding(16.dp)
                    .horizontalScroll(scrollState),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ){
                Pill( modifier = Modifier, "Action")
                Pill( modifier = Modifier, "Adventure")
                Pill( modifier = Modifier, "Race")
                Pill( modifier = Modifier, "Platform")
            }

            Row() {
                Column {

                    Text(
                        modifier = Modifier,
                        text = "Trending games",
                        color = Color.White,
                        fontSize = 20.sp,
                        fontFamily = FontFamily(Font(R.font.poppinssemibold))
                    )

                    Spacer(modifier.height(12.dp))

                    Row(
                        modifier = Modifier.horizontalScroll(scrollState),
                        horizontalArrangement = Arrangement.spacedBy(16.dp)
                    ) {
                        CardGame(
                            modifier = modifier,
                            title = "Call Of Duty",
                            category = "FPS",
                            thumbUrl = "https://fastly.picsum.photos/id/807/200/300.jpg?hmac=9ZZk1Nj28qIecGuVvozSN7I4LW0zotTPqeYfdGR3YdE",
                            rating = 4.5F
                        )
                        CardGame(
                            modifier = modifier,
                            title = "Mario Galaxy",
                            category = "Plataform",
                            thumbUrl = "https://fastly.picsum.photos/id/807/200/300.jpg?hmac=9ZZk1Nj28qIecGuVvozSN7I4LW0zotTPqeYfdGR3YdE",
                            rating = 4.9F
                        )
                        CardGame(
                            modifier = modifier,
                            title = "Mario Kart",
                            category = "Race",
                            thumbUrl = "https://fastly.picsum.photos/id/807/200/300.jpg?hmac=9ZZk1Nj28qIecGuVvozSN7I4LW0zotTPqeYfdGR3YdE",
                            rating = 4.2F
                        )
                        CardGame(
                            modifier = modifier,
                            title = "Minecraft",
                            category = "Adventure",
                            thumbUrl = "https://fastly.picsum.photos/id/738/200/200.jpg?hmac=s1pXxIw4TdDLyUY2RRVeDyhLPUF2xW3AFjdzjVsE6zc",
                            rating = 4.9F
                        )
                        CardGame(
                            modifier = modifier,
                            title = "Need for speed",
                            category = "Race",
                            thumbUrl = "https://fastly.picsum.photos/id/983/200/200.jpg?hmac=dWGIQKhPUTlF4pkeYDou10SJkQTJDRGf4usmJS38cNY",
                            rating = 4.1F
                        )
                    }

                    Spacer(modifier.height(12.dp))

                    Text(
                        modifier = Modifier,
                        text = "Popular games",
                        color = Color.White,
                        fontSize = 20.sp,
                        fontFamily = FontFamily(Font(R.font.poppinssemibold))
                    )

                    Spacer(modifier.height(12.dp))

                    Row(
                        modifier = Modifier.horizontalScroll(popularScrollState),
                        horizontalArrangement = Arrangement.spacedBy(16.dp)
                    ) {

                        PopularCard(
                            modifier = modifier,
                            name = "Minecraft",
                            rating = 4.9F,
                            downloads = 40000,
                            reviews = 4700,
                            thumbUrl = "https://fastly.picsum.photos/id/640/200/200.jpg?hmac=iFmWtlROU2QVjs0GSK5LASqVkXu6yl8MIQHJrpra6PA",
                            category = "Adventure, Online"
                        )

                        PopularCard(
                            modifier = modifier,
                            name = "FC Sports",
                            rating = 4.2F,
                            downloads = 10000,
                            reviews = 700,
                            thumbUrl = "https://fastly.picsum.photos/id/456/400/300.jpg?hmac=45N0vRoFFoGis2BqBTFo0-VumYuCawud0drkuavo-HA",
                            category = "Sports, Online"
                        )

                        PopularCard(
                            modifier = modifier,
                            name = "Clash Royale",
                            rating = 4.8F,
                            downloads = 20000,
                            reviews = 2700,
                            thumbUrl = "https://fastly.picsum.photos/id/509/200/200.jpg?hmac=F3VucjvZ_2eEx_ObPM7NJ_Ymq5jESSGCuXo_8japTZc",
                            category = "Sports, Online, Startegy"
                        )

                    }
                }
            }

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