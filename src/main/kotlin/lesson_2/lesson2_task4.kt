package org.example.lesson_2

fun main() {

    val crystallineOre = 7
    val ironOre = 11
    val buff = 20

    val crystallineOreBuff = crystallineOre * buff / percentOre
    val ironOreBuff = ironOre * buff / percentOre

    println("Количество бонусной кристаллической руды: $crystallineOreBuff")
    println("Количество бонусной железной руды: $ironOreBuff")

}

    const val percentOre = 100