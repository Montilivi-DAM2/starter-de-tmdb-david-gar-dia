package cat.montilivi.gameapi_activity.data.network

import cat.montilivi.gameapi_activity.model.APIResponseGetGameDevelopers
import cat.montilivi.gameapi_activity.model.APIResponseGetGames
import kotlinx.coroutines.flow.Flow

interface RAWGHelper {

    fun getGamesFlow(
        key: String = rawgClient.API_KEY,
        page: Int = 1
    ): Flow<APIResponseGetGames>

    fun getGameDevelopersFlow(
        gameId: Int,
        key: String = rawgClient.API_KEY,
    ): Flow<APIResponseGetGameDevelopers>
}