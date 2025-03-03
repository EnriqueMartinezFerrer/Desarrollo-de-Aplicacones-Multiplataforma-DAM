package com.example.cartas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var botonEmpezar: Button
    lateinit var textoNombre: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        crearInstancias()
        crearAcciones()
    }
    private fun crearInstancias() {
        this.botonEmpezar = findViewById(R.id.boton_empezar) //Con esto relaciono el boton del XML con el objeto (toast)
        this.textoNombre = findViewById(R.id.nombre_introducido)

    }
    private fun crearAcciones() {
        botonEmpezar.setOnClickListener(this)//Agrego un listener para el boton, se crea el nuevo objeto
    }

    override fun onClick(vista: View?) { // Aqui es donde pongo qué va a pasar cuando se le da un click al boton
        when (vista!!.id) {
            R.id.boton_empezar -> {
                if (!textoNombre.text.isEmpty()) {
                        var accionPasar = Intent(applicationContext, SegundaPagina::class.java)
                        var datosPasar: Bundle =Bundle()
                        datosPasar.putString("nombre", textoNombre.text.toString())
                        accionPasar.putExtras(datosPasar)

                        startActivity(accionPasar)
                    }
                else{
                    var notification = Snackbar.make(vista, "El nombre está vacío ", Snackbar.LENGTH_INDEFINITE)
                    notification.setAction("Aceptar") {
                }
                    notification.show()
            }
        }

        }
        }
    }

