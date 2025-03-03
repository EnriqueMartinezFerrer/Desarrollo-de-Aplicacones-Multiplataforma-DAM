package com.example.examen_ev_enriquemartinez

import android.content.Context
import android.content.Intent
import android.renderscript.ScriptGroup.Binding
import android.view.LayoutInflater
import android.view.View
import android.view.View.inflate
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.examen_ev_enriquemartinez.R
import com.example.examen_ev_enriquemartinez.databinding.ActivityMainBinding.inflate
import com.example.examen_ev_enriquemartinez.databinding.ItemRecyclerBinding
import com.example.examen_ev_enriquemartinez.tipo.Restaurante

class AdapterRestaurante(var context: Context, var lista: ArrayList<Restaurante>) :
    RecyclerView.Adapter<AdapterRestaurante.MyHolder>() {
    inner class MyHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imagen: ImageView
        var modelo: TextView
        var boton: Button
        init {
            imagen = itemView.findViewById(R.id.imagen_item)
            modelo = itemView.findViewById(R.id.tipo_item)
            boton = itemView.findViewById(R.id.boton_item)
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        val view: View = LayoutInflater.from(context).inflate(R.layout.item_recycler, parent, false)
        return MyHolder(view)
    }
    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        val restaurante = lista.get(position)
        holder.tipo.text = restaurante.tipo
        holder.imagen.setImageResource(restaurante.imagen)
        holder.boton.setOnClickListener {
            // comunicacion

            // comunicacion el coche seleccionado a la activity
        }

    }

    override fun getItemCount(): Int {
        return lista.size
    }

    // 1. Creo interfaz con metodo onMetodoSelected(dato a comunicar)
}

