package org.example.lesson_9

fun main() {
    println("Введите по одному 5 ингредиентов:")
    val mutableListOfIngredients = mutableListOf("")

    for (i in QUANTITY_OF_INGREDIENTS downTo 1) {
        val addIngredient = readln()
        mutableListOfIngredients.add(addIngredient)
        mutableListOfIngredients.filter {
            it == addIngredient
        }
        mutableListOfIngredients.contains(addIngredient)
        println("Такой ингредиент уже введен")
    }

// equals(addIngredient)

    mutableListOfIngredients.sort()

    println("$mutableListOfIngredients")

}

const val QUANTITY_OF_INGREDIENTS = 5