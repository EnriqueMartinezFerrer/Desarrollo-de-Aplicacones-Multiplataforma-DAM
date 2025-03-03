package com.example.recex_pmdm

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.DialogFragment

class Ventana: DialogFragment() {
    private lateinit var vista: View

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {

        val builder = AlertDialog.Builder(requireContext())
        // traer el xml desde el archivo --> view
        vista = LayoutInflater.from(requireContext()).inflate(R.layout.ventana, null)
        builder.setView(vista)

        return builder.create()
    }

}