fun main(arg: Array<String>){
    var numero = 0
    var media = 0
    var suma = 0
    var max = 0
    var min = 200

    println("Introduce tu edad: ")
    var edad: Int = readLine()!!.toInt();
    if (edad>=18) {
        for (i in 1..10) {
            numero = (1..100).random()
            suma += numero
            if (max < numero) max = numero
            if (min > numero) min = numero
        }
        println("Suma = ${suma}")
        println("Media = ${suma / 10}")
        println("El mayor numero es: ${max}")
        println("El menor numero es: ${min}")
    }
    else println("No eres mayor de edad")
}