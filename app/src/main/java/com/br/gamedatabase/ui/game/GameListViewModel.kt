package com.br.gamedatabase.ui.game

import android.util.Log
import kotlinx.coroutines.launch
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.br.gamedatabase.data.repository.GameRepository
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.MutableStateFlow

class GameListViewModel(
    val gameRepository: GameRepository
) : ViewModel() {

    private val _state = MutableStateFlow(GameUiState())

    val state: StateFlow<GameUiState> = _state

    fun handle(intent: GameListIntent){
        when(intent){
            is GameListIntent.LoadTredingGames -> loadTrendingGames()
            is GameListIntent.LoadPopularGames -> loadPopularGames()
            is GameListIntent.LoadCategories -> loadCategories()
        }
    }

    private fun loadTrendingGames() {
        viewModelScope.launch {

            val gamesRemoteSource = gameRepository.getAllGames()
            val list = mutableListOf<Game>()
            gamesRemoteSource.results.forEach {
                list.add(Game(it.Name, it.BackgroundImage, it.Rating, 0F, it.Reviews, ""))
            }

            _state.emit(_state.value.copy(tredingGames = list))
        }
    }

    private fun loadPopularGames() {
        viewModelScope.launch {

            val popularGames = gameRepository.getPopularGames()
            val list = mutableListOf<Game>()

            popularGames.results.forEach {
                list.add(Game(it.Name, it.BackgroundImage, it.Rating, 0F, it.Reviews, ""))
            }

            _state.emit(_state.value.copy(popularGames = list))
        }
    }

    private fun loadCategories() {
        viewModelScope.launch {
            val genres = gameRepository.getAllGenres()
            val list = mutableListOf<Category>()
            genres.results.forEach {
                list.add(Category(it.Id, it.Name))
            }
            _state.emit(_state.value.copy(categories = list))
        }
    }

}