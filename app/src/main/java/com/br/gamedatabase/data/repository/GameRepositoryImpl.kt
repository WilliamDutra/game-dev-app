package com.br.gamedatabase.data.repository

import com.br.gamedatabase.data.Game
import com.br.gamedatabase.data.GameBaseResponse
import com.br.gamedatabase.data.Genre

class GameRepositoryImpl(
    val gameRepository: GameRepository
){

    suspend fun getAllGames() : GameBaseResponse<Game> {
        return gameRepository.getAllGames()
    }

    suspend fun getAllGenres() : GameBaseResponse<Genre> {
        return gameRepository.getAllGenres()
    }

}