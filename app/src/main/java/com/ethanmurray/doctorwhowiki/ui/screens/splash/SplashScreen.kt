package com.ethanmurray.doctorwhowiki.ui.screens.splash

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ethanmurray.doctorwhowiki.R
import com.ethanmurray.doctorwhowiki.destinations.HomeScreenDestination
import com.ethanmurray.doctorwhowiki.ui.components.GenericError
import com.ethanmurray.doctorwhowiki.ui.components.GenericLoading
import com.ethanmurray.doctorwhowiki.ui.components.PreviewSurface
import com.ethanmurray.doctorwhowiki.ui.components.effects.ExecuteOnInstanceEffect
import com.ethanmurray.doctorwhowiki.ui.resources.ColorPalette
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
        state = state,
        onRetryTap = viewModel::fetch
    )
}

@Composable
fun SplashScreenContent(
    state: State,
    onRetryTap: () -> Unit
) = Column(
    modifier = Modifier
        .fillMaxSize()
        .background(color = ColorPalette.DarkBlue),
    horizontalAlignment = Alignment.CenterHorizontally
) {
    Spacer(modifier = Modifier.height(164.dp))
    Text(
        text = stringResource(id = R.string.app_name),
        style = MaterialTheme.typography.titleLarge,
        color = ColorPalette.LightBlue,
        textAlign = TextAlign.Center
    )
    if (state is State.FetchError) {
        Spacer(modifier = Modifier.weight(0.25f))
        GenericError(onRetryTap = onRetryTap)
        Spacer(modifier = Modifier.weight(1f))
    } else {
        GenericLoading()
    }
}

@Preview(name = "Splash Screen - Fetching", group = previewGroup)
@Composable
fun SplashScreenFetchingPreview() = PreviewSurface {
    SplashScreenContent(
        state = State.Fetching,
        onRetryTap = {}
    )
}

@Preview(name = "Splash Screen - Fetch Error", group = previewGroup)
@Composable
fun SplashScreenFetchErrorPreview() = PreviewSurface {
    SplashScreenContent(
        state = State.FetchError,
        onRetryTap = {}
    )
}