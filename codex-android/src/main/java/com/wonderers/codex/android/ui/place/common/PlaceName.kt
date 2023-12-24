package com.wonderers.codex.android.ui.place.common

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun PlaceName(placeName: String) {
    Text(
        text = placeName,
        style = MaterialTheme.typography.headlineMedium
    )
}