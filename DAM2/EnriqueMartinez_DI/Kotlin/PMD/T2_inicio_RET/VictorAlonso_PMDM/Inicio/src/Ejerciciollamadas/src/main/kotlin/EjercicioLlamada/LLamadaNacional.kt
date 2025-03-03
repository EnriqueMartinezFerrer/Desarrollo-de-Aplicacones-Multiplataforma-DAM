package EjercicioLlamada

class LLamadaNacional(nOrigen: Int, nDestino: Int, duracion: Int, var franja: Int) : Llamada (nOrigen,nDestino,duracion){

    // coste = franja * duracion

    init {
        when (franja) {
            1 -> { coste = duracion * 0.20 }
            2 -> { coste = duracion * 0.25 }
            3 -> { coste = duracion * 0.30 }
        }
    }

    override fun mostrarDatos() {
        println("Llamada nadional")
        super.mostrarDatos()
        println("Franja ${franja}")
    }

}