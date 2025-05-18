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
    var authorId = 0
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
        println(userId)
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
                println("Сообщение $message создано")
            } else if (false) {
                println("Для отправления сообщений необходимо зарегистрироваться")
            }
        }
        println(authorId)
    }

    fun printThread() {
        for (i in forumList) {
            for (j in forumMessage) {
                if (i.userId == j.authorId) {
                    println("${i.userName}: ${j.message}")
                }
            }
        }

//        for (i in forumList) {
//            println(i.userName)
//        }
//        for (i in forumMessage) {
//            println(i.message)
//        }

//        val ids = forumList.groupBy { it.userId }
//        val authorIds = forumMessage.groupBy { it.authorId }
//
//        for (id in ids) {
//            for (forumList in id.value) {
//                println(forumList.userName)
//            }
//        }
//
//        for (authorId in authorIds) {
//            for (forumMessage in authorId.value) {
//                println("${forumMessage.message}")
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