package cat.montilivi.gameapi_activity.model

import com.google.gson.annotations.SerializedName

data class Developer(
    val games: List<Game>,
    val gamesCount: Int,
    val id: Int,
    val image: String?,
    val name: String,
    val positions: List<Position>,
    val slug: String
)

data class Position(
    val id: Int,
    val name: String,
    val slug: String
)