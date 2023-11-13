package com.gresaid.gameobserver.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable


private val darkColorPalette = darkColors(
    primary = extraWhite,
    background = darkBLue,
    onSecondary = gray,
    secondary = blue,
    secondaryVariant = yellow,

    )

private val lightColorPalette = lightColors(
    primary = extraWhite,
    background = darkBLue,
    onSecondary = gray,
    secondary = blue,
    secondaryVariant = yellow,
)

@Composable
fun GresTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    val colors = if (darkTheme) {
        darkColorPalette
    } else {
        lightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        content = content
    )
}
