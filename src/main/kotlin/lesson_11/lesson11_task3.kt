package org.example.lesson_11

fun main() {

    println("Введите ваше имя:")
    val user1: Participant = Participant(
        userId = TODO(),
        nickName = readln(),
    )
    val add = Room()
    add.addUser(
        participant = user1
    )
    println("Выберете статус:")
    user1.textBadge = readln()

    println("Для изменения статуса введите имя:")
    user1.nickName = readln()

    println("Введите новый статус:")
    add.statusUpdate(
        nickName = user1,
        newStatus = readln(),
    )
}

class Room(
    val cover: String = "Картинка",
    val roomName: String = "Комната просто поболтать",
    val listOfParticipants: MutableList<Participant> = mutableListOf(),
) {

    fun addUser(participant: Participant) {
        val findId = listOfParticipants.contains(participant)
        if (findId) {
            listOfParticipants.add(participant)
            println("Пользователь добавлен")
        }
    }

    fun statusUpdate(nickName: Participant, newStatus: String) {
        val findNickName = listOfParticipants.contains(nickName)
        if (findNickName) {
            nickName.textBadge = newStatus
            println("Статус изменён: $newStatus")
        } else println("Статус не изменён")
    }
}

class Participant(
    var userId: Int,
    val avatar: String = "Ава",
    var nickName: String,
    var textBadge: String = "микрофон выключен",
) {
    val id = userId++
    fun statusUpdate(newStatus: String) {
        textBadge = newStatus
        println("Статус изменён на $newStatus")
    }
}