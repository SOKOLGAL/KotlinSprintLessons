package org.example.lesson_22

fun main() {

    val ordinaryBook = OrdinaryBook("Мастер и Маргарита", "Булгаков М. А.")
    val dataRegularBook = DataRegularBook("Мастер и Маргарита", "Булгаков М. А.")

    println(ordinaryBook)
//    TODO для class OrdinaryBook переопредилила стандартный toString(), иначе
//     в консоль выводится строковое представление по умолчанию
    println(dataRegularBook)
//    TODO для data class DataRegularBook не нужно тело класса

}

class OrdinaryBook(
    val name: String,
    val author: String,
) {
    override fun toString(): String {
        return "OrdinaryBook(name='$name', author='$author')"
    }
}

data class DataRegularBook(
    val name: String,
    val author: String,
) {}