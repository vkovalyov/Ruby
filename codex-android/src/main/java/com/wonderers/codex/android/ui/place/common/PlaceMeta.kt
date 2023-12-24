package com.wonderers.codex.android.ui.place.common

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun PlaceMeta(typeName: String, placeDistance: String) {
    Row {
        Text(
            text = typeName,
            color = MaterialTheme.colorScheme.primary
        )
        Text(text = " • ")
        Text(
            text = placeDistance,
            color = MaterialTheme.colorScheme.primary
        )
    }
}