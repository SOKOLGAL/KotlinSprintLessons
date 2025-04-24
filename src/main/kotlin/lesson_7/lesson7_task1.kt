package org.example.lesson_7

fun main() {

    val numberOfCharacters = 6
    val passwordLet = 'a'..'z'
    val passwordNum = 1..9
    var password = ""

    for (i in 1..(numberOfCharacters/ TWO_CHARACTER_IN_ONE_PASS_FOR)) {
        password += passwordLet.random()
        password += passwordNum.random()
    }

    println("Сгенерированный пароль: $password")

}

const val TWO_CHARACTER_IN_ONE_PASS_FOR = 2