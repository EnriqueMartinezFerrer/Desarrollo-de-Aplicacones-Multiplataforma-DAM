package EjercicioLlamada

open abstract class Llamada (var nOrigen: Int,var nDestino: Int,var duracion: Int){
    var coste: Double = 0.0;

    open fun mostrarDatos(){
        println("NOrigen $nOrigen")
        println("Destino $nDestino")
        println("Duración $duracion")
        println("Coste $coste")
    }

}