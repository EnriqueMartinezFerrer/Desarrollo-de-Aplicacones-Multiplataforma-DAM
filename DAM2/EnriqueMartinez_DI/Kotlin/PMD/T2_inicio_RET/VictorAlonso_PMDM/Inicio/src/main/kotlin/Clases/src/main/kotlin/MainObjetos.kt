import model.Coche
import model.Propietario

fun main() {
    //[cv = 0]
    var coche1 = Coche("Mercedes","C220");
    var coche2 = Coche("Ford","Fiesta");
    /*coche1.mostrarDatos()
    coche1.calcularParMotor({aceleracion->aceleracion*2},10)
    coche1.calcularParMotor({aceleracion->aceleracion*1},10)*/
    //coche1.setCV(100)
    //println(coche1.getCV())
    //var coche2 = Coche("Mercedes","C300","1234A");

    coche1.calcularVelocidad = { cc ->
        println("Ejecucion desde la clase coche")
        println("Pero definicion en la clase main")
        println("Obtenidos los cc del coche: $cc")
    }

    coche1.aumentarVelocidad(7);

    coche1.calcularVelocidad = { cc ->

        println("Obtenidos los cc del coche: $cc")
    }

    coche1.aumentarVelocidad(7);

    // var (_, _, dniPro) = propietario;
    // println(_)
    // println(dniPro)

    coche1.asignarPropietario(Propietario("V","A","1234A"))
    println(coche1.propietario)
}