package org.example.lesson_10

//fun main() {
//
//    do {
//        newRound()
//        println("Хотите бросить кости еще раз? Введите да или нет")
//        val continuationOfGame = readln()
//    } while (continuationOfGame == "да")
//
//    getIndex()
//
//}
//
//const val NUMBER_OF_MOVES = 3
//
//fun getThrowOfDice(): Int = (1..6).random()
//
//fun newRound(): Int {
//
//    val comp = mutableListOf<Int>()
//    val player = mutableListOf<Int>()
//
//    for (i in NUMBER_OF_MOVES downTo 1) {
//
//        val moveComp = getThrowOfDice()
//        println("Сейчас ход компьютера, бросаем кости, выпало $moveComp")
//        comp.add(moveComp)
//
//        val movePlayer = getThrowOfDice()
//        println("Сейчас ход игрока, бросаем кости, выпало $movePlayer")
//        player.add(movePlayer)
//
//    }
//
//    val sumComp = comp.sum()
//    val sumPlayer = player.sum()
//
//    if (sumComp > sumPlayer) {
//        println("Победила машина")
//    } else if (sumComp < sumPlayer) {
//        println("Победило человечество")
//    } else println("Победила дружба")
//return sumPlayer
//}
//
//fun getIndex(sumComp: Int, sumPlayer: Int): Int {
//    val numberOfWins = mutableListOf<Int>()
//        if (sumComp < sumPlayer && sumPlayer > 0) {
//        numberOfWins.add(sumPlayer)
//    }
//    val index = numberOfWins.size
//
//    println("Игра завершена. Выигрышных партий $index")
//
//    return index
//}