package org.example.lesson_10

fun main() {

    val comp = mutableListOf<Int>()
    val player = mutableListOf<Int>()

    for (i in NUMBER_MOVES downTo 1) {
        val moveComp = getThrowOfDice()
        println("Сейчас ход компьютера, бросаем кости, выпало $moveComp")
        comp.add(moveComp)

        val movePlayer = getThrowOfDice()
        println("Сейчас ход игрока, бросаем кости, выпало $movePlayer")
        player.add(movePlayer)
    }

    val sumComp = comp.sum()
    val sumPlayer = player.sum()

    if (sumComp > sumPlayer) {
        println("Победила машина")
    } else if (sumComp < sumPlayer) {
        println("Победило человечество")
    } else
        println("Победила дружба")

}

const val NUMBER_MOVES = 3

//fun getThrowOfDice(): Int {
//    val number = (1..6).random()
//    return number
//}

fun getThrowOfDice(): Int = (1..6).random()