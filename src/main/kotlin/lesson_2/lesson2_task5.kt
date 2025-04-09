package org.example.lesson_2

fun main() {

    val depositMoney = 70000
    val interestRate: Double = 16.7
    val depositYear = 20

    val rate: Double = interestRate / DECIMAL_CONVERSION_FACTOR
    val rateYear = NUMBER_COMPOUND_FORMULA + rate
    val result = Math.pow(rateYear, depositYear.toDouble())
    val deposit = depositMoney * result

    println("%.3f".format(deposit.toDouble()))

}

    const val DECIMAL_CONVERSION_FACTOR = 100
    const val NUMBER_COMPOUND_FORMULA = 1