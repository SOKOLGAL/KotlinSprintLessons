package org.example.lesson_5

fun main() {

    println("Примите участие в лотерее! Введите по очереди три числа от 0 до 42:")

    val num = List(NUM) { readln().toInt() }
    val winNum = List(NUM) { (1..42).random()}
    var result = num.intersect(winNum)

    val category = when (result) {
        3 -> "Поздравляем! Вы отгадали все числа и выиграли джекпот!"
        2 -> "Вы отгадали два числа и получаете крупный приз!"
        1 -> "Вы отгадали одно число и получаете утешительный приз!"
        else -> "Вы не угадали ни одного числа!"
    }
    println("Для победы нужны были числа: ${winNum[1]}, ${winNum[2]} и ${winNum[3]}!")
}

const val NUM = 3