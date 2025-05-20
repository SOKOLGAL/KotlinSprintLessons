package org.example.lesson_17

fun main() {

    val parcel = Parcel(
        parcelNumber = 6768522700207,
        initialLocation = "Пункт приема посылок",
    )

    parcel.newCurrentLocation = "Сортировочный терминал"

    println(parcel.currentLocation)
    println(parcel.movementCounter)

}

class Parcel(
    val parcelNumber: Long,
    val initialLocation: String,
) {
    var currentLocation = initialLocation
    var newCurrentLocation: String = ""
        set(value) {
            field = value
            if (field == value) {
                currentLocation = newCurrentLocation
                movementCounter++
            }
        }
    var movementCounter: Int = 1
}