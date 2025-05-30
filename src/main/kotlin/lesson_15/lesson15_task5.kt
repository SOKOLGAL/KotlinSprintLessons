package org.example.lesson_15

fun main() {

    val truck1 = Truck("Бычок")
    val passengerCar1 = PassengerCar("Ласточка")
    val passengerCar2 = PassengerCar("Волга")
    val passengers = 5
    val weightOfCargo = 2

    truck1.loadingTruck(weightOfCargo)
    truck1.loadingPassengers(passengers)
    truck1.moving(truck1.quantityOfCargo, truck1.passengersForTransportation)
    truck1.unloadingTruck(truck1.quantityOfCargo)
    truck1.unloadingPassengers(truck1.passengersForTransportation)
    passengerCar1.loadingPassengers(passengers)
    passengerCar1.moving(quantityOfCargo = 0, passengerCar1.passengersForTransportation)
    passengerCar1.unloadingPassengers(passengerCar1.passengersForTransportation)
    passengerCar2.loadingPassengers(passengers)
    passengerCar2.moving(quantityOfCargo = 0, passengerCar2.passengersForTransportation)
    passengerCar2.unloadingPassengers(passengerCar2.passengersForTransportation)

}

abstract class Car(
    val carName: String,
    val maxNumberOfPassengers: Int,
    val minNumberOfPassengers: Int,
    var passengersForTransportation: Int,
    val cargoTransportation: Boolean,
) {
}

class Truck(
    carName: String,
    maxNumberOfPassengers: Int = 1,
    passengersForTransportation: Int = 0,
    val maxQuantityOfCargo: Int = 2,
    minNumberOfPassengers: Int = 0,
    var quantityOfCargo: Int = 0,
) : Car(
    carName, maxNumberOfPassengers,
    passengersForTransportation, minNumberOfPassengers, cargoTransportation = true
), moving, loadingTruck, loadingPassenger {

    var weightOfCargo: Int = 0
    var passengers: Int = 0
    var remainingPassengers: Int = 0
    var remainingCargo: Int = 0

    override fun loadingTruck(weightOfCargo: Int): Int {
        if (weightOfCargo >= maxQuantityOfCargo) {
            quantityOfCargo = maxQuantityOfCargo
            remainingCargo = weightOfCargo - quantityOfCargo
        } else {
            quantityOfCargo = weightOfCargo
        }
        println(
            "В грузовую машину $carName загружают груз: $quantityOfCargo тонны, " +
                    "максимально возможный вес груза для перевозки: $maxQuantityOfCargo тонны"
        )
        return quantityOfCargo
        return remainingCargo
    }

    override fun unloadingTruck(quantityOfCargo: Int) {
        println("На грузовой машине $carName доставлена $quantityOfCargo тонна груза")
    }

    override fun loadingPassengers(passengers: Int): Int {
        if (passengers >= maxNumberOfPassengers || remainingPassengers >= maxNumberOfPassengers) {
            passengersForTransportation = maxNumberOfPassengers
            remainingPassengers = passengers - passengersForTransportation
        } else {
            passengersForTransportation = passengers
        }
        println(
            "В грузовую машину $carName загружают для перевозки $passengersForTransportation " +
                    "пассажир, максимально возможное количество пассажиров " +
                    "для перевозки: $maxNumberOfPassengers пассажир"
        )
        return passengersForTransportation
        return remainingPassengers
    }

    override fun unloadingPassengers(passengersForTransportation: Int) {
        println("На грузовой машине $carName доставлен $passengersForTransportation пассажир")
    }

    override fun moving(quantityOfCargo: Int, passengersForTransportation: Int) {
        println("Грузовая машина $carName везёт груз: ${quantityOfCargo}т")
        println("Грузовая машина $carName везёт пассажиров: $passengersForTransportation")
    }
}

class PassengerCar(
    carName: String,
    maxNumberOfPassengers: Int = 3,
    minNumberOfPassengers: Int = 0,
    passengersForTransportation: Int = 0,
    cargoTransportation: Boolean = false,
) : Car(
    carName, maxNumberOfPassengers,
    passengersForTransportation, minNumberOfPassengers, cargoTransportation = false
), moving, loadingPassenger {

    var passengers: Int = 0
    var remainingPassengers: Int = 0

    override fun moving(quantityOfCargo: Int, passengersForTransportation: Int) {
        println("Легковая машина $carName везёт $passengersForTransportation пассажиров")
    }

    override fun loadingPassengers(passengers: Int): Int {
        if (passengers >= maxNumberOfPassengers || remainingPassengers >= maxNumberOfPassengers) {
            passengersForTransportation = maxNumberOfPassengers
            remainingPassengers = passengers - passengersForTransportation
        } else {
            passengersForTransportation = passengers

        }
        println(
            "В легковую машину $carName для перевозки загружают $passengersForTransportation пассажира, " +
                    "максимально возможное количество пассажиров для перевозки: $maxNumberOfPassengers пассажира"
        )
        return passengersForTransportation
        return remainingPassengers
    }

    override fun unloadingPassengers(passengersForTransportation: Int) {
        println("Легковая машина $carName доставила $passengersForTransportation пассажира")
    }
}

interface moving {
    fun moving(quantityOfCargo: Int, passengersForTransportation: Int)
}

interface loadingTruck {
    fun loadingTruck(weightOfCargo: Int): Int
    fun unloadingTruck(quantityOfCargo: Int)
}

interface loadingPassenger {
    fun loadingPassengers(passengers: Int): Int
    fun unloadingPassengers(passengersForTransportation: Int)
}