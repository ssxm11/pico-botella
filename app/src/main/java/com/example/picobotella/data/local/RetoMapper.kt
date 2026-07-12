package com.example.picobotella.data.local

import com.example.picobotella.domain.model.Reto

fun RetoEntity.toDomain(): Reto = Reto(id, descripcion, fechaCreacion)
fun Reto.toEntity(): RetoEntity = RetoEntity(id, descripcion, fechaCreacion)
