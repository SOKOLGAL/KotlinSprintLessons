package org.example.lesson1_10.lesson_7

fun main() {

    println("Введите число:")
    val num = readln().toInt()
    val range = 0..num
    for(i in range step 2) {
        println("Все чётные числа от 0 до $num: $i")
    }

}