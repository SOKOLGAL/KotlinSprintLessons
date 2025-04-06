package org.example.lesson_2

fun main() {
    val depositMoney = 70000
    val interestRate: Double = 16.7
    val depositYear = 20
    val monthInYear = 12
    val monthSum = depositYear * monthInYear
    val coef = 100
    val rate: Double = interestRate / coef
    val rateYear = 1 + rate / 12
    val result = Math.pow(rateYear, monthSum.toDouble())
    val deposit = depositMoney * result
    println("%.3f".format(deposit.toDouble()))
}