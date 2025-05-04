package org.example.lesson_12

fun main() {
    val weather1: SaveWeatherToday = SaveWeatherToday(299, 286, true)

}

class SaveWeatherToday(
    val daytimeTemperature: Int,
    val nightTemperature: Int,
    val precipitationDuringDay: Boolean,

    ) {

    init {
        println(
            "Дневная температура ${daytimeTemperature - CONVERSION_TO_CELSIUS}, " +
                    "ночная температура ${nightTemperature - CONVERSION_TO_CELSIUS}, " +
                    "осадки $precipitationDuringDay")
    }
}
const val CONVERSION_TO_CELSIUS = 273