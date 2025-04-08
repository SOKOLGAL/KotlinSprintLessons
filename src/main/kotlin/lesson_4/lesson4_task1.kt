package org.example.lesson_4

fun main() {

    val tablesReservationToday = 13
    val tablesReservationTomorrow = 9

    val freeTablesToday = TOTAL_TABLES - tablesReservationToday
    val freeTablesTomorrow = TOTAL_TABLES - tablesReservationTomorrow

    val comparisonTablesToday = freeTablesToday == 0
    val comparisonTablesTomorrow = freeTablesTomorrow == 0
    val arrayOfDay: Array<String> = arrayOf("сегодня", "завтра")

    for (i in arrayOfDay) {
        println("[Доступность столиков на $i: $comparisonTablesToday/$comparisonTablesTomorrow]")
    }

}

    const val TOTAL_TABLES = 13
