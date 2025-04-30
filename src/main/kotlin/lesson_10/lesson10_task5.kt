package org.example.lesson_10

fun main() {

    println("Для авторизации введите логин:")
    val login = readln()
    println("Введите пароль:")
    val password = readln()
    passAuthorization()
    generateToken()
    getBasket()

}

fun passAuthorization(login: String, password: String): String {

    val successfulAuthorization = login == USER_LOGIN && password == USER_PASSWORD

    if (successfulAuthorization) {
        generateToken()
    } else println("Неудачная авторизация")
    return generateToken()
}

fun generateToken(): String {
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
    return listOf("Ботинки", "Носки", "Рубашка")
}

const val TWO_CHARACTER_IN_ONE_PASS_FOR = 2
const val USER_LOGIN = "lordpash"
const val USER_PASSWORD = "hfrtnf"