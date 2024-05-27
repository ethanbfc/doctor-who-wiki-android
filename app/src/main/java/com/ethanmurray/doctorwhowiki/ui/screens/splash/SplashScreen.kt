package com.ethanmurray.doctorwhowiki.ui.screens.splash

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.ethanmurray.doctorwhowiki.ui.components.GenericLoading
import com.ethanmurray.doctorwhowiki.ui.components.PreviewSurface
import com.ethanmurray.doctorwhowiki.viewmodel.splash.SplashViewModel
import com.ethanmurray.doctorwhowiki.viewmodel.splash.SplashViewModel.State
import com.ramcosta.composedestinations.annotation.Destination
import org.koin.androidx.compose.koinViewModel

private const val previewGroup = "Splash Screen"

@Destination
@Composable
fun SplashScreen() {
    val viewModel = koinViewModel<SplashViewModel>()
    val state by viewModel.state.collectAsState()

    // TODO: Navigate to HomeScreen when state=Success

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
    } else {
        Text(text = "Placeholder splash screen")
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
