package org.example.lesson_19

import org.example.lesson_19.Category.*

fun main() {

    val product1 = Product(
        name = "Футболка",
        id = 122418495016,
        category = CLOTH
    )
    val product2 = Product(
        name = "Линейка",
        id = 122418491651,
        category = STATIONERY
    )
    val product3 = Product(
        name = "Пакет",
        id = 123418461498,
        category = SUNDRY
    )

    product1.productInformation()
    product2.productInformation()
    product3.productInformation()

}

enum class Category {
    CLOTH {
        override fun textCategoryName(): String {
            return "Категория: Одежда"
        }
    },
    STATIONERY {
        override fun textCategoryName(): String {
            return "Категория: Канцелярские товары"
        }
    },
    SUNDRY {
        override fun textCategoryName(): String {
            return "Категория: Разное"
        }
    };

    abstract fun textCategoryName(): String
}

class Product(
    val name: String,
    val id: Long,
    val category: Category,
) {

    fun productInformation() {
        println("Название товара: $name")
        println("ID товара: $id")
        definitionOfCategory(
            category = category
        )
    }

    fun definitionOfCategory(category: Category) {
        when (category) {
            CLOTH -> println("Категория: Одежда")
            STATIONERY -> println("Категория: Канцелярские товары")
            SUNDRY -> println("Категория: Разное")
        }
    }
}