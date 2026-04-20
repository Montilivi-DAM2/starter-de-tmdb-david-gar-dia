package cat.montilivi.gameapi_activity.data.network

import cat.montilivi.gameapi_activity.model.APIResponseGetGameDevelopers
import cat.montilivi.gameapi_activity.model.APIResponseGetGames
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface RAWGService {
    @GET("games")
    suspend fun getGames(
        @Query("key") key: String =
            rawgClient.API_KEY,
        @Query("page") page: Int = 1
    ): APIResponseGetGames

    @GET (value = "games/{game_id}/development-team")
    suspend fun getGameDevelopers(
        @Path("game_id") gameId: Int,
        @Query("key") key: String =
            rawgClient.API_KEY,
    ): APIResponseGetGameDevelopers
}