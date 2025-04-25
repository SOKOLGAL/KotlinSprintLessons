package org.example.lesson_9

fun main() {

    println("Введите по одному 5 ингредиентов:")
    val mutableListOfIngredients = mutableListOf<String>()

    for (i in QUANTITY_OF_INGREDIENTS downTo 1) {
        val addIngredient = readln()
        mutableListOfIngredients.add(addIngredient)
    }

    val setOfIngredients = mutableListOfIngredients.toSet()

//    println("Такой ингредиент уже введен")

    val sorted = setOfIngredients.sorted()

//    .capitalize()

    println("$sorted")

}

const val QUANTITY_OF_INGREDIENTS = 5