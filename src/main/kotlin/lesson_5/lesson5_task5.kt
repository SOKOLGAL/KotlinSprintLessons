package org.example.lesson_5

fun main() {

    println("Примите участие в лотерее! Введите по очереди три числа от 0 до 42:")

    val num = List(NUM) { readln().toInt() }
    val winNum = List(NUM) { (1..42).random()}
    val result = num.intersect(winNum).size

    when (result) {
        3 -> println("Поздравляем! Вы отгадали все числа и выиграли джекпот!")
        2 -> println("Вы отгадали два числа и получаете крупный приз!")
        1 -> println("Вы отгадали одно число и получаете утешительный приз!")
        else -> println("Вы не угадали ни одного числа!")
    }
    println("Для победы нужны были числа: ${winNum[0]}, ${winNum[1]} и ${winNum[2]}!")
}

const val NUM = 3