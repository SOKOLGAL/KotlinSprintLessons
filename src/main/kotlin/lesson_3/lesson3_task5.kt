package org.example.lesson_3

import java.util.regex.Pattern

fun main() {

    val lineFromPlayer = "D2-D4;0"
    val line = lineFromPlayer.split('-', ';')
    val from = line.get(0)
    val where = line.get(1)
    val moveNumber = line.get(2)

    println(from)
    println(where)
    println(moveNumber)

}