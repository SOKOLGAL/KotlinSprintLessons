package org.example.lesson_11

fun main() {

    val user3: User2 = User2(
        id = 3,
        login = "LittlePrince",
        password = "Ro_Sa_Exup",
        mail = "littleprince@mail.ru",
    )

    user3.outputInUserInformation(user2 = user3)
    user3.setBio(user2 = user3)
    user3.changePassword(user2 = user3)

}

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val mail: String,
    var bio: String = "",
) {

    fun outputInUserInformation(user2: User2) {
        println(user2.id)
        println(user2.login)
        println(user2.password)
        println(user2.mail)
    }

    fun setBio(user2: User2) {
        println("Заполните блок о себе:")
        user2.bio = readln()
        println(user2.bio)
    }

    fun changePassword(user2: User2) {
        println("Для изменения пароля введите текущий пароль:")
        val password = readln()

        if (password == user2.password) {
            println("Введите новый пароль:")
            user2.password = readln()
            println("Пароль изменён")
        }
    }
}