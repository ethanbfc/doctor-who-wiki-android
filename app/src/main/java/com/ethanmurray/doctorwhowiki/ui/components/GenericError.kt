package com.ethanmurray.doctorwhowiki.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ethanmurray.doctorwhowiki.R
import com.ethanmurray.doctorwhowiki.ui.components.buttons.DoctorWhoWikiButton
import com.ethanmurray.doctorwhowiki.ui.resources.ColorPalette

private const val previewGroup = "Components - Generic Error"

@Composable
fun GenericError(
    onRetryTap: () -> Unit
) = Column(
    modifier = Modifier.fillMaxWidth(),
    verticalArrangement = Arrangement.spacedBy(4.dp),
    horizontalAlignment = Alignment.CenterHorizontally
) {
    Text(
        text = stringResource(id = R.string.generic_error_message),
        style = MaterialTheme.typography.bodyLarge,
        color = ColorPalette.NeutralWhite
    )

    DoctorWhoWikiButton(
        label = stringResource(id = R.string.generic_error_retry_button_label),
        onClick = onRetryTap
    )
}

@Preview(name = "Error component", group = previewGroup)
@Composable
fun ErrorComponentPreview() = PreviewSurface {
    GenericError(onRetryTap = {})
}
