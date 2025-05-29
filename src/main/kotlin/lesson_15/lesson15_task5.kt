package org.example.lesson_15

fun main() {

    val truck1 = Truck(
        carName = "Бычок",
        passengers = 1,
        weightOfCargo = 2,
    )
    val passengerCar1 = PassengerCar(
        carName = "Ласточка",
        passengers = 3,
    )
    val passengerCar2 = PassengerCar(
        carName = "Волга",
        passengers = 2,
    )

    truck1.loadingTruck(truck1.weightOfCargo)
    truck1.loadingPassengers(truck1.passengers)
    truck1.moving(truck1.quantityOfCargo, truck1.passengersForTransportation)
    truck1.unloadingTruck(truck1.quantityOfCargo)
    truck1.unloadingPassengers(truck1.passengersForTransportation)
    passengerCar1.loadingPassengers(passengerCar1.passengers)
    passengerCar1.moving(quantityOfCargo = 0, passengerCar1.passengersForTransportation)
    passengerCar1.unloadingPassengers(passengerCar1.passengersForTransportation)
    passengerCar2.loadingPassengers(passengerCar2.passengers)
    passengerCar2.moving(quantityOfCargo = 0, passengerCar2.passengersForTransportation)
    passengerCar2.unloadingPassengers(passengerCar2.passengersForTransportation)

}

abstract class Car(
    val carName: String,
    val maxNumberOfPassengers: Int,
    val passengers: Int,
    var passengersForTransportation: Int,
    val cargoTransportation: Boolean,
) {
}

class Truck(
    carName: String,
    maxNumberOfPassengers: Int = 1,
    passengers: Int,
    passengersForTransportation: Int = 0,
    val maxQuantityOfCargo: Int = 2,
    var weightOfCargo: Int,
    var quantityOfCargo: Int = 0,
) : Car(
    carName, maxNumberOfPassengers, passengers,
    passengersForTransportation, cargoTransportation = true
), moving, loadingTruck, loadingPassenger {

    override fun loadingTruck(weightOfCargo: Int): Int {
        if (weightOfCargo >= maxQuantityOfCargo) {
            quantityOfCargo = maxQuantityOfCargo
        } else {
            quantityOfCargo = weightOfCargo
        }
        println(
            "В грузовую машину $carName загружают груз: $quantityOfCargo тонны, " +
                    "максимально возможный вес груза для перевозки: $maxQuantityOfCargo тонны"
        )
        return quantityOfCargo
    }

    override fun unloadingTruck(quantityOfCargo: Int) {
        println("На грузовой машине $carName доставлена $quantityOfCargo тонна груза")
    }

    override fun loadingPassengers(passengers: Int): Int {
        if (passengers >= maxNumberOfPassengers) {
            passengersForTransportation = maxNumberOfPassengers
        } else {
            passengersForTransportation = passengers
        }
        println(
            "В грузовую машину $carName загружают для перевозки $passengersForTransportation " +
                    "пассажир, максимально возможное количество пассажиров " +
                    "для перевозки: $maxNumberOfPassengers пассажир"
        )
        return passengersForTransportation
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
    passengers: Int,
    passengersForTransportation: Int = 0,
    cargoTransportation: Boolean = false,
) : Car(
    carName, maxNumberOfPassengers, passengers,
    passengersForTransportation, cargoTransportation = false
), moving, loadingPassenger {

    override fun moving(quantityOfCargo: Int, passengersForTransportation: Int) {
        println("Легковая машина $carName везёт $passengersForTransportation пассажиров")
    }

    override fun loadingPassengers(passengers: Int): Int {
        if (passengers >= maxNumberOfPassengers) {
            passengersForTransportation = maxNumberOfPassengers
        } else {
            passengersForTransportation = passengers
        }
        println(
            "В легковую машину $carName для перевозки загружают $passengersForTransportation пассажира, " +
                    "максимально возможное количество пассажиров для перевозки: $maxNumberOfPassengers пассажира"
        )
        return passengersForTransportation
    }

    override fun unloadingPassengers(passengersForTransportation: Int) {
        println("Легковая машина $carName доставила $passengersForTransportation пассажира")
    }
}

interface moving {
    fun moving(quantityOfCargo: Int, passengersForTransportation: Int)
}

interface loadingTruck {
    fun loadingTruck(quantityOfCargo: Int): Int
    fun unloadingTruck(quantityOfCargo: Int)
}

interface loadingPassenger {
    fun loadingPassengers(passengersForTransportation: Int): Int
    fun unloadingPassengers(passengersForTransportation: Int)
}