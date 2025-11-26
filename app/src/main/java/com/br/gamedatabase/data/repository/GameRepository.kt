package com.br.gamedatabase.data.repository

import com.br.gamedatabase.data.Game
import com.br.gamedatabase.data.GameBaseResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface GameRepository {

    @GET("games")
    suspend fun getAllGames(): GameBaseResponse<Game>

    @GET("games")
    suspend fun getPopularGames(): GameBaseResponse<Game>

}