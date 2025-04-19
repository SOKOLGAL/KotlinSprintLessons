package org.example.lesson_6

fun main() {

    println("Введите количество секунд, которые нужно засечь:")
    var numberOfSeconds = readln().toInt()

    while (numberOfSeconds > 0) {
       println("Осталось секунд: ${numberOfSeconds--}")
        Thread.sleep(1000)
    }

        println("Время вышло")

}