package org.example.lesson1_10.lesson_6

import java.lang.Integer.sum

fun main() {

    var numberOfAttempts = 3

    do {
        val example1 = (1..9).random()
        val example2 = (1..9).random()
        val summary = sum(example1, example2)

        println("Подтвердите, что вы не бот. Решите уравнение: $example1 + $example2 = ? Введите ваш ответ:")
        val solution = readln().toInt()

        if (solution == summary) {
            println("Добро пожаловать!")
            return
        } else println("Неверно! Попробуйте еще ${--numberOfAttempts} раза")

    } while (numberOfAttempts > 0)

    println("Доступ запрещен.")

}