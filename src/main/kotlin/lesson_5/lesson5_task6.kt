package org.example.lesson_5

import kotlin.math.pow

fun main() {

    println("Введите ваш вес в кг:")
    val weight = readln().toFloat()
    println("Введите ваш рост в см:")
    val height = readln().toFloat()
    val bodyMassIndex = weight / ((height / CONVERT_CENTIMETERS_TO_METERS).pow(SQUARE)).toFloat()
    val bMI = "%.2f".format(bodyMassIndex)

    when (bodyMassIndex) {
        ((< UNDER_WEIGHT))-> println("Ваш ИМТ равен $bMI - это недостаточная масса тела")
        (>= UNDER_WEIGHT && < NORMAL_BODY_WEIGHT)-> println("Ваш ИМТ равен $bMI - это нормальная масса тела")
        (> NORMAL_BODY_WEIGHT && < OVER_WEIGHT)-> println("Ваш ИМТ равен $bMI - это избыточная масса тела")
        ((>= OVER_WEIGHT))-> println("Ваш ИМТ равен $bMI - это ожирение")
    }

}

const val CONVERT_CENTIMETERS_TO_METERS = 100
const val SQUARE = 2
const val UNDER_WEIGHT = 18.5
const val NORMAL_BODY_WEIGHT = 25.0
const val OVER_WEIGHT = 30