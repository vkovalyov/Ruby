package com.wonderers.codex.android.ui.place.common

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import com.wonderers.codex.android.common.model.CodexImage

@Composable
fun codexImagePainterResource(image: CodexImage): Painter {
    return when(image) {
        is CodexImage.Drawable -> painterResource(id = image.drawableRes)
        is CodexImage.Url -> {
            error("CodexImage.Url is not supported yet in codexImagePainterResource")
        }
    }
}
