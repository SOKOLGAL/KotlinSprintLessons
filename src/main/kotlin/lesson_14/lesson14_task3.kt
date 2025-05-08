package org.example.lesson_14

import kotlin.math.pow

fun main() {

    val circle1 = Circle(COLOR_W, 15)
    val circle2 = Circle(COLOR_B, 10)
    val circle3 = Circle(COLOR_B, 5)
    val rectangle1 = Rectangle(COLOR_B, 3, 7)
    val rectangle2 = Rectangle(COLOR_W, 5, 9)
    val rectangle3 = Rectangle(COLOR_B, 4, 8)

    val generalList = mutableListOf(circle1, circle2, circle3, rectangle1, rectangle2, rectangle3)
    val color = Figure().color
    val perimeter = generalList.filter {
        color == COLOR_B
    }
    val area = generalList.filter {
        color == COLOR_W
    }
    val sumOfPerimeters = perimeter.sumOf { it.perimeter() }
    val sumOfArea = area.sumOf { it.area() }

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
    val radius: Int,
) : Figure() {

    fun area(circle: Circle): Circle {
        val square = NUMBER_PI * radius.toDouble().pow(SQUARING.toDouble())
        println(square)
        return circle
    }
}

class Rectangle(
    color: String,
    val width: Int,
    val height: Int,
) : Figure() {

    fun perimeter(rectangle: Rectangle): Rectangle {
        val perimeter = (width + height) * CONSTANT_FOR_CALCULATING_PERIMETER
        println(perimeter)
        return rectangle
    }
}

const val NUMBER_PI = 3.14
const val SQUARING = 2
const val CONSTANT_FOR_CALCULATING_PERIMETER = 2
const val COLOR_B = "black"
const val COLOR_W = "white"