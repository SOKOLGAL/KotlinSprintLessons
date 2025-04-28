package org.example.lesson_11

fun main() {

    val user3: User2 = User2(
        id = 3,
        login = "LittlePrince",
        password = "Ro_Sa_Exup",
        mail = "littleprince@mail.ru",
    )

    user3.outputInUserInformation()
    user3.setBio()
    user3.changePassword()

}

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val mail: String,
    var bio: String = "",
) {

    fun outputInUserInformation(user3: User2) {
        println(user3.id)
        println(user3.login)
        println(user3.password)
        println(user3.mail)
    }

    fun setBio(user3: User2) {
        println("Заполните блок о себе:")
        user3.bio = readln()
        println(user3.bio)
    }

    fun changePassword(user3: User2) {
        println("Для изменения пароля введите текущий пароль:")
        val password = readln()

        if (password == user3.password) {
            println("Введите новый пароль:")
            user3.password = readln()
            println("Пароль изменён")
        }
    }
}