package org.example.lesson_15

fun main() {

    val truck1 = Truck(
        carName = "Бычок",
        numberOfPassengers = 1,
        quantityOfCargo = 1,
    )
    val passengerCar1 = PassengerCar(
        carName = "Ласточка",
        numberOfPassengers = 3,
    )
    val passengerCar2 = PassengerCar(
        carName = "Волга",
        numberOfPassengers = 2
    )
    val truck2 = Truck(
        carName = "Камаз",
        numberOfPassengers = 0,
        quantityOfCargo = 1
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
    val summaryNumberOfPassengers = truck1.numberOfPassengers +
            passengerCar1.numberOfPassengers +
            passengerCar2.numberOfPassengers + truck2.numberOfPassengers

    println(
        "Всего перевезено $summaryQuantityOfCargo тонны груза и" +
                " $summaryNumberOfPassengers пассажиров"
    )

}

abstract class Car(
    val carName: String,
    val maxNumberOfPassengers: Int,
    val minNumberOfPassengers: Int,
    var numberOfPassengers: Int,
    val cargoTransportation: Boolean,
) {
}

class Truck(
    carName: String,
    maxNumberOfPassengers: Int = 1,
    minNumberOfPassengers: Int = 0,
    numberOfPassengers: Int,
    val maxQuantityOfCargo: Int = 2,
    var minQuantityOfCargo: Int = 0,
    var quantityOfCargo: Int,
) : Car(
    carName, maxNumberOfPassengers, minNumberOfPassengers, numberOfPassengers,
    cargoTransportation = true
), moving, loadingTruck, loadingPassenger {

    val cargo: Boolean = quantityOfCargo <= maxQuantityOfCargo
    val passenger: Boolean = numberOfPassengers <= maxNumberOfPassengers

    override fun moving() {
        if (quantityOfCargo == minQuantityOfCargo) {
            println(
                "Грузовая машина $carName выехала без груза"
            )
        } else if (cargo) {
            println("Грузовая машина $carName везёт груз: ${quantityOfCargo}т")
        } else if (quantityOfCargo >= maxQuantityOfCargo) {
            println(
                "Грузовая машина $carName везёт груз: ${quantityOfCargo}т"
            )
        }

        if (numberOfPassengers == minNumberOfPassengers) {
            println("Грузовая машина $carName выехала без пассажиров")
        } else if (numberOfPassengers >= maxNumberOfPassengers) {
            println(
                "Грузовая машина $carName везёт пассажиров: $numberOfPassengers"
            )
        } else if (passenger) {
            println("Грузовая машина $carName везёт пассажиров: $numberOfPassengers")
        }
    }

    override fun loadingTruck() {
        if (quantityOfCargo == minQuantityOfCargo) {
            println("В грузовую машину $carName не загружен груз")
        } else if (cargo) {
            println("В грузовую машину $carName загружен груз: ${quantityOfCargo}т")
        } else if (quantityOfCargo >= maxQuantityOfCargo) {
            quantityOfCargo = maxQuantityOfCargo
            println("В грузовую машину $carName загружено груза только: ${quantityOfCargo}т")
        }
    }

    override fun unloadingTruck() {
        if (quantityOfCargo == minQuantityOfCargo) {
            println("Грузовая машина $carName не доставила груз")
        } else if (cargo) {
            println("На грузовой машине $carName доставлена $quantityOfCargo тонна груза")
        } else if (quantityOfCargo >= maxQuantityOfCargo) {
            quantityOfCargo = maxQuantityOfCargo
            println("На грузовой машине $carName доставлена $quantityOfCargo тонна груза")
        }
    }

    override fun loadingPassengers() {
        if (numberOfPassengers == minNumberOfPassengers) {
            println("В грузовую машину $carName не загружен пассажир")
        } else if (passenger) {
            println("В грузовой машине $carName для перевозки $numberOfPassengers пассажир")
        } else if (numberOfPassengers >= maxNumberOfPassengers) {
            numberOfPassengers = maxNumberOfPassengers
            println(
                "В грузовую машину $carName для перевозки загружен только " +
                        "$numberOfPassengers пассажир"
            )
        }
    }

    override fun unloadingPassengers() {
        if (numberOfPassengers == minNumberOfPassengers) {
            numberOfPassengers = minNumberOfPassengers
            println("Грузовая машина $carName не доставила пассажира")
        } else if (passenger) {
            println("На грузовой машине $carName доставлен $numberOfPassengers пассажир")
        } else if (numberOfPassengers >= maxNumberOfPassengers) {
            numberOfPassengers = maxNumberOfPassengers
            println("На грузовой машине $carName доставлен $numberOfPassengers пассажир")
        }
    }
}

class PassengerCar(
    carName: String,
    maxNumberOfPassengers: Int = 3,
    minNumberOfPassengers: Int = 0,
    numberOfPassengers: Int,
    cargoTransportation: Boolean = false,
) : Car(
    carName, maxNumberOfPassengers, minNumberOfPassengers, numberOfPassengers,
    cargoTransportation = false
), moving, loadingPassenger {

    val passenger: Boolean = numberOfPassengers <= maxNumberOfPassengers

    override fun moving() {
        if (numberOfPassengers == 0) {
            println("Легковая машина $carName не везёт пассажиров")
        } else if (passenger) {
            println("Легковая машина $carName выехала с $numberOfPassengers пассажирами")
        } else if (numberOfPassengers >= maxNumberOfPassengers) {
            numberOfPassengers = maxNumberOfPassengers
            println("Легковая машина $carName везёт только $numberOfPassengers пассажира")
        }
    }

    override fun loadingPassengers() {
        if (numberOfPassengers == 0) {
            println("В легковую машину $carName для перевозки не размещено пассажиров")
        } else if (passenger) {
            println("В легковой машине $carName для перевозки $numberOfPassengers пассажира")
        } else if (numberOfPassengers >= maxNumberOfPassengers) {
            numberOfPassengers = maxNumberOfPassengers
            println(
                "В легковую машину $carName для перевозки размещено " +
                        "только $maxNumberOfPassengers пассажира"
            )
        }
    }

    override fun unloadingPassengers() {
        if (numberOfPassengers == 0) {
            println("Легковая машина $carName не доставила пассажиров")
        } else if (passenger) {
            println("Легковая машина $carName доставила $numberOfPassengers пассажира")
        } else if (numberOfPassengers >= maxNumberOfPassengers) {
            println("Легковая машина $carName доставила только $numberOfPassengers пассажира")
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