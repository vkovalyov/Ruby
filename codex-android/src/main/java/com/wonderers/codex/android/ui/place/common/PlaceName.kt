package com.wonderers.codex.android.ui.place.common

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.wonderers.codex.android.MockPlace

@Composable
fun PlaceName(place: MockPlace) {
    Text(
        text = place.title,
        style = MaterialTheme.typography.headlineMedium
    )
}