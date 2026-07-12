package com.example.picobotella.data.remote

import retrofit2.http.GET

interface PokemonApiService {
    @GET("Biuni/PokemonGO-Pokedex/master/pokedex.json")
    suspend fun getPokedex(): PokedexResponse
}