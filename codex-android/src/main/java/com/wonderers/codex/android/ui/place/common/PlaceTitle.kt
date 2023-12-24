package com.wonderers.codex.android.ui.place.common

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun PlaceTitle(
    placeName: String,
    typeName: String,
    distance: String
) {
    Column(
        modifier = Modifier.padding(8.dp),
    ) {
        PlaceMeta(typeName, distance)
        PlaceName(placeName)
    }
}