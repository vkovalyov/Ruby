package com.wonderers.codex.android

import androidx.annotation.DrawableRes

data class MockPlace(
    val title: String,
    val distance: Int,
    val type: PlaceType,
    @DrawableRes
    val previewImageRes: Int
)

sealed class PlaceType(
    val name: String
) {
    data object Park : PlaceType("Park")

    data object Bridge : PlaceType("Bridge")

    data object Tower : PlaceType("Tower")

    data object Ruins : PlaceType("Ruins")
}

val mockPlaces = listOf(
    MockPlace(
        title = "Clock tower",
        distance = 1000,
        type = PlaceType.Tower,
        previewImageRes = R.drawable.podgorica_clock_tower
    ),
    MockPlace(
        title = "Moscow bridge",
        distance = 200,
        type = PlaceType.Bridge,
        previewImageRes = R.drawable.podgorica_moscow_bridge
    ),
    MockPlace(
        title = "Petrovich park",
        distance = 100,
        type = PlaceType.Park,
        previewImageRes = R.drawable.podgorica_park_petrovic
    ),
    MockPlace(
        title = "Ribnica bridge",
        distance = 300,
        type = PlaceType.Bridge,
        previewImageRes = R.drawable.podgorica_ribnica_bridge
    ),
    MockPlace(
        title = "Duclya",
        distance = 500,
        type = PlaceType.Ruins,
        previewImageRes = R.drawable.podorica_duclya
    )
)
