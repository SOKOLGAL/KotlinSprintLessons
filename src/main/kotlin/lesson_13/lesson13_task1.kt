package org.example.lesson_13

fun main() {
    val newContact1 = NewContact(
        name = readln(),
        phoneNumber = readln().toLong(),
        company = readln()
    )
    newContact1.contactCard()
}

class NewContact(
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

//class TelephoneDirectoryData(
//    val listOfNewContact: MutableList<NewContact> = mutableListOf(),
//) {
//
//    fun addNewContact(
//    ) {
//        listOfNewContact.add(
//            NewContact(
//                name = TODO(),
//                phoneNumber = TODO(),
//                company = TODO()
//            )
//        )
//    }
//}