package com.example.picobotella.data.repository

import com.example.picobotella.data.local.RetoDao
import com.example.picobotella.data.local.toDomain
import com.example.picobotella.data.local.toEntity
import com.example.picobotella.domain.model.Reto
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class RetoRepository @Inject constructor(
    private val retoDao: RetoDao
) {
    val allRetos: Flow<List<Reto>> =
        retoDao.getAllRetos().map { list -> list.map { it.toDomain() } }

    suspend fun insertReto(reto: Reto) = retoDao.insertReto(reto.toEntity())
    suspend fun updateReto(reto: Reto) = retoDao.updateReto(reto.toEntity())
    suspend fun deleteReto(reto: Reto) = retoDao.deleteReto(reto.toEntity())
    suspend fun getRetoAleatorio(): Reto? = retoDao.getRetoAleatorio()?.toDomain()
}