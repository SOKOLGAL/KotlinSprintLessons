package org.example.lesson_12

fun main() {

    val weather1 = SaveWeather()
    weather1.daytimeTemperature = 300
    weather1.nightTemperature = 275
    weather1.precipitationDuringDay = false

    weather1.weatherTodayTomorrow()

}

class SaveWeather(
) {
    var daytimeTemperature: Int = 290
    var nightTemperature: Int = 280
    var precipitationDuringDay: Boolean = false

    fun weatherTodayTomorrow() {
        println(
            "Дневная температура ${daytimeTemperature - CONVERSION_TO_CELSIUS}, " +
                    "ночная температура ${nightTemperature - CONVERSION_TO_CELSIUS}, " +
                    "осадки $precipitationDuringDay")
    }
}

const val CONVERSION_TO_CELSIUS = 273