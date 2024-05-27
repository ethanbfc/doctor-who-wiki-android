package com.ethanmurray.doctorwhowiki.ui.resources

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val colorScheme = lightColorScheme(
    primary = ColorPalette.Purple40,
    secondary = ColorPalette.PurpleGrey40,
    tertiary = ColorPalette.Pink40

    /* Other default colors to override
    background = Color(0xFFFFFBFE),
    surface = Color(0xFFFFFBFE),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color(0xFF1C1B1F),
    onSurface = Color(0xFF1C1B1F),
    */
)

@Composable
fun RootTheme(
    content: @Composable () -> Unit
) = MaterialTheme(
    colorScheme = colorScheme,
    typography = InternalTypography.typography,
    content = content
)
