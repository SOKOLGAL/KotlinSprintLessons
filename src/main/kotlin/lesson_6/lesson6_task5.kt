package org.example.lesson_6

import java.lang.Integer.sum

fun main() {

    var numberOfAttempts = 3

    do {
        val example1 = (1..9).random()
        val example2 = (1..9).random()
        val summary = sum(example1, example2)

        println("Подтвердите, что вы не бот. Решите уравнение: $example1 + $example2 = ? Введите ваш ответ:")

        val solution = readln().toInt()
        solution == summary
        println("Добро пожаловать!")
        solution !== summary
        println("Неверно! Попробуйте еще ${(numberOfAttempts--) - 1} раза")

        println("Доступ запрещен.")
    } while (numberOfAttempts > 0)

}