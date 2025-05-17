package org.example.lesson_11

fun main() {

    val forumWork: ForumWork = ForumWork()
    println("Для регистрации на ФОРУМе введите ваше имя:")
    val user1: ForumMember = ForumMember(
        userName = readln()
    )
    forumWork.createNewUser(
        userName = user1.userName
    )
    forumWork.createNewMessage(
        userId = user1.userId
    )
    forumWork.createNewMessage(
        userId = user1.userId
    )

    println("Для регистрации на ФОРУМе введите ваше имя:")
    val user2: ForumMember = ForumMember(
        userName = readln()
    )
    forumWork.createNewUser(
        userName = user2.userName
    )
    forumWork.createNewMessage(
        userId = user2.userId
    )
    forumWork.createNewMessage(
        userId = user2.userId
    )

    forumWork.printThread()
}

class ForumWork(
) {
    var userId = 0
    var message = ""
    val forumList: MutableList<ForumMember> = mutableListOf()
    val forumMessage: MutableList<ForumMessage> = mutableListOf()

    fun createNewUser(userName: String) {
        forumList.add(
            ForumMember(
                userId = userId++,
                userName = userName
            )
        )
        println("Пользователь $userName создан")
    }

    fun createNewMessage(userId: Int) {
        var authorId = 0
        for (i in forumList) {
            if (i.userId == userId) {
                println("Введите ваше сообщение:")
                message = readln()
                println("Сообщение $message создано")
            } else {
                println("Для отправления сообщений необходимо зарегистрироваться")
            }
        }
        forumMessage.add(
            ForumMessage(
                authorId = userId,
                message = message
            )
        )
    }

    fun printThread() {
        for (i in forumList) {
//            val message = forumMessage
            println("${i.userName}: ${message}")
        }

//        for (i in forumList) {
//            for (j in forumMessage) {
//                println("${i.userName}: ${j.message}")
//            }
//        }
    }
}

class ForumMember(
    var userId: Int = 0,
    val userName: String,
) {
}

class ForumMessage(
    var authorId: Int = 0,
    var message: String,
) {
}