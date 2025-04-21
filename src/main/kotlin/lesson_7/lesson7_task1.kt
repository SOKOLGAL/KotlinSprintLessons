package org.example.lesson_7

import kotlin.random.Random

fun main() {

    val numberOfCharacters = 6
    val passwordNum = 1..9
    val passwordLet = 'a'..'z'

    for (i in 0..numberOfCharacters) {
        val pass = passwordLet.random()
        val pass1 = passwordNum.random()
    }
    println("Сгенерированный пароль: $passwordLet$passwordNum")

    }