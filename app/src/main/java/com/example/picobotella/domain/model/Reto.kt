package com.example.picobotella.domain.model

data class Reto(
    val id: Long = 0,
    val descripcion: String,
    val fechaCreacion: Long = System.currentTimeMillis()
)