package EjercicioLlamada

fun main() {

    var centralita : Centralita = Centralita();
    centralita.registrarLlamada(LlamadaLocal(1,2,3,"Alcorcón"))
    centralita.registrarLlamada(LlamadaLocal(1,2,3,"Pozuelo"))
    centralita.registrarLlamada(LLamadaNacional(1,2,3,4))
    centralita.registrarLlamada(LLamadaNacional(1,2,3,4))
    centralita.registrarLlamada(LlamadaProvincia(1,2,3))
    centralita.registrarLlamada(LlamadaProvincia(1,2,3))

    centralita.listarLlamadas()

}