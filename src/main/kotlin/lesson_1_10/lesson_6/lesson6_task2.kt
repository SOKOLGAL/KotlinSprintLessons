package org.example.lesson1_10.lesson_6

fun main() {

    println("Введите количество секунд, которые нужно засечь:")

    val numberOfSeconds = readln().toLong()
    val seconds = numberOfSeconds * MILLISECONDS

    Thread.sleep(seconds)

    println("Прошло $numberOfSeconds секунд")

}

const val MILLISECONDS = 1000