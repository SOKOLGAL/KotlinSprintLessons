package org.example.lesson_17

fun main() {

    val parcel = Parcel(
        parcelNumber = 6768522700207,
        initialLocation = "Пункт приема посылок",
    )

    println(parcel.initialLocation)
    println(parcel.movementCounter)

    parcel.currentLocation = "Сортировочный терминал"

    println(parcel.currentLocation)
    println(parcel.movementCounter)

    parcel.currentLocation = "Склад"

    println(parcel.currentLocation)
    println(parcel.movementCounter)

}

class Parcel(
    val parcelNumber: Long,
    var initialLocation: String,
) {

    var currentLocation = ""
        set(value) {
            if (field != value) {
                field = value
                movementCounter++
            }
        }
    var movementCounter: Int = 1
}