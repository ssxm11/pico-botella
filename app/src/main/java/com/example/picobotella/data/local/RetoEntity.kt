package com.example.picobotella.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room3.Entity

@Entity(tableName = "retos")
data class RetoEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val descripcion: String,
    val fechaCreacion: Long = System.currentTimeMillis()
)