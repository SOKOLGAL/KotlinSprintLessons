package org.example.lesson_11

fun main() {

    val room = Room()
    println("Введите ваше имя:")
    val user1: Participant = Participant(
        nickName = readln(),
    )
    println("Выберете статус:")
    user1.status(
        nickName = user1,
        textBadge = readln()
    )

    println("Для изменения статуса введите имя:")
    val nickNameStatus = readln()

    println("Введите новый статус:")
    room.statusUpdate(
        nickName = nickNameStatus,
        newStatus = readln()
    )
}

class Room(
    val cover: String = "Картинка",
    val roomName: String = "Комната просто поболтать",
    val listOfParticipants: MutableList<Participant> = mutableListOf(),
) {

    fun addUser(participant: Participant): MutableList<Participant> {
        val findId = listOfParticipants.contains(participant)
        if (!findId) {
            listOfParticipants.add(participant)
            println("Пользователь добавлен")
        } else println("Такой пользователь уже зарегистрирован")
        return listOfParticipants
    }

    fun statusUpdate(nickName: String, newStatus: String) {
        val findNickName = listOfParticipants.contains(nickName)
        if (findNickName) {
            nickName.textBadge = newStatus
            println("Статус изменён: $newStatus")
        } else {
            println("Статус не изменён")
        }
    }
}

class Participant(
    var userId: Int = 0,
    val avatar: String = "Ава",
    var nickName: String,
    var textBadge: String = "микрофон выключен",
) {
    val id by lazy { userId++ }
    fun status(nickName: Participant, textBadge: String) {
        println("Статус добавлен")
    }
}