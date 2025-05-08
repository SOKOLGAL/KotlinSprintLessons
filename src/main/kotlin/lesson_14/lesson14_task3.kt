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

    val color = Figure()
    val whatColor = color.color
    val perimeter = generalList.filter {
        whatColor == COLOR_B
    }
    val area = generalList.filter {
        whatColor == COLOR_W
    }
    val sumOfPerimeters = perimeter.map { it.color } . sumOf { color -> Int }
    val sumOfArea = area.map { it.color }

    println("${perimeter.joinToString()}")
        println("${area.joinToString()}")
        println("${sumOfPerimeters.joinToString()}")
        println("${sumOfArea.joinToString()}")
//    val numPer = Figure.perimeter
//        .sumBy { it.color}
//    val num = numPer.sumBy { it.color}
//    val sumPerimeter = perimeter.perimeter(sum)
//    val sumArea = area.sum

//    println("Сумма периметров всех черных фигур: $sumPerimeter")
//    println("Сумма площадей всех белых фигур: $sumArea")

    }

            open class Figure() {
        val color: Any = ""
        open fun area() {}
        open fun perimeter() {}
    }

        class Circle (
            color: String,
    val radius: Int,
    ) : Figure() {
        override fun area() {
            val square = NUMBER_PI * radius.toDouble().pow(SQUARING.toDouble())
            println(square)
//        return square
        }
    }

    class Rectangle(
        color: String,
        val width: Int,
        val height: Int,
    ) : Figure() {
        override fun perimeter() {
            val perimeter = (width + height) * CONSTANT_FOR_CALCULATING_PERIMETER
            println(perimeter)
//        return perimeter
        }
    }

    const val NUMBER_PI = 3.14
    const val SQUARING = 2
    const val CONSTANT_FOR_CALCULATING_PERIMETER = 2
    const val COLOR_B = "black"
    const val COLOR_W = "white"