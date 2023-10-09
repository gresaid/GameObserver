package com.gresaid.gameobserver.presentation.screens.gameInfoScreen.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.gresaid.gameobserver.R
import com.gresaid.gameobserver.presentation.model.ReviewData

@Composable
fun ReviewDataGridItem(data: ReviewData) {
    Column(
        modifier = Modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.Start,
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start,
        ) {
            Image(
                painter = painterResource(
                    id = when (data.id) {
                        1L -> R.drawable.indus
                        2L -> R.drawable.not_indus
                        else -> R.drawable.blank_avatar
                    }
                ),
                contentDescription = stringResource(R.string.userpic),
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(36.dp)
                    .clip(CircleShape),
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column(
                modifier = Modifier,
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.Start,
            ) {
                Text(
                    text = data.userName,
                    style = MaterialTheme.typography.h3,
                    color = MaterialTheme.colors.primary
                )
                Spacer(modifier = Modifier.height(7.dp))
                Text(
                    text = data.Date,
                    style = MaterialTheme.typography.body2,
                    color = MaterialTheme.colors.primary
                ) // Change in feature
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = data.userComment,
            style = MaterialTheme.typography.body2,
            color = MaterialTheme.colors.onSecondary,
            maxLines = 5,
        )
    }

}