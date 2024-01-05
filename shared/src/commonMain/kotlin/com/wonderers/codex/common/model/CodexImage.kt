package com.wonderers.codex.common.model

sealed interface CodexImage {

    class Drawable(
        val drawableRes: Int
    ) : CodexImage

    class Url(
        val url: String
    ) : CodexImage
}
