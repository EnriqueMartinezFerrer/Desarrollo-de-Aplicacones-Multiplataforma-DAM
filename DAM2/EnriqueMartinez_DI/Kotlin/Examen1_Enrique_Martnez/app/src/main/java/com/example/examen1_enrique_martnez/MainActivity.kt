package com.example.examen1_enrique_martnez

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Switch
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
//Lo he hecho sin el Switch no sabía como hacerlo

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var boton: Button
    private lateinit var edit_apellido: EditText
    private lateinit var edit_nombre: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        instancias()
        acciones()


    }

    private fun instancias() {
        this.boton = findViewById(R.id.boton)
        this.edit_nombre = findViewById(R.id.edit_nombre)
        this.edit_apellido = findViewById(R.id.edit_apellido)
    }

    private fun acciones() {
        boton.setOnClickListener(this)

    }

    override fun onClick(p0: View?) {
        when (p0!!.id) {

            R.id.boton -> {

                if (!edit_nombre.text.isEmpty()) {

                    var accionPasar = Intent(applicationContext, SecondActivity::class.java)
                    var datosPasar: Bundle = Bundle();
                    datosPasar.putString("nombre", edit_nombre.text.toString())
                    accionPasar.putExtras(datosPasar)
                    startActivity(accionPasar)
                } else {
                    Toast.makeText(
                        applicationContext,
                        "Por favor introduce el nombre",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
        }

    }


}


/*

 */