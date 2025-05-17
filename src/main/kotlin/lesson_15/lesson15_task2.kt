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

    val weatherServer = WeatherServer()

    weatherServer.sendMessage(temperature)
    weatherServer.sendMessage(precipitation)
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
    override fun measurement() {
        println("Дневная температура: $daytimeTemperature")
        println("Ночная температура: $nightTemperature")
    }
}

class PrecipitationAmount(
    override val data: String,
    val precipitation: Boolean,
    val precipitationAmount: Int,
) : WeatherStationStats() {
    override fun measurement() {
        println("Наличие осаднов: $precipitation")
        println("Количество осадков: ${precipitationAmount}мм")
    }
}

class WeatherServer() {
    fun sendMessage(weatherData: WeatherStationStats) {
        weatherData.measurement()
    }
}