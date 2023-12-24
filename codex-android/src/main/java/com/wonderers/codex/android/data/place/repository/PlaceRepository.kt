package com.wonderers.codex.android.data.place.repository

import com.wonderers.codex.android.data.place.model.Place
import com.wonderers.codex.android.common.PlaceId
import com.wonderers.codex.android.common.RegionId

interface PlaceRepository {

    suspend fun getPlacesByRegion(regionId: RegionId): List<Place>

    suspend fun getPlaceByIdFromCache(placeId: PlaceId): Place?
}
