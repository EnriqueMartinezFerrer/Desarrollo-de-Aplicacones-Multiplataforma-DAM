package com.example.pruebas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.Toast
import com.example.pruebas.databinding.ActivityMainBinding
import com.example.pruebas.dialogs.*
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity(), OnClickListener,
    DialogoConfirmacion.OnDialogoConfirmListener, DialogoLista.OnListaListener,
    DialogoListaSimple.OnListaSimpleListener {

    private lateinit var binding: ActivityMainBinding
    private var dialogoConfirm: DialogoConfirmacion;

    init {
        dialogoConfirm = DialogoConfirmacion()
        dialogoConfirm.funcionNula = { elemento ->
            if (elemento){
                Snackbar.make(binding.root, "Seleccionado true", Snackbar.LENGTH_SHORT).show()
            } else {
                Snackbar.make(binding.root, "Seleccionado false", Snackbar.LENGTH_SHORT).show()
            }

        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        acciones()
    }

    private fun acciones() {
        binding.botonConfirmacion.setOnClickListener(this)
        binding.botonLista.setOnClickListener(this)
        binding.botonListaSimple.setOnClickListener(this)
        binding.botonListaMultiple.setOnClickListener(this)
        binding.botonPersonalizado.setOnClickListener(this)

    }

    override fun onClick(p0: View?) {
        when (p0!!.id) {
            binding.botonConfirmacion.id -> {
                // saltar en cuadro de diálogo
                // show() parte del DialogFragment
                val dialogoConfirmacion = DialogoConfirmacion()
                dialogoConfirmacion.show(supportFragmentManager, "")
            }
            binding.botonLista.id ->{
                DialogoLista().show(supportFragmentManager,"")
            }
            binding.botonListaSimple.id ->{
                DialogoListaSimple().show(supportFragmentManager,"")
            }
            binding.botonListaMultiple.id ->{
                DialogoMultiple().show(supportFragmentManager,"")
            }
            binding.botonPersonalizado.id -> {
                DialogoPersonalizado().show(supportFragmentManager,"")
            }
        }
    }

    override fun onDialogoSelected(seleccionado: Boolean) {
        if (seleccionado) {
            Snackbar.make(binding.root, "Seleccionado true", Snackbar.LENGTH_SHORT).show()
        } else {
            Snackbar.make(binding.root, "Seleccionado false", Snackbar.LENGTH_SHORT).show()
        }
    }

    override fun onElementoListaSelected(elemento: String) {
        binding.listaConfirmacion.text = elemento
    }

    override fun onListaSelected(elemento: String?) {
        binding.listaSimpleConfirmacion.text = elemento?:"Sin comunicacion"
    }
}