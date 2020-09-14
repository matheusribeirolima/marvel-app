package com.marvel.app.home.data

import com.marvel.app.network.api.MarvelApi
import javax.inject.Inject

class HomeRepository @Inject constructor(private val api: MarvelApi) {

    suspend fun listCharacters(offset: Int) = api.characters(offset)
}
