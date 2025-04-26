package org.example.lesson_8

fun main() {

    println("Введите количество планируемых ингредиентов:")
    val quantityOfIngredients = readln().toInt()

    println("Вводите ингредиенты по одному:")
    val ingredients = Array(quantityOfIngredients) { readln() }

    val listIngredients = ingredients.toSet()

    println("Полученные ингредиенты: $listIngredients")

}
