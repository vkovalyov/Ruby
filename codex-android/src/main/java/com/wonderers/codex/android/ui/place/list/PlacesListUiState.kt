package com.wonderers.codex.android.ui.place.list

import com.wonderers.codex.common.model.CodexImage
import com.wonderers.codex.common.model.PlaceId

sealed interface PlacesListUiState {

    data object Loading : PlacesListUiState

    data class Error(
        val errorText: String,
        val isRecovering: Boolean
    ) : PlacesListUiState

    data class Loaded(
        val places: List<PlaceItemUiModel>
    ) : PlacesListUiState
}

data class PlaceItemUiModel(
    val id: PlaceId,
    val title: String,
    val typeName: String,
    val distance: String,
    val previewImage: CodexImage
)
