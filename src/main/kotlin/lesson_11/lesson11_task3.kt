package org.example.lesson_11

fun main() {

    println("Введите ваше имя:")
    val user1: Participant = Participant(
        id = 1,
        nickname = readln(),
    )
    println("Выберете статус:")
    user1.textBadge = readln()

    println("Для изменения статуса введите имя:")
    user1.nickname = readln()

    println("Введите новый статус:")
    val newStatus = readln()
}

class Room(
    val cover: String = "Картинка",
    val roomName: String = "Комната просто поболтать",
    val listOfParticipants: MutableList<Participant> = mutableListOf(),
) {
    fun addUser(Participant: String): MutableList<Participant> {
        listOfParticipants.add(Participant())
        return listOfParticipants
    }
    fun statusUpdate(newStatus: String) {
        val textBadge = newStatus
        println("Статус изменён на $newStatus")
    }
}

class Participant(
    var id: Int,
    val avatar: String = "Ава",
    var nickname: String,
    var textBadge: String = "микрофон выключен",
) {
    fun statusUpdate(newStatus: String) {
        textBadge = newStatus
        println("Статус изменён на $newStatus")
    }
}