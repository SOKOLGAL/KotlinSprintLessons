package org.example.lesson_11

fun main() {

    println("Для регистрации на ФОРУМе введите ваше имя:")
    val user1: ForumMember = ForumMember(
        userId = 1,
        userName = readln()
    )
    val list: ForumWork = ForumWork()
    list.createNewUser(
        ForumMember(
            userId = user1.userId,
            userName = user1.userName
        )
    )
    println("Введите ваше сообщение:")
    var messageUser1: ForumMessage = ForumMessage(
        authorId = user1.userId,
        message = readln()
    )
    list.createNewMessage(
        message = messageUser1
    )
    println("Для регистрации на ФОРУМе введите ваше имя:")
    val user2: ForumMember = ForumMember(
        userId = 2,
        userName = readln()
    )
    println("Введите ваше сообщение:")
    var messageUser2: ForumMessage = ForumMessage(
        authorId = user2.userId,
        message = readln()
    )
    list.createNewMessage(
        message = messageUser2
    )
    println("Введите ваше сообщение:")
    messageUser1 = ForumMessage(
        authorId = user2.userId,
        message = readln()
    )
    list.createNewMessage(
        message = messageUser1
    )
    println("Введите ваше сообщение:")
    messageUser2 = ForumMessage(
        authorId = user2.userId,
        message = readln()
    )
    list.createNewMessage(
        message = messageUser2
    )

    list.printThread()
}

class ForumWork(
) {
    var userId = 0
    val forumList: MutableList<ForumMember> = mutableListOf()
    val forumMessage: MutableList<ForumMessage> = mutableListOf()

    fun createNewUser(userName: ForumMember): ForumMember {
        forumList.add(userName)
        userId++
        forumList.add(userId)
        return ForumMember(userId, userName.toString())
    }

    fun createNewMessage(message: ForumMessage): ForumMessage {
        if (forumList.contains(userId)) else println("Пользователь не найден")
        val authorId = userId
        forumMessage.add(message)
        return ForumMessage(authorId, message.toString())
    }

    fun printThread() {
        val listOfUser = forumList.map {
            it.userName
        }
        val listOfMessage = forumMessage.map {
            it.message
        }
        println("${listOfUser.joinToString()}: ${listOfMessage.joinToString()}")
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