package org.example.lesson_15

fun main() {
    val tool = Tool(
        name = "Скрипка",
        quantityInStock = 5,
        component = "Смычок",
    )
    val componentForTool = ComponentForTool(
        name = "Смычок",
        quantityInStock = 3,
        suitableForTool = "Скрипка",
    )
    tool.scan()
    tool.searching()
    componentForTool.inStock()

}

abstract class MusicStore(
    val name: String,
    val quantityInStock: Int,
) {
}

class Tool(
    name: String,
    quantityInStock: Int,
    val component: String,
) : MusicStore(name, quantityInStock), searchingComponent {
    fun scan() {
        println("Для инструмента $name необходимо найти ${component}")
    }
    override fun searching() {
        println("Выполняется поиск")
    }
}

class ComponentForTool(
    name: String,
    quantityInStock: Int,
    val suitableForTool: String,
) : MusicStore(name, quantityInStock) {
    fun inStock() {
        println("В наличии есть $name в количестве $quantityInStock штук")
    }
}

interface searchingComponent {
    fun searching()
}