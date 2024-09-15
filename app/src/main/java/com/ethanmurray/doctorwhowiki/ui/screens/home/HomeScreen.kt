package com.ethanmurray.doctorwhowiki.ui.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
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
import com.ethanmurray.doctorwhowiki.ui.components.GenericError
import com.ethanmurray.doctorwhowiki.ui.components.GenericLoading
import com.ethanmurray.doctorwhowiki.ui.components.PreviewSurface
import com.ethanmurray.doctorwhowiki.ui.resources.ColorPalette
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
        state = state,
        onDoctorsTap = {},
        onCompanionsTap = {},
        onEpisodesTap = {},
        onSeriesTap = {},
        onActorsTap = {},
        onWritersTap = {},
        onDirectorsTap = {},
        onRetryTap = viewModel::fetch
    )
}

@Composable
fun HomeScreenContent(
    state: State,
    onDoctorsTap: () -> Unit,
    onCompanionsTap: () -> Unit,
    onEpisodesTap: () -> Unit,
    onSeriesTap: () -> Unit,
    onActorsTap: () -> Unit,
    onWritersTap: () -> Unit,
    onDirectorsTap: () -> Unit,
    onRetryTap: () -> Unit
) = Column(
    modifier = Modifier
        .fillMaxSize()
        .background(color = ColorPalette.DarkBlue)
        .verticalScroll(rememberScrollState())
        .padding(horizontal = 20.dp),
    horizontalAlignment = Alignment.CenterHorizontally
) {
    Spacer(modifier = Modifier.height(20.dp))
    Text(
        text = stringResource(id = R.string.app_name),
        style = MaterialTheme.typography.titleLarge,
        color = ColorPalette.LightBlue,
        textAlign = TextAlign.Center
    )
    Spacer(modifier = Modifier.height(20.dp))

    when (state) {
        is State.Populated -> {
            CategoriesSection(
                onDoctorsTap = onDoctorsTap,
                onCompanionsTap = onCompanionsTap,
                onEpisodesTap = onEpisodesTap,
                onSeriesTap = onSeriesTap,
                onActorsTap = onActorsTap,
                onWritersTap = onWritersTap,
                onDirectorsTap = onDirectorsTap
            )
            Spacer(modifier = Modifier.height(20.dp))
        }
        is State.FetchError -> GenericError(onRetryTap = onRetryTap)
        is State.Fetching -> GenericLoading()
    }
}

@Composable
private fun CategoriesSection(
    onDoctorsTap: () -> Unit,
    onCompanionsTap: () -> Unit,
    onEpisodesTap: () -> Unit,
    onSeriesTap: () -> Unit,
    onActorsTap: () -> Unit,
    onWritersTap: () -> Unit,
    onDirectorsTap: () -> Unit
) = Column(
    modifier = Modifier.fillMaxWidth(),
    verticalArrangement = Arrangement.spacedBy(16.dp)
) {
    CategoriesCard(
        title = "Doctors",
        description = "Doctors",
        onClick = onDoctorsTap
    )
    CategoriesCard(
        title = "Companions",
        description = "Companions",
        onClick = onCompanionsTap
    )
    CategoriesCard(
        title = "Episodes",
        description = "Episodes",
        onClick = onEpisodesTap
    )
    CategoriesCard(
        title = "Series",
        description = "Series",
        onClick = onSeriesTap
    )
    CategoriesCard(
        title = "Actors",
        description = "Actors",
        onClick = onActorsTap
    )
    CategoriesCard(
        title = "Writers",
        description = "Writers",
        onClick = onWritersTap
    )
    CategoriesCard(
        title = "Directors",
        description = "Directors",
        onClick = onDirectorsTap
    )
}

@Composable
private fun CategoriesCard(
    title: String,
    description: String,
    onClick: () -> Unit
) = Column(
    modifier = Modifier
        .fillMaxWidth()
        .background(
            color = ColorPalette.Blue,
            shape = RoundedCornerShape(12.dp)
        )
        .clickable { onClick() }
        .padding(16.dp),
    verticalArrangement = Arrangement.spacedBy(4.dp)
) {
    Text(
        text = title,
        style = MaterialTheme.typography.titleMedium,
        color = ColorPalette.LightBlue,
        textAlign = TextAlign.Center
    )
    Text(
        text = description,
        style = MaterialTheme.typography.bodyMedium,
        color = ColorPalette.LightBlue,
        textAlign = TextAlign.Center
    )
}

@Preview(name = "Home Screen - Populated", group = previewGroup)
@Composable
fun HomeScreenPopulatedPreview() = HomeScreenPreviewWrapper(state = State.Populated)

@Preview(name = "Home Screen - Fetching", group = previewGroup)
@Composable
fun HomeScreenFetchingPreview() = HomeScreenPreviewWrapper(state = State.Fetching)

@Preview(name = "Home Screen - Fetch Error", group = previewGroup)
@Composable
fun HomeScreenFetchErrorPreview() = HomeScreenPreviewWrapper(state = State.FetchError)

@Composable
private fun HomeScreenPreviewWrapper(
    state: State
) = PreviewSurface {
    HomeScreenContent(
        state = state,
        onDoctorsTap = {},
        onCompanionsTap = {},
        onEpisodesTap = {},
        onSeriesTap = {},
        onActorsTap = {},
        onWritersTap = {},
        onDirectorsTap = {},
        onRetryTap = {}
    )
}
