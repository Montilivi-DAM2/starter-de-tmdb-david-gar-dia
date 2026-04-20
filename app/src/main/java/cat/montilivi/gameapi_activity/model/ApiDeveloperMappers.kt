package cat.montilivi.gameapi_activity.model

fun ApiDeveloper.toDeveloper() = Developer(
    games = games.map { it.toGame() },
    gamesCount = gamesCount,
    id = id,
    image = image,
    name = name,
    positions = positions.map { it.toPosition() },
    slug = slug
)

fun ApiPosition.toPosition() = Position(
    id = id,
    name = name,
    slug = slug
)
