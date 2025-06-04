package org.example.lesson_22

fun main() {

    val regularBook1 = RegularBook("Мастер и Маргарита", "Булгаков М. А.")
    val regularBook2 = RegularBook("Мастер и Маргарита", "Булгаков М. А.")
    val dataBook1 = DataBook("Мастер и Маргарита", "Булгаков М. А.")
    val dataBook2 = DataBook("Мастер и Маргарита", "Булгаков М. А.")

    println(regularBook1 == regularBook2)
//    TODO для class RegularBook сравниваются ссылки на объекты в памяти
    println(dataBook1 == dataBook2)
//    TODO для data class DataBook сравниваются проинициализированные данные

}

class RegularBook(
    val name: String,
    val author: String,
) {}

data class DataBook(
    val name: String,
    val author: String,
) {}