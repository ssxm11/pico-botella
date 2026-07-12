package com.example.picobotella.data.remote

data class PokedexResponse(val pokemon: List<PokemonDto>)

data class PokemonDto(
    val id: Int,
    val name: String,
    val img: String
)