package org.example.lesson_10

fun main() {
    println("Придумайте логин:")
    val login = readln()
    println("Придумайте пароль:")
    val password = readln()
    val loginNumberOfCharacters = login.toCharArray().count()
    val passwordNumberOfCharacters = password.toCharArray().count()
    val result = validationLength(loginNumberOfCharacters, passwordNumberOfCharacters)

    if (result == false) {
        println("Логин или пароль недостаточно длинные")
    } else println("Приветствуем вас")

}

fun validationLength(loginNumberOfCharacters: Int?, passwordNumberOfCharacters: Int?): Boolean {
    val minimumNumberOfCharacters = 4
    val result =
        loginNumberOfCharacters!! >= minimumNumberOfCharacters || passwordNumberOfCharacters!! >= minimumNumberOfCharacters
    return result
}