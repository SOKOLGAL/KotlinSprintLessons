package org.example.lesson_20

fun main() {
    val robot = Robot("Розалия")

    robot.say()
    robot.setModifier(robot.phrase)
    robot.say(robot.phraseInvert)

}

class Robot(
    val name: String,
) {
    var phrase: String = ""
    var phraseInvert: String = ""

    fun say(): (String) -> String {
        phrase: (String) -> String
        phrase = {
            listOf(
                Phrase.PHRASE_ONE.getPhrases(),
                Phrase.PHRASE_TWO.getPhrases(), Phrase.PHRASE_THREE.getPhrases(),
                Phrase.PHRASE_FOUR.getPhrases(), Phrase.PHRASE_FIVE.getPhrases()
            ).random()
        }.toString()
        println(phrase)
        return phrase
    }

    fun setModifier(phrase: (String) -> String): String {
        val phraseInvert = phrase.toString().reversed()
        return phraseInvert
    }

    fun say(phraseInvert: String) {
        println(phraseInvert)
    }

}

enum class Phrase() {
    PHRASE_ONE {
        override fun getPhrases(): String {
            return "Пьяный в зюзю"
        }
    },
    PHRASE_TWO {
        override fun getPhrases(): String {
            return "А был ли мальчик?"
        }
    },
    PHRASE_THREE {
        override fun getPhrases(): String {
            return "Не верь, не бойся, не проси"
        }
    },
    PHRASE_FOUR {
        override fun getPhrases(): String {
            return "Большой брат следит за тобой"
        }
    },
    PHRASE_FIVE {
        override fun getPhrases(): String {
            return "Потому что гладиолус"
        }
    };

    abstract fun getPhrases(): String
}