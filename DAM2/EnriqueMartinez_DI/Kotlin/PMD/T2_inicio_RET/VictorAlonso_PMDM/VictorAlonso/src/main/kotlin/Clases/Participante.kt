package Clases

class Participante (nombre: String, var plantilla: String, var puntos: Int, var presupuesto: Int, id: Int) : Comun(id, nombre) {

    constructor(nombre: String, plantilla: String, puntos: Int, presupuesto: Int, id: Int) : this(id, nombre){
        // setter
        this.plantilla = plantilla;
        this.puntos = puntos;
        this.presupuesto = presupuesto;
    }

    override fun mostrarDatos(){
        println("Participante:")
        super.mostrarDatos()
        println("Participantes: $participantes")
    }

    // Plantilla 1 (válida)

    var plantillauno: ArrayList<Jugador>

    init {
        plantillauno = ArrayList();
    }

    fun agregarJugadores(jugador: Jugador) {
        plantillauno.add(Jugador(1,"Marc-André ter Stegen", "Portero",3000000))
        plantillauno.add(Jugador(7,"David Alaba", "Defensa",4000000))
        plantillauno.add(Jugador(8,"Jesús Vallejo", "Defensa",500000))
        plantillauno.add(Jugador(9,"Luka Modric", "Mediocentro",5000000))
        plantillauno.add(Jugador(14,"Alex Fernández", "Mediocentro",700000))
        plantillauno.add(Jugador(20"Ángel", "Delantero", 300000))
    }



    // Plantilla 2 (válida)

    var plantillados: ArrayList<Jugador>

    init {
        plantillados = ArrayList();
    }

    fun agregarJugadores(jugador: Jugador) {
        plantillados.add(Jugador(6,"Courtois", "Portero",3000000))
        plantillados.add(Jugador(2,"Ronald Araújo", "Defensa",4000000))
        plantillados.add(Jugador(17,"Raíllo", "Defensa",200000))
        plantillados.add(Jugador(9,"Luka Modric", "Mediocentro",5000000))
        plantillados.add(Jugador(25,"Zubimendi", "Mediocentro",1000000))
        plantillados.add(Jugador(26,"Take Kubo", "Delantero", 800000))
    }



    // Plantilla 3 (válida)

    var plantillatres: ArrayList<Jugador>

    init {
        plantillatres = ArrayList();
    }

    fun agregarJugadores(jugador: Jugador) {
        plantillatres.add(Jugador(1,"Marc-André ter Stegen", "Portero",3000000))
        plantillatres.add(Jugador(18,"Maffeo", "Defensa",300000))
        plantillatres.add(Jugador(17,"Raíllo", "Defensa",200000))
        plantillatres.add(Jugador(4,"Pedri", "Mediocentro",5000000))
        plantillatres.add(Jugador(14,"Alex Fernández", "Mediocentro",700000))
        plantillatres.add(Jugador(10,"Karim Benzema", "Delantero",8000000))
    }



    // Plantilla 4 (5 válidos y 1 no válido, tiene dos porteros)

    var plantillacuatro: ArrayList<Jugador>

    init {
        plantillacuatro = ArrayList();
    }

    fun agregarJugadores(jugador: Jugador) {
        plantillacuatro.add(Jugador(6,"Courtois", "Portero",3000000))
        plantillacuatro.add(Jugador(17,"Raíllo", "Defensa",200000))
        plantillacuatro.add(Jugador(24,"Zubeldia", "Defensa",800000))
        plantillacuatro.add(Jugador(19,"Ruiz de Galarreta", "Mediocentro",400000))
        plantillacuatro.add(Jugador(25,"Zubimendi", "Mediocentro",1000000))
        plantillacuatro.add(Jugador(22,"Remiro", "Portero",1000000))
    }







    // Participantes

    var participantes: ArrayList<Participante>?;

    init {
        participantes = ArrayList();
    }

    fun agregarParticipantes(participante: Participante) {
        participantes.add(Participante("Milan", "$plantillauno",300))
        participantes.add(Participante("Malaga", "$plantillados",300))
        participantes.add(Participante("Betis", "$plantillatres",300))
        participantes.add(Participante("Mayorca", "$plantillacuatro",300))
    }

    fun listarParticipantes(participante: Participante) {
        participante.mostrarDatos()
    }


}