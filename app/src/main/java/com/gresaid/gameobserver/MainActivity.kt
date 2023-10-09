package com.gresaid.gameobserver

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.gresaid.gameobserver.ui.theme.GresTheme
import com.gresaid.gameobserver.presentation.screens.gameInfoScreen.GameInfoScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GresTheme {
                    GameInfoScreen()
            }
        }
    }
}

