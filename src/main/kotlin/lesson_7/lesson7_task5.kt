package org.example.lesson_7

fun main() {

    println("Задайте размер генерируемого пароля (минимальная длина пароля $MINIMUM_PASSWORD_LENGTH символов):")

    val passwordLenght = readln().toInt()

    val password = List(passwordLenght) {
        (('a'..'z') + ('A'..'Z') + ('0'..'9')).random()
    }.joinToString("")

    println("Сгенерированный пароль: ${password}")

}

const val MINIMUM_PASSWORD_LENGTH = 6