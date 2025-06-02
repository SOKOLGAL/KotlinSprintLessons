package org.example.lesson_20

fun main() {
    val robot = Robot("Розалия")

    robot.say()
    robot.setModifier { str: String ->
        str.reversed()
    }
    robot.say()

}

class Robot(
    val name: String,
) {
    var listOfPhrase = listOf(
        "Пьяный в зюзю",
        "А был ли мальчик?",
        "Не верь, не бойся, не проси",
        "Большой брат следит за тобой",
        "Потому что гладиолус"
    )
    private var modifier: (String) -> String = { it }

    fun say() {
        println(listOfPhrase.random())
    }

    fun setModifier(modifier: (String) -> String) {
        this.modifier = modifier
    }

    fun say() {
        println(modifier(listOfPhrase.random()))
    }
}