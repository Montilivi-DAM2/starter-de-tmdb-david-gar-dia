package cat.montilivi.gameapi_activity.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.PlayArrow
import androidx.compose.ui.graphics.vector.ImageVector
import kotlinx.serialization.Serializable

@Serializable
object CoverDestination

@Serializable
object GamesDestination

@Serializable
data class GameDevelopersDestination(val gameId: Int)

data class DrawerTag<T:Any>(
    val route: T,
    val unselectedIcon: ImageVector,
    val selectedIcon: ImageVector,
    val title: String
)

val drawerTags = listOf(
    DrawerTag(CoverDestination, unselectedIcon = Icons.Outlined.Home, selectedIcon = Icons.Filled.Home, title = "Cover Page"),
    DrawerTag(GamesDestination, unselectedIcon = Icons.Outlined.PlayArrow, selectedIcon = Icons.Filled.PlayArrow, title = "Games List"),
)