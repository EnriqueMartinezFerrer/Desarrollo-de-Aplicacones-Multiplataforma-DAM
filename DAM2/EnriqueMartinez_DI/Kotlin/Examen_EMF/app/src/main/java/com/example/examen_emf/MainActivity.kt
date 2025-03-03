package com.example.examen_emf

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var gameAdapter: GameAdapter
    private lateinit var gameFilter: GameFilter
    private lateinit var toolbar: Toolbar

    private val games = mutableListOf(
        Game("Elden Ring", "xbox", "rol"),
        Game("Gran turismo", "ps5","coches" ),
        Game("Persona 5 Royal", "switch","plataformas" ),
        Game("Red Dead Redemption", "ps5", "mundo abierto"),
        Game("Fifa 23", "xbox", "fútbol"),
        Game("Half - life", "pc","shooter" ),
        Game("The Legend of Zelda", "switch","plataformas" ),
        Game("Super Mario", "switch", "plataformas"),
        Game("Super Smash Bros", "switch", "peleas"),
        Game("The Last of Us", "ps5", "aventuras"),
        Game("Resident Evil 7", "ps5", "terror"),
        Game("GTA V", "xbox", "mundo abierto"),
        Game("God of War", "ps5", "plataformas"),
        Game("Forza Horizon 4", "xbox", "coches"),
        Game("BioShock", "pc", "futurista")
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        gameFilter = GameFilter(games)
        gameAdapter = GameAdapter(games, this::onGameClick)

        recyclerView = findViewById(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = gameAdapter
    }

    private fun onGameClick(game: Game) {
        val intent = Intent(this, GameDetailActivity::class.java)
        intent.putExtra("game", game)
        startActivity(intent)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.filter_platforms -> gameFilter.showPlatformFilterDialog(this)
            R.id.view_favorites -> gameFilter.filterByFavorites()
            R.id.clear_filters -> gameFilter.clearFilters()
        }
        gameAdapter.notifyDataSetChanged()
        return true
    }
}