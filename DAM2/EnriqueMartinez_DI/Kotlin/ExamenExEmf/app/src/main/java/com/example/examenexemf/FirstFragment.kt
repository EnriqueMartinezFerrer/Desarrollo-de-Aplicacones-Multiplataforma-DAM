package com.example.examenexemf

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.examenexemf.databinding.FragmentFirstBinding
import com.google.firebase.auth.FirebaseAuth

class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null
    private lateinit var auth: FirebaseAuth
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        auth = FirebaseAuth.getInstance()
        binding.botonLogin.setOnClickListener {
            val email = binding.inputNombre.text.toString()
            val password = binding.inputPass.text.toString()

            if (email.isNotEmpty() && password.isNotEmpty()) {
                signIn(email, password)
            } else {
                Toast.makeText(context, "Por favor, ingrese correo electrónico y contraseña.", Toast.LENGTH_SHORT).show()
            }
        }
    }


    private fun signIn(email: String, password: String) {
        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener(requireActivity()) { task ->
                if (task.isSuccessful) {
                    // Inicio de sesión exitoso, navegar al FragmentAñadir
                    findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)

                } else {
                    // Si el inicio de sesión falla, mostrar un mensaje al usuario
                    Toast.makeText(context, "Error de autenticación.", Toast.LENGTH_SHORT).show()
                }
            }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
