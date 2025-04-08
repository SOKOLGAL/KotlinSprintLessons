package org.example.lesson_4

fun main() {

    val arrayOfExersises = arrayOf("для рук", "для ног", "для спины", "для пресса")
    val trainingDay = 5
    val even = trainingDay % 2
    val trainingHandsPress = even !== 0
    val trainingLegsBack = even == 1

    for (i in arrayOfExersises) {
            println("Упражнения $i: ${(trainingHandsPress) or (trainingLegsBack)}")
        }

}