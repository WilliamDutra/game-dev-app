package com.br.gamedatabase.ui.game

sealed interface GameListIntent {

    object LoadPopularGames: GameListIntent

    object LoadTredingGames: GameListIntent

    object LoadCategories: GameListIntent

}