package com.br.gamedatabase.ui.game

data class GameUiState (
    val tredingGames: List<Game> = emptyList(),
    val popularGames: List<Game> = emptyList(),
    val categories: List<Category> = emptyList(),
    val isLoading: Boolean = false
)