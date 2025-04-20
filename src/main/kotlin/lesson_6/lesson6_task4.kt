package org.example.lesson_6

fun main() {

    val winNum = (1..9).random()
    println("Отгадайте число от 1 до 9:")
    var numberOfAttempts = 5

    do {
        val num = readln().toInt()
        println("Неверно. Осталось еще ${--numberOfAttempts} попытки")

    } while (num !== winNum && numberOfAttempts > 0)

    println("Это была великолепная игра!")
    println("Было загадано число: $winNum")

}