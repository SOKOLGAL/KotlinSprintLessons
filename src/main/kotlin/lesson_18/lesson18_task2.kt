package org.example.lesson_18

fun main() {

    val sidesDice1 = FourSidesDice()
    val sidesDice2 = SixSidesDice()
    val sidesDice3 = EightSidesDice()

    val list = arrayOf<Dice>(sidesDice1, sidesDice2, sidesDice3)

    showAllDiceRolls(list)

}

fun showAllDiceRolls(dice: Array<Dice>) {
    dice.forEach {
        it.diceThrower()
    }
}

abstract class Dice(
    open val numberOfFaces: Int,
) {
    open fun diceThrower() {}
}

class FourSidesDice(
    override val numberOfFaces: Int = 4,
) : Dice(numberOfFaces) {

    override fun diceThrower() {
        val drop: Int = (1..numberOfFaces).random()
        println("Выпало $drop")
    }
}

class SixSidesDice(
    override val numberOfFaces: Int = 6,
) : Dice(numberOfFaces) {

    override fun diceThrower() {
        val drop: Int = (1..numberOfFaces).random()
        println("Выпало $drop")
    }
}

class EightSidesDice(
    override val numberOfFaces: Int = 8,
) : Dice(numberOfFaces) {

    override fun diceThrower() {
        val drop: Int = (1..numberOfFaces).random()
        println("Выпало $drop")
    }
}