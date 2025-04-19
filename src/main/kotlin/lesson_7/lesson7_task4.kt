package org.example.lesson_7

fun main() {

    println("Введите количество секунд, которые нужно засечь:")
    var numberOfSeconds = readln().toLong()
    val range = numberOfSeconds downTo 1

    for (i in range) {
        println("Осталось ${numberOfSeconds--} секунд")
        Thread.sleep(1000)
    }

    println("Время вышло")

}