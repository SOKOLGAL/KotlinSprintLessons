package org.example.lesson_2

fun main() {

    val departureHours = 9
    val departureMinutes = 39
    val travelTimeMinutes = 457
    val MINUTES_IN_HOUR = 60

    val travelTimeHours = travelTimeMinutes / MINUTES_IN_HOUR
    val travelMinutes = travelTimeMinutes % MINUTES_IN_HOUR
    val arrivalTime = departureHours + travelTimeHours
    val arrivalMinutes = departureMinutes + travelMinutes
    val hour = arrivalMinutes / MINUTES_IN_HOUR

    println("%02d:%02d".format(arrivalTime + hour, arrivalMinutes - MINUTES_IN_HOUR))

}