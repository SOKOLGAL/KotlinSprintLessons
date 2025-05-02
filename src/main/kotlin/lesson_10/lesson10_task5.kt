package org.example.lesson_10

fun main() {

    println("Для авторизации введите логин:")
    val login = readln()
    println("Введите пароль:")
    val password = readln()

    val token = passAuthorization(login, password)

    if (token == null) {
        println("Неудачная авторизация")
    } else getBasket(println().toString())

}

fun passAuthorization(login: String, password: String): String? =
    if (login == USER_LOGIN && password == USER_PASSWORD) {
        generateToken()
    } else {
        null
    }

fun generateToken(): String {
    val tokenLength = 32
    val number = '0'..'9'
    val symbolsUpper = 'a'..'z'
    val symbolsLower = 'A'..'Z'
    val allowedChars = number + symbolsLower + symbolsUpper
    return List(tokenLength) { allowedChars.random() }.joinToString("")
}

fun getBasket(token: String): List<String> {
    println(listOf("Ботинки", "Носки", "Рубашка"))
    return listOf("Ботинки", "Носки", "Рубашка")
}

const val USER_LOGIN = "lordpash"
const val USER_PASSWORD = "hfrtnf"