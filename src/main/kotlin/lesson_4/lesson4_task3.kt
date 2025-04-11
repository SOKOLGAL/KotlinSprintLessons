package org.example.lesson_4

fun main() {

    val weatherIsSunnyToday = true
    val isAwningOpenToday = true
    val airHumidityToday: Int = 20
    val currentSeasonToday: String = "winter"

    val resultAnalysisConditions = (weatherIsSunnyToday == WEATHER_IS_SUNNY) &&
            (isAwningOpenToday == IS_AWNING_OPEN) &&
            (airHumidityToday == AIR_HUMIDITY) &&
            (currentSeasonToday !== CURRENT_SEASON)

    println("Благоприятные ли условия сейчас для роста бобовых? $resultAnalysisConditions")

}
    const val WEATHER_IS_SUNNY = true
    const val IS_AWNING_OPEN = true
    const val AIR_HUMIDITY = 20
    const val CURRENT_SEASON = "winter"