package org.example.lesson_7

fun main() {

    println("Задайте размер генерируемого пароля (минимальная длина пароля $MINIMUM_PASSWORD_LENGTH символов):")
    val passwordLenght = readln().toInt()
    val password = ('A'..'Z') + ('a'..'z') + ('1'..'9')
    val pass = password.random()
    val pass1 = List(passwordLenght) { password }.random()

    for (i in passwordLenght downTo 1) {
        println("Сгенерированный пароль: ${pass}")
    }
    println("Сгенерированный пароль: ${}")

}

const val MINIMUM_PASSWORD_LENGTH = 6