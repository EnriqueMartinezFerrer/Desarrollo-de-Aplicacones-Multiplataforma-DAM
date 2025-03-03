package com.example.examenexemf.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.examenexemf.Proyecto
import com.example.examenexemf.R

class ProjectAdapter(
    private var projectsList: List<Proyecto>,
    private val onClickListener: (Proyecto) -> Unit
) : RecyclerView.Adapter<ProjectAdapter.ProjectViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProjectViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.proyecto_item, parent, false)
        return ProjectViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProjectViewHolder, position: Int) {
        val project = projectsList[position]
        holder.bind(project)
        holder.itemView.setOnClickListener { onClickListener(project) }
    }

    override fun getItemCount(): Int {
        return projectsList.size
    }

    fun updateData(newData: List<Proyecto>) {
        projectsList = newData
        notifyDataSetChanged()
    }

    class ProjectViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val nameTextView: TextView = itemView.findViewById(R.id.project_name_text_view)
        private val managerTextView: TextView = itemView.findViewById(R.id.project_manager_text_view)

        fun bind(project: Proyecto) {
            nameTextView.text = project.nombre
            managerTextView.text = project.responsable
        }
    }
}
