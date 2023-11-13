package com.gresaid.gameobserver.presentation.utils

import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.gresaid.gameobserver.R

@Composable
fun RatingStars(starCount: Int) {
    repeat(starCount) {
        Icon(
            imageVector = Icons.Default.Star,
            contentDescription = stringResource(R.string.rating_star),
            tint = Color.Yellow,
            modifier = Modifier.size(12.dp)
        )
    }
}