package com.gresaid.gameobserver.presentation.screens.gameInfoScreen.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.BlurredEdgeTreatment
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.gresaid.gameobserver.R

@Composable
fun PostSection(
    posts: List<Painter>,
    modifier: Modifier = Modifier,
) {
    LazyHorizontalGrid(
        modifier = modifier.size(width = 240.dp, height = 135.dp),
        rows = GridCells.Fixed(1),
        horizontalArrangement = Arrangement.spacedBy(15.dp),
    ) {
        items(posts.size) {
            Box(
                modifier = Modifier
                    .size(width = 240.dp, height = 135.dp),
                contentAlignment = Alignment.Center,
            ) {
                Image(
                    painter = posts[it],
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier
                        .clip(
                            RoundedCornerShape(14.dp)
                        ),
                )
                Box(
                    modifier = Modifier
                        .size(48.dp)
                        .background(color = Color(255, 255, 255, 100), RoundedCornerShape(100.dp))
                        .blur(
                            radiusX = 10.dp,
                            radiusY = 10.dp,
                            edgeTreatment = BlurredEdgeTreatment(RoundedCornerShape(8.dp))
                        ),
                )


                Icon(
                    imageVector = Icons.Default.PlayArrow,
                    contentDescription = stringResource(R.string.play),
                    tint = Color.White,
                )

            }
        }
    }
}