package org.example.lesson_8

fun main() {

    println("Введите количество планируемых ингредиентов:")
    val quantityOfIngredients = readln().toInt()
    val arrayOfIngredients = charArrayOf()

    println("Вводите ингредиенты по одному:")

    for (i in 0..quantityOfIngredients) {
        readln().toCharArray().also { arrayOfIngredients[i] }
    }
    println("Полученные ингредиенты: ${arrayOfIngredients}")

}