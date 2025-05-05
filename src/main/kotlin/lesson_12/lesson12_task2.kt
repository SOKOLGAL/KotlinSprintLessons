package org.example.lesson_12

fun main() {

    val weather1 = SaveWeatherByDays(17, 8, true)
    weather1.weatherTodayTomorrow()

}

class SaveWeatherByDays(
    var daytimeTemperature: Int,
    var nightTemperature: Int,
    var precipitationDuringDay: Boolean,
) {
    fun weatherTodayTomorrow() {
        println("Дневная температура $daytimeTemperature, ночная температура $nightTemperature, осадки $precipitationDuringDay")
    }

}