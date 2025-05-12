package org.example.lesson_15

fun main() {
    val temperature = Temperature(
        data = "12.05.2025",
        daytimeTemperature = 13,
        nightTemperature = 4
    )

    val precipitation = PrecipitationAmount(
        data = "12.05.2025",
        precipitation = true,
        precipitationAmount = 3
    )
    val dataForDay: MutableList<WeatherStationStats> = mutableListOf()
}

abstract class WeatherStationStats() {
    abstract val data: String
    abstract fun measurement()
}

class Temperature(
    override val data: String,
    val daytimeTemperature: Int,
    val nightTemperature: Int,
) : WeatherStationStats() {
    override fun measurement() {}
}

class PrecipitationAmount(
    override val data: String,
    val precipitation: Boolean,
    val precipitationAmount: Int,
) : WeatherStationStats() {
    override fun measurement() {}
}

class WeatherServer(weatherStationStats: MutableList<WeatherStationStats>) {
    fun sendMessage() {
    }
}

interface weatherConditions {
    fun presenceOfPrecipitation()
    fun measuringAmountOfPrecipitation()
    fun dayTemperature()
    fun temperatureAtNight()
}