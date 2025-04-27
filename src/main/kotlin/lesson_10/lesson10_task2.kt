package org.example.lesson_10

fun main() {

    val result = isLengthValid()

    if (result) {
        println("Приветствуем вас")
    } else println("Логин или пароль недостаточно длинные")

}

fun isLengthValid(): Boolean {

    println("Придумайте логин:")
    val login = readln()

    println("Придумайте пароль:")
    val password = readln()

    val result = login.length >= MINIMUM_NUMBER_OF_CHARACTERS && password.length >= MINIMUM_NUMBER_OF_CHARACTERS

    return result

}

const val MINIMUM_NUMBER_OF_CHARACTERS = 4