package com.gresaid.gameobserver

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            HeaderBackground(R.drawable.dota_background, modifier = Modifier.fillMaxSize())
            GameLogo(gameLogo = R.drawable.dota_logo, modifier = Modifier.fillMaxSize())
//            GameInfo(gameName = "Dota 2", ratingsCount = 70)
        }
    }
}

