package org.example.lesson_8

fun main() {

    var arrayOfIngredients = arrayOf("яйцо", "помидор", "сыр", "грибы", "укроп", "петрушка", "соль", "перец", "болгарский перец", "сметана", "молоко", "лук")

    for (i in arrayOfIngredients) {
        println("Список ингредиентов: $i")
    }

    var ingredientExchange: String

    do {
        println("Какой ингредиент вы хотите заменить в рецепте?")
        ingredientExchange = readln()
        val hasIngredient = arrayOfIngredients.contains(ingredientExchange)
        if(hasIngredient == true) {
            println("Ингредиент ${ingredientExchange} в рецепте есть")
            println("Введите ингредиент, который хотели бы добавить")
          continue
        } else println("Такого индгредиента нет в списке")
    } while (ingredientExchange !in arrayOfIngredients)

    val ingredientIndex = arrayOfIngredients.indexOf(ingredientExchange)
    val ingredientNew = readln()
    arrayOfIngredients[ingredientIndex] = ingredientNew

    for (i in arrayOfIngredients) {
        println("Готово! Вы сохранили следующий список ингредиентов:$i")
    }

}