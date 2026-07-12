package com.example.picobotella.data.repository

import com.example.picobotella.data.remote.PokemonApiService
import com.example.picobotella.data.remote.PokemonDto
import javax.inject.Inject

class PokemonRepository @Inject constructor(
    private val api: PokemonApiService
) {
    suspend fun getRandomPokemon(): Result<PokemonDto> = try {
        val pokedex = api.getPokedex()
        Result.success(pokedex.pokemon.random())
    } catch (e: Exception) {
        Result.failure(e)
    }
}