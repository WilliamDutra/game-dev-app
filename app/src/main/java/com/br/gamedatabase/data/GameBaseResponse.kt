package com.br.gamedatabase.data

class GameBaseResponse<K>(
    val count: Int,
    val results: List<K>
)