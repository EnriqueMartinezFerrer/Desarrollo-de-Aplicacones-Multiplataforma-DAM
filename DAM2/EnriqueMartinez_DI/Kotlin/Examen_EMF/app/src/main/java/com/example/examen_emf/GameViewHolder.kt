package com.example.examen_emf
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class GameViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val gameNameTextView: TextView = itemView.findViewById(R.id.game_name_text_view)

    fun bind(game: Game) {
        gameNameTextView.text = game.name
    }
}