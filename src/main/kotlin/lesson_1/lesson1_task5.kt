package org.example.lesson_1

fun main() {
        val secondsInSpace: Int = 6480
        val hour = secondsInSpace/3600
        val secondsRemaining = secondsInSpace%3600
        val minute = secondsRemaining/60
        val second = secondsRemaining%60
        val hour1 = "%02d".format(hour)
        val minute1 = "%02d".format(minute)
        val second1 = "%02d".format(second)
        println("$hour1:$minute1:$second1")
}