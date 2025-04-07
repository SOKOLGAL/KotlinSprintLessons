package org.example.lesson_3

import kotlin.time.times

fun main() {

    val number = readln().toInt()

    for (i in 1..10) {
        val result = number * i
        println("$number * $i = $result")
    }

}