package org.example.lesson_7

fun main() {

    val a = 1000..9999
    val authorizationCode = a.random()
    println("Ваш код авторизации: ${authorizationCode}")
    println("Введите код авторизации:")
    var code = readln().toInt()
    while (code !== authorizationCode) {
        println("Ваш код авторизации: ${authorizationCode}")
        println("Введите код авторизации:")
        code = readln().toInt()
    }

    println("Авторизация прошла успешно")

}