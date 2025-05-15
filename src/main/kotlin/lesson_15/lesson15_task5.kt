package org.example.lesson_15

fun main() {

    val truck1 = Truck(
        "Бычок",
        numberOfPassengers = 1,
        quantityOfCargo = 2,
    )
    val passengerCar1 = PassengerCar(
        "Ласточка",
        numberOfPassengers = 3,
    )
    val passengerCar2 = PassengerCar(
        "Волга",
        numberOfPassengers = 2,
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

    val summaryQuantityOfCargo = truck1.quantityOfCargo
    val summaryNumberOfPassengers = truck1.numberOfPassengers +
            passengerCar1.numberOfPassengers +
            passengerCar2.numberOfPassengers

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
    val quantityOfCargo: Int,
) : Car(carName, maxNumberOfPassengers, numberOfPassengers, cargoTransportation = true), moving, loadingTruck,
    loadingPassenger {

    override fun moving() {
        println(
            "Грузовая машина $carName может перевезти максимально $maxNumberOfPassengers пассажира " +
                    "и $quantityOfCargo тонн груза"
        )
    }

    override fun loadingTruck() {
        println("В грузовую машину $carName загружено $quantityOfCargo тонны груза")
    }

    override fun unloadingTruck() {
        println("Из грузовой машины $carName выгружено $quantityOfCargo тонны груза")
    }

    override fun loadingPassengers() {
        println("В грузовой машине $carName для перевозки $maxNumberOfPassengers пассажир")
    }

    override fun unloadingPassengers() {
        println("Из грузовой машины $carName выгружен $maxNumberOfPassengers пассажир")
    }
}

class PassengerCar(
    carName: String,
    maxNumberOfPassengers: Int = 3,
    numberOfPassengers: Int,
) : Car(carName, maxNumberOfPassengers, numberOfPassengers, cargoTransportation = false), moving, loadingPassenger {

    override fun moving() {
        println("Легковая машина $carName может перевезти максимально $maxNumberOfPassengers пассажира и не перевозит груз")
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