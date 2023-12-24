package com.wonderers.codex.android.data.region.repository

import com.wonderers.codex.android.common.model.Coordinates
import com.wonderers.codex.android.data.region.model.Region

interface RegionRepository {

    suspend fun getRegionFromCache(): Region?

    suspend fun getRegionByCoordinates(coordinates: Coordinates): Region?

    suspend fun getRegions(): List<Region>
}
