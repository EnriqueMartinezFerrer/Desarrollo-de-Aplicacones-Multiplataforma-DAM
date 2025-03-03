import Clases.Comun
import Clases.Fantasy
import Clases.Jugador
import Clases.Participante
import Clases.Puntuacion

class MainFutbol {


}



    fun main(){

        fun menu(filtro: String) {

            when (filtro) {
                "Participantes" -> {
                    var participante: Participante = Participante();
                    participante.listarParticipantes()
                }
                "Puntuaciones" -> {
                    var puntuacion: Puntuacion = Puntuacion();
                    puntuacion.listarPuntuaciones()
                }
            }
        }

}