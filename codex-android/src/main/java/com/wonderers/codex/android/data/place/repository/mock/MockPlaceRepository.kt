package com.wonderers.codex.android.data.place.repository.mock

import com.wonderers.codex.android.data.place.model.Place
import com.wonderers.codex.android.common.model.PlaceId
import com.wonderers.codex.android.common.model.RegionId
import com.wonderers.codex.android.data.place.repository.PlaceRepository

class MockPlaceRepository : PlaceRepository {

    override suspend fun getPlacesByRegion(regionId: RegionId): List<Place> {
        return mockPlaces
    }

    override suspend fun getPlaceByIdFromCache(placeId: PlaceId): Place? {
        return mockPlaces.firstOrNull { it.id == placeId }
    }
}
