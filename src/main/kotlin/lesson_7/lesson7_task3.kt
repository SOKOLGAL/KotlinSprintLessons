package org.example.lesson_7

fun main() {

    println("Введите число:")
    val num = readln().toInt()
    val range = listOf(0..num step 2)
    println("Все чётные числа от 0 до $num: ${range[0] + 1}")

}