package com.example.listasholder.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.listasholder.R
import com.example.listasholder.model.Usuario

class AdapatadorRecycler(var context: Context, var lista: ArrayList<Usuario>) : RecyclerView.Adapter<AdapatadorRecycler.MyHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        var view : View = LayoutInflater.from(context).inflate(R.layout.item_recycler,parent,false)
        var holder = MyHolder(view)
        return holder
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        // personaliza cada una de las filas -> holder
        var usuarioFila = lista.get(position)
        holder.nombre.setText(usuarioFila.nombre)
        holder.apellidos.setText(usuarioFila.apellido)
        holder.correo.setText(usuarioFila.correo)
        /*usuarioFila.apellido
        usuarioFila.nombre
        usuarioFila.correo*/
    }

    override fun getItemCount(): Int {
        return lista.size
    }

    //clase anidada
    inner class MyHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var nombre:TextView
        var correo:TextView
        var apellidos: TextView

        init {
            nombre = itemView.findViewById(R.id.nombre_lista)
            apellidos = itemView.findViewById(R.id.correo_lista)
            correo = itemView.findViewById(R.id.apellidoLista)
        }

    }

}