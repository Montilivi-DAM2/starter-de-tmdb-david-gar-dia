package cat.montilivi.gameapi_activity.model

import com.google.gson.annotations.SerializedName

data class ApiGame(
    @SerializedName("added")
    val added: Int,
    @SerializedName("added_by_status")
    val addedByStatus: ApiAddedByStatus,
    @SerializedName("background_image")
    val backgroundImage: String,
    @SerializedName("clip")
    val clip: Any?,
    @SerializedName("dominant_color")
    val dominantColor: String,
    @SerializedName("esrb_rating")
    val esrbRating: ApiEsrbRating,
    @SerializedName("genres")
    val genres: List<ApiGenre>,
    @SerializedName("id")
    val id: Int,
    @SerializedName("metacritic")
    val metacritic: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("parent_platforms")
    val parentPlatforms: List<ApiParentPlatform>,
    @SerializedName("platforms")
    val platforms: List<ApiPlatformMeta>,
    @SerializedName("playtime")
    val playtime: Int,
    @SerializedName("rating")
    val rating: Double,
    @SerializedName("rating_top")
    val ratingTop: Int,
    @SerializedName("ratings")
    val ratings: List<ApiRating>,
    @SerializedName("ratings_count")
    val ratingsCount: Int,
    @SerializedName("released")
    val released: String,
    @SerializedName("reviews_count")
    val reviewsCount: Int,
    @SerializedName("reviews_text_count")
    val reviewsTextCount: Int,
    @SerializedName("saturated_color")
    val saturatedColor: String,
    @SerializedName("short_screenshots")
    val shortScreenshots: List<ApiShortScreenshot>,
    @SerializedName("slug")
    val slug: String,
    @SerializedName("stores")
    val stores: List<ApiStoreMeta>,
    @SerializedName("suggestions_count")
    val suggestionsCount: Int,
    @SerializedName("tags")
    val tags: List<ApiTag>,
    @SerializedName("tba")
    val tba: Boolean,
    @SerializedName("updated")
    val updated: String,
    @SerializedName("user_game")
    val userGame: Any?
)

data class ApiAddedByStatus(
    @SerializedName("beaten")
    val beaten: Int,
    @SerializedName("dropped")
    val dropped: Int,
    @SerializedName("owned")
    val owned: Int,
    @SerializedName("playing")
    val playing: Int,
    @SerializedName("toplay")
    val toplay: Int,
    @SerializedName("yet")
    val yet: Int
)

data class ApiEsrbRating(
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("slug")
    val slug: String
)

data class ApiGenre(
    @SerializedName("games_count")
    val gamesCount: Int,
    @SerializedName("id")
    val id: Int,
    @SerializedName("image_background")
    val imageBackground: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("slug")
    val slug: String
)

data class ApiParentPlatform(
    @SerializedName("platform")
    val platform: ApiPlatformBrief
)

data class ApiPlatformBrief(
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("slug")
    val slug: String
)

data class ApiPlatformMeta(
    @SerializedName("platform")
    val platform: ApiPlatform,
    @SerializedName("released_at")
    val releasedAt: String,
    @SerializedName("requirements_en")
    val requirementsEn: ApiRequirementsEn?,
    @SerializedName("requirements_ru")
    val requirementsRu: ApiRequirementsRu?
)

data class ApiPlatform(
    @SerializedName("games_count")
    val gamesCount: Int,
    @SerializedName("id")
    val id: Int,
    @SerializedName("image")
    val image: Any?,
    @SerializedName("image_background")
    val imageBackground: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("slug")
    val slug: String,
    @SerializedName("year_end")
    val yearEnd: Any?,
    @SerializedName("year_start")
    val yearStart: Int?
)

data class ApiRating(
    @SerializedName("count")
    val count: Int,
    @SerializedName("id")
    val id: Int,
    @SerializedName("percent")
    val percent: Double,
    @SerializedName("title")
    val title: String
)

data class ApiRequirementsEn(
    @SerializedName("minimum")
    val minimum: String,
    @SerializedName("recommended")
    val recommended: String
)

data class ApiRequirementsRu(
    @SerializedName("minimum")
    val minimum: String,
    @SerializedName("recommended")
    val recommended: String
)

data class ApiShortScreenshot(
    @SerializedName("id")
    val id: Int,
    @SerializedName("image")
    val image: String
)

data class ApiStoreMeta(
    @SerializedName("id")
    val id: Int,
    @SerializedName("store")
    val store: ApiStore
)

data class ApiStore(
    @SerializedName("domain")
    val domain: String,
    @SerializedName("games_count")
    val gamesCount: Int,
    @SerializedName("id")
    val id: Int,
    @SerializedName("image_background")
    val imageBackground: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("slug")
    val slug: String
)

data class ApiTag(
    @SerializedName("games_count")
    val gamesCount: Int,
    @SerializedName("id")
    val id: Int,
    @SerializedName("image_background")
    val imageBackground: String,
    @SerializedName("language")
    val language: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("slug")
    val slug: String
)
