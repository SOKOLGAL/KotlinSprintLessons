package org.example.lesson_11

fun main() {

    val room = Room()
    println("Введите ваше имя:")
    val user1: Participant = Participant(
        nickName = readln(),
    )
    room.addUser(
        participant = user1
    )

    println("Выберете статус:")
    user1.textBadge = readln()

    println("Для изменения статуса введите имя:")
    val nickName = readln()
    println("Введите новый статус:")
    room.statusUpdate(
        nickName = nickName,
        newStatus = readln()
    )

}

class Room(
    val cover: String = "Картинка",
    val roomName: String = "Комната просто поболтать",
    val listOfParticipants: MutableList<Participant> = mutableListOf(),
) {
    fun addUser(participant: Participant) {
        val userId = participant.userId++
        for(i in listOfParticipants) {
            if (i.userId == userId) {
                println("Пользователь уже зарегистрирован")
            } else {
                println("Пользователь добавлен")
            }
        }
        listOfParticipants.add(participant)
    }

    fun statusUpdate(nickName: String, newStatus: String) {
        for (i in listOfParticipants) {
            if (i.nickName == nickName) {
                i.textBadge = newStatus
                println("Статус изменён: $newStatus")
            } else println("Для изменения статуса необходима регистрация")
        }
    }
}

class Participant(
    var userId: Int = 0,
    val avatar: String = "Ава",
    var nickName: String,
    var textBadge: String = "микрофон выключен",
) {
}