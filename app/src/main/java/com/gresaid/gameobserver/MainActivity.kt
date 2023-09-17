package com.gresaid.gameobserver

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ScreenWithImageAndDimmingPreview()
        }
    }
}

@Composable
fun ScreenWithImageAndDimming() {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.dota_background),
            contentDescription = "",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .fillMaxWidth()
                .size(310.dp)
                .drawWithContent {
                    val gradient = Brush.verticalGradient(
                        colors = listOf(Color.Black, Color.Transparent),
                        startY = 0f,
                        endY = (size.height / 3).coerceAtMost(126.dp.toPx())// Вниз
                    )
                    drawContent()
                    drawRect(brush = gradient, blendMode = BlendMode.Multiply,alpha = 0.92f)
                }
        )
    }
}
@Preview
@Composable
fun ScreenWithImageAndDimmingPreview() {
    Surface(
        modifier = Modifier
            .fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        ScreenWithImageAndDimming()
    }
}

