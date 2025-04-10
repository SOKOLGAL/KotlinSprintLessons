package org.example.lesson_4

fun main() {

    val trainingDay = 5
    val isEven = trainingDay % 2

    val trainingHands = isEven == EVEN
    val trainingPress = isEven == EVEN
    val trainingLegs = isEven !== EVEN
    val trainingBack = isEven !== EVEN

    val multiString = """
        Упражнения для рук:    $trainingHands
        Упражнения для ног:    $trainingLegs
        Упражнения для спины:  $trainingBack
        Упражнения для пресса: $trainingPress
    """.trimIndent()

    println(multiString)

}

const val EVEN = 1