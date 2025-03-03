package com.example.t3_estado

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var  Contador
    private lateinit var Incrementar: Button
    private lateinit var Decrementar: Button
    private lateinit var Reset: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        instancias()
        acciones()
    }
    private fun instancias() {
        this.boton = findViewById(R.id.Incrementar)
        this.boton = findViewById(R.id.Decrementar)
        this.boton = findViewById(R.id.Reset)
    }
private fun acciones(){
    binding.botonIncrementar.SetOnClickListener(this)
    binding.botonDecrementar.SetOnClickListener(this)
    binding.botonReset.SetOnClickListener(this)
}

    override fun onClick(p0: View?) {

    }

}