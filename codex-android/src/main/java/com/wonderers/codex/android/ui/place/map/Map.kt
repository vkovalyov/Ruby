package com.wonderers.codex.android.ui.place.map

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.wonderers.codex.android.R

@Composable
fun PlacesMap() {
    // TODO implement map
    MapStub()
}

@Composable
private fun MapStub() {
    Image(
        painter = painterResource(id = R.drawable.map_stub),
        contentDescription = null
    )
}
