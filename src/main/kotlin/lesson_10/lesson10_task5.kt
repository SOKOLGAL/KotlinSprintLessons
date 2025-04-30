package org.example.lesson_10

fun main() {

    val successfulAuthorization = passAuthorization()
    accessToken()
    getBasket()

}

fun passAuthorization(basketContent: List<String>): Boolean {

    println("Для авторизации введите логин:")
    val login = readln()
    println("Введите пароль:")
    val password = readln()
    val successfulAuthorization = login == USER_LOGIN && password == USER_PASSWORD

    if (successfulAuthorization) {
        println(basketContent)
    } else println("Неудачная авторизация")
    return successfulAuthorization
}

fun accessToken(successfulAuthorization: Boolean): String {
    val tokenLength = 32
    val letter = 'a'..'z'
    val number = '0'..'9'
    var token: String = ""
    for (i in 1..tokenLength / TWO_CHARACTER_IN_ONE_PASS_FOR) {
        token += (letter.random())
        token += (number.random())
    }
    return token
}

fun getBasket(token: String): List<String> {
    val basketContent = listOf("Ботинки", "Носки", "Рубашка")
    return basketContent
}

const val TWO_CHARACTER_IN_ONE_PASS_FOR = 2
const val USER_LOGIN = "lordpash"
const val USER_PASSWORD = "hfrtnf"

}

const val USER_LOGIN = login123
const val USER_PASSWORD = password123