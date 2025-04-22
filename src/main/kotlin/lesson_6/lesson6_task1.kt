package org.example.lesson_6

fun main() {

    println("Создайте ваш логин:")
    val login = readln()
    println("Создайте ваш пароль:")
    val password = readln()

    do {
        println("Для авторизации введите ваш логин:")
        val loginNew = readln()
        println("Введите ваш пароль:")
        val passwordNew = readln()
    } while (login == loginNew && password == passwordNew)

    println("Авторизация прошла успешно")

}