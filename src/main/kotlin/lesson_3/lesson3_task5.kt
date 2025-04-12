package org.example.lesson_3

fun main() {

    val lineFromPlayer = "D2-D4;0"
    val line = lineFromPlayer.split('-', ';')
    val from = line[0]
    val where = line[1]
    val moveNumber = line[2]

    println(from)
    println(where)
    println(moveNumber)

}