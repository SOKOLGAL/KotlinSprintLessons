package org.example.lesson_10

fun main() {

    println("Задайте длину пароля:")

    val passwordLength = readln().toInt()
    val passwordGen = generatePassword(passwordLength)

    println(passwordGen)

}

fun generatePassword(passwordLength: Int): String {

    val specialCharacters = ' '..'/'
    val passwordNum = 0..9
    var password: String = ""

    for (i in 1..passwordLength / TWO_CHARACTER_IN_ONE_PASS_FOR) {
        password += passwordNum.random()
        password += specialCharacters.random()
    }
    if (passwordLength % 2 != 0) {
        password += passwordNum.random()
    }

    return password
}

const val TWO_CHARACTER_IN_ONE_PASS_FOR = 2