package org.example.lesson1_10.lesson_9

fun main() {

    println("Введите по одному 5 ингредиентов:")
    val mutableListOfIngredients = mutableListOf<String>()

    for (i in QUANTITY_OF_INGREDIENTS downTo 1) {
        val addIngredient = readln()
        mutableListOfIngredients.add(addIngredient)
    }

    val setOfIngredients = mutableListOfIngredients.toSet()
    val sorted = setOfIngredients.sorted()

    println("${(sorted.joinToString(separator = ", ", postfix = ".")).replaceFirstChar { it.uppercase() }}")

}

const val QUANTITY_OF_INGREDIENTS = 5