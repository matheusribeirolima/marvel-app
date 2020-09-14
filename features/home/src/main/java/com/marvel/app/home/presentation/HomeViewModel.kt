package com.marvel.app.home.presentation

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.marvel.app.home.data.HomeRepository
import com.marvel.app.network.model.Wrapper
import kotlinx.coroutines.launch

class HomeViewModel @ViewModelInject constructor(
    private val repository: HomeRepository
): ViewModel() {

    init {
        listCharacters(0)
    }

    private val _characters = MutableLiveData<Wrapper>()
    val characters: LiveData<Wrapper>
        get() = _characters

    fun listCharacters(offset: Int) {
        viewModelScope.launch {
            _characters.postValue(repository.listCharacters(offset))
        }
    }
}
