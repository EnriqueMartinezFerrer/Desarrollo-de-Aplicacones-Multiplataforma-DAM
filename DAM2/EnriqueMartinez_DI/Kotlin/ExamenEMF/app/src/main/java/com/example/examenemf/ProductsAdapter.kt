package com.example.examenemf
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.item_product.view.*

class ProductsAdapter(private val products: List<Product>) :
    RecyclerView.Adapter<ProductsAdapter.ProductViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_product, parent, false)
        return ProductViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        holder.bind(products[position])
    }

    override fun getItemCount(): Int = products.size

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
}
