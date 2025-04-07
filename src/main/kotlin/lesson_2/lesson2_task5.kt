package org.example.lesson_2

fun main() {

    val depositMoney = 70000
    val interestRate: Double = 16.7
    val depositYear = 20

    val rate: Double = interestRate / COEF
    val rateYear = 1 + rate
    val result = Math.pow(rateYear, depositYear.toDouble())
    val deposit = depositMoney * result

    println("%.3f".format(deposit.toDouble()))

}

    const val COEF = 100