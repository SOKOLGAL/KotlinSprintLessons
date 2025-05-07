package org.example.lesson_11

fun main() {

    val user1: ForumWork = ForumWork()
    val user2: ForumWork = ForumWork()
    println("Для регистрации на ФОРУМе введите ваше имя:")
    user1.createNewUser(readln())
    println("Введите ваше сообщение:")
    user1.createNewMessage(readln())
    println("Для регистрации на ФОРУМе введите ваше имя:")
    user2.createNewUser(readln())
    println("Введите ваше сообщение:")
    user2.createNewMessage(readln())
    println("Введите ваше сообщение:")
    user1.createNewMessage(readln())
    println("Введите ваше сообщение:")
    user2.createNewMessage(readln())
    user1.printThread()
    user2.printThread()
}

class ForumWork(
) {
    var userId = 0
    val forumList: MutableList<ForumMember> = mutableListOf()
    val forumMessage: MutableList<ForumMessage> = mutableListOf()

    fun createNewUser(userName: String): ForumMember {
        forumList.plus(userName)
        userId++
        forumList.plus(userId)
        return ForumMember(userId, userName)
    }
    fun createNewMessage(message: String): ForumMessage {
        if (forumList.contains(userId))  else println("Пользователь не найден")
        val authorId = userId
        forumMessage.plus(authorId)
        forumMessage.plus(message)
        return ForumMessage(authorId, message)
    }
    fun printThread() {

        val listOfUser = forumList.map {
            it.userName
        }
        val listOfMessage = forumMessage.map {
            it.message
        }
        println("$listOfUser: $listOfMessage")
    }
}

class ForumMember(
    val userId: Int,
    val userName: String = readln(),
) {
}

class ForumMessage(
    val authorId: Int,
    val message: String,
) {
}