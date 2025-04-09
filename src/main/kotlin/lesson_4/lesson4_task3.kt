package org.example.lesson_4

fun main() {

    val isSunnyToday = "yes"
    val isAwningOpenToday = "yes"
    val airHumidityToday: Int = 20
    val currentSeasonToday: String = "winter"

    val resultAnalysisConditions = (isSunnyToday == IS_SUNNY) && (isAwningOpenToday == IS_AWNING_OPEN)
            && (airHumidityToday == AIR_HUMIDITY) && (currentSeasonToday !== CURRENT_SEASON)

    println("Благоприятные ли условия сейчас для роста бобовых? $resultAnalysisConditions")

}
    const val IS_SUNNY = "yes"
    const val IS_AWNING_OPEN = "yes"
    const val AIR_HUMIDITY = 20
    const val CURRENT_SEASON = "winter"