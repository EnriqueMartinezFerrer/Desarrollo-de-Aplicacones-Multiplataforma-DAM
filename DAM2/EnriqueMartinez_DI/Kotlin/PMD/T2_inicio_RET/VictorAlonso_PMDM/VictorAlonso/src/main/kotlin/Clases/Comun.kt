package Clases

abstract class Comun(var id: Int, var nombre: String) {


    fun mostrarDatos() {
        println("ID: $id")
        println("Nombre: $nombre")
    }
}