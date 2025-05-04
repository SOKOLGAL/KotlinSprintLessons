package org.example.lesson1_10.lesson_8

fun main() {

    println("Введите количество планируемых ингредиентов:")
    val quantityOfIngredients = readln().toInt()

    println("Вводите ингредиенты по одному:")
    val ingredients = Array(quantityOfIngredients) { readln() }

    println("Полученные ингредиенты: ${ingredients.joinToString()}")

}
