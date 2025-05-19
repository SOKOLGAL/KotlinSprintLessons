package org.example.lesson_17

fun main() {

    val parcel = Parcel(
        parcelNumber = 6768522700207,
        currentLocation = "Пункт приема посылок"
    )

    parcel.movementCounter = "Пункт выдачи заказов"

    println("Посылка перемещена из ${parcel.currentLocation} в ${parcel.movementCounter}")

}

class Parcel(
    val parcelNumber: Long,
    var currentLocation: String,
) {
    var movementCounter = "Сортировочный центр"
        set(value: String) {
            field = value
        }
}