package com.ethanmurray.doctorwhowiki.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

private const val previewGroup = "Components - Generic Error"

@Composable
fun GenericLoading() = Column(
    modifier = Modifier.fillMaxWidth(),
    horizontalAlignment = Alignment.CenterHorizontally
) {
    Spacer(modifier = Modifier.weight(1f))
    CircularProgressIndicator()
    Spacer(modifier = Modifier.weight(1f))
}

@Preview(name = "Loading component", group = previewGroup)
@Composable
fun LoadingComponentPreview() = PreviewSurface {
    GenericLoading()
}
