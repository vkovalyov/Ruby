package com.wonderers.codex.android.ui.place.common

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.wonderers.codex.android.MockPlace

@Composable
fun PlaceMeta(place: MockPlace) {
    Row {
        Text(
            text = place.type.name,
            color = MaterialTheme.colorScheme.primary
        )
        Text(text = " • ")
        Text(
            text = "${place.distance}m",
            color = MaterialTheme.colorScheme.primary
        )
    }
}