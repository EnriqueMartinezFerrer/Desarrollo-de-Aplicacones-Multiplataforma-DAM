package com.example.examenemf
import com.google.android.material.snackbar.Snackbar
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_product.view.*

class ProductViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(product: Product) {
        itemView.apply {
            // Carga la imagen del producto con Glide
            Glide.with(context)
                .load(product.thumbnail)
                .into(ivThumbnail)

            // Muestra el nombre y precio del producto
            tvName.text = product.title


            // Agrega un listener para mostrar el precio completo del producto en un Snackbar
            setOnClickListener {
                val message = "${product.title}: $${product.price}"
                Snackbar.make(itemView, message, Snackbar.LENGTH_SHORT).show()
            }
        }
    }
}
