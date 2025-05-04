package org.example.lesson_11

fun main() {

}

class ForumWork() {
    val forumList: MutableList<ForumMember> = mutableListOf()
    val forumMessage: MutableList<ForumMessage> = mutableListOf()

    fun createNewUser(userName: String): ForumMember {
        println("Для регистрации на ФОРУМе введите ваше имя:")
        forumList.add(ForumMember(userId = (1..1000).random(), userName = readln()))
        return ForumMember(userId = (1..1000).random(), userName = println().toString())
    }

    fun createNewMessage(userId: Int): ForumMessage {
        return
    }

    fun printThread(userName: String, message: String) {
        return println("$userName: $message")
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