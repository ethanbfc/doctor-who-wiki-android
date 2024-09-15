package com.ethanmurray.doctorwhowiki.viewmodel.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

open class HomeViewModel(): ViewModel() {
    val state = MutableStateFlow<State>(State.Fetching)

    init {
        fetch()
    }
    
    fun fetch() = viewModelScope.launch {
        state.value = State.Fetching
        // TODO: This will be replaced with an actual network call
        delay(1000L)
        state.value = State.Populated
    }

    sealed class State {
        object Fetching: State()
        object FetchError: State()
        object Populated: State()
    }
}
