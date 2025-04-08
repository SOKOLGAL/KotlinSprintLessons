package org.example.lesson_5

fun main() {
    val example = 2 + 5
    val rightSolution = 7
    println("Подтвердите, что вы не бот. Решите уравнение: 2 + 5 = ? Введите ваш ответ: ")
    val solution = readln().toInt()
    if (solution == rightSolution) {
        println("Добро пожаловать!")
    } else if (solution !== rightSolution) {
        println("Доступ запрещен.")
    }
}