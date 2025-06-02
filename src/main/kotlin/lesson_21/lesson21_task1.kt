package org.example.lesson_21

import java.lang.String

fun main() {

    val string = String("Hello")

    println(string.vowelCount())

}

fun String.vowelCount(): Int {
    val vowels = listOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
    return this.count { it in vowels }
}
