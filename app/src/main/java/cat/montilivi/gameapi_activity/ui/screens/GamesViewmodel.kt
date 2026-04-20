package cat.montilivi.gameapi_activity.ui.screens

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import cat.montilivi.gameapi_activity.data.network.RAWGHelperImpl
import cat.montilivi.gameapi_activity.data.network.rawgClient
import cat.montilivi.gameapi_activity.model.Game
import cat.montilivi.gameapi_activity.model.toGame
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class GamesViewmodel: ViewModel() {
    private var _state = MutableStateFlow(StateGamesFlow())
    val state = _state.asStateFlow()

    val apiHelper = RAWGHelperImpl(rawgClient.service)

    init {
        getGames(1)
    }

    fun getGames(page: Int) {
        viewModelScope.launch {
            apiHelper.getGamesFlow(page = page)
                .flowOn(Dispatchers.IO)
                .onStart { _state.update { it.copy(isLoading = true) } }
                .catch{ error -> _state.update{
                    it.copy(isError = true, message = error.message ?: "") }}
                .collect { response ->
                    _state.update { state ->
                        state.copy(isLoading = false,
                            isError = false,
                            message = "",
                            page = page,
                            games = response.results
                                .map { apiGames-> apiGames.toGame() }) }

                }
        }
    }



    data class StateGamesFlow (
        val isLoading: Boolean = false,
        val isError: Boolean = false,
        val message: String = "",
        val games: List<Game> = listOf(),
        val page: Int = 1,
        val totalPages: Int = 5
    )
}