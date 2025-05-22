package org.example.lesson_17

fun main() {

    val parcel = Parcel(
        parcelNumber = 6768522700207,
    )

    println(parcel.initialLocation)
    println(parcel.movementCounter)

    parcel.initialLocation = "Сортировочный терминал"

    println(parcel.initialLocation)
    println(parcel.movementCounter)

    parcel.initialLocation = "Склад"

    println(parcel.initialLocation)
    println(parcel.movementCounter)

}

class Parcel(
    val parcelNumber: Long,
) {

    var initialLocation: String = "Пункт приема посылок"
        set(value) {
            if (field != value) {
                field = value
                movementCounter++
            }
        }
    var movementCounter: Int = 1
}