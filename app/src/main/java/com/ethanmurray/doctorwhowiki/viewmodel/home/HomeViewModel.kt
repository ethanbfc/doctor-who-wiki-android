package com.ethanmurray.doctorwhowiki.viewmodel.home

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow

open class HomeViewModel(): ViewModel() {
    val state = MutableStateFlow<State>(State.Fetching)

    sealed class State {
        object Fetching: State()
        object FetchError: State()
        object Success: State()
    }
}
