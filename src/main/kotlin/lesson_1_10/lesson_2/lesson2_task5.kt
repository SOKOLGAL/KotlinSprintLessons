package org.example.lesson1_10.lesson_2

import kotlin.math.pow

fun main() {

    val depositMoney = 70000
    val interestRate: Double = 16.7
    val depositYear = 20

    val rate: Double = interestRate / DECIMAL_CONVERSION_FACTOR
    val deposit = depositMoney * (NUMBER_COMPOUND_FORMULA + rate).pow(depositYear)

    println("%.3f".format(deposit))

}

    const val DECIMAL_CONVERSION_FACTOR = 100
    const val NUMBER_COMPOUND_FORMULA = 1