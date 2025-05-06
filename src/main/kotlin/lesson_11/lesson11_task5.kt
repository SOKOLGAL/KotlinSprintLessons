package org.example.lesson_11

fun main() {

    val user1: ForumWork = ForumWork()
    val user2: ForumWork = ForumWork()
    user1.createNewUser(user1.forumList.toString())
    user1.createNewMessage()
    user2.createNewUser(user2.forumList.toString())
    user2.createNewMessage()
    user1.createNewMessage()
    user2.createNewMessage()
    user1.printThread()
    user2.printThread()
}

class ForumWork() {
    val forumList: MutableList<ForumMember> = mutableListOf()
    val forumMessage: MutableList<ForumMessage> = mutableListOf()

    fun createNewUser(userName: String) {
        println("Для регистрации на ФОРУМе введите ваше имя:")
        forumList.add(ForumMember())
    }

    fun createNewMessage() {
        val findUser = forumList.find {
            it.userId
        }
        if (findUser == userId) {
            println("Введите ваше сообщение:")
            val message = readln()
            forumMessage.add(message)
        } else println("Пользователь не найден")
    }

    fun printThread() {
        val findUser = forumList.map {
            it.userName
        }
        val findMessage = forumMessage.map {
            it.message
        }
        println("$findUser: $findMessage")

        findUser.forEach { println("$findUser: $findMessage")}
    }
//    userName: String, message: ForumMessage
}

class ForumMember(
    var userId: Int = (1..1000).random(),
    var userName: String = readln(),
) {
}

class ForumMessage(
    val authorId: Int,
    val message: String,
) {
}