package org.example.lesson_10

fun main() {

    val sumPlayerWin = mutableListOf<Int>()

    do {
        val moveComp = getThrowOfDice()
        println("Сейчас ход компьютера, бросаем кости, выпало $moveComp")

        val movePlayer = getThrowOfDice()
        println("Сейчас ход игрока, бросаем кости, выпало $movePlayer")

        when {
            (moveComp > movePlayer) -> println("Победила машина")
            (moveComp < movePlayer) -> println("Победило человечество")
            else -> println("Победила дружба")
        }

        if (moveComp < movePlayer) {
            sumPlayerWin.add(1)
        }

        val continuationOfGame = newRound()

    } while (continuationOfGame == "да")

    println("Игра завершена. Выигрышных партий ${sumPlayerWin.sum()}")

}

fun getThrowOfDice(): Int = (1..6).random()

fun newRound(): String {

    println("Хотите бросить кости еще раз? Введите да или нет")

    val continuationOfGame = readln()

    return continuationOfGame
}