package org.example.lesson_5

fun main() {
    val example1 = (1..10).random()
    val example2 = (1..10).random()
    val summary = example1 + example2
    val rightSolution = summary
    println("Подтвердите, что вы не бот. Решите уравнение: $example1 + $example2 = ? Введите ваш ответ: ")
    val solution = readln().toInt()
    if (solution == rightSolution) {
        println("Добро пожаловать!")
    } else if (solution !== rightSolution) {
        println("Доступ запрещен.")
    }
}