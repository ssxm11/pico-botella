package com.example.picobotella.data.local

import androidx.room.*
import androidx.room3.Dao
import kotlinx.coroutines.flow.Flow

@Dao
interface RetoDao {
    @Query("SELECT * FROM retos ORDER BY fechaCreacion DESC")
    fun getAllRetos(): Flow<List<RetoEntity>>

    @Insert
    suspend fun insertReto(reto: RetoEntity)

    @Update
    suspend fun updateReto(reto: RetoEntity)

    @Delete
    suspend fun deleteReto(reto: RetoEntity)

    @Query("SELECT * FROM retos ORDER BY RANDOM() LIMIT 1")
    suspend fun getRetoAleatorio(): RetoEntity?
}