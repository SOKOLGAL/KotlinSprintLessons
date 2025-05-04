package org.example.lesson1_10.lesson_7

fun main() {

    println("Введите количество секунд, которые нужно засечь:")
    var numberOfSeconds = readln().toLong()

    for (i in numberOfSeconds downTo 0) {
        println("Осталось ${numberOfSeconds--} секунд")
        Thread.sleep(1000)
    }

    println("Время вышло")

}