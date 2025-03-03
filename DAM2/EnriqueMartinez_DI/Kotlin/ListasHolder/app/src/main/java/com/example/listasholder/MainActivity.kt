package com.example.listasholder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.listasholder.adapter.AdapatadorRecycler
import com.example.listasholder.databinding.ActivityMainBinding
import com.example.listasholder.model.Usuario

class MainActivity : AppCompatActivity() {

    /* diferencia con el otro tipo de listas es que los elemengos estan cargados al hacer scroll y
    en el otro no */
    private lateinit var binding: ActivityMainBinding
    private lateinit var listaUsuarios: ArrayList<Usuario>
    private lateinit var adaptadorRecycler: AdapatadorRecycler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        instancias();


    }

    private fun instancias() {

        listaUsuarios = ArrayList();
        listaUsuarios.add(Usuario("Borja","Martin","correo@retamar.es",38))
        listaUsuarios.add(Usuario("Jose","Martin","correo@retamar.es",34))
        listaUsuarios.add(Usuario("Pedro","Martin","correo@retamar.es",32))
        listaUsuarios.add(Usuario("Claudia","Martin","correo@retamar.es",24))
        listaUsuarios.add(Usuario("Maria","Martin","correo@retamar.es",36))
        listaUsuarios.add(Usuario("Celia","Martin","correo@retamar.es",32))
        adaptadorRecycler = AdapatadorRecycler(this, listaUsuarios)
        binding.listaRecycler.layoutManager = LinearLayoutManager(applicationContext,
        LinearLayoutManager.VERTICAL, false)
    }
}