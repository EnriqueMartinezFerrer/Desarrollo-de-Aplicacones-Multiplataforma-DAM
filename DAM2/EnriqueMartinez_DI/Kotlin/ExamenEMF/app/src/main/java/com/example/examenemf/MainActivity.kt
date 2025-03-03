package com.example.examenemf

import ProductsFragment
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.google.android.material.snackbar.Snackbar
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.*
import kotlinx.android.synthetic.main.fragment_login.*
import kotlinx.android.synthetic.main.fragment_products.*
import kotlinx.android.synthetic.main.item_product.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_login)

        // Muestra el fragmento de inicio de sesión al iniciar la aplicación
        val loginFragment = LoginFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, loginFragment)
            .commit()
    }

    // Función para mostrar un mensaje de error en un Snackbar
    fun showError(message: String) {
        Snackbar.make(container, message, Snackbar.LENGTH_SHORT).show()
    }

    // Fragmento de inicio de sesión
    class LoginFragment : Fragment(R.layout.fragment_login) {

        private lateinit var auth: FirebaseAuth

        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)

            // Inicializa Firebase Auth
            auth = FirebaseAuth.getInstance()

            // Agrega un listener al botón de inicio de sesión
            btnIngresar.setOnClickListener {
                val email = edtEmail.text.toString()
                val password = edtPassword.text.toString()

                if (email.isNotEmpty() && password.isNotEmpty()) {
                    // Inicia sesión en Firebase Auth
                    auth.signInWithEmailAndPassword(email, password)
                        .addOnCompleteListener { task ->
                            if (task.isSuccessful) {
                                // El inicio de sesión fue exitoso, muestra el fragmento de productos
                                activity?.supportFragmentManager?.beginTransaction()
                                    ?.replace(R.id.container, ProductsFragment)
                                    ?.commit()
                            } else {
                                // El inicio de sesión falló, muestra un mensaje de error
                                (activity as MainActivity).showError("Error en el inicio de sesión.")
                            }
                        }
                } else {
                    // Los campos de correo electrónico y contraseña son requeridos
                    (activity as MainActivity).showError("Ingresa tu correo electrónico y contraseña.")
                }
            }
        }
    }
}





