package org.example.lesson_12

fun main() {

    val weather1 = SaveWeatherByDays(17, 8, true)

    weather1.weatherTodayTomorrow()

}

class SaveWeatherByDays(
    daytimeTemperature: Int,
    nightTemperature: Int,
    precipitationDuringDay: Boolean,
) {
    var daytimeTemperature = daytimeTemperature
    var nightTemperature = nightTemperature
    var precipitationDuringDay = precipitationDuringDay

    fun weatherTodayTomorrow() {
        println("Дневная температура $daytimeTemperature, ночная температура $nightTemperature, осадки $precipitationDuringDay")
    }

}