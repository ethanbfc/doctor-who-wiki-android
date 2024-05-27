package com.ethanmurray.doctorwhowiki.ui.screens.home

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.tooling.preview.Preview
import com.ethanmurray.doctorwhowiki.ui.components.PreviewSurface
import com.ethanmurray.doctorwhowiki.viewmodel.home.HomeViewModel
import com.ethanmurray.doctorwhowiki.viewmodel.home.HomeViewModel.State
import com.ramcosta.composedestinations.annotation.Destination
import org.koin.androidx.compose.koinViewModel

private const val previewGroup = "Home Screen"

@Destination
@Composable
fun HomeScreen() {
    val viewModel = koinViewModel<HomeViewModel>()
    val state by viewModel.state.collectAsState()

    HomeScreenContent(
        state = state
    )
}

@Composable
fun HomeScreenContent(
    state: State
) = Column {
    Text(text = "Home screen")
}

@Preview(name = "Home Screen - Fetching", group = previewGroup)
@Composable
fun HomeScreenFetchingPreview() = PreviewSurface {
    HomeScreenContent(
        state = State.Fetching
    )
}
