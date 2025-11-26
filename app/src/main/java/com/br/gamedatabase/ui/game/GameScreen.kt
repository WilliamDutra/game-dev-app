package com.br.gamedatabase.ui.game

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
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
import org.koin.androidx.compose.koinViewModel

@Composable
fun GameScreen(modifier: Modifier = Modifier) {

    val verticalScrollState = rememberScrollState()

    val viewModel: GameListViewModel = koinViewModel()
    val state = viewModel.state.collectAsState()

    LaunchedEffect(Unit) {
        viewModel.handle(GameListIntent.LoadCategories)
        viewModel.handle(GameListIntent.LoadTredingGames)
        viewModel.handle(GameListIntent.LoadPopularGames)
    }



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

            LazyRow (
                modifier = Modifier.padding(16.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ){
                items(state.value.categories){
                    Pill( modifier = Modifier, it.Name)
                }
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

                    LazyRow (
                        modifier = Modifier,
                        horizontalArrangement = Arrangement.spacedBy(16.dp)
                    ) {

                        items(state.value.tredingGames) { game ->

                            CardGame(
                                modifier = modifier,
                                title = game.name,
                                category = game.category,
                                thumbUrl = game.thumbnail,
                                rating = game.rate
                            )

                        }
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

                    LazyRow(
                        modifier = Modifier,
                        horizontalArrangement = Arrangement.spacedBy(16.dp)
                    ) {

                        items(state.value.popularGames) { game ->
                            PopularCard(
                                modifier = modifier,
                                name = game.name,
                                rating = game.rate,
                                downloads = game.downlods.toInt(),
                                reviews = game.reviews.toInt(),
                                thumbUrl = game.thumbnail,
                                category = game.category
                            )
                        }
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