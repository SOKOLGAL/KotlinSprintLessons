package org.example.lesson_6

fun main() {

    println("Создайте ваш логин:")
    var login = readln()
    println("Создайте ваш пароль:")
    var password = readln()
    val enterLoginPass = listOf(login, password)

    do {
        do {
            println("Для авторизации введите ваш логин:")
            login = readln()
            while (login !in enterLoginPass) {
                println("Для авторизации введите ваш логин:")
                login = readln()
            }
            println("Введите ваш пароль:")
            password = readln()
            while (password !in enterLoginPass) {
                println("Введите ваш пароль:")
                password = readln()
            }
        } while (false)

    } while (false)

    println("Авторизация прошла успешно")

}