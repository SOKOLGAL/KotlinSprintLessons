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
    val perimeter = generalList.filter {
        color == COLOR_B
    }
    val area = generalList.filter {
        color == COLOR_W
    }
    val sumOfPerimeters = perimeter.sum()
    val sumOfArea = area.sum()

    println("Сумма периметров всех черных фигур: ${sumOfPerimeters.joinToString()}")
    println("Сумма площадей всех белых фигур: ${sumOfArea.joinToString()}")

}

abstract class Figure() {
    val color = ""
    fun area() {}
    fun perimeter() {}
}

class Circle(
    color: String,
    val radius: Double,
) : Figure() {

    fun area(): Int {
        val square = NUMBER_PI * radius.toDouble().pow(SQUARING.toDouble())
        println(square)
        return square
    }
}

class Rectangle(
    color: String,
    val width: Double,
    val height: Double,
) : Figure() {

    fun perimeter(): Double {
        val perimeter = (width + height) * CONSTANT_FOR_CALCULATING_PERIMETER
        println(perimeter)
        return perimeter
    }
}

const val NUMBER_PI = 3.14
const val SQUARING = 2
const val CONSTANT_FOR_CALCULATING_PERIMETER = 2
const val COLOR_B = "black"
const val COLOR_W = "white"