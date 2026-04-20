package cat.montilivi.gameapi_activity.model

import com.google.gson.annotations.SerializedName

data class APIResponseGetGameDevelopers(
    @SerializedName("count")
    val count: Int,
    @SerializedName("next")
    val next: String,
    @SerializedName("previous")
    val previous: Any,
    @SerializedName("results")
    val results: List<ApiDeveloper>
)