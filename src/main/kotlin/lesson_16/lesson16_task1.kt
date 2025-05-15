package org.example.lesson_16

fun main() {
    val number = Cube()
    number.printingNumber()
}

class Cube() {
    private val randomNumber: Int = (1..6).random()
    fun printingNumber() {
        println(randomNumber)
    }
}