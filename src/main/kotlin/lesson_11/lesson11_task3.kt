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
    user1.statusUpdate(readln())

}

class Room(
    val cover: String = "Картинка",
    val roomName: String = "Комната просто поболтать",
    val listOfParticipants: MutableList<Participant> = mutableListOf(),
) {
    fun addUser(Participant: String) {
        listOfParticipants.plus(Participant)
    }

    fun statusUpdate(id: Int, newStatus: String) {

        val findId = listOfParticipants.find { id -> id.equals(id) }
        if (findId != null) {
            findId.textBadge = newStatus
        }
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