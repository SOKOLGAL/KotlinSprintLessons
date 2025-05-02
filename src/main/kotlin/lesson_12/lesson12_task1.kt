package org.example.lesson_12

fun main() {

    val weather1 = StoringDailyWeather()
    weather1.daytimeTemperature = 15
    weather1.nightTemperature = 3
    weather1.precipitationDuringDay = false

    val weather2 = StoringDailyWeather()
    weather2.daytimeTemperature = 20
    weather2.nightTemperature = 12
    weather2.precipitationDuringDay = true

    weather1.weatherTodayTomorrow()
    weather2.weatherTodayTomorrow()

}

class StoringDailyWeather() {

    var daytimeTemperature = 17
    var nightTemperature = 5
    var precipitationDuringDay = false

    fun weatherTodayTomorrow() {
        println("Дневная температура $daytimeTemperature, ночная температура $nightTemperature, осадки $precipitationDuringDay")
    }

}