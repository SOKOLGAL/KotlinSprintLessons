package org.example.lesson1_10.lesson_5

fun main() {

    println("Введите год рождения:")
    val yearOfBirth = readln().toInt()
    val userAge = 2025 - yearOfBirth
    if (userAge >= AGE_OF_MAJORITY) {
        println("Показать экран со скрытым контентом")
    }
}

const val AGE_OF_MAJORITY = 18