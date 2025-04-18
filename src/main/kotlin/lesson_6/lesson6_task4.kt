package org.example.lesson_6

fun main() {

    val winNum = (1..9).random()
    println("Отгадайте число от 1 до 9:")

    for (i in 5 downTo 1) {
        val num = readln().toInt()
        if (num == winNum) {
            println("Это была великолепная игра!")
            break
        } else if (num !== winNum) {
            println("Неверно. Осталось еще ${i - 1} попыток")
            continue
        }
    }
    println("Было загадано число: $winNum")

}