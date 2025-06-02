package org.example.lesson_15

fun main() {

    val truck1 = Truck()
    val passengerCar1 = PassengerCar()
    val passengerCar2 = PassengerCar()
    var passengers = 6
    var weightOfCargo = 2

    while (weightOfCargo > 0 && passengers > 0) {
        truck1.loadingTruck(weightOfCargo)
        weightOfCargo -= truck1.currentCargoQuantity
        truck1.loadingPassengers(passengers)
        passengers -= truck1.currentNumberOfPassengers
        passengerCar1.loadingPassengers(passengers)
        passengers -= passengerCar1.currentNumberOfPassengers
        passengerCar2.loadingPassengers(passengers)
        passengers -= passengerCar2.currentNumberOfPassengers
    }

    truck1.moving(truck1.currentCargoQuantity, truck1.currentNumberOfPassengers)
    passengerCar1.moving(currentCargoQuantity = 0, passengerCar1.currentNumberOfPassengers)
    passengerCar2.moving(currentCargoQuantity = 0, passengerCar2.currentNumberOfPassengers)
    truck1.unloadingTruck(truck1.currentCargoQuantity)
    truck1.unloadingPassengers(truck1.currentNumberOfPassengers)
    passengerCar1.unloadingPassengers(passengerCar1.currentNumberOfPassengers)
    passengerCar2.unloadingPassengers(passengerCar2.currentNumberOfPassengers)

}

abstract class Car(
    val maxNumberOfPassengers: Int,
    val minNumberOfPassengers: Int,
    var currentNumberOfPassengers: Int,
    val cargoTransportation: Boolean,
) {
}

class Truck(
    maxNumberOfPassengers: Int = 1,
    minNumberOfPassengers: Int = 0,
    passengersForTransportation: Int = 0,
    val maxQuantityOfCargo: Int = 2,
    val mixQuantityOfCargo: Int = 0,
    var currentCargoQuantity: Int = 0,
) : Car(
    maxNumberOfPassengers,
    passengersForTransportation, minNumberOfPassengers, cargoTransportation = true
), moving, loadingTruck, loadingPassenger {

    override fun loadingTruck(weightOfCargo: Int) {
        if (weightOfCargo >= maxQuantityOfCargo) {
            currentCargoQuantity = maxQuantityOfCargo
        } else {
            currentCargoQuantity = weightOfCargo
        }
        println(
            "В грузовую машину загружают груз: $currentCargoQuantity тонны, " +
                    "максимально возможный вес груза для перевозки: $maxQuantityOfCargo тонны"
        )
    }

    override fun unloadingTruck(currentCargoQuantity: Int) {
        println("На грузовой машине доставлена $currentCargoQuantity тонна груза")
        val currentCargoQuantity = mixQuantityOfCargo
    }

    override fun loadingPassengers(passengers: Int) {
        if (passengers >= maxNumberOfPassengers) {
            currentNumberOfPassengers = maxNumberOfPassengers
        } else {
            currentNumberOfPassengers = passengers
        }
        println(
            "В грузовую машину загружают для перевозки $currentNumberOfPassengers " +
                    "пассажира, максимально возможное количество пассажиров " +
                    "для перевозки: $maxNumberOfPassengers пассажир"
        )
    }

    override fun unloadingPassengers(currentNumberOfPassengers: Int) {
        println("На грузовой машине доставлен $currentNumberOfPassengers пассажир")
        val currentNumberOfPassengers = minNumberOfPassengers
    }

    override fun moving(currentCargoQuantity: Int, currentNumberOfPassengers: Int) {
        println("Грузовая машина везёт груз: ${currentCargoQuantity}т")
        println("Грузовая машина везёт пассажиров: $currentNumberOfPassengers")
        currentCargoQuantity
        currentNumberOfPassengers
    }
}

class PassengerCar(
    maxNumberOfPassengers: Int = 3,
    minNumberOfPassengers: Int = 0,
    currentNumberOfPassengers: Int = 0,
    cargoTransportation: Boolean = false,
) : Car(
    maxNumberOfPassengers,
    currentNumberOfPassengers, minNumberOfPassengers, cargoTransportation = false
), moving, loadingPassenger {

    override fun moving(currentCargoQuantity: Int, currentNumberOfPassengers: Int) {
        println("Легковая машина везёт $currentNumberOfPassengers пассажира")
        currentNumberOfPassengers
    }

    override fun loadingPassengers(passengers: Int) {
        if (passengers >= maxNumberOfPassengers) {
            currentNumberOfPassengers = maxNumberOfPassengers
        } else {
            currentNumberOfPassengers = passengers
        }
        println(
            "В легковую машину для перевозки загружают $currentNumberOfPassengers пассажира, " +
                    "максимально возможное количество пассажиров для перевозки: $maxNumberOfPassengers пассажира"
        )
    }

    override fun unloadingPassengers(currentNumberOfPassengers: Int) {
        println("Легковая машина доставила $currentNumberOfPassengers пассажира")
        val currentNumberOfPassengers = minNumberOfPassengers
    }
}

interface moving {
    fun moving(currentCargoQuantity: Int, currentNumberOfPassengers: Int)
}

interface loadingTruck {
    fun loadingTruck(weightOfCargo: Int)
    fun unloadingTruck(currentCargoQuantity: Int)
}

interface loadingPassenger {
    fun loadingPassengers(passengers: Int)
    fun unloadingPassengers(currentNumberOfPassengers: Int)
}