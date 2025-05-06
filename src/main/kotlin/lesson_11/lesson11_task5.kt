package org.example.lesson_11

fun main() {

    val user1: ForumWork = ForumWork()
    val user2: ForumWork = ForumWork()
    user1.createNewUser(readln())
   val user1Message = readln()
    user2.createNewUser(readln())
    val user2Message = readln()

}

class ForumWork() {
    val forumList: MutableList<ForumMember> = mutableListOf()
    val forumMessage: MutableList<ForumMessage> = mutableListOf()

    fun createNewUser(userName: String) {
        println("Для регистрации на ФОРУМе введите ваше имя:")
        forumList.add(ForumMember(userId = (1..1000).random(), userName = readln()))
          }

    fun createNewMessage(userId: Int) {
        val findUser= forumList.map {
        it.userId
    }
        if (userId in findUser) {
            println("Введите ваше сообщение:")
            val message: ForumMessage = readln()
            forumMessage.add(message)
        } else println("Пользователь не найден")
    }

    fun printThread(userName: String, message: ForumMessage) {
        val findUser= forumList.map {
            it.userName
        }
        val findMessage= forumMessage.map {
            it.message
        }
        println("$findUser: $findMessage")
    }
}

class ForumMember(
    var userId: Int,
    var userName: String,
) {
}

class ForumMessage(
    val authorId: Int,
    val message: String,
) {
}