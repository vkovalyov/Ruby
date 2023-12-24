package com.wonderers.codex.android.common.model

import androidx.annotation.DrawableRes

sealed interface CodexImage {

    class Drawable(
        @DrawableRes
        val drawableRes: Int
    ) : CodexImage

    class Url(
        val url: String
    ) : CodexImage
}
