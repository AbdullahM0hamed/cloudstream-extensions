// use an integer for version numbers
version = 1


cloudstream {
    // All of these properties are optional, you can safely remove them

    // description = "Lorem Ipsum"
    // authors = listOf("Cloudburst")

    /**
     * Status int as the following:
     * 0: Down
     * 1: Ok
     * 2: Slow
     * 3: Beta only
     * */
    status = 1 // will be 3 if unspecified
    tvTypes = listOf(
        "AsianDrama",
        "Anime",
        "TvSeries",
        "Movie",
    )


    iconUrl = "https://www.google.com/s2/favicons?domain=104.237.198.194&sz=24"
}