package org.example.lesson_13

fun main() {
    val newContact1 = TelephoneDirectoryData(
        name = readln(),
        phoneNumber = readln().toLong(),
        company = readln()
    )
    newContact1.contactCard()
}

class TelephoneDirectoryData(
    val name: String?,
    val phoneNumber: Long?,
    val company: String?,
) {
    fun contactCard() {
        println(name)
        println(phoneNumber)
        println(company)
    }
}