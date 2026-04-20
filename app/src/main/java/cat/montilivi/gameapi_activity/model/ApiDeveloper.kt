package cat.montilivi.gameapi_activity.model

import com.google.gson.annotations.SerializedName

data class ApiDeveloper(
    @SerializedName("games")
    val games: List<ApiGame>,
    @SerializedName("games_count")
    val gamesCount: Int,
    @SerializedName("id")
    val id: Int,
    @SerializedName("image")
    val image: String,
    @SerializedName("image_background")
    val imageBackground: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("positions")
    val positions: List<ApiPosition>,
    @SerializedName("slug")
    val slug: String
)

data class ApiPosition(
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("slug")
    val slug: String
)