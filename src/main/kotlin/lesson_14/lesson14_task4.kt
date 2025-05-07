package org.example.lesson_14

fun main() {
    val planets1 = Planets(
        "Плутон",
        atmosphere = false,
        suitableForLanding = true,
        satellite = true,
    )
    val satellite1 = Satellites(
        nameSatellites = "Харон",
        atmosphere = false,
        suitableForLanding = false,
    )
    val satellite2 = Satellites(
        nameSatellites = "Кербер",
        atmosphere = false,
        suitableForLanding = true,
    )
    val satelliteList = mutableListOf(satellite1, satellite2)

    val listOfAllSatellites = satelliteList.map {
        it.nameSatellites
    }
    println(
        "Название планеты: ${planets1.namePlanets},\n" +
                "названия её спутников: ${listOfAllSatellites.joinToString()}"
    )

}

open class CelestialBodies(
    val atmosphere: Boolean,
    val suitableForLanding: Boolean,
) {
}

class Planets(
    val namePlanets: String,
    atmosphere: Boolean,
    suitableForLanding: Boolean,
    val satellite: Boolean,
) : CelestialBodies(atmosphere, suitableForLanding) {
}

class Satellites(
    val nameSatellites: String,
    atmosphere: Boolean,
    suitableForLanding: Boolean,
) : CelestialBodies(atmosphere, suitableForLanding) {
}