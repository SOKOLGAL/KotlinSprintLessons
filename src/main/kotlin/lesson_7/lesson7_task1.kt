package org.example.lesson_7

import kotlin.random.Random

fun main() {

    val numberOfCharacters = 6
    val passwordNum = 1..9
    val passwordLet = 'a'..'z'

    for (1) {
        val password = List(numberOfCharacters) {Random.nextInt(1, 9)
            println("Сгенерированный пароль: ${password}")
        }

    }