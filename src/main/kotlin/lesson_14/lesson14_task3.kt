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
    val color = ""

    for (i in generalList) {
        when (color) {
            COLOR_B -> println(i.perimeter())
            COLOR_W -> println(i.area())
        }
    }

    val sumOfPerimeter = circle2.perimeter() + circle3.perimeter() + rectangle1.perimeter() + rectangle3.perimeter()
    val sumOfArea = circle1.area() + rectangle2.area()
    println("Сумма периметров всех черных фигур: $sumOfPerimeter")
    println("Сумма площадей всех белых фигур: $sumOfArea")

}

abstract class Figure() {
    val color = ""
    abstract fun area(): Double
    abstract fun perimeter(): Double
}

class Circle(
    color: String,
    val radius: Double,
) : Figure() {

    override fun area(): Double {
        val square = NUMBER_PI * radius.pow(SQUARING.toDouble())
        println(square)
        return square
    }

    override fun perimeter(): Double {
        val perimeter = SQUARING * NUMBER_PI * radius
        println(perimeter)
        return perimeter
    }
}

class Rectangle(
    color: String,
    val width: Double,
    val height: Double,
) : Figure() {

    override fun perimeter(): Double {
        val perimeter = (width + height) * CONSTANT_FOR_CALCULATING_PERIMETER
        println(perimeter)
        return perimeter
    }

    override fun area(): Double {
        val square = width * height
        println(square)
        return square
    }
}

const val NUMBER_PI = 3.14
const val SQUARING = 2
const val CONSTANT_FOR_CALCULATING_PERIMETER = 2
const val COLOR_B = "black"
const val COLOR_W = "white"