package com.wonderers.codex.android.ui.place.common

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.wonderers.codex.android.common.model.CodexImage

@Composable
fun PlaceImage(image: CodexImage) {
    Image(
        modifier = Modifier
            .fillMaxWidth()
            .aspectRatio(16f / 10f),
        painter = codexImagePainterResource(image),
        contentScale = ContentScale.Crop,
        contentDescription = null
    )
}