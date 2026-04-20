package cat.montilivi.gameapi_activity.ui.screens

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.navigation.toRoute
import cat.montilivi.gameapi_activity.data.network.RAWGHelperImpl
import cat.montilivi.gameapi_activity.data.network.rawgClient
import cat.montilivi.gameapi_activity.model.Developer
import cat.montilivi.gameapi_activity.model.toDeveloper
import cat.montilivi.gameapi_activity.navigation.GameDevelopersDestination
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class GameDevelopersViewmodel(savedStateHandle: SavedStateHandle): ViewModel() {
    private var _state = MutableStateFlow(StateGameDevelopersFlow())
    val state = _state.asStateFlow()

    val apiHelper = RAWGHelperImpl(rawgClient.service)

    init {
        val parameters = savedStateHandle.toRoute<GameDevelopersDestination>()
        getGameDevelopers(parameters.gameId)
    }

    fun getGameDevelopers(gameId: Int) {
        viewModelScope.launch {
            apiHelper.getGameDevelopersFlow(gameId)
                .flowOn(Dispatchers.IO)
                .onStart { _state.update { it.copy(isLoading = true) } }
                .catch{ error -> _state.update{
                    it.copy(isError = true, message = error.message ?: "") }}
                .collect { response ->
                    _state.update { state ->
                        state.copy(isLoading = false,
                            isError = false,
                            message = "",
                            developers = response.results
                                .map { apiDeveloper -> apiDeveloper.toDeveloper() }) }

                }
        }
    }



    data class StateGameDevelopersFlow (
        val isLoading: Boolean = false,
        val isError: Boolean = false,
        val message: String = "",
        val developers: List<Developer> = listOf()
    )
}