package com.example.examen_emf

class GameFilter(private val games: List<Game>) {

    private var filteredGames: List<Game> = games

    fun filterByPlatform(platforms: List<String>) {
        filteredGames = games.filter { game -> platforms.contains(game.platform) }
    }

    fun filterFavorites() {
        filteredGames = filteredGames.filter { it.favorite }
    }

    fun clearFilter() {
        filteredGames = games
    }

    fun getFilteredGames(): List<Game> {
        return filteredGames
    }
}