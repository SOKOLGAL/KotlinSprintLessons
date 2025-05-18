package org.example.lesson_17

fun main() {

    val parcel = Parcel(
        parcelNumber = 6768522700207,
        currentLocation = "Пункт выдачи - на отправку"
    )

    println(parcel.currentLocation)
    println(parcel.movementCounter)

    parcel.currentLocation = "Сортировочный центр"

    parcel.movementCounter++

    println(parcel.currentLocation)
    println(parcel.movementCounter)

}

class Parcel(
    val parcelNumber: Long,
    var currentLocation: String,
) {
    var movementCounter = 1
        set(value: Int) {
            field = value
            if (false) {
                currentLocation
                field++
            }
        }
}