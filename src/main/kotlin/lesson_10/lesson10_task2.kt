package org.example.lesson_10

fun main() {
    isLengthValid()

}

fun isLengthValid(): Boolean {
    println("Придумайте логин:")
    val login = readln()
    println("Придумайте пароль:")
    val password = readln()
    login.length
    password.length
    val result =
        login.toInt() >= MINIMUM_NUMBER_OF_CHARACTERS || password.toInt() >= MINIMUM_NUMBER_OF_CHARACTERS
    if (true) {
        println("Приветствуем вас")
    } else println("Логин или пароль недостаточно длинные")

    return result
}

const val MINIMUM_NUMBER_OF_CHARACTERS = 4