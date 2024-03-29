package com.wonderers.codex.android.ui.place.map

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource

@Composable
fun PlacesMap() {
    // TODO implement map
    MapStub()
}

@Composable
private fun MapStub() {
    Image(
        painter = painterResource(id = com.wonderers.codex.R.drawable.map_stub),
        contentDescription = null
    )
}
