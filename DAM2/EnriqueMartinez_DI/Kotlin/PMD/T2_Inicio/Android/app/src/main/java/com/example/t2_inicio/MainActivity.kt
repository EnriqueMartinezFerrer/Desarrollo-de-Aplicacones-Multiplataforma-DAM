package com.example.t2_inicio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.*
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    lateinit var botonInicial: Button;
    lateinit var etiquetaSaludo: TextView
    lateinit var editNombre: EditText
    lateinit var imagenEstado: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.v("ciclo_vida", "ejecutando metodo onCreate")
        setContentView(R.layout.activity_main)
        instancias();
        acciones()
    }

    private fun acciones() {
        botonInicial.setOnClickListener({
            if (!editNombre.text.isEmpty()) {
                var notificacion =
                    Snackbar.make(it, "Estas seguro?" + editNombre.text, Snackbar.LENGTH_INDEFINITE)
                    notificacion.setAction("Aceptar", {
                   /*etiquetaSaludo.setText(editNombre.text)
                    editNombre.setText("")
                    notificacion.dismiss()*/

                    imagenEstado.setImageResource(R.drawable.thinking)
                })
                notificacion.show()
            } else {
                Log.v("edit_nombre", "texto vacio")
                Toast.makeText(applicationContext, "Texto vacio", Toast.LENGTH_SHORT).show()
            }
        })
    }

    private fun instancias() {
        this.botonInicial = findViewById(R.id.boton_inicial)
        this.etiquetaSaludo = findViewById(R.id.texto_inicial)
        this.editNombre = findViewById(R.id.edit_nombre)
        this.imagenEstado = findViewById(R.id.imagen_estado)
    }

    override fun onStart() {
        super.onStart()
        Log.v("ciclo_vida", "ejecutando metodo onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.v("ciclo_vida", "ejecutando metodo onResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.v("ciclo_vida", "ejecutando metodo onRestart")
    }
}