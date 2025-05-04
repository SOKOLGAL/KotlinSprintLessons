package org.example.lesson1_10.lesson_7

fun main() {

    println("Задайте размер генерируемого пароля (минимальная длина пароля $MINIMUM_PASSWORD_LENGTH символов):")

    val passwordLenght = readln().toInt()

    val lowercaseLetters = ('a'..'z').random()
    val capitalLetters = ('A'..'Z').random()
    val numbers = ('0'..'9').random()
    val password: MutableList<Char> = mutableListOf()
    password.add(lowercaseLetters)
    password.add(capitalLetters)
    password.add(numbers)

    val pass = (('a'..'z') + ('A'..'Z') + ('0'..'9')).random()
    for (i in passwordLenght downTo FREE_PASSWORD_LENGTH) {
        password.add(pass)
    }
    password.shuffle()

    println("Сгенерированный пароль: ${password}")

}

const val MINIMUM_PASSWORD_LENGTH = 6
const val FREE_PASSWORD_LENGTH = 4