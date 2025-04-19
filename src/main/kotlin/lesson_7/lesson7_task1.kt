package org.example.lesson_7

fun main() {

    val passwordNum = List(NUMBER) { (1..9).random()}
    val passwordLet = List(LETTER) { ('a'..'z').random()}

    println("Сгенерированный пароль: ${passwordLet[0]}${passwordNum[0]}${passwordLet[1]}${passwordNum[1]}${passwordLet[2]}${passwordNum[2]}")

}

const val NUMBER = 3
const val LETTER = 3