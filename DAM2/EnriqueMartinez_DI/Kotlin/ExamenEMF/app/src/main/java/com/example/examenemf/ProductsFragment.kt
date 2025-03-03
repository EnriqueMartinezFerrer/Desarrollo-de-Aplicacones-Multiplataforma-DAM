import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.examenemf.Product
import com.example.examenemf.ProductsAdapter
import com.example.examenemf.R
import com.firebase.ui.database.FirebaseRecyclerOptions
import com.google.firebase.database.*
import kotlinx.android.synthetic.main.fragment_products.*

class ProductsFragment : Fragment() {

    private lateinit var database: DatabaseReference

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_products, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Inicializa la referencia de Firebase Database
        database = FirebaseDatabase.getInstance().reference

        // Carga los productos desde Firebase Database
        val productsRef = database.child("products")
        val options = FirebaseRecyclerOptions.Builder<Product>()
            .setQuery(productsRef, Product::class.java)
            .build()
        val adapter = ProductsAdapter(options)
        rvProducts.adapter = adapter
        rvProducts.layoutManager = LinearLayoutManager(activity)

        // Incrementa el contador de inicio de sesión en Firebase Database
        val counterRef = database.child("counter")
        counterRef.runTransaction(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val currentValue = snapshot.getValue(Int::class.java) ?: 0
                counterRef.setValue(currentValue + 1)
            }
            override fun onCancelled(error: DatabaseError) {
                // Error al actualizar el contador en Firebase Database
            }
        })
    }
}
