package org.example.lesson_21

import kotlin.Int as Int

fun main() {

    val int = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 15, 16)
    int.sum().evenNumbersSum()

}

fun Int.evenNumbersSum() {
    val int = listOf(this)
    val sumOfEvenNum = int.filter {
       it % 2 == 0
        }
    println(sumOfEvenNum.sum())
}