package org.example.lesson_6

fun main() {

    println("Создайте ваш логин:")
    val login = readln()
    println("Создайте ваш пароль:")
    val password = readln()

    do {
        println("Для авторизации введите ваш логин:")
        val loginNew = readln()
        login == loginNew
        println("Введите ваш пароль:")
        val passwordNew = readln()
        password == passwordNew
    } while (false)

    println("Авторизация прошла успешно")

}