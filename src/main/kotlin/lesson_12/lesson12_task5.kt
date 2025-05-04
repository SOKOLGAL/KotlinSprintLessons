package org.example.lesson_12

import kotlin.random.Random

fun main() {

    val weather = WeatherDataProcessing(
        daytimeTemperature = (15..35).random(),
        nightTemperature = (5..20).random(),
        precipitationDuringDay = Random.nextBoolean()
    )
    val monthWeather = mutableListOf(weather)
    for (i in 2..NUMBER_OF_DAYS) {
        monthWeather.add(weather)
    }
    val weatherDay = monthWeather.map {
        it.daytimeTemperature
    }
    val averageValuesDayWeather = weatherDay.average()

    val weatherNight = monthWeather.map {
        it.nightTemperature
    }
    val averageValuesNightWeather = weatherNight.average()

    val precipitation = monthWeather.map {
        it.precipitationDuringDay
    }
    val numberOfDaysWithPrecipitation = precipitation.size

    println(
        "Средние температуры за месяц: дневные $averageValuesDayWeather, " +
                "ночные $averageValuesNightWeather, $numberOfDaysWithPrecipitation дней с осадками"
    )

}

const val NUMBER_OF_DAYS = 30

class WeatherDataProcessing(
    val daytimeTemperature: Int,
    val nightTemperature: Int,
    val precipitationDuringDay: Boolean,
) {
}