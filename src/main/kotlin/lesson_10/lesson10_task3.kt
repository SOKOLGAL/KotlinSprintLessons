package org.example.lesson_10

fun main() {

    println("Задайте длину пароля:")

    val passwordLength = readln().toInt()
    val passwordGen = passwordGeneration(passwordLength.toString())
    println(passwordGen)

}

fun passwordGeneration(passwordLength: String): String? {
    val numberOfCharacters = passwordLength.toInt()
    val specialCharacters = mutableListOf('!', '"', '#', '$', '%', '&', '`', '(', ')', '*', '+', '-', '/', ' ')
    val passwordNum = 0..9
    var password: String = ""

    for (i in 1..numberOfCharacters / TWO_CHARACTER_IN_ONE_PASS_FOR) {
        password += passwordNum.random()
        password += specialCharacters.random()
    }

    return password
}

const val TWO_CHARACTER_IN_ONE_PASS_FOR = 2