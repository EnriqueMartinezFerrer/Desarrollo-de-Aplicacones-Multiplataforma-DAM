package com.example.t3_listas_ret.model

class Usuario(var nombre: String, var imagen: Int, var telefono: Int) {

    override fun toString(): String {
        return nombre
    }
}