package com.wonderers.codex.android

import androidx.annotation.DrawableRes

data class MockPlace(
    val title: String,
    val distance: Int,
    val type: PlaceType,
    @DrawableRes
    val previewImageRes: Int,
    val description: String,
    val references: List<PlaceReference>
)

sealed class PlaceType(
    val name: String
) {
    data object Park : PlaceType("Park")

    data object Bridge : PlaceType("Bridge")

    data object Tower : PlaceType("Tower")

    data object Ruins : PlaceType("Ruins")
}

data class PlaceReference(
    val name: String,
    val url: String
)

val mockPlaces = listOf(
    MockPlace(
        title = "Clock tower",
        distance = 1000,
        type = PlaceType.Tower,
        previewImageRes = R.drawable.podgorica_clock_tower,
        description = """
            The Clock Tower of Podgorica, Montenegro, is located at Bećir Beg Osmanagić square, in 
            the Stara Varoš 
             neighborhood (the old town). It is one of the very few Ottoman landmarks that survived 
             the bombing of Podgorica in World War II.
             
             Sahat Kula was built in 1667, by Hadži-paša Osmanagić, a prominent citizen of 
             Podgorica. It is a freestanding 19 m (62 ft) tall stone clock tower.

             Its current turret clock mechanism was made in 1890 by Pietro Colbachini foundry in 
             Bassano del Grappa, Italy, after Podgorica was incorporated into Montenegro 
             (original mechanism was made in Austria). Around the same time, a metal cross was 
             installed at the top of the tower, symbolizing transfer of the city from the Ottomans 
             into the hands of Christian Montenegrins. The cross was made by Stevan Radović, Lazar 
             Radović's grandfather.

             Today, Sahat Kula is an important cultural monument of Montenegro, protected by law. 
             The clock was renovated in January 2012, when a new electric mechanism was installed,
              as the old one was kept for historic significance.
        """.trimIndent(),
        references = listOf(
            PlaceReference(
                name = "Wikipedia",
                url = "https://en.wikipedia.org/wiki/Clock_Tower_(Podgorica)"
            ),
            PlaceReference(
                name = "Trip Advisor",
                url = "https://www.tripadvisor.com/Attraction_Review-g304088-d7266121-Reviews-Clock_Tower-Podgorica_Podgorica_Municipality.html"
            )
        )
    ),
    MockPlace(
        title = "Moscow bridge",
        distance = 200,
        type = PlaceType.Bridge,
        previewImageRes = R.drawable.podgorica_moscow_bridge,
        description = "",
        references = emptyList()
    ),
    MockPlace(
        title = "Petrovich park",
        distance = 100,
        type = PlaceType.Park,
        previewImageRes = R.drawable.podgorica_park_petrovic,
        description = "",
        references = emptyList()
    ),
    MockPlace(
        title = "Ribnica bridge",
        distance = 300,
        type = PlaceType.Bridge,
        previewImageRes = R.drawable.podgorica_ribnica_bridge,
        description = "",
        references = emptyList()
    ),
    MockPlace(
        title = "Duclya",
        distance = 500,
        type = PlaceType.Ruins,
        previewImageRes = R.drawable.podorica_duclya,
        description = "",
        references = emptyList()
    )
)
