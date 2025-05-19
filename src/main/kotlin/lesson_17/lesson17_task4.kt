package org.example.lesson_17

fun main() {

    val parcel = Parcel(
        parcelNumber = 6768522700207,
        currentLocation = "Пункт приема посылок ",
    )

    parcel.newCurrentLocation = "Сортировочный терминал"

    println("${parcel.movementCounter}")

}

class Parcel(
    val parcelNumber: Long,
    var currentLocation: String,
) {
    var newCurrentLocation = currentLocation
        set(value) {
            field = value
            if (newCurrentLocation != currentLocation) {
                movementCounter++
            }
        }
    var movementCounter: Int = 1
}