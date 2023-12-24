package com.wonderers.codex.android.ui.place.common

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource

@Composable
fun PlaceImage(@DrawableRes imageRes: Int) {
    Image(
        modifier = Modifier
            .fillMaxWidth()
            .aspectRatio(16f / 10f),
        painter = painterResource(id = imageRes),
        contentScale = ContentScale.Crop,
        contentDescription = null
    )
}