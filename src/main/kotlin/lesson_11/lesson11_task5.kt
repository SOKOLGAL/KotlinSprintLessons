package org.example.lesson_11

fun main() {

    val forumWork: ForumWork = ForumWork()
    println("Для регистрации на ФОРУМе введите ваше имя:")
    val user1: ForumMember = ForumMember(
        userName = forumWork.createNewUser(readln()).toString()
    )
    println("Введите ваше сообщение:")
    val userMessage1: ForumMessage = ForumMessage(
        message = readln()
    )
    forumWork.createNewMessage(
        userId = user1.userId
    )
    println("Введите ваше сообщение:")
    userMessage1.message = readln()
    forumWork.createNewMessage(
        userId = user1.userId
    )
    println("Для регистрации на ФОРУМе введите ваше имя:")
    val user2: ForumMember = ForumMember(
        userName = forumWork.createNewUser(readln()).toString()
    )
    println("Введите ваше сообщение:")
    val userMessage2: ForumMessage = ForumMessage(
        message = readln()
    )
    forumWork.createNewMessage(
        userId = user2.userId
    )
    println("Введите ваше сообщение:")
    userMessage2.message = readln()
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

    fun createNewUser(userName: String): MutableList<ForumMember> {
        val id by lazy { userId++ }
        forumList.add(
            ForumMember(
                userId = userId++,
                userName = userName
            )
        )
        println("Пользователь $userName создан")
        return forumList
    }

    fun createNewMessage(userId: Int): MutableList<ForumMessage> {
        for (i in forumList) {
            if (i.userId == userId) {
                println("Введите ваше сообщение:")
                message = readln()
                println("Сообщение $message создано")
            } else println("Для отправления сообщений необходимо зарегистрироваться")
        }
        forumMessage.add(
            ForumMessage(
                authorId = userId,
                message = message
            )
        )
        return forumMessage
    }

    fun printThread() {
        println(forumList.size)
        println(forumMessage.size)
        val listOfUser = forumList.map {
            it.userName
        }
        val listOfMessage = forumMessage.map {
            it.message
        }
        for (i in 4 downTo 1) {
            println("${listOfUser.joinToString()}: ${listOfMessage.joinToString()}")
        }
        println("${listOfUser.joinToString()}: ${listOfMessage.joinToString()}")
        listOfUser.forEach { println(it) }
        listOfMessage.forEach { println(it) }
        println("${forumList.forEach { println(it) }}: ${forumMessage.forEach { println(it) }}")
        forumList.forEach { println(it.toString()) }
        forumMessage.forEach { println(it.toString()) }
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
    val id by lazy { authorId++ }
}