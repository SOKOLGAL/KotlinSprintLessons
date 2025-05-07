package org.example.lesson_11

fun main() {

    val user1: ForumWork = ForumWork()
    val user2: ForumWork = ForumWork()
    println("Для регистрации на ФОРУМе введите ваше имя:")
    user1.createNewUser(user1.forumList.toString())
    user1.createNewMessage()
    user2.createNewUser(user2.forumList.toString())
    user2.createNewMessage()
    user1.createNewMessage()
    user2.createNewMessage()
    user1.printThread()
    user2.printThread()
}

class ForumWork(
    ) {
    val id: Int = 0

    val forumList: MutableList<ForumMember> = mutableListOf()
    val forumMessage: MutableList<ForumMessage> = mutableListOf()

    fun createNewUser(name: String) {
        name = userName
        id += 1
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

}

class ForumMember(
    var userId: Int,
    var userName: String = readln(),
) {
    userId += 1
}

class ForumMessage(
    val authorId: Int,
    val message: String,
) {
}