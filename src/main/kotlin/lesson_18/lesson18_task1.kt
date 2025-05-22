package org.example.lesson_18

fun main() {

    val order1 = Order(85305259352342)
    val order2 = Order(80123987600121)

    order1.orderInformation(goods = "Микроволновая печь")
    order2.orderInformation(goods = listOf("Мыло", "Шампунь", "Гель для душа"))

}

class Order(
    val numberOfOrder: Long,
) {
    fun orderInformation(
        goods: String,
    ) {
        println("Заказан товар: $goods")
    }

    fun orderInformation(
        goods: List<String>,
    ) {
        println("Заказаны следующие товары: $goods")
    }
}