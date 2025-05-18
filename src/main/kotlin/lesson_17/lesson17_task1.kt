package org.example.lesson_17

fun main() {

    val quiz = Quiz()
    println(quiz.question)
    println(quiz.answer)

}

class Quiz(
) {
    val question: String = "Сколько вы знаете времен года?"
        get() = field

    var answer: String = "4 времени года: зима, весна, лето, осень"
        get() = field
        set(value: String) {
            field = value
        }
}