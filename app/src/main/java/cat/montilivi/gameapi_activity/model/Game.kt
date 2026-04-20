package cat.montilivi.gameapi_activity.model

class Game (
    val added: Int,
    val addedByStatus: AddedByStatus,
    val backgroundImage: String,
    val clip: Any?,
    val dominantColor: String,
    val esrbRating: EsrbRating?,
    val genres: List<Genre>,
    val id: Int,
    val metacritic: Int,
    val name: String,
    val parentPlatforms: List<ParentPlatform>,
    val platforms: List<PlatformMeta>,
    val playtime: Int,
    val rating: Double,
    val ratingTop: Int,
    val ratings: List<Rating>,
    val ratingsCount: Int,
    val released: String?,
    val reviewsCount: Int,
    val reviewsTextCount: Int,
    val saturatedColor: String,
    val shortScreenshots: List<ShortScreenshot>,
    val slug: String,
    val stores: List<StoreMeta>,
    val suggestionsCount: Int,
    val tags: List<Tag>,
    val tba: Boolean,
    val updated: String,
    val userGame: Any?
)

data class AddedByStatus(
    val beaten: Int,
    val dropped: Int,
    val owned: Int,
    val playing: Int,
    val toplay: Int,
    val yet: Int
)

data class EsrbRating(
    val id: Int,
    val name: String,
    val slug: String
)

data class Genre(
    val gamesCount: Int,
    val id: Int,
    val imageBackground: String,
    val name: String,
    val slug: String
)

data class ParentPlatform(
    val platform: PlatformBrief
)

data class PlatformBrief(
    val id: Int,
    val name: String,
    val slug: String
)

data class PlatformMeta(
    val platform: Platform,
    val releasedAt: String?,
    val requirementsEn: RequirementsEn?,
    val requirementsRu: RequirementsRu?
)

data class Platform(
    val gamesCount: Int,
    val id: Int,
    val image: Any?,
    val imageBackground: String,
    val name: String,
    val slug: String,
    val yearEnd: Any?,
    val yearStart: Int?
)

data class Rating(
    val count: Int,
    val id: Int,
    val percent: Double,
    val title: String
)

data class RequirementsEn(
    val minimum: String?,
    val recommended: String?
)

data class RequirementsRu(
    val minimum: String?,
    val recommended: String?
)

data class ShortScreenshot(
    val id: Int,
    val image: String
)

data class StoreMeta(
    val id: Int,
    val store: Store
)

data class Store(
    val domain: String,
    val gamesCount: Int,
    val id: Int,
    val imageBackground: String,
    val name: String,
    val slug: String
)

data class Tag(
    val gamesCount: Int,
    val id: Int,
    val imageBackground: String,
    val language: String,
    val name: String,
    val slug: String
)