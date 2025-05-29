package org.example.lesson_21

fun main() {

    val string = java.lang.String("Hello")

    println(string.intern().vowelCount(string.toString()))

}

fun String.vowelCount(string: String): Int {
    val lowers = listOf('a', 'e', 'i', 'o', 'u')
    var count = 0
    for (char in lowercase()) {
        if (char in lowers) {
            count++
        }
    }
    return count
}
