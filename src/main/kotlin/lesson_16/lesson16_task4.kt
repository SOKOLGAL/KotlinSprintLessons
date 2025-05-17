package org.example.lesson_16

fun main() {

    val order = Order(
        orderNumber = 80110208443358,
        statusOrder = "Заказ принят"
    )

    println("Для изменения статуса заказа отправьте заявку менеджеру и укажите новый статус заказа:")
    order.applicationToManager(
        newStatusOrder = readln()
    )

}

class Order(
    private val orderNumber: Long,
    var statusOrder: String,
) {
    private fun changingStatusOrder(newStatusOrder: String) {
        statusOrder = newStatusOrder
        println("Статус заказа изменён на: $statusOrder")
    }

    fun applicationToManager(newStatusOrder: String) {
        println("Заявка менеджеру для изменения статуса заказа отправлена")
        changingStatusOrder(newStatusOrder)
    }
}