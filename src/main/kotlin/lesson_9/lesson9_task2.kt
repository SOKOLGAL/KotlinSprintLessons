package org.example.lesson_9

fun main() {

    val mutableListOfIngredients = mutableListOf("яйцо", "помидор", "сыр")
    println("В рецепте есть следующие ингредиенты: $mutableListOfIngredients")
    println("Желаете добавить еще?")
    val answer = readln()

    if (answer == "да") {
        println("Какой ингредиент вы хотите добавить?")
        val addIngredient = readln()
        mutableListOfIngredients.equals(addIngredient)
        mutableListOfIngredients.add(addIngredient)
    }

    println("Теперь в рецепте есть следующие ингредиенты: $mutableListOfIngredients")

}