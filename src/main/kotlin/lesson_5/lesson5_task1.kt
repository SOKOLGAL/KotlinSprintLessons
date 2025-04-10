package org.example.lesson_5

import java.lang.Integer.sum

fun main() {
    val example1 = (1..10).random()
    val example2 = (1..10).random()

    val summary = sum(example1, example2)

    println("Подтвердите, что вы не бот. Решите уравнение: $example1 + $example2 = ? Введите ваш ответ:")

    val solution = readln().toInt()

    if (solution == summary) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }

}