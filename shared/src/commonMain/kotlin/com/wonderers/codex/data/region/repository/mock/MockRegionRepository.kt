package com.wonderers.codex.data.region.repository.mock

import com.wonderers.codex.common.model.Coordinates
import com.wonderers.codex.common.model.RegionId
import com.wonderers.codex.data.region.model.Region
import com.wonderers.codex.data.region.repository.RegionRepository

class MockRegionRepository : RegionRepository {

    private val mockRegion = Region(
        id = RegionId("1"),
        name = "Montenegro, Podgorica"
    )

    override suspend fun getRegionFromCache(): Region? {
        return mockRegion
    }

    override suspend fun getRegionByCoordinates(coordinates: Coordinates): Region? {
        return mockRegion
    }

    override suspend fun getRegions(): List<Region> {
        return listOf(mockRegion)
    }
}
