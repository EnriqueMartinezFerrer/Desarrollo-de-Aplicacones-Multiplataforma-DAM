package com.example.practica_hobbys

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.core.view.isVisible
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.practica_hobbys.adaptadores.AdaptadorGeneral
import com.example.practica_hobbys.databinding.Activity2Binding
import com.example.practica_hobbys.model.Elemento
import com.google.android.material.snackbar.Snackbar

class Activity2 : AppCompatActivity(), AdaptadorGeneral.OnRecyclerElementoListener, AdapterView.OnItemSelectedListener {
    private lateinit var binding: Activity2Binding
    private lateinit var listaElemento:ArrayList<Elemento>
    private lateinit var listafiltrada:ArrayList<Elemento>
    private lateinit var adaptadorPersonalizado: AdaptadorGeneral
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Activity2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        instancias()
        configurarRecycler()
        acciones()

    }

    private fun acciones() {

    }

    private fun instancias() {
        binding.constraintSelected.isVisible = false
        listaElemento = ArrayList()
        listaElemento.add(Elemento("Messi","Argentina","Futbol",R.drawable.messi))
        listaElemento.add(Elemento("Maradona","Argentina","Futbol",R.drawable.maradona))
        listaElemento.add(Elemento("Ronaldo","Brasil","Futbol",R.drawable.ronaldo))
        listaElemento.add(Elemento("Zidane","Francia","Futbol",R.drawable.zidane))
        listaElemento.add(Elemento("Stranger Things", "Fantastica","Serie",R.drawable.stranger))
        listaElemento.add(Elemento("Lost", "Fantastica","Serie", R.drawable.lost))
        listaElemento.add(Elemento("Juego de tronos", "Histórica","Serie", R.drawable.tronos))
        listaElemento.add(Elemento("La casa de papel", "Accion","Serie", R.drawable.papel))
        listaElemento.add(Elemento("Metal Gear", "Sigilo","Juego", R.drawable.metal))
        listaElemento.add(Elemento("Gran Turismo", "Coches","Juego", R.drawable.gt))
        listaElemento.add(Elemento("God Of War", "Plataformas","Juego", R.drawable.god))
        listaElemento.add(Elemento("Final Fantasy X", "Rol","Juego", R.drawable.ffx))
        adaptadorPersonalizado = AdaptadorGeneral(listaElemento,this)
        binding.spinner.adapter = ArrayAdapter.createFromResource(applicationContext,R.array.lista_spinner,
        android.R.layout.simple_spinner_item)
        (binding.spinner.adapter as ArrayAdapter<CharSequence>).setDropDownViewResource(
            android.R.layout.simple_spinner_dropdown_item)
        binding.spinner.onItemSelectedListener = this;
    }
    private fun filtrarLista(categoria:String){
        listafiltrada = listaElemento.filter{ elemento-> elemento.Categoria == categoria} as ArrayList<Elemento>
        adaptadorPersonalizado.notifyDataSetChanged()
        Log.v("Categoria",categoria.toString())
    }
    private fun configurarRecycler(){
        binding.listaRecycler.adapter = adaptadorPersonalizado
        binding.listaRecycler.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
    }

    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
        when(p0!!.id){
            R.id.spinner->{
                var seleccion: String = binding.spinner.getItemAtPosition(p2).toString()
                if(seleccion == "Futbol"){
                    listaElemento.clear()
                    listaElemento.add(Elemento("Messi","Argentina","Futbol",R.drawable.messi))
                    listaElemento.add(Elemento("Maradona","Argentina","Futbol",R.drawable.maradona))
                    listaElemento.add(Elemento("Ronaldo","Brasil","Futbol",R.drawable.ronaldo))
                    listaElemento.add(Elemento("Zidane","Francia","Futbol",R.drawable.zidane))
                    adaptadorPersonalizado.notifyDataSetChanged()
                }else if(seleccion == "Series"){
                    listaElemento.clear()
                    listaElemento.add(Elemento("Stranger Things", "Fantastica","Serie",R.drawable.stranger))
                    listaElemento.add(Elemento("Lost", "Fantastica","Serie", R.drawable.lost))
                    listaElemento.add(Elemento("Juego de tronos", "Histórica","Serie", R.drawable.tronos))
                    listaElemento.add(Elemento("La casa de papel", "Accion","Serie", R.drawable.papel))
                    adaptadorPersonalizado.notifyDataSetChanged()
                }else if(seleccion == "Juegos"){
                    listaElemento.clear()
                    listaElemento.add(Elemento("Metal Gear", "Sigilo","Juego", R.drawable.metal))
                    listaElemento.add(Elemento("Gran Turismo", "Coches","Juego", R.drawable.gt))
                    listaElemento.add(Elemento("God Of War", "Plataformas","Juego", R.drawable.god))
                    listaElemento.add(Elemento("Final Fantasy X", "Rol","Juego", R.drawable.ffx))
                    adaptadorPersonalizado.notifyDataSetChanged()
                }
            }
        }
    }

    override fun onNothingSelected(p0: AdapterView<*>?) {}
    override fun onElementoSelected(elemento: Elemento) {
        binding.constraintSelected.isVisible = true
        binding.imagenElemento.setImageResource(elemento.imagen)
        binding.textoNombre.text=elemento.nombre
        binding.textoDescripcion.text = elemento.detalle
    }

    override fun onElementoSelected(elemento: Elemento, posicion: Int) {
        binding.constraintSelected.isVisible = false
    }
}
