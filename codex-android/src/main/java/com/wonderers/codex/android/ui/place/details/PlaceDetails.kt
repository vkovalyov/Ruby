package com.wonderers.codex.android.ui.place.details

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.wonderers.codex.android.MyApplicationTheme
import com.wonderers.codex.android.ui.place.common.PlaceImage
import com.wonderers.codex.android.ui.place.common.PlaceTitle

@Preview(showBackground = true, backgroundColor = 0xffffff)
@Composable
private fun PlaceDetailsPreview() {
    MyApplicationTheme {
        PlaceDetails()
    }
}

@Composable
fun PlaceDetails() {
    val vm = viewModel<PlaceDetailsVm>()
    val uiState by vm.uiState.collectAsStateWithLifecycle()
    PlaceDetails(uiState)
}

@Composable
private fun PlaceDetails(
    uiState: PlaceDetailsUiState
) {
    when (uiState) {
        is PlaceDetailsUiState.Loaded -> {
            Column(
                modifier = Modifier.verticalScroll(rememberScrollState())
            ) {
                PlaceImage(image = uiState.placeDetails.previewImage)
                PlaceTitle(
                    placeName = uiState.placeDetails.title,
                    typeName = uiState.placeDetails.typeName,
                    distance = uiState.placeDetails.distance
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    modifier = Modifier.padding(8.dp),
                    text = uiState.placeDetails.description
                )
            }
        }
        else -> {
            // TODO support other ui states
        }
    }
}
