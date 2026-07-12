package com.example.picobotella.ui.retos

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.picobotella.data.repository.RetoRepository
import com.example.picobotella.domain.model.Reto
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class RetosViewModel @Inject constructor(
    private val repository: RetoRepository
) : ViewModel() {

    val retos = repository.allRetos

    fun agregarReto(descripcion: String) = viewModelScope.launch {
        repository.insertReto(Reto(descripcion = descripcion))
    }

    fun editarReto(reto: Reto) = viewModelScope.launch {
        repository.updateReto(reto)
    }

    fun eliminarReto(reto: Reto) = viewModelScope.launch {
        repository.deleteReto(reto)
    }
}