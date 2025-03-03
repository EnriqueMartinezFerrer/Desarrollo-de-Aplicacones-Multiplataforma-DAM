package com.example.examenexemf

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.examenexemf.Proyecto
import com.example.examenexemf.adapter.ProjectAdapter
import com.example.examenexemf.databinding.FragmentListarBinding
import com.google.android.material.snackbar.Snackbar
import com.google.firebase.database.*

class FragmentListar : Fragment() {
    private var _binding: FragmentListarBinding? = null
    private val binding get() = _binding!!
    private lateinit var database: DatabaseReference
    private lateinit var myAdapter: ProjectAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentListarBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        database = FirebaseDatabase.getInstance().getReference("projects")

        binding.projectsRecyclerView.layoutManager = LinearLayoutManager(context)

        // Define tu adaptador personalizado y asigna el adaptador al RecyclerView
        myAdapter = ProjectAdapter(emptyList()) { project ->
            Snackbar.make(binding.root, "Presupuesto: ${project.presupuesto}", Snackbar.LENGTH_SHORT).show()
        }
        binding.projectsRecyclerView.adapter = myAdapter

        loadProjects()
    }

    private fun loadProjects() {
        database.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                // Aquí debes obtener los datos de los proyectos y actualizar el adaptador
                val projects = mutableListOf<Proyecto>()
                for (projectSnapshot in snapshot.children) {
                    val project = projectSnapshot.getValue(Proyecto::class.java)
                    project?.let { projects.add(it) }
                }
                myAdapter.updateData(projects)
            }

            override fun onCancelled(error: DatabaseError) {
                // En caso de error al cargar los datos, muestra un mensaje
                Toast.makeText(context, "Error al cargar los proyectos.", Toast.LENGTH_SHORT).show()
            }
        })
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

