package org.example.lesson_21

fun main() {

    val listOfInt: List<Int> = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 15, 16)

    println(listOfInt.evenNumbersSum())

}

fun List<Int>.evenNumbersSum(): Int {
    val sumOfEvenNum = this.filter { it % 2 == 0 }.sum()
    return sumOfEvenNum
}