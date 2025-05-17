package org.example.lesson_15

fun main() {

    val truck1 = Truck(
        carName = "Бычок",
        numberOfPassengers = 13,
        quantityOfCargo = 4,
    )
    val passengerCar1 = PassengerCar(
        carName = "Ласточка",
        numberOfPassengers = 12,
    )
    val passengerCar2 = PassengerCar(
        carName = "Волга",
        numberOfPassengers = 23
    )
    val truck2 = Truck(
        carName = "Камаз",

        numberOfPassengers = 10,

        quantityOfCargo = 5
    )

    truck1.moving()
    truck1.loadingTruck()
    truck1.loadingPassengers()
    truck1.unloadingTruck()
    truck1.unloadingPassengers()
    passengerCar1.moving()
    passengerCar1.loadingPassengers()
    passengerCar1.unloadingPassengers()
    passengerCar2.moving()
    passengerCar2.loadingPassengers()
    passengerCar2.unloadingPassengers()
    truck2.moving()
    truck2.loadingTruck()
    truck2.loadingPassengers()
    truck2.unloadingTruck()
    truck2.unloadingPassengers()

    val summaryQuantityOfCargo = truck1.quantityOfCargo+ truck2.quantityOfCargo
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
    val numberOfPassengers: Int,
    val cargoTransportation: Boolean,
) {
}

class Truck(
    carName: String,
    maxNumberOfPassengers: Int = 1,
    numberOfPassengers: Int,
    val maxQuantityOfCargo: Int = 2,
    val quantityOfCargo: Int,
) : Car(carName, maxNumberOfPassengers, numberOfPassengers, cargoTransportation = true), moving, loadingTruck,
    loadingPassenger {

    override fun moving() {
        if (quantityOfCargo <= maxQuantityOfCargo) {
            println("Для перевозки в грузовую машину $carName загружено $quantityOfCargo тонны груза")
        } else {
            println(
                "Грузовая машина $carName может перевезти максимально $maxQuantityOfCargo тонны груза"
            )
        }
        if (numberOfPassengers <= maxNumberOfPassengers) {
            println("Для пеервозки в грузовую машину $carName загружен $numberOfPassengers пассажир")
        } else {
            println(
                "Грузовая машина $carName может перевезти максимально $maxNumberOfPassengers пассажира"
            )
        }
    }


    override fun loadingTruck() {
        println("В грузовую машину $carName загружено $quantityOfCargo тонны груза")
    }

    override fun unloadingTruck() {
        println("Из грузовой машины $carName выгружено $quantityOfCargo тонны груза")
    }

    override fun loadingPassengers() {
        println("В грузовой машине $carName для перевозки $numberOfPassengers пассажир")
    }

    override fun unloadingPassengers() {
        println("Из грузовой машины $carName выгружен $numberOfPassengers пассажир")
    }
}

class PassengerCar(
    carName: String,
    maxNumberOfPassengers: Int = 3,
    numberOfPassengers: Int,
) : Car(carName, maxNumberOfPassengers, numberOfPassengers, cargoTransportation = false), moving, loadingPassenger {

    override fun moving() {
        if (numberOfPassengers <= maxNumberOfPassengers) {
            println("Для перевозки в легковую машину $carName загружено $numberOfPassengers пассажиров")
        } else {
            println(
                "Легковая машина $carName может перевезти максимально $maxNumberOfPassengers пассажира"
            )
        }
    }

    override fun loadingPassengers() {
        println("В легковой машине $carName для перевозки $numberOfPassengers пассажира")
    }

    override fun unloadingPassengers() {
        println("Легковая машина $carName перевезла $numberOfPassengers пассажира")
    }
}

interface moving {
    fun moving() {}
}

interface loadingTruck {
    fun loadingTruck() {}
    fun unloadingTruck() {}
}

interface loadingPassenger {
    fun loadingPassengers() {}
    fun unloadingPassengers() {}
}