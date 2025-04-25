package org.example.lesson_8

fun main() {

    println("Введите количество планируемых ингредиентов:")
    val quantityOfIngredients = readln().toInt()
    println("Вводите ингредиенты по одному:")
    val ingredients = Array(quantityOfIngredients) {""}

//    val ingredients = Array(quantityOfIngredients) { readLn() }

    for (i in 1..quantityOfIngredients) {
        ingredients[i] = readln()
    }

    println("Полученные ингредиенты: $ingredients")

}