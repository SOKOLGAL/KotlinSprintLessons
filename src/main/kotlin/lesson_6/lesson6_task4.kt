package org.example.lesson_6

fun main() {

    val winNum = (1..9).random()
    println("Отгадайте число от 1 до 9:")
    var numberOfAttempts = 5

    do {
        val num = readln().toInt()
        if (num == winNum) {
            println("Это была великолепная игра!")
            break
        } else println("Неверно. Осталось еще ${--numberOfAttempts} попытки")

    } while (numberOfAttempts > 0)

    println("Было загадано число: $winNum")

}