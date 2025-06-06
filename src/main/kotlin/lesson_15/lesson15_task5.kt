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

    truck1.moving()
    passengerCar1.moving()
    passengerCar2.moving()
    truck1.unloadingTruck()
    truck1.unloadingPassengers()
    passengerCar1.unloadingPassengers()
    passengerCar2.unloadingPassengers()

}

abstract class Car(
    val maxNumberOfPassengers: Int,
    val minNumberOfPassengers: Int,
    var currentNumberOfPassengers: Int,
) {
}

class Truck(
    maxNumberOfPassengers: Int = 1,
    minNumberOfPassengers: Int = 0,
    passengersForTransportation: Int = 0,
    val maxQuantityOfCargo: Int = 2,
    val minQuantityOfCargo: Int = 0,
    var currentCargoQuantity: Int = 0,
) : Car(
    maxNumberOfPassengers,
    passengersForTransportation, minNumberOfPassengers
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

    override fun unloadingTruck() {
        println("На грузовой машине доставлены $currentCargoQuantity тонны груза")
        val currentCargoQuantity = minQuantityOfCargo
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

    override fun unloadingPassengers() {
        println("На грузовой машине доставлен $currentNumberOfPassengers пассажир")
        val currentNumberOfPassengers = minNumberOfPassengers
    }

    override fun moving() {
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
) : Car(
    maxNumberOfPassengers,
    currentNumberOfPassengers, minNumberOfPassengers
), moving, loadingPassenger {

    override fun moving() {
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

    override fun unloadingPassengers() {
        println("Легковая машина доставила $currentNumberOfPassengers пассажира")
        val currentNumberOfPassengers = minNumberOfPassengers
    }
}

interface moving {
    fun moving()
}

interface loadingTruck {
    fun loadingTruck(weightOfCargo: Int)
    fun unloadingTruck()
}

interface loadingPassenger {
    fun loadingPassengers(passengers: Int)
    fun unloadingPassengers()
}