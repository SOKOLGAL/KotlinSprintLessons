package org.example.lesson_2

fun main() {

    val depositMoney = 70000
    val interestRate: Double = 16.7
    val depositYear = 20

    val monthSum = depositYear * MONTH_IN_YEAR
    val rate: Double = interestRate / COEF
    val rateYear = 1 + rate / 12
    val result = Math.pow(rateYear, monthSum.toDouble())
    val deposit = depositMoney * result

    println("%.3f".format(deposit.toDouble()))

}

    const val MONTH_IN_YEAR = 12
    const val COEF = 100