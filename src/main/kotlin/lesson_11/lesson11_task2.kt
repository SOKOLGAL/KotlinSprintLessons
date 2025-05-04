package org.example.lesson_11

fun main() {

    val user3: User2 = User2(
        id = 3,
        login = "LittlePrince",
        password = "Ro_Sa_Exup",
        mail = "littleprince@mail.ru",
    )
    user3.outputInUserInformation()
    println("Заполните блок о себе:")
    user3.setBio(newBio = readln())
    user3.changePassword()
    user3.outputInUserInformation()
}

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val mail: String,
    private var bio: String = "",
) {
    fun outputInUserInformation() {
        println(id)
        println(login)
        println(password)
        println(mail)
        println(bio)
    }

    fun setBio(newBio: String) {
        bio = newBio
        println("Данные обновлены")
    }

    fun changePassword() {
        println("Введите старый пароль")
        val checkPassword = readln()
        if (checkPassword == password) {
            println("Введите новый пароль")
        }
        val passwordNew = readln()
        password = passwordNew
        println("Пароль изменен, новый пароль $passwordNew!")
    }
}