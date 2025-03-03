package com.example.tema3_ej_cartas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.google.android.material.snackbar.Snackbar
import kotlin.random.Random
import kotlin.Array as Array

class SecondActivity : AppCompatActivity(), View.OnClickListener{

    private lateinit var botonMayor : ImageButton
    private lateinit var botonMenor : ImageButton
    private lateinit var nombreRecuperado : String
    private lateinit var puntuacion : TextView
    private lateinit var liner: LinearLayout
    private var cartaPresente : Int = 0
    private var cartaFutura : Int = 0
    private var contadorPuntos : Int  = 0
    private var cartas: Array<Int> = arrayOf(R.drawable.cf,R.drawable.c1, R.drawable.c2, R.drawable.c3, R.drawable.c4,R.drawable.c5,
        R.drawable.c6,R.drawable.c7,R.drawable.c8,R.drawable.c9,R.drawable.c10,R.drawable.c11,R.drawable.c12,R.drawable.c13)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        instancias()
        acciones()
        recuperardatos()
        botonMayor.isEnabled = false
        botonMenor.isEnabled = false
        noti()
    }



    private fun aumentarPuntuacion(){
        ++contadorPuntos
        puntuacion.setText(contadorPuntos.toString())
    }

    private fun cambiarFondo(cartaPresente:Int) {
        liner.setBackgroundResource(cartas[cartaPresente])
    }

    private fun noti() {

        var notification = Snackbar.make(liner,
            "Bienvenido "+nombreRecuperado
            , Snackbar.LENGTH_INDEFINITE)
        notification.setAction("Aceptar"){
            notification.dismiss()
            cartaPresente = Random.nextInt(1,13)
            cambiarFondo(cartaPresente)
            botonMayor.isEnabled = true
            botonMenor.isEnabled = true
        }
        notification.show()

    }

    private fun recuperardatos() {
        nombreRecuperado = intent.extras!!.getString("nombre", "")
    }

    private fun acciones() {
        botonMayor.setOnClickListener(this)
        botonMenor.setOnClickListener(this)
    }

    private fun instancias() {
        this.botonMayor = findViewById(R.id.boton_mayor)
        this.botonMenor = findViewById(R.id.boton_menor)
        this.puntuacion = findViewById(R.id.puntuacion)
        liner=findViewById(R.id.fondo)
    }


    override fun onClick(v: View?) {
        when (v!!.id) {

            R.id.boton_mayor->{
                cartaFutura = Random.nextInt(1,13)

                if (cartaFutura>cartaPresente){
                    cambiarFondo(cartaFutura)
                    cartaPresente=this.cartaFutura
                    aumentarPuntuacion()
                }

                else if (cartaFutura==cartaPresente){
                    cambiarFondo(cartaFutura)
                    cartaPresente=this.cartaFutura
                    aumentarPuntuacion()
                    Toast.makeText(applicationContext, "Esta carta era igual que la anterior, se ha sumado un punto",
                        Toast.LENGTH_SHORT).show()

                }
                    else{
                        cambiarFondo(cartaFutura)
                        botonMayor.isEnabled = false
                        botonMenor.isEnabled = false
                        var notification = Snackbar.make(
                            liner,
                            "Has perdido!!\nLa puntuación fue de: " + contadorPuntos,
                            Snackbar.LENGTH_INDEFINITE
                        )
                        notification.setAction("Aceptar tu derrota") {
                            notification.dismiss()
                            var accionPasar = Intent(applicationContext, MainActivity::class.java)
                            startActivity(accionPasar)
                        }
                        notification.show()
                    }
                }


            R.id.boton_menor->{
                cartaFutura = Random.nextInt(1,13)

                if (cartaFutura<cartaPresente){
                    cambiarFondo(cartaFutura)
                    cartaPresente=this.cartaFutura
                    aumentarPuntuacion()
                }

                else if (cartaFutura==cartaPresente){
                    cambiarFondo(cartaFutura)
                    cartaPresente=this.cartaFutura
                    aumentarPuntuacion()
                    Toast.makeText(applicationContext, "Esta carta era igual que la anterior, se ha sumado un punto",
                        Toast.LENGTH_SHORT).show()
                }
                    else{
                        cambiarFondo(cartaFutura)
                        botonMayor.isEnabled = false
                        botonMenor.isEnabled = false
                        var notification = Snackbar.make(
                            liner,
                            "Has perdido!!\nLa puntuación fue de: " + contadorPuntos,
                            Snackbar.LENGTH_INDEFINITE
                        )
                        notification.setAction("Aceptar tu derrota") {
                            notification.dismiss()
                            var accionPasar = Intent(applicationContext, MainActivity::class.java)
                            startActivity(accionPasar)
                        }
                        notification.show()
                    }
                }
            }
    }
}