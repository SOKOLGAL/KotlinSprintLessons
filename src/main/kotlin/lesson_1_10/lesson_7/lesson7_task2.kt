package org.example.lesson1_10.lesson_7

fun main() {

    val number = 1000..9999
    val authorizationCode = number.random()
    println("Ваш код авторизации: $authorizationCode")
    println("Введите код авторизации:")
    var code = readln().toInt()
    while (code != authorizationCode) {
        println("Ваш код авторизации: $authorizationCode")
        println("Введите код авторизации:")
        code = readln().toInt()
    }

    println("Авторизация прошла успешно")

}