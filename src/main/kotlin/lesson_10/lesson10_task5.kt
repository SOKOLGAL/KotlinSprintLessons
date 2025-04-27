package org.example.lesson_10

fun main() {

    val successfulAuthorization = aufhorization()
    if (successfulAuthorization) {
        accessToken()
        basket(null)
    } else println("Неудачная авторизация")

}

fun aufhorization(): Boolean {

    println("Для авторизации введите логин:")
    val login = readln()

    println("Введите пароль:")
    val password = readln()

    val successfulAuthorization = login == USER_LOGIN && password == USER_PASSWORD

    return successfulAuthorization

}

fun accessToken(): MutableList<Char> {

    val tokenLength = 32
    val letter = 'a'..'z'
    val number = '0'..'9'
    val token: MutableList<Char> = mutableListOf()

    for (i in 1..tokenLength / TWO_CHARACTER_IN_ONE_PASS_FOR) {
        token.add(letter.random())
        token.add(number.random())
    }

    token.shuffle()

    return token
}

fun basket(token: Int?): Unit {

    val basketContent: Unit = println("Печать содержимого корзины")

    if (token != null) {
        println(basketContent)
    }

}

const val TWO_CHARACTER_IN_ONE_PASS_FOR = 2
const val USER_LOGIN = "lordpash"
const val USER_PASSWORD = "hfrtnf"