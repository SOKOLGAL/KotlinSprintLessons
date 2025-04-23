package org.example.lesson_8

fun main() {

    val arrayOfIngredients = arrayOf(
        "яйцо",
        "помидор",
        "сыр",
        "грибы",
        "укроп",
        "петрушка",
        "соль",
        "перец",
        "болгарский перец",
        "сметана",
        "молоко",
        "лук"
    )
    println("Какой ингредиент вы хотите найти?")
    val ingredient = readln()
    val hasIngredient = arrayOfIngredients.contains(ingredient)

    if (hasIngredient == true) {
        println("Ингредиент ${ingredient} в рецепте есть")
    } else println("Такого ингредиента в рецепте нет")

}