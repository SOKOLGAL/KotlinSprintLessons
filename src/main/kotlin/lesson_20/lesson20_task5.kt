package org.example.lesson_20

fun main() {
    val robot = Robot("Розалия")

    robot.say()
    robot.setModifier(modifier = )
    robot.say(modifier = )

}

class Robot(
    val name: String,
) {
    var phrase: String = ""
    var listOfPhrase = listOf(
        "Пьяный в зюзю",
        "А был ли мальчик?",
        "Не верь, не бойся, не проси",
        "Большой брат следит за тобой",
        "Потому что гладиолус"
    )
    private var modifier: (String) -> String = { it }

    fun say(): String {
        phrase = listOfPhrase.random()
        println(phrase)
        return phrase
    }

    fun setModifier(modifier: (String) -> String) {
        this.modifier = {
            phrase.reversed()
        }
    }

    fun say(modifier: (String) -> String) {
        println(modifier)
    }
}