package com.example.tema3_ej_cartas
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var boton:Button
    private lateinit var nombre:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        instancias()
        acciones()


    }

    private fun instancias() {
        this.boton = findViewById(R.id.botonInicial)
        this.nombre = findViewById(R.id.nombre)
    }

    private fun acciones() {
        boton.setOnClickListener(this)

    }

    override fun onClick(p0: View?) {
        when(p0!!.id){

            R.id.botonInicial-> {

                if(!nombre.text.isEmpty()){

                    var accionPasar = Intent(applicationContext, SecondActivity::class.java)
                    var datosPasar: Bundle = Bundle();
                    datosPasar.putString("nombre", nombre.text.toString())
                    accionPasar.putExtras(datosPasar)
                    startActivity(accionPasar)
                }
                else{
                    Toast.makeText(applicationContext, "Por favor introduce el nombre",Toast.LENGTH_SHORT).show()
                }
            }
        }

    }
}

