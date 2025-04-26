package org.example.lesson_10

fun main() {

    println("Придумайте логин:")
    val login = readln()

    println("Придумайте пароль:")
    val password = readln()

    val loginNumberOfCharacters = login.length
    val passwordNumberOfCharacters = password.length
    val result = isLengthValid(loginNumberOfCharacters, passwordNumberOfCharacters)

    if (result) {
        println("Приветствуем вас")
    } else println("Логин или пароль недостаточно длинные")

}

fun isLengthValid(loginNumberOfCharacters: Int?, passwordNumberOfCharacters: Int?): Boolean =
    loginNumberOfCharacters!! >= MINIMUM_NUMBER_OF_CHARACTERS && passwordNumberOfCharacters!! >= MINIMUM_NUMBER_OF_CHARACTERS

const val MINIMUM_NUMBER_OF_CHARACTERS = 4