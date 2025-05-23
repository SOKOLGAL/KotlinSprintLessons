package org.example.lesson_14

import kotlin.math.pow

fun main() {

    val circle1 = Circle(COLOR_W, 15.0)
    val circle2 = Circle(COLOR_B, 10.0)
    val circle3 = Circle(COLOR_B, 5.0)
    val rectangle1 = Rectangle(COLOR_B, 3.0, 7.0)
    val rectangle2 = Rectangle(COLOR_W, 5.0, 9.0)
    val rectangle3 = Rectangle(COLOR_B, 4.0, 8.0)

    val generalList = mutableListOf(circle1, circle2, circle3, rectangle1, rectangle2, rectangle3)
    var sumOfPerimeter = 0.0
    var sumOfArea = 0.0

    for (i in generalList) {
        when (i.color) {
            COLOR_B -> sumOfPerimeter += i.perimeter()
            COLOR_W -> sumOfArea += i.area()
        }
    }
    println("Сумма периметров всех черных фигур: $sumOfPerimeter")
    println("Сумма площадей всех белых фигур: $sumOfArea")

}

abstract class Figure() {
    abstract val color: String
    abstract fun area(): Double
    abstract fun perimeter(): Double

}

class Circle(
    override val color: String,
    val radius: Double,
) : Figure() {

    override fun area(): Double {
        val square = NUMBER_PI * radius.pow(SQUARING.toDouble())
        return square
    }

    override fun perimeter(): Double {
        val perimeter = SQUARING * NUMBER_PI * radius
        return perimeter
    }
}

class Rectangle(
    override val color: String,
    val width: Double,
    val height: Double,
) : Figure() {

    override fun perimeter(): Double {
        val perimeter = (width + height) * CONSTANT_FOR_CALCULATING_PERIMETER
        return perimeter
    }

    override fun area(): Double {
        val square = width * height
        return square
    }
}

const val NUMBER_PI = 3.14
const val SQUARING = 2
const val CONSTANT_FOR_CALCULATING_PERIMETER = 2
const val COLOR_B = "black"
const val COLOR_W = "white"