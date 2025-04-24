package org.example.lesson_8

fun main() {

    println("Введите количество планируемых ингредиентов:")
    val quantityOfIngredients = readln().toInt()
    val arrayOfIngredients = Array(quantityOfIngredients) {}.toString()

    println("Вводите ингредиенты по одному:")

    for (i in 1..quantityOfIngredients) {
        readln()
        arrayOfIngredients.get(i)
    }

    println("Полученные ингредиенты: $arrayOfIngredients")

}