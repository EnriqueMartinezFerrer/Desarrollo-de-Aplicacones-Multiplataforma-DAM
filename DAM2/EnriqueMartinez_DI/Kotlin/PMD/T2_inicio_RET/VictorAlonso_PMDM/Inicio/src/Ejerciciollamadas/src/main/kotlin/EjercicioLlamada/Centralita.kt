package EjercicioLlamada

class Centralita {

    lateinit var listaLlamada: ArrayList<Llamada>;

    init {
        listaLlamada = ArrayList();
    }

    fun registrarLlamada(llamada: Llamada){
        listaLlamada?.add(llamada)
        print("Llamada registrada datos: ")
    }

    fun listarLlamadas(){
        listaLlamada.forEachIndexed ({ index, llamada -> llamada.mostrarDatos()
        } )
    }

    fun mostrarCostesAcumulados(){
        var costeAcumulado: Double = 0.0;
        listaLlamada.forEach {
            costeAcumulado+=it.coste }
        println("El coste acumulado es de: $costeAcumulado")
    }

    // me dicen que tipo de llamada quiero listar
    // y solo listo esas llamadas

    fun listarConFiltro(clase: String){
        listaLlamada.forEach ({
            if (it.javaClass.simpleName == clase) {
                it.mostrarDatos()
            }
        })

        listaLlamada.forEach ({
            if (it::class.simpleName == clase) {
                it.mostrarDatos()
            }
        })
    }

    // CUANTAS LLAMADAS SON LOCALES
    // CUANTAS LLAMADAS SON PROVINCIALES
    // CUANTAS LLAMADAS SON NACIONALES

    fun filtradoNumero(){

        println((listaLlamada.filter { it.javaClass.simpleName == "LLamadaNacional" }).size)
        println((listaLlamada.filter { it.javaClass.simpleName == "LLamadaLocal" }).size)
        println((listaLlamada.filter { it.javaClass.simpleName == "LLamadaProvincia" }).size)


    }

}