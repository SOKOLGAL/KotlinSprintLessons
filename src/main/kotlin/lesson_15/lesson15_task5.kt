package org.example.lesson_15

fun main() {

    val truck1 = Truck(
        carName = "Бычок",
        passengers = 6,
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

    truck1.loadingTruck()
    truck1.loadingPassengers()
    truck1.moving()
    truck1.unloadingTruck()
    truck1.unloadingPassengers()
    passengerCar1.loadingPassengers()
    passengerCar1.moving()
    passengerCar1.unloadingPassengers()
    passengerCar2.loadingPassengers()
    passengerCar2.moving()
    passengerCar2.unloadingPassengers()

}

abstract class Car(
    val carName: String,
    val maxNumberOfPassengers: Int,
    val minNumberOfPassengers: Int,
    val passengers: Int,
    val passengersForTransportation: Int,
    val passengersDelivery: Int,
    val cargoTransportation: Boolean,
) {
}

class Truck(
    carName: String,
    maxNumberOfPassengers: Int = 1,
    minNumberOfPassengers: Int = 0,
    passengers: Int,
    passengersForTransportation: Int = 0,
    passengersDelivery: Int = 0,
    val maxQuantityOfCargo: Int = 2,
    var minQuantityOfCargo: Int = 0,
    val weightOfCargo: Int,
    val quantityOfCargo: Int = 0,
    val cargoDelivery: Int = 0,
) : Car(
    carName, maxNumberOfPassengers, minNumberOfPassengers, passengers,
    passengersForTransportation, passengersDelivery, cargoTransportation = true
), moving, loadingTruck, loadingPassenger {

    override fun loadingTruck() {
        val quantityOfCargo = if (weightOfCargo >= maxQuantityOfCargo) {
            maxQuantityOfCargo
        } else {
            weightOfCargo
        }
        println(
            "В грузовую машину $carName загружают груз: $quantityOfCargo тонны, " +
                    "максимально возможный вес груза для перевозки: $maxQuantityOfCargo тонны"
        )
    }

    override fun unloadingTruck() {
        val cargoDelivery = if (weightOfCargo >= maxQuantityOfCargo) {
            maxQuantityOfCargo
        } else {
            weightOfCargo
        }
        println("На грузовой машине $carName доставлена $cargoDelivery тонна груза")
    }

    override fun loadingPassengers() {
        val passengersForTransportation: Int = if (passengers >= maxNumberOfPassengers) {
            maxNumberOfPassengers
        } else {
            passengers
        }
        println(
            "В грузовую машину $carName загружают для перевозки $passengersForTransportation " +
                    "пассажир, максимально возможное количество пассажиров " +
                    "для перевозки: $maxNumberOfPassengers пассажир"
        )
    }

    override fun unloadingPassengers() {
        val passengersDelivery = if (passengers >= maxNumberOfPassengers) {
            maxNumberOfPassengers
        } else {
            passengers
        }
        println("На грузовой машине $carName доставлен $passengersDelivery пассажир")
    }

    override fun moving() {
        val movingCargo = if (weightOfCargo >= maxQuantityOfCargo) {
            maxQuantityOfCargo
        } else {
            weightOfCargo
        }
        val movingPassenger = if (passengers >= maxNumberOfPassengers) {
            maxNumberOfPassengers
        } else {
            passengers
        }
        println("Грузовая машина $carName везёт груз: ${movingCargo}т")
        println("Грузовая машина $carName везёт пассажиров: $movingPassenger")
    }
}

class PassengerCar(
    carName: String,
    maxNumberOfPassengers: Int = 3,
    minNumberOfPassengers: Int = 0,
    passengers: Int,
    passengersForTransportation: Int = 0,
    passengersDelivery: Int = 0,
    cargoTransportation: Boolean = false,
) : Car(
    carName, maxNumberOfPassengers, minNumberOfPassengers, passengers,
    passengersForTransportation, passengersDelivery, cargoTransportation = false
), moving, loadingPassenger {

    override fun moving() {
        val movingPassenger = if (passengers >= maxNumberOfPassengers) {
            maxNumberOfPassengers
        } else {
            passengers
        }
        println("Легковая машина $carName везёт $movingPassenger пассажиров")
    }

    override fun loadingPassengers() {
        val passengersForTransportation = if (passengers >= maxNumberOfPassengers) {
            maxNumberOfPassengers
        } else {
            passengers
        }
        println(
            "В легковую машину $carName для перевозки загружают $passengersForTransportation пассажира, " +
                    "максимально возможное количество пассажиров для перевозки: $maxNumberOfPassengers пассажира"
        )
    }

    override fun unloadingPassengers() {
        val passengersDelivery = if (passengers >= maxNumberOfPassengers) {
            maxNumberOfPassengers
        } else {
            passengers
        }
        println("Легковая машина $carName доставила $passengersDelivery пассажира")
    }
}

interface moving {
    fun moving()
}

interface loadingTruck {
    fun loadingTruck()
    fun unloadingTruck()
}

interface loadingPassenger {
    fun loadingPassengers()
    fun unloadingPassengers()
}