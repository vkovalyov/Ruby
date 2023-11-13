package com.wonderers.codex.android.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.wonderers.codex.android.MockPlace

@Composable
fun PlaceTitle(place: MockPlace) {
    Column(
        modifier = Modifier.padding(8.dp),
    ) {
        PlaceMeta(place)
        PlaceName(place)
    }
}