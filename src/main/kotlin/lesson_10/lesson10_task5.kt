package org.example.lesson_10

fun main() {

    println("Для авторизации введите логин:")
    val login = readln()
    println("Введите пароль:")
    val password = readln()
    passAuthorization(login, password)
    generateToken()
    getBasket(println().toString())


}

fun passAuthorization(login: String, password: String): String? {
    var token: String? = ""
    if (login == USER_LOGIN && password == USER_PASSWORD) {
        token = generateToken()
    } else token = null
    return token
}

fun generateToken(): String {
    val tokenLength = 32
    val letter = 'a'..'z'
    val number = '0'..'9'
    val token: MutableList<Char> = mutableListOf()
    for (i in 1..tokenLength / TWO_CHARACTER_IN_ONE_PASS_FOR) {
        token += (letter.random())
        token += (number.random())
    }
    if (tokenLength % 2 != 0) {
        token += (number.random())
    }
    token.shuffle()
       return token.toString()
}

fun getBasket(token: String): List<String> {
    if (token == null) {
        println("Неудачная авторизация")
    } else println(listOf("Ботинки", "Носки", "Рубашка"))
    return listOf("Ботинки", "Носки", "Рубашка")
}

const val TWO_CHARACTER_IN_ONE_PASS_FOR = 2
const val USER_LOGIN = "lordpash"
const val USER_PASSWORD = "hfrtnf"