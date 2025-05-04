package org.example.lesson1_10.lesson_8

fun main() {

    val numberOfViewsMonday = 500
    val numberOfViewsTuesday = 1500
    val numberOfViewsWednesday = 890
    val numberOfViewsThursday = 900
    val numberOfViewsFriday = 1150
    val numberOfViewsSaturday = 1200
    val numberOfViewsSunday = 1350
    val arrayOfNumberOfViews = intArrayOf(
        numberOfViewsMonday,
        numberOfViewsTuesday,
        numberOfViewsWednesday,
        numberOfViewsThursday,
        numberOfViewsFriday,
        numberOfViewsSaturday,
        numberOfViewsSunday
    )

    println("За неделю было ${arrayOfNumberOfViews.sum()} просмотров.")

}