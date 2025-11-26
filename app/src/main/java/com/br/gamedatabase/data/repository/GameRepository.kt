package com.br.gamedatabase.data.repository

import com.br.gamedatabase.data.Game
import com.br.gamedatabase.data.GameBaseResponse
import com.br.gamedatabase.data.Genre
import retrofit2.http.GET
import retrofit2.http.Query

interface GameRepository {

    @GET("games")
    suspend fun getAllGames(): GameBaseResponse<Game>

    @GET("games")
    suspend fun getPopularGames(
        @Query("ordering") ordering: String = "-rating",
        @Query("page_size") pageSize: Int = 20
    ): GameBaseResponse<Game>

    @GET("genres")
    suspend fun getAllGenres(): GameBaseResponse<Genre>

}