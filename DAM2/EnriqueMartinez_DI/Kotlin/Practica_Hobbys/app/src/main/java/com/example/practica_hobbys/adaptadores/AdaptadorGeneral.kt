package com.example.practica_hobbys.adaptadores

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.practica_hobbys.R
import com.example.practica_hobbys.model.Elemento
import com.google.android.material.snackbar.Snackbar

class AdaptadorGeneral(var listaElementos:ArrayList<Elemento>, var contexto:Context):RecyclerView.Adapter<AdaptadorGeneral.Myholder>(){
    private lateinit var listener: OnRecyclerElementoListener
    init {
        listener = contexto as OnRecyclerElementoListener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdaptadorGeneral.Myholder {
        var vista : View = LayoutInflater.from(contexto).inflate(R.layout.activity_recycler,parent,false);
        return Myholder(vista)
    }
    inner class Myholder(itemView:View):ViewHolder(itemView){
        var textoNombre:TextView
        var textoDescripcion:TextView
        var imagen:ImageView
        var constraintLayout: ConstraintLayout
        init {
            constraintLayout = itemView.findViewById(R.id.constraint_general)
            textoNombre = itemView.findViewById(R.id.texto_Nombre)
            textoDescripcion = itemView.findViewById(R.id.texto_Descripcion)
            imagen = itemView.findViewById(R.id.imagen_elemento)
        }
    }
    interface OnRecyclerElementoListener{
        fun onElementoSelected(elemento:Elemento)
        fun onElementoSelected(elemento:Elemento,posicion:Int)
    }

    override fun onBindViewHolder(holder: Myholder, position: Int) {
        var elementoactual = listaElementos.get(position)
        holder.textoNombre.setText(elementoactual.nombre)
        holder.textoDescripcion.setText(elementoactual.detalle)
        holder.imagen.setImageResource(elementoactual.imagen)
        holder.textoNombre.setOnClickListener{
            listener.onElementoSelected(elementoactual)
        }
        holder.constraintLayout.setOnClickListener{
            listener.onElementoSelected(elementoactual)
        }
        holder.textoNombre.setOnClickListener{
            listener.onElementoSelected(elementoactual)
        }
        holder.textoDescripcion.setOnClickListener{
            listener.onElementoSelected(elementoactual)
        }
        holder.imagen.setOnClickListener{
            listener.onElementoSelected(elementoactual)
        }
        holder.constraintLayout.setOnLongClickListener{
            listener.onElementoSelected(elementoactual,position)
            return@setOnLongClickListener true
        }
        holder.textoNombre.setOnLongClickListener{
            listener.onElementoSelected(elementoactual,position)
            return@setOnLongClickListener true
        }
        holder.textoDescripcion.setOnLongClickListener{
            listener.onElementoSelected(elementoactual,position)
            return@setOnLongClickListener true
        }
        holder.imagen.setOnLongClickListener{
            listener.onElementoSelected(elementoactual,position)
            return@setOnLongClickListener true
        }
    }

    override fun getItemCount(): Int {
        return listaElementos.size
    }
    public fun setlistaElementos(listanueva:ArrayList<Elemento>){
        this.listaElementos = listanueva
        notifyDataSetChanged()
    }

}