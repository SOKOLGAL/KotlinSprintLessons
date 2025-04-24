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
    println("Список ингредиентов: ${arrayOfIngredients.joinToString()}")

    var ingredientExchange: String

    do {
        println("Какой ингредиент вы хотите заменить в рецепте?")
        ingredientExchange = readln()

        if (ingredientExchange in arrayOfIngredients) {
            println("Ингредиент $ingredientExchange в рецепте есть")
        } else println("Такого индгредиента нет в списке")
    } while (ingredientExchange !in arrayOfIngredients)

    val ingredientIndex = arrayOfIngredients.indexOf(ingredientExchange)
    println("Введите ингредиент, который хотели бы добавить")
    val ingredientNew = readln()

    arrayOfIngredients[ingredientIndex] = ingredientNew

    println("Готово! Вы сохранили следующий список ингредиентов: ${arrayOfIngredients.joinToString()}")

}