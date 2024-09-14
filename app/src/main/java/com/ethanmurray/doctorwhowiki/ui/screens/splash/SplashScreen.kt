package com.ethanmurray.doctorwhowiki.ui.screens.splash

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.ethanmurray.doctorwhowiki.destinations.HomeScreenDestination
import com.ethanmurray.doctorwhowiki.ui.components.GenericLoading
import com.ethanmurray.doctorwhowiki.ui.components.PreviewSurface
import com.ethanmurray.doctorwhowiki.ui.components.effects.ExecuteOnInstanceEffect
import com.ethanmurray.doctorwhowiki.viewmodel.splash.SplashViewModel
import com.ethanmurray.doctorwhowiki.viewmodel.splash.SplashViewModel.State
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.annotation.RootNavGraph
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import org.koin.androidx.compose.koinViewModel

private const val previewGroup = "Splash Screen"

@RootNavGraph(start = true)
@Destination
@Composable
fun SplashScreen(
    navigator: DestinationsNavigator
) {
    val viewModel = koinViewModel<SplashViewModel>()
    val state by viewModel.state.collectAsState()

    ExecuteOnInstanceEffect<State, State.Success>(viewModel.state) {
        navigator.navigate(HomeScreenDestination)
    }

    SplashScreenContent(
        state = state
    )
}

@Composable
fun SplashScreenContent(
    state: State
) = Column(
    modifier = Modifier.fillMaxWidth()
) {
    if (state is State.Fetching) {
        GenericLoading()
    }
}

@Preview(name = "Splash Screen - Fetching", group = previewGroup)
@Composable
fun SplashScreenFetchingPreview() = PreviewSurface {
    SplashScreenContent(
        state = State.Fetching
    )
}

@Preview(name = "Splash Screen - Success", group = previewGroup)
@Composable
fun SplashScreenSuccessPreview() = PreviewSurface {
    SplashScreenContent(
        state = State.Success
    )
}
