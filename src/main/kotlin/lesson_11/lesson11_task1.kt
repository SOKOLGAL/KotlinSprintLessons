package org.example.lesson_11

fun main() {

    val user1: User = User(
        id = 1,
        login = "LittlePrince",
        password = "Ro_Sa_Exup",
        mail = "littleprince@mail.ru",
    )

    val user2: User = User(
        id = 2,
        login = "Helen_1980",
        password = "NeLeH_98",
        mail = "Helen@yandex.ru",
    )

    println(user1.id)
    println(user1.login)
    println(user1.password)
    println(user1.mail)
    println()

    println(user2.id)
    println(user2.login)
    println(user2.password)
    println(user2.mail)

}

class User(
    val id: Int,
    val login: String,
    val password: String,
    val mail: String,
) {

}