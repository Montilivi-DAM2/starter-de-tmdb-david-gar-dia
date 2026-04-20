package cat.montilivi.gameapi_activity.model

import com.google.gson.annotations.SerializedName

data class APIResponseGetGames(
    @SerializedName("count")
    val count: Int,
    @SerializedName("description")
    val description: String,
    @SerializedName("filters")
    val filters: Filters,
    @SerializedName("next")
    val next: String?,
    @SerializedName("nofollow")
    val nofollow: Boolean,
    @SerializedName("nofollow_collections")
    val nofollowCollections: List<String>,
    @SerializedName("noindex")
    val noindex: Boolean,
    @SerializedName("previous")
    val previous: Any?,
    @SerializedName("results")
    val results: List<ApiGame>,
    @SerializedName("seo_description")
    val seoDescription: String,
    @SerializedName("seo_h1")
    val seoH1: String,
    @SerializedName("seo_keywords")
    val seoKeywords: String,
    @SerializedName("seo_title")
    val seoTitle: String
)

data class Filters(
    @SerializedName("years")
    val years: List<YearPeriod>
)

data class YearPeriod(
    @SerializedName("count")
    val count: Int,
    @SerializedName("decade")
    val decade: Int,
    @SerializedName("filter")
    val filter: String,
    @SerializedName("from")
    val from: Int,
    @SerializedName("nofollow")
    val nofollow: Boolean,
    @SerializedName("to")
    val to: Int,
    @SerializedName("years")
    val years: List<Year>
)

data class Year(
    @SerializedName("count")
    val count: Int,
    @SerializedName("nofollow")
    val nofollow: Boolean,
    @SerializedName("year")
    val year: Int
)
