package com.gresaid.gameobserver.presentation.screens.gameInfoScreen.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun RoundedButtonInstall(
    modifier: Modifier = Modifier,
    buttonName: String? = null,
) {
    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .background(
                color = MaterialTheme.colors.secondaryVariant,
                shape = RoundedCornerShape(12.dp)
            )
            .fillMaxWidth(),
    ) {
        if (buttonName != null) {
            Text(
                modifier = Modifier.padding(vertical = 20.dp),
                text = buttonName,
                style = MaterialTheme.typography.h2,
                color = MaterialTheme.colors.background,

                )
        }
    }
}