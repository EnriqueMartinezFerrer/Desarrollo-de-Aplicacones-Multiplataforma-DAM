package com.example.examenemf

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.material.snackbar.Snackbar
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.fragment_login.*

class LoginFragment : Fragment() {

    private lateinit var auth: FirebaseAuth

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

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
                            val productsFragment = MainActivity.ProductsFragment()
                            activity?.supportFragmentManager?.beginTransaction()
                                ?.replace(R.id.container, productsFragment)
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
