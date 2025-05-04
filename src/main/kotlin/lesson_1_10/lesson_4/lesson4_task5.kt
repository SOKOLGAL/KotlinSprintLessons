package org.example.lesson1_10.lesson_4

fun main() {

    println("Есть ли повреждения корпуса (true/falce)?")
    var presenceOfDamage = readln().toBoolean()
    println("Сколько человек в экипаже на борту?")
    var currentCrewComposition = readln().toInt()
    println("Сколько ящиков с провизией на борту?")
    var numOfBoxesWithProvisions = readln().toInt()
    println("Погода благоприятная (true/falce)?")
    var weatherConditions = readln().toBoolean()

    val presenceOfDamage1: Boolean = presenceOfDamage == PRESENCE_OF_DAMAGE
    val presenceOfDamage2: Boolean = presenceOfDamage !== PRESENCE_OF_DAMAGE
    val currentCrewComposition1 = currentCrewComposition >= CURRENT_CREW_COMPOSITION
    val numOfBoxesWithProvisions1 = numOfBoxesWithProvisions >= NUM_OF_BOXES_WITH_PROVISIONS
    val wether: Boolean = weatherConditions == WEATHER_CONDITIONS
    val wether1: Boolean = weatherConditions !== WEATHER_CONDITIONS


    val resultAnalysisConditions = (presenceOfDamage1 || presenceOfDamage2) &&
            (currentCrewComposition1) && (numOfBoxesWithProvisions1) && (wether || wether1)

    println("Корабль может отправиться в долгосрочное плавание: $resultAnalysisConditions")

}

const val PRESENCE_OF_DAMAGE = true
const val CURRENT_CREW_COMPOSITION = 55
const val NUM_OF_BOXES_WITH_PROVISIONS = 50
const val WEATHER_CONDITIONS = true

