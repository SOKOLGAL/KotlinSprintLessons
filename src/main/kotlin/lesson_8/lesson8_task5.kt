package org.example.lesson_8

fun main() {

    println("Введите количество планируемых ингредиентов:")
    val quantityOfIngredients = readln().toInt()
    val arrayOfIngredients: String = Array(quantityOfIngredients) {}.toString()

    println("Вводите ингредиенты по одному:")

    for (i in 1..quantityOfIngredients) {
        arrayOfIngredients[i] = readln().toString()
        println("Полученные ингредиенты: ${arrayOfIngredients[i]}")
    }

//    println("Полученные ингредиенты: $arrayOfIngredients")

}

private operator fun String.set(i: Int, value: String) {

}
