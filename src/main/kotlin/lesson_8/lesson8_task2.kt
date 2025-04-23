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

    for (i in arrayOfIngredients) {
        if (ingredient in arrayOfIngredients) {
            println("Ингредиент ${ingredient} в рецепте есть")
        }
        return
    }

    println("Такого ингредиента в рецепте нет")

}