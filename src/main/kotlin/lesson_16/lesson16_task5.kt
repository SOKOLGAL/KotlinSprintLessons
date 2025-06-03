package org.example.lesson_16

fun main() {

    val player = Player()

    println(
        "Игрок ${player.name} начинает бой"
    )

    player.getDamage()
    player.getDamage()
    player.getTreatment()
    player.getDamage()
    player.getDamage()
    player.getTreatment()
    player.getDamage()
    player.getDamage()
    player.getTreatment()
    player.getDamage()
    player.getDamage()
    player.getTreatment()

}

class Player() {
    val name: String = "Непобедимый"
    private var health: Int = 100
    var impactForce: Int = 25

    fun getDamage() {
        if (health >= 20) {
            println("Игрок $name получил урон")
            val lossOfHealth = health - impactForce
            health = lossOfHealth
            println("Уровень здоровья у игрока $name равен $health")
            killing()
        }
    }

    fun getTreatment() {
        if (health >= 20) {
            println("Игрок $name получил лечение")
            val receiveTreatment = health + TREATMENT
            health = receiveTreatment
            println("Уровень здоровья у игрока $name равен $health")
        }
    }

    private fun killing() {
        if (health <= 15) {
            impactForce = 0
            health = 0
            println(
                "Уровень здоровья у игрока $name равен $health, сила удара " +
                        "равна $impactForce - игрок убит"
            )
        }
    }
}

const val TREATMENT = 10