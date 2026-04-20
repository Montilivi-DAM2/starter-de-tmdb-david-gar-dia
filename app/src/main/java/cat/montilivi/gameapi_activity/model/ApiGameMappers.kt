package cat.montilivi.gameapi_activity.model

fun ApiGame.toGame(): Game = Game(
    added = added,
    addedByStatus = addedByStatus.toAddedByStatus(),
    backgroundImage = backgroundImage,
    clip = clip,
    dominantColor = dominantColor,
    esrbRating = esrbRating?.toEsrbRating(),
    genres = genres.map { it.toGenre() },
    id = id,
    metacritic = metacritic,
    name = name,
    parentPlatforms = parentPlatforms.map { it.toParentPlatform() },
    platforms = platforms.map { it.toPlatformMeta() },
    playtime = playtime,
    rating = rating,
    ratingTop = ratingTop,
    ratings = ratings.map { it.toRating() },
    ratingsCount = ratingsCount,
    released = released,
    reviewsCount = reviewsCount,
    reviewsTextCount = reviewsTextCount,
    saturatedColor = saturatedColor,
    shortScreenshots = shortScreenshots.map { it.toShortScreenshot() },
    slug = slug,
    stores = stores.map { it.toStoreMeta() },
    suggestionsCount = suggestionsCount,
    tags = tags.map { it.toTag() },
    tba = tba,
    updated = updated,
    userGame = userGame
)

fun ApiAddedByStatus.toAddedByStatus() = AddedByStatus(
    beaten = beaten,
    dropped = dropped,
    owned = owned,
    playing = playing,
    toplay = toplay,
    yet = yet
)

fun ApiEsrbRating.toEsrbRating() = EsrbRating(
    id = id,
    name = name,
    slug = slug
)

fun ApiGenre.toGenre() = Genre(
    gamesCount = gamesCount,
    id = id,
    imageBackground = imageBackground,
    name = name,
    slug = slug
)

fun ApiParentPlatform.toParentPlatform() = ParentPlatform(
    platform = platform.toPlatformBrief())

fun ApiPlatformBrief.toPlatformBrief() = PlatformBrief(
    id = id,
    name = name,
    slug = slug
)

fun ApiPlatformMeta.toPlatformMeta() = PlatformMeta(
    platform = platform.toPlatform(),
    releasedAt = releasedAt,
    requirementsEn = requirementsEn?.let { RequirementsEn(it.minimum, it.recommended) },
    requirementsRu = requirementsRu?.let { RequirementsRu(it.minimum, it.recommended) }
)

fun ApiPlatform.toPlatform() = Platform(
    gamesCount = gamesCount,
    id = id,
    image = image,
    imageBackground = imageBackground,
    name = name,
    slug = slug,
    yearEnd = yearEnd,
    yearStart = yearStart
)

fun ApiRating.toRating() = Rating(
    count = count,
    id = id,
    percent = percent,
    title = title
)

fun ApiShortScreenshot.toShortScreenshot() = ShortScreenshot(
    id = id,
    image = image
)

fun ApiStoreMeta.toStoreMeta() = StoreMeta(
    id = id,
    store = store.toStore())

fun ApiStore.toStore() = Store(
    domain = domain,
    gamesCount = gamesCount,
    id = id,
    imageBackground = imageBackground,
    name = name,
    slug = slug
)

fun ApiTag.toTag() = Tag(
    gamesCount = gamesCount,
    id = id,
    imageBackground = imageBackground,
    language = language,
    name = name,
    slug = slug
)