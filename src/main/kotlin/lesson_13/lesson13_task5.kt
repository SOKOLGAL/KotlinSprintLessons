package org.example.lesson_13

fun main() {

    val newContact1 = TelephoneBook(phoneNumber = readln())
    val num = try {
        val number = newContact1.phoneNumber.toLong()
    } catch (e: Exception) {
        println(e.message)
    }

}

class TelephoneBook(
    val name: String = "",
    var phoneNumber: String,
    val company: String = "",
) {
}