package com.gresaid.gameobserver.presentation.screens.gameInfoScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.gresaid.gameobserver.R
import com.gresaid.gameobserver.presentation.model.ReviewData
import com.gresaid.gameobserver.presentation.screens.gameInfoScreen.components.CategoryButton
import com.gresaid.gameobserver.presentation.screens.gameInfoScreen.components.GameLogo
import com.gresaid.gameobserver.presentation.screens.gameInfoScreen.components.PostSection
import com.gresaid.gameobserver.presentation.screens.gameInfoScreen.components.ReviewDataGridItem
import com.gresaid.gameobserver.presentation.screens.gameInfoScreen.components.RoundedButtonInstall
import com.gresaid.gameobserver.presentation.utils.RatingStars
import com.gresaid.gameobserver.presentation.utils.getJsonDataFromAsset

@Composable
fun GameInfoScreen() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Color(0xFF050B18)
            ),
    ) {
        item {
            HeaderBackground(picture = R.drawable.dota_background)
        }
        item {
            GameSection()
        }
        item {
            Spacer(modifier = Modifier.height(height = 20.dp))
        }
        item {
            ReviewAndRating()
        }
        item {
            RoundedButtonInstall(
                modifier = Modifier.padding(vertical = 40.dp, horizontal = 24.dp),
                buttonName = stringResource(R.string.install)
            )
        }
    }
}


@Composable
fun HeaderBackground(
    picture: Int,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier,
    ) {
        Image(
            painter = painterResource(id = picture),
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
                    drawRect(brush = gradient, blendMode = BlendMode.Multiply, alpha = 0.92f)
                }

        )
    }
}

@Composable
fun GameSection() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        GameLogo(
            gameLogo = R.drawable.dota_logo,
            modifier = Modifier
                .offset(y = (-17).dp),
        )
        Spacer(modifier = Modifier.width(12.dp))
        GameInfo(gameName = "Dota 2", ratingsCount = 70, starCount = 5)
    }
    CategorySection(
        modifier = Modifier
            .padding(horizontal = 20.dp),
    )
    Spacer(modifier = Modifier.height(30.dp))
    GameDescription(text = "Dota 2 is a multiplayer online battle arena (MOBA) game which has two teams of five players compete to collectively destroy a large structure defended by the opposing team known as the \"Ancient\", whilst defending their own.")
    Spacer(modifier = Modifier.height(20.dp))
    GameMultimediaContent()
}

@Composable
fun GameInfo(
    gameName: String,
    ratingsCount: Int,
    starCount: Int,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.Start,
    ) {

        Text(
            text = gameName,
            overflow = TextOverflow.Ellipsis,
            style = MaterialTheme.typography.h2,
            color = MaterialTheme.colors.primary,
        )
        Spacer(modifier = Modifier.height(7.dp))
        Row(
            modifier = modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ) {
            RatingStars(starCount)
            Spacer(modifier = Modifier.width(10.dp))
            Text(
                text = "${ratingsCount}M",
                overflow = TextOverflow.Ellipsis,
                style = MaterialTheme.typography.body2,
                color = MaterialTheme.colors.onSecondary
            )
        }


    }
}


@Composable
fun CategorySection(
    modifier: Modifier = Modifier
) {
    val height = 22.dp
    val minWidth = 95.dp
    Row(
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        modifier = modifier
    ) {
        CategoryButton(
            text = "MOBA", modifier = Modifier
                .defaultMinSize(minWidth = minWidth)
                .height(height)
        )
        CategoryButton(
            text = "MULTIPLAYER", modifier = Modifier
                .defaultMinSize(minWidth = minWidth)
                .height(height)
        )
        CategoryButton(
            text = "STRATEGY", modifier = Modifier
                .defaultMinSize(minWidth = minWidth)
                .height(height)
        )
    }
}


@Composable
fun GameDescription(
    text: String? = null,
) {
    Box(modifier = Modifier.padding(horizontal = 20.dp)) {
        if (text != null) {
            Text(
                text = text,
                style = MaterialTheme.typography.body2,
                color = MaterialTheme.colors.onSecondary,
            )
        }
    }
}

@Composable
fun GameMultimediaContent() {
    PostSection(
        posts = listOf(
            painterResource(id = R.drawable.dota_video),
            painterResource(id = R.drawable.dota_video2),
        ), modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp)
    )
}

@Composable
fun ReviewAndRating(modifier: Modifier = Modifier) {

    Box(modifier.padding(horizontal = 20.dp)) {
        Column {
            Text(
                text = stringResource(R.string.review_ratings),
                style = MaterialTheme.typography.h3,
                color = MaterialTheme.colors.primary,
            )
            Spacer(modifier = Modifier.height(12.dp))
            AverageRatingGame(ratingGame = 4.9f, ratingsCount = 70)
            Spacer(modifier = Modifier.height(32.dp))
            UserReview()
        }

    }
}


@Composable
fun AverageRatingGame(
    modifier: Modifier = Modifier,
    ratingGame: Float? = null,
    ratingsCount: Int? = null,
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Text(
            text = ratingGame.toString(),
            style = MaterialTheme.typography.h1,
            color = MaterialTheme.colors.primary
        )
        Spacer(modifier = Modifier.width(16.dp))
        Column(
            modifier = modifier,
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.Start
        ) {

            Row(
                modifier = modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                RatingStars(starCount = 5)
            }
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = ratingsCount.toString() + "M",
                style = MaterialTheme.typography.body2,
                color = MaterialTheme.colors.onSecondary,
            )
        }
    }
}

@Composable
fun UserReview() {
    val context = LocalContext.current
    val dataFileString = getJsonDataFromAsset(context, "ReviewJson.json")
    val gson = Gson()
    val gridSampleType = object : TypeToken<List<ReviewData>>() {}.type
    val reviewData: List<ReviewData> = gson.fromJson(dataFileString, gridSampleType)
    LazyVerticalGrid(
        columns = GridCells.Fixed(1),
        modifier = Modifier
            .height(350.dp),
        verticalArrangement = Arrangement.spacedBy(24.dp),

        ) {
        items(reviewData) { data ->
            ReviewDataGridItem(data)
        }
    }
}


