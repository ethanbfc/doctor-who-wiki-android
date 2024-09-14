package com.ethanmurray.doctorwhowiki.ui.components.buttons

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ethanmurray.doctorwhowiki.ui.components.PreviewSurface
import com.ethanmurray.doctorwhowiki.ui.resources.ColorPalette
import com.ethanmurray.doctorwhowiki.ui.resources.InternalTypography

private const val previewGroup = "Components - Buttons - Base Button"

@Composable
fun DoctorWhoWikiButton(
    label: String,
    onClick: () -> Unit,
    isEnabled: Boolean = true
) = Button(
    onClick = onClick,
    enabled = isEnabled,
    colors = ButtonColors(
        containerColor = ColorPalette.LightBlue,
        contentColor = ColorPalette.NeutralWhite,
        disabledContainerColor = ColorPalette.LightBlue.copy(alpha = 0.5f),
        disabledContentColor = ColorPalette.NeutralWhite.copy(alpha = 0.5f),
    )
) {
    Text(
        text = label,
        style = InternalTypography.bodyMedium
    )
}

@Composable
@Preview(name = "Doctor Who Wiki Button", group = previewGroup)
fun DoctorWhoWikiButtonPreview() = PreviewSurface {
    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        DoctorWhoWikiButton(
            label = "Click Me",
            onClick = {}
        )
        DoctorWhoWikiButton(
            label = "Click Me",
            onClick = {},
            isEnabled = false
        )
    }
}
