package com.marvel.app.network.api

import com.marvel.app.network.base.CHARACTERS_URL
import com.marvel.app.network.base.COMICS_BY_CHARACTER_URL
import com.marvel.app.network.model.Wrapper
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MarvelApi {
    @GET(CHARACTERS_URL)
    suspend fun characters(@Query("offset") offset: Int) : Wrapper

    @GET(COMICS_BY_CHARACTER_URL)
    suspend fun comicsByCharacter(
        @Path("characterId") characterId: Int,
        @Query("offset") offset: Int
    ) : Wrapper
}
