package Clases.src.main.kotlin.model

class Asalariado(nombre: String, apellido: String, edad: Int, var correo: String) : Persona(nombre, apellido, edad) {

    private var NSS: Int = 0;
    private var salario: Int? = null;
    private var pagas: Int = 12;

constructor(nombre: String, apellido: String, edad: Int, correo: String, NSS: Int, salario: Int) : this(nombre,apellido,edad,correo){

}

    // crear el método que me permite ver los datos del salario del usuario
    // bruta anual, neto anual
    // neto mensual
    // necesito que el usuario me diga el % de retencion que quiere aplicar

    fun calculoSalarios(retention: Int){
        println("Ejecucion ${salario?.plus(20)}")
        println("Ejecucion ${salario * 20}")
    }

    override fun mostrarDatos() {
        super.mostrarDatos()
        println("NSS: $NSS")
        println("Correo: $correo")
        println("Salario: $salario")

    }

    fun getNSS(): Int {
        return this.NSS
    }

    fun getSalario(): Int{
        return this.salario!!;
    }

    fun setSalario(salario: Int)



}