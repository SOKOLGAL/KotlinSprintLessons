package org.example.lesson_5

fun main() {

    println("Введите расстояние поездки (в километрах):")
    val distance = readln().toFloat()
    println("Введите расход топлива на 100 км (в литрах):")
    val fuelConsumption = readln().toFloat()
    println("Введите текущую цену за литр топлива:")
    val currentPricePerLiner = readln().toFloat()

    val fuel = (distance * fuelConsumption) / TRANSLATION_PER_HUNDRED_KILOMETERS
    val finalFuel = "%.1f".format(fuel)
    val price = fuel * currentPricePerLiner
    val finalCost = "%.2f".format(price)


    println("Для поездки на $distance км потребуется $finalFuel литров топлива. " +
            "Итоговая стоимость поездки $finalCost.")

}

const val TRANSLATION_PER_HUNDRED_KILOMETERS = 100