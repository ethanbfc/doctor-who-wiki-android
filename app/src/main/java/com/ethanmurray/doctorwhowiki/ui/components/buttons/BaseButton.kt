package com.ethanmurray.doctorwhowiki.ui.components.buttons

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ethanmurray.doctorwhowiki.ui.resources.InternalTypography

private const val previewGroup = "Components - Buttons - Base Button"

@Composable
fun DoctorWhoWikiButton(
    label: String,
    onClick: () -> Unit
) {
    Button(onClick = onClick) {
        Text(
            text = label,
            style = InternalTypography.bodyMedium
        )
    }
}

@Composable
@Preview(name = "Doctor Who Wiki Button", group = previewGroup)
fun DoctorWhoWikiButtonPreview() = Column(
    modifier = Modifier
        .background(Color.LightGray)
        .padding(20.dp)
) {
    DoctorWhoWikiButton(label = "Click Me", onClick = {})
}
