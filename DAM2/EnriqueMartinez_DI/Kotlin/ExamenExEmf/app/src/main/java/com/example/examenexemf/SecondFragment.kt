package com.example.examenexemf

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.examenexemf.databinding.FragmentSecondBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase

class SecondFragment : Fragment() {
    private var _binding: FragmentSecondBinding? = null
    private val binding get() = _binding!!
    private lateinit var auth: FirebaseAuth
    private lateinit var database: FirebaseDatabase

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        auth = FirebaseAuth.getInstance()
        database = FirebaseDatabase.getInstance()

        binding.buttonAddProject.setOnClickListener {
            val projectName = binding.editTextProjectName.text.toString().trim()
            val projectBudget = binding.editTextProjectBudget.text.toString().trim().toDoubleOrNull()
            val projectManager = binding.editTextProjectResponsible.text.toString().trim()

            if (projectName.isNotEmpty() && projectBudget != null && projectManager.isNotEmpty()) {
                addProject(projectName, projectBudget, projectManager)
            } else {
                Toast.makeText(context, "Por favor, complete todos los campos.", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun addProject(projectName: String, projectBudget: Double, projectManager: String) {
        val project = hashMapOf(
            "name" to projectName,
            "budget" to projectBudget,
            "manager" to projectManager
        )

        database.getReference("projects").push().setValue(project)
            .addOnSuccessListener {
                Toast.makeText(context, "Proyecto agregado con éxito.", Toast.LENGTH_SHORT).show()
            }
            .addOnFailureListener {
                Toast.makeText(context, "Error al agregar el proyecto.", Toast.LENGTH_SHORT).show()
            }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
