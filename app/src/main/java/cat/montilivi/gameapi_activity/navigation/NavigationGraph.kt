package cat.montilivi.gameapi_activity.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.toRoute
import cat.montilivi.gameapi_activity.ui.screens.CoverScreen
import cat.montilivi.gameapi_activity.ui.screens.GameDevelopersScreen
import cat.montilivi.gameapi_activity.ui.screens.GamesScreen

@Composable
fun NavigationGraph(
    navigationController: NavHostController,
    modifier: Modifier = Modifier
)
{
    NavHost(
        navController = navigationController,
        startDestination = CoverDestination,
        modifier = modifier)
    {
        composable<CoverDestination>
        {
            CoverScreen(onExploreClicked = {
                navigationController.navigate(GamesDestination) {
                    popUpTo(CoverDestination) { inclusive = true }
                }
            })
        }
        composable<GamesDestination>
        {
            GamesScreen(onClick = { gameId: Int -> navigationController.navigate(
                GameDevelopersDestination(gameId))})
        }
        composable<GameDevelopersDestination>{ backStackEntry ->
            val values = backStackEntry.toRoute<GameDevelopersDestination>()
            GameDevelopersScreen()
        }
    }
}