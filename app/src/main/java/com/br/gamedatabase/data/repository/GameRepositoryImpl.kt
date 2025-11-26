package com.br.gamedatabase.data.repository

import com.br.gamedatabase.data.Game
import com.br.gamedatabase.data.GameBaseResponse

class GameRepositoryImpl(
    val gameRepository: GameRepository
){

    suspend fun getAllGames() : GameBaseResponse<Game> {
        return gameRepository.getAllGames()
    }

}