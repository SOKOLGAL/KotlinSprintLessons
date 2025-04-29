package org.example.lesson_10

fun main() {

    val successfulAuthorization = passAufhorization()
    accessToken()
    getBasket()

}

fun passAufhorization(): Boolean {


    println("Для авторизации введите логин:")
    val login = readln()
    println("Введите пароль:")
    val password = readln()
    val successfulAuthorization = login == USER_LOGIN && password == USER_PASSWORD

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

    if (successfulAuthorization) {
        getBasket(token)
    } else println("Неудачная авторизация")

    return token
}

fun getBasket(token: String): List<String> {

    val basketContent = listOf("Ботинки", "Носки", "Рубашка")
    return basketContent
}

const val TWO_CHARACTER_IN_ONE_PASS_FOR = 2
const val USER_LOGIN = "lordpash"
const val USER_PASSWORD = "hfrtnf"