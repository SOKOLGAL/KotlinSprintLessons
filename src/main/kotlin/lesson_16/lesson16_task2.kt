package org.example.lesson_16

import kotlin.math.pow

fun main() {

    val circle = Circle(
        radius = 15.0
    )

    circle.calculatingCircumference()
    circle.calculatingAreaOfCircle()


}

class Circle(
    private val radius: Double,
) {

    private val pi = 3.14

    fun calculatingCircumference() {
        val circumference: Double = CALCULATE_LENGTH_AREA * pi * radius
        println(circumference)
    }

    fun calculatingAreaOfCircle() {
        val areaOfCircle: Double = pi * radius.pow(CALCULATE_LENGTH_AREA.toDouble())
        println(areaOfCircle)
    }

}

const val CALCULATE_LENGTH_AREA = 2