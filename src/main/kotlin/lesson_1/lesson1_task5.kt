package org.example.lesson_1

fun main() {

    val secondsInSpace: Int = 6480

    val hour = secondsInSpace / SECOND_IN_HOUR
    val secondsRemaining = secondsInSpace % SECOND_IN_HOUR
    val minute = secondsRemaining / SECOND_IN_MINUTE
    val second = secondsRemaining % SECOND_IN_MINUTE

    println("%02d:%02d:%02d".format(hour, minute, second))

}
    const val SECOND_IN_HOUR = 3600
    const val SECOND_IN_MINUTE = 60