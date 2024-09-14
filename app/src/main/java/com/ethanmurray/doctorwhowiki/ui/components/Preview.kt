package com.ethanmurray.doctorwhowiki.ui.components

import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.ethanmurray.doctorwhowiki.ui.resources.ColorPalette
import com.ethanmurray.doctorwhowiki.ui.resources.RootTheme

@Composable
fun PreviewSurface(
    color: Color = ColorPalette.DarkBlue,
    content: @Composable () -> Unit
) = RootTheme {
    Surface(color = color, content = content)
}
