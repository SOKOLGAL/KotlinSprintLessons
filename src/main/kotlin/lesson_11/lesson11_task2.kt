package org.example.lesson_11

fun main() {

    val user3: User2 = User2(
        id = 3,
        login = "LittlePrince",
        password = "Ro_Sa_Exup",
        mail = "littleprince@mail.ru",
    )

    user3.outputInUserInformation()
    user3.bio = readln()
    println("Для изменения пароля введите текущий пароль:")
    val passwordCurrent: String = readln()
    if (passwordCurrent == user3.password) {
        println("Введите новый пароль:")
        user3.password = readln()
        println("Пароль изменён")
    }

    user3.changePassword(readln())
    user3.outputInUserInformation()

}

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val mail: String,
    var bio: String = "",
) {

    fun outputInUserInformation() {
        println(id)
        println(login)
        println(password)
        println(mail)
        println(bio)
    }

    fun setBio(bio: String) {
        println("Заполните блок о себе:")
           }

    fun changePassword(password: String): String {
        return password
    }
}