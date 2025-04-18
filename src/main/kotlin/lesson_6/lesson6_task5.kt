package org.example.lesson_6

import java.lang.Integer.sum

fun main() {

    for (i in 3 downTo 1) {
        val example1 = (1..9).random()
        val example2 = (1..9).random()
        val summary = sum(example1, example2)
        println("Подтвердите, что вы не бот. Решите уравнение: $example1 + $example2 = ? Введите ваш ответ:")
        val solution = readln().toInt()
        if (solution == summary) {
            println("Добро пожаловать!")
            break
        } else if (solution !== summary) {
            println("Неверно! Попробуйте еще ${i - 1} раза")

        }
        println("Доступ запрещен.")
    }



}