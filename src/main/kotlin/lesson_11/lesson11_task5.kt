package org.example.lesson_11

fun main() {

    val forumWork: ForumWork = ForumWork()

    println("Для регистрации на ФОРУМе введите ваше имя:")

    val user1: ForumMember = ForumMember(
        userId = forumWork.userId,
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
        userId = forumWork.userId,
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
    val forumList: MutableList<ForumMember> = mutableListOf()
    val forumMessage: MutableList<ForumMessage> = mutableListOf()
    var userId = 0

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
        for (i in forumList) {
            if (i.userId == userId) {
                println("Введите ваше сообщение:")
                forumMessage.add(
                    ForumMessage(
                        authorId = userId,
                        message = readln()
                    )
                )
                println("Сообщение создано")
            } else {
                println("Для отправления сообщений необходимо зарегистрироваться")
            }
        }
    }

    fun printThread() {
        for (i in forumList) {
            for (j in forumMessage) {
                when {
                    i.userId == j.authorId -> println("${i.userName}: ${j.message}")
                }
            }
        }
    }
}

class ForumMember(
    var userId: Int,
    val userName: String,
) {
}

class ForumMessage(
    var authorId: Int = 0,
    var message: String,
) {
}