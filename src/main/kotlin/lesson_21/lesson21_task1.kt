package org.example.lesson_21

fun main() {

    val string = java.lang.String("Hello")

    println(string.intern().vowelCount(string.toString()))

}

fun String.vowelCount(string: String): Int {
    val vowels = listOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
    return this.count { it in vowels }
}
