package org.example.lesson1_10.lesson_8

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

    do {
        println("Какой ингредиент вы хотите заменить в рецепте?")
        val ingredientExchange = readln()

        if (ingredientExchange in arrayOfIngredients) {
            println("Ингредиент $ingredientExchange в рецепте есть")
            val ingredientIndex = arrayOfIngredients.indexOf(ingredientExchange)

            println("Введите ингредиент, который хотели бы добавить")
            val ingredientNew = readln()
            arrayOfIngredients[ingredientIndex] = ingredientNew

            println("Готово! Вы сохранили следующий список ингредиентов: ${arrayOfIngredients.joinToString()}")

            return

        } else println("Такого индгредиента нет в списке")

    } while (ingredientExchange !in arrayOfIngredients)

}