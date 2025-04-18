package org.example.lesson_6

fun main() {

    println("Введите количество секунд, которые нужно засечь:")
    val numberOfSeconds = readln().toLong()
    val seconds = numberOfSeconds * MILLISECONDS
    do {
        Thread.sleep(seconds)
        println("Прошло $numberOfSeconds секунд")
            } while (false)

}

const val MILLISECONDS = 1000