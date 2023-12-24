package com.wonderers.codex.android.ui.place.details

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.wonderers.codex.android.MockPlace
import com.wonderers.codex.android.MyApplicationTheme
import com.wonderers.codex.android.mockPlaces
import com.wonderers.codex.android.ui.place.common.PlaceImage
import com.wonderers.codex.android.ui.place.common.PlaceTitle

@Preview(showBackground = true, backgroundColor = 0xffffff)
@Composable
private fun PlaceDetailsPreview() {
    MyApplicationTheme {
        PlaceDetails(
            place = mockPlaces.first()
        )
    }
}

@Composable
fun PlaceDetails(place: MockPlace) {
    Column(
        modifier = Modifier.verticalScroll(rememberScrollState())
    ) {
        PlaceImage(imageRes = place.previewImageRes)
        PlaceTitle(place = place)
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            modifier = Modifier.padding(8.dp),
            text = place.description
        )

    }
}