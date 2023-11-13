package com.gresaid.gameobserver.presentation.screens.gameInfoScreen.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.gresaid.gameobserver.R

@Composable
fun GameLogo(
    gameLogo: Int,
    modifier: Modifier = Modifier,
) {
    Box(modifier = modifier.padding(horizontal = 20.dp)) {
        val sizeGameIcon = 54.dp
        Box(
            modifier = Modifier
                .size(sizeGameIcon + 17.dp * 2)
                .background(Color.Black, shape = RoundedCornerShape(13.dp))
                .border(2.dp, Color.Gray, RoundedCornerShape(13.dp))
        ) {
            Image(
                painter = painterResource(id = gameLogo),
                contentDescription = stringResource(R.string.game_logo),
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .size(sizeGameIcon)
                    .align(Alignment.Center)
            )
        }
    }
}