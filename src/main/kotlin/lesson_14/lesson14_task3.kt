package org.example.lesson_14

import kotlin.math.pow

fun main() {
    val circle1 = Circle("white", 15)
    val circle2 = Circle("black", 10)
    val circle3 = Circle("black", 5)
    val rectangle1 = Rectangle("black", 3, 7)
    val rectangle2 = Rectangle("white", 5, 9)
    val rectangle3 = Rectangle("black", 4, 8)
    val generalList = mutableListOf(circle1, circle2, circle3, rectangle1, rectangle2, rectangle3)

    println("Сумма периметров всех черных фигур: $")
    println("Сумма площадей всех белых фигур: $")

}

abstract class Figure(
    val color: String,
) {
    abstract fun area()
    abstract fun perimeter()
}

class Circle(
    color: String,
    val radius: Int,
) : Figure(color) {
    override fun area() {
        val square = NUMBER_PI * radius.toDouble().pow(SQUARING.toDouble())
        println(square)
    }
}

class Rectangle(
    color: String,
    val width: Int,
    val height: Int,
) : Figure(color) {
    override fun perimeter() {
        val perimeter = (width + height) * CONSTANT_FOR_CALCULATING_PERIMETER
        println(perimeter)
    }
}

const val NUMBER_PI = 3.14
const val SQUARING = 2
const val CONSTANT_FOR_CALCULATING_PERIMETER = 2