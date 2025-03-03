package com.example.t3_listas_ret

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.t3_listas_ret.databinding.ActivityMainBinding
import com.example.t3_listas_ret.model.Usuario

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    //private lateinit var adaptadorBase: ArrayAdapter<CharSequence>
    private lateinit var adaptadorBase: ArrayAdapter<Usuario>
    private lateinit var listaUsuarios: ArrayList<Usuario>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        instancias()
        asociarDatos()
        acciones()
    }

    private fun instancias() {
        /*adaptadorBase = ArrayAdapter.createFromResource(
            applicationContext,
            R.array.usuarios,
            android.R.layout.simple_list_item_1
        )*/
        listaUsuarios= ArrayList()
        listaUsuarios.add(Usuario("Israel", R.drawable.hombre, 123456))
        listaUsuarios.add(Usuario("Luis", R.drawable.hombre, 123456))
        listaUsuarios.add(Usuario("Celia", R.drawable.mujer, 123456))
        listaUsuarios.add(Usuario("Marta", R.drawable.mujer, 123456))
        listaUsuarios.add(Usuario("Juan", R.drawable.hombre, 123456))
        listaUsuarios.add(Usuario("Jose", R.drawable.hombre, 123456))
        adaptadorBase= ArrayAdapter(applicationContext,android.R.layout.simple_list_item_1,listaUsuarios)
    }

    private fun asociarDatos() {
        binding.listaUsuarios.adapter= adaptadorBase
    }

    private fun acciones() {
    }
}