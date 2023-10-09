package com.gresaid.gameobserver.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable


private val darkColorPalette = darkColorScheme(
    primary = extraWhite,
    background = darkBLue,
    onSecondary = gray,
    secondary = blue,
    onPrimaryContainer = yellow,

)

private val lightColorPalette = lightColorScheme(
    primary = extraWhite,
    background = darkBLue,
    onSecondary = gray,
    secondary = blue,
    onPrimaryContainer = yellow,
)

@Composable
fun GresTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    if (darkTheme) {
        darkColorPalette
    } else {
        lightColorPalette
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
