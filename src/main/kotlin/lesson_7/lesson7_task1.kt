package org.example.lesson_7

fun main() {

    val numberOfCharacters = 6 / TWO_CHARACTER_IN_ONE_PASS_FOR
    val passwordLet = 'a'..'z'
    val passwordNum = 1..9
    var password = passwordLet + passwordNum

    for (i in 0..numberOfCharacters) {
        passwordLet.random()
        passwordNum.random()
    }
    password += passwordLet.random()
    password += passwordNum.random()

    println("Сгенерированный пароль: ${password}")

}

const val TWO_CHARACTER_IN_ONE_PASS_FOR = 2