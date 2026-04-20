package cat.montilivi.gameapi_activity.data.network

import cat.montilivi.gameapi_activity.model.APIResponseGetGameDevelopers
import cat.montilivi.gameapi_activity.model.APIResponseGetGames
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class RAWGHelperImpl(val apiService: RAWGService): RAWGHelper {
    override fun getGamesFlow(
        key: String,
        page: Int
    ): Flow<APIResponseGetGames> = flow {
        emit(apiService.getGames(key, page))
    }

    override fun getGameDevelopersFlow(
        gameId: Int,
        key: String,
    ): Flow<APIResponseGetGameDevelopers> = flow {
        emit(apiService.getGameDevelopers(gameId, key))
    }
}