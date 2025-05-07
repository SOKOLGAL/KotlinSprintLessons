package org.example.lesson_13

fun main() {

    val newContact1 = TelephoneBook(phoneNumber = readln())
    val number: Long? = newContact1.phoneNumber.toLongOrNull()
    if (number == null) {
        println("NumberFormatException")
    }

}

class TelephoneBook(
    val name: String = "",
    var phoneNumber: String,
    val company: String = "",
) {
}