package org.example.lesson_13

fun main() {

    val newContact1 = TelephoneDirectory(
        name = readln(),
        phoneNumber = readln().toLongOrNull(),
        company = readln()
    )

    if (newContact1.phoneNumber != null) {
        val contactList = listOf(newContact1)
        newContact1.contactCard()
    } else if (newContact1.phoneNumber == null) {
        println("Номер телефона не введён")
    }

}

class TelephoneDirectory(
    val name: String?,
    val phoneNumber: Long?,
    val company: String?,
) {

    fun contactCard() {
        println("- Имя: $name\n- Номер: $phoneNumber\n- Компания: $company")
    }
}