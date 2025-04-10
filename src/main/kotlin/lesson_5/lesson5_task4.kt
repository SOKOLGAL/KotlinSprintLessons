package org.example.lesson_5

fun main() {

    println("Введите ваш логин:")
    val userName = readln()

    if (userName == USERNAME) {
        println("Введите ваш пароль:")
    } else {
        println("Необходимо зарегистрироваться")

    }

    val password = readln()

    if (password == PASSWORD) {
        println("$userName, приветствуем вас на борту корабля \"Heart of Gold\"")
    } else {
        println("Необходимо зарегистрироваться")
    }

}



const val USERNAME = "Zaphod"
const val PASSWORD = "PanGalactic"