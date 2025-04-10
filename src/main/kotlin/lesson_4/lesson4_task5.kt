package org.example.lesson_4

fun main() {

    println("Есть ли повреждения корпуса (true/falce)?")
    var presenceOfDamage = readln().toBoolean()
    println("Сколько человек в экипаже на борту?")
    var currentCrewComposition = readln().toInt()
    println("Сколько ящиков с провизией на борту?")
    var numOfBoxesWithProvisions = readln().toInt()
    println("Погода благоприятная (true/falce)?")
    var weatherConditions = readln().toBoolean()

    val presenceOfDamage1: Boolean = getPresenceOfDamage().toBoolean() == PRESENCE_OF_DAMAGE
    val presenceOfDamage2: Boolean = getPresenceOfDamage().toBoolean() !== PRESENCE_OF_DAMAGE
    val currentCrewComposition1 = (getCurrentCrewComposition() >= CURRENT_CREW_COMPOSITION)
    val numOfBoxesWithProvisions1 = getNumOfBoxesWithProvisions() >= NUM_OF_BOXES_WITH_PROVISIONS
    val wether: Boolean = getWeatherConditions().toBoolean() == WEATHER_CONDITIONS
    val wether1: Boolean = getWeatherConditions().toBoolean() !== WEATHER_CONDITIONS


    val resultAnalysisConditions = (presenceOfDamage1 || presenceOfDamage2) &&
            (currentCrewComposition1) && (numOfBoxesWithProvisions1) && (wether || wether1)

    println("Корабль может отправиться в долгосрочное плавание: $resultAnalysisConditions")

}

const val PRESENCE_OF_DAMAGE = true
const val CURRENT_CREW_COMPOSITION = 55
const val NUM_OF_BOXES_WITH_PROVISIONS = 50
const val WEATHER_CONDITIONS = true

fun getPresenceOfDamage() = readLine()
fun getCurrentCrewComposition() = readLine()
fun getNumOfBoxesWithProvisions() = readLine()
fun getWeatherConditions() = readLine()