package org.example.lesson_15

fun main() {

    val truck1 = Truck(
        carName = "Бычок",
        passengers = 1,
        weightOfCargo = 1,
    )
    val passengerCar1 = PassengerCar(
        carName = "Ласточка",
        passengers = 3,
    )
    val passengerCar2 = PassengerCar(
        carName = "Волга",
        passengers = 2,
    )
    val truck2 = Truck(
        carName = "Камаз",
        passengers = 0,
        weightOfCargo = 1,
    )

    truck1.loadingTruck(quantityOfCargo = truck1.weightOfCargo)
    truck1.loadingPassengers(
        passengersForTransportation = truck1.passengers
    )
    truck1.moving()
    truck1.unloadingTruck()
    truck1.unloadingPassengers()
    passengerCar1.loadingPassengers(
        passengersForTransportation = passengerCar1.passengers
    )
    passengerCar1.moving()
    passengerCar1.unloadingPassengers()
    passengerCar2.loadingPassengers(
        passengersForTransportation = passengerCar2.passengers
    )
    passengerCar2.moving()
    passengerCar2.unloadingPassengers()
    truck2.loadingTruck(quantityOfCargo = truck2.weightOfCargo)
    truck2.loadingPassengers(
        passengersForTransportation = truck2.passengers
    )
    truck2.moving()
    truck2.unloadingTruck()
    truck2.unloadingPassengers()

    val summaryQuantityOfCargo = truck1.quantityOfCargo + truck2.quantityOfCargo
    val summaryNumberOfPassengers = truck1.passengersForTransportation +
            passengerCar1.passengersForTransportation +
            passengerCar2.passengersForTransportation + truck2.passengersForTransportation

    println(
        "Всего перевезено $summaryQuantityOfCargo тонны груза и" +
                " $summaryNumberOfPassengers пассажиров"
    )

}

abstract class Car(
    val carName: String,
    val maxNumberOfPassengers: Int,
    val minNumberOfPassengers: Int,
    val passengers: Int,
    val cargoTransportation: Boolean,
) {
}

class Truck(
    carName: String,
    maxNumberOfPassengers: Int = 1,
    minNumberOfPassengers: Int = 0,
    passengers: Int,
    val maxQuantityOfCargo: Int = 2,
    var minQuantityOfCargo: Int = 0,
    val weightOfCargo: Int,
) : Car(
    carName, maxNumberOfPassengers, minNumberOfPassengers, passengers, cargoTransportation = true
), moving, loadingTruck, loadingPassenger {

    var quantityOfCargo = if (weightOfCargo >= maxQuantityOfCargo) {
        maxQuantityOfCargo
    } else {
        weightOfCargo
    }
    var passengersForTransportation: Int = if (passengers >= maxNumberOfPassengers) {
        maxNumberOfPassengers
    } else {
        passengers
    }


    override fun loadingTruck(quantityOfCargo: Int) {
        println(
            "В грузовую машину $carName загружают груз: $quantityOfCargo тонны, " +
                    "максимально возможный вес груза для перевозки: $maxQuantityOfCargo тонны"
        )
    }

    override fun unloadingTruck() {
        println("На грузовой машине $carName доставлена $quantityOfCargo тонна груза")
    }

    override fun loadingPassengers(passengersForTransportation: Int) {
        println(
            "В грузовую машину $carName загружают для перевозки $passengersForTransportation " +
                    "пассажир, максимально возможное количество пассажиров " +
                    "для перевозки: $maxNumberOfPassengers пассажир"
        )
    }

    override fun unloadingPassengers() {
        println("На грузовой машине $carName доставлен $passengersForTransportation пассажир")
    }

    override fun moving() {
        println("Грузовая машина $carName везёт груз: ${quantityOfCargo}т")
        println("Грузовая машина $carName везёт пассажиров: $passengersForTransportation")
    }
}

class PassengerCar(
    carName: String,
    maxNumberOfPassengers: Int = 3,
    minNumberOfPassengers: Int = 0,
    passengers: Int,
    cargoTransportation: Boolean = false,
) : Car(
    carName, maxNumberOfPassengers, minNumberOfPassengers, passengers,
    cargoTransportation = false
), moving, loadingPassenger {
    var passengersForTransportation = if (passengers >= maxNumberOfPassengers) {
        maxNumberOfPassengers
    } else {
        passengers
    }

    override fun moving() {
        println("Легковая машина $carName выехала с $passengersForTransportation пассажирами")
    }

    override fun loadingPassengers(passengersForTransportation: Int) {
        println(
            "В легковую машину $carName для перевозки загружают $passengersForTransportation пассажира, " +
                    "максимально возможное количество пассажиров для перевозки: $maxNumberOfPassengers пассажира"
        )
    }

    override fun unloadingPassengers() {
        println("Легковая машина $carName доставила $passengersForTransportation пассажира")
    }
}

interface moving {
    fun moving()
}

interface loadingTruck {
    fun loadingTruck(quantityOfCargo: Int)
    fun unloadingTruck()
}

interface loadingPassenger {
    fun loadingPassengers(passengersForTransportation: Int)
    fun unloadingPassengers()
}