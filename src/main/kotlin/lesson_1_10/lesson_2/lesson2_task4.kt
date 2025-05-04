package org.example.lesson1_10.lesson_2

fun main() {

    val crystallineOre = 7
    val ironOre = 11
    val buff = 20

    val crystallineOreBuff = crystallineOre * buff / PERCENT_ORE
    val ironOreBuff = ironOre * buff / PERCENT_ORE

    println("Количество бонусной кристаллической руды: $crystallineOreBuff")
    println("Количество бонусной железной руды: $ironOreBuff")

}

    const val PERCENT_ORE = 100