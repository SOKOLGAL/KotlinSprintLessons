package org.example.lesson1_10.lesson_5

fun main() {

    println("Введите ваш логин:")
    val userName = readln()

    if (userName == USERNAME) {
        println("Введите ваш пароль:")

        val password = readln()

        if (password == PASSWORD) {
            println("$userName, приветствуем вас на борту корабля \"Heart of Gold\"")
        } else {
            println("Пароль неверный. Необходимо зарегистрироваться")
        }
    } else {
        println("Необходимо зарегистрироваться")
    }

}

const val USERNAME = "Zaphod"
const val PASSWORD = "PanGalactic"