package org.example.lesson_4

fun main() {

    val weather = "солнечная".toBoolean()
    val awning = "открыт".toBoolean()
    val airHumidity = 20
    val currentSeason = "не зима"

    val weatherToday: Boolean = "солнечная".toBoolean()
    val awningAtTheMoment: Boolean = "открыт".toBoolean()
    val airHumidityToday: Int = 20
    val currentSeasonToday: String = "зима"

    val resultAnalysisConditions = (weatherToday == weather) && (awningAtTheMoment == awning) && (airHumidityToday == airHumidity) && (currentSeasonToday == currentSeason)
    println("Благоприятные ли условия сейчас для роста бобовых? $resultAnalysisConditions")
}