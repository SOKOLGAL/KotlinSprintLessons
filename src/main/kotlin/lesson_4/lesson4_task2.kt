package org.example.lesson_4

fun main() {

    val averageWeight = 35  ..  100
    val averageVolume = 0 until  100
    val cargoWeight1 = 20
    val cargoVolume1 = 80
    val cargoWeight2 = 50
    val cargoVolume2 = 100

    println("Груз с весом $cargoWeight1 кг и объемом $cargoVolume1 л соответствует категории 'Average': ${20 in averageWeight && 80 in averageVolume}")
    println("Груз с весом $cargoWeight2 кг и объемом $cargoVolume2 л соответствует категории 'Average': ${50 in averageWeight && 100 in averageVolume}")

}