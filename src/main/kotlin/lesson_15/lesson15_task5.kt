package org.example.lesson_15

fun main() {

    val truck1 = Truck(
        carName = "Бычок",
        passengers = 0,
        weightOfCargo = 1,
    )
    val passengerCar1 = PassengerCar(
        carName = "Ласточка",
        passengers = 2,
    )
    val passengerCar2 = PassengerCar(
        carName = "Волга",
        passengers = 3,
    )
    val truck2 = Truck(
        carName = "Камаз",
        passengers = 1,
        weightOfCargo = 1,
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
    truck2.loadingTruck()
    truck2.loadingPassengers()
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
    var passengersForTransportation: Int,
    val passengers: Int,
    val cargoTransportation: Boolean,
) {
}

class Truck(
    carName: String,
    maxNumberOfPassengers: Int = 1,
    minNumberOfPassengers: Int = 0,
    passengersForTransportation: Int = 0,
    passengers: Int,
    val maxQuantityOfCargo: Int = 2,
    var minQuantityOfCargo: Int = 0,
    val weightOfCargo: Int,
    var quantityOfCargo: Int = 0,
) : Car(
    carName, maxNumberOfPassengers, minNumberOfPassengers, passengers, passengersForTransportation,
    cargoTransportation = true
), moving, loadingTruck, loadingPassenger {


    val cargo: Boolean = weightOfCargo <= maxQuantityOfCargo
    val quantityOfPassenger: Boolean = passengers <= maxNumberOfPassengers

    override fun moving() {
        if (weightOfCargo == minQuantityOfCargo) {
            quantityOfCargo = weightOfCargo
            println(
                "Грузовая машина $carName выехала без груза"
            )
        } else if (cargo) {
            quantityOfCargo = weightOfCargo
            println("Грузовая машина $carName везёт груз: ${quantityOfCargo}т")
        } else if (weightOfCargo >= maxQuantityOfCargo) {
            quantityOfCargo = maxQuantityOfCargo
            println(
                "Грузовая машина $carName везёт груз: ${quantityOfCargo}т"
            )
        }

        if (quantityOfPassenger) {
            passengersForTransportation = passengers
            println("Грузовая машина $carName везёт пассажиров: $passengersForTransportation")
        } else if (passengers == minNumberOfPassengers) {
            passengersForTransportation = passengers
            println("Грузовая машина $carName выехала без пассажиров")
        } else if (passengers >= maxNumberOfPassengers) {
            passengersForTransportation = maxNumberOfPassengers
            println(
                "Грузовая машина $carName везёт пассажиров: $passengersForTransportation"
            )
        }
    }

    override fun loadingTruck() {
        if (weightOfCargo == minQuantityOfCargo) {
            quantityOfCargo = weightOfCargo
            println("В грузовую машину $carName не загружен груз")
        } else if (cargo) {
            quantityOfCargo = weightOfCargo
            println("В грузовую машину $carName загружен груз: ${quantityOfCargo}т")
        } else if (weightOfCargo >= maxQuantityOfCargo) {
            quantityOfCargo = maxQuantityOfCargo
            println("В грузовую машину $carName загружено груза только: ${quantityOfCargo}т")
        }
    }

    override fun unloadingTruck() {
        if (weightOfCargo == minQuantityOfCargo) {
            quantityOfCargo = weightOfCargo
            println("Грузовая машина $carName не доставила груз")
        } else if (cargo) {
            quantityOfCargo = weightOfCargo
            println("На грузовой машине $carName доставлена $quantityOfCargo тонна груза")
        } else if (weightOfCargo >= maxQuantityOfCargo) {
            quantityOfCargo = maxQuantityOfCargo
            println("На грузовой машине $carName доставлена $quantityOfCargo тонна груза")
        }
    }

    override fun loadingPassengers() {
        if (quantityOfPassenger) {
            passengersForTransportation = passengers
            println("В грузовой машине $carName для перевозки $passengersForTransportation пассажир")
        } else if (passengers == minNumberOfPassengers) {
            passengersForTransportation = passengers
            println("В грузовую машину $carName не загружен пассажир")
        } else if (passengers >= maxNumberOfPassengers) {
            passengersForTransportation = maxNumberOfPassengers
            println(
                "В грузовую машину $carName для перевозки загружен только " +
                        "$passengersForTransportation пассажир"
            )
        }
    }

    override fun unloadingPassengers() {
        if (quantityOfPassenger) {
            passengersForTransportation = passengers
            println("На грузовой машине $carName доставлен $passengersForTransportation пассажир")
        } else if (passengers >= maxNumberOfPassengers) {
            passengersForTransportation = maxNumberOfPassengers
            println("На грузовой машине $carName доставлен $passengersForTransportation пассажир")
        } else if (passengers == minNumberOfPassengers) {
            passengersForTransportation = passengers
            println("Грузовая машина $carName не доставила пассажира")
        }
    }
}

class PassengerCar(
    carName: String,
    maxNumberOfPassengers: Int = 3,
    minNumberOfPassengers: Int = 0,
    passengersForTransportation: Int = 0,
    passengers: Int,
    cargoTransportation: Boolean = false,
) : Car(
    carName, maxNumberOfPassengers, minNumberOfPassengers, passengersForTransportation, passengers,
    cargoTransportation = false
), moving, loadingPassenger {

    val quantityOfPassenger: Boolean = passengers <= maxNumberOfPassengers

    override fun moving() {
        if (passengers == minNumberOfPassengers) {
            passengersForTransportation = passengers
            println("Легковая машина $carName не везёт пассажиров")
        } else if (quantityOfPassenger) {
            passengersForTransportation = passengers
            println("Легковая машина $carName выехала с $passengersForTransportation пассажирами")
        } else if (passengers >= maxNumberOfPassengers) {
            passengersForTransportation = maxNumberOfPassengers
            println("Легковая машина $carName везёт только $passengersForTransportation пассажира")
        }
    }

    override fun loadingPassengers() {
        if (passengers == minNumberOfPassengers) {
            passengersForTransportation = passengers
            println("В легковую машину $carName для перевозки не размещено пассажиров")
        } else if (quantityOfPassenger) {
            passengersForTransportation = passengers
            println("В легковой машине $carName для перевозки $passengersForTransportation пассажира")
        } else if (passengers >= maxNumberOfPassengers) {
            passengersForTransportation = maxNumberOfPassengers
            println(
                "В легковую машину $carName для перевозки размещено " +
                        "только $passengersForTransportation пассажира"
            )
        }
    }

    override fun unloadingPassengers() {
        if (passengers == minNumberOfPassengers) {
            passengersForTransportation = passengers
            println("Легковая машина $carName не доставила пассажиров")
        } else if (quantityOfPassenger) {
            passengersForTransportation = passengers
            println("Легковая машина $carName доставила $passengersForTransportation пассажира")
        } else if (passengersForTransportation >= maxNumberOfPassengers) {
            passengersForTransportation = maxNumberOfPassengers
            println("Легковая машина $carName доставила только $passengersForTransportation пассажира")
        }
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