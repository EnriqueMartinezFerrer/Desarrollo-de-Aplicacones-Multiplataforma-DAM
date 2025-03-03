package com.example.practica_hobbys

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.practica_hobbys.adaptadores.AdaptadorGeneral
import com.example.practica_hobbys.databinding.Activity2Binding
import com.example.practica_hobbys.databinding.ActivityMainBinding
import com.example.practica_hobbys.model.Elemento

class MainActivity : AppCompatActivity(),View.OnClickListener {
    private lateinit var binding: ActivityMainBinding
    private lateinit var listaMaradona:ArrayList<Int>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        acciones()
    }

    private fun acciones() {
        binding.botonInicio.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        var Pasar = Intent(applicationContext, Activity2::class.java)
        startActivity(Pasar)
    }
}