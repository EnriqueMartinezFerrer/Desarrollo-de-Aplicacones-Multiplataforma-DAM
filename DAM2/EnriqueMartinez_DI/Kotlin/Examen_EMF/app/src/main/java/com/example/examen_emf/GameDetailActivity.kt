package com.example.examen_emf

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class GameDetailActivity : AppCompatActivity() {

    companion object {
        const val GAME_KEY = "game"
    }

    private lateinit var game: Game

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_detail)

        game = intent.getParcelableExtra(GAME_KEY)!!

        supportActionBar?.title = game.name


        imagen.setImageResource(game.image)
        nameTextView.text = game.name
        platformTextView.text = game.platform
        priceTextView.text = game.price
    }
}