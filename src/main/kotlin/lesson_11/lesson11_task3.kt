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
    user1.textBadge = readln()
    println("Статус изменён")

}

class Room(
    val cover: String = "Картинка",
    val roomName: String = "Комната просто поболтать",
    val listOfParticipants: MutableList<String> = mutableListOf(),
) {

    fun addUser(Participant: String): MutableList<String> {
        mutableListOf(Participant)
        return mutableListOf()

    }

    fun statusUpdate(id: Int, nickname: String, textBadge: String): String {
        val newStatus = listOfParticipants.filter { it == nickname }
        newStatus.forEach {
            textBadge
        }
        return textBadge
    }
}

class Participant(
    var id: Int,
    val avatar: String = "Ава",
    var nickname: String,
    var textBadge: String = "микрофон выключен",
) {
}