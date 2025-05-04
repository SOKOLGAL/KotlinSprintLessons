package org.example.lesson1_10.lesson_9

fun main() {

    val listIngredients = listOf(
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

    println("В рецепте есть следующие ингредиенты: $listIngredients")

    for (i in listIngredients) {
        println("$i")
    }

}