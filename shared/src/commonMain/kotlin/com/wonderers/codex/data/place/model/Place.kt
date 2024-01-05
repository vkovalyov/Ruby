package com.wonderers.codex.data.place.model

import com.wonderers.codex.common.model.CodexImage
import com.wonderers.codex.common.model.PlaceId

data class Place(
    val id: PlaceId,
    val title: String,
    val type: PlaceType,
    val previewImage: CodexImage,
    val description: String,
    val references: List<PlaceReference>
)

data class PlaceReference(
    val name: String,
    val url: String
)

sealed class PlaceType(
    val name: String
) {
    data object Park : PlaceType("Park")

    data object Bridge : PlaceType("Bridge")

    data object Tower : PlaceType("Tower")

    data object Ruins : PlaceType("Ruins")
}
