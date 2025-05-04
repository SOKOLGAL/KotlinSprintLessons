package org.example.lesson1_10.lesson_5

import kotlin.math.pow

fun main() {

    println("Введите ваш вес в кг:")
    val weight = readln().toFloat()
    println("Введите ваш рост в см:")
    val height = readln().toFloat()
    val bodyMassIndex = weight / ((height / CONVERT_CENTIMETERS_TO_METERS).pow(SQUARE)).toFloat()
    val bMI = "%.2f".format(bodyMassIndex)

    val category = when {
        bodyMassIndex < UNDER_WEIGHT -> "недостаточная масса тела"
        bodyMassIndex < NORMAL_BODY_WEIGHT -> "нормальная масса тела"
        bodyMassIndex < OVER_WEIGHT -> "избыточная масса тела"
        else -> "ожирение"
    }
    println("Ваш ИМТ равен $bMI - это $category")
}

const val CONVERT_CENTIMETERS_TO_METERS = 100
const val SQUARE = 2
const val UNDER_WEIGHT = 18.5
const val NORMAL_BODY_WEIGHT = 25.0
const val OVER_WEIGHT = 30