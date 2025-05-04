package org.example.lesson1_10.lesson_4

fun main() {

    val averageWeight = 35  ..  100
    val averageVolume = 0 until 100
    val cargoWeight1 = 20
    val cargoVolume1 = 80
    val cargoWeight2 = 50
    val cargoVolume2 = 100
    val condition1 = cargoWeight1 in averageWeight && cargoVolume1 in averageVolume
    val condition2 = cargoWeight2 in averageVolume && cargoVolume2 in averageVolume

    println("Груз с весом $cargoWeight1 кг и объемом $cargoVolume1 л соответствует " +
            "категории 'Average': $condition1")
    println("Груз с весом $cargoWeight2 кг и объемом $cargoVolume2 л соответствует " +
            "категории 'Average': $condition2")

}
//    const val AVERAGE_WEIGHT = 35 .. 100
//    const val AVERAGE_VOLUME = 0 .. 100
