package Clases

class Jugador (id: Int, nombre: String,var posicion: String, var valor: Int) : Comun(id, nombre) {

    constructor(id: Int, nombre: String, posicion: String, valor: Int) : this(id, nombre){
        // setter
        this.posicion = posicion;
        this.valor = valor;
    }

    override fun mostrarDatos(){
        println("Jugador:")
        super.mostrarDatos()
        println("Posicion: $posicion")
        println("Valor: $valor")
    }




}