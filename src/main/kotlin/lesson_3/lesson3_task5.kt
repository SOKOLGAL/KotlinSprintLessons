package org.example.lesson_3

fun main() {

    val lineFromPlayer = "D2-D4;0"
    val fromLetter = lineFromPlayer.get(0)
    val fromNum = lineFromPlayer.get(1)
    val whereLetter = lineFromPlayer.get(3)
    val whereNum = lineFromPlayer.get(4)
    val moveNumber = lineFromPlayer.get(6)

    println("$fromLetter$fromNum")
    println("$whereLetter$whereNum")
    println(moveNumber)

}