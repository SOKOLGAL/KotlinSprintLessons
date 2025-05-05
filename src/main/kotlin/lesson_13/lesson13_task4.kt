package org.example.lesson_13

fun main() {

    val newContact1 = TelephoneDirectory(
        name = readln(),
        phoneNumber = readln().toLongOrNull(),
        company = readln()
    )
    val contactList =listOf(newContact1)
    if (newContact1.phoneNumber == null) {
        println("Номер телефона не введён")
        contactList  // запись не добавляется
    }

    newContact1.contactCard()
}

class TelephoneDirectory(
    val name: String?,
    val phoneNumber: Long?,
    val company: String?,
) {
    val contactList: MutableList<String> = mutableListOf()

    fun contactCard() {
        println("- Имя: $name\n- Номер: ${phoneNumber ?: "Номер телефона не введён"}\n- Компания: ${company ?: "null"}")
    }
}