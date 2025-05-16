package org.example.lesson_16

fun main() {

    val player = Player()
    println(
        "Игрок ${player.name} начинает бой с уровнем " +
                "здоровья: ${player.health} и силой удара: ${player.impactForce}"
    )
    player.takingDamage()
    player.takingDamage()
    player.receivingTreatment()
    player.takingDamage()
    player.takingDamage()
    player.receivingTreatment()
    player.takingDamage()
    player.takingDamage()

}

class Player() {
    val name: String = "Непобедимый"
   private var health: Int = 100
    var impactForce: Int = 25
    val player: MutableList<Player> = mutableListOf()

    fun takingDamage() {
               if (health > 0) {
            println("Игрок $name получил урон")
            val lossOfHealth = health - impactForce
            health = lossOfHealth
            println("Уровень здоровья у игрока $name равен $health")
        } else killing()
    }


    fun receivingTreatment() {
        println("Игрок $name получил лечение")
        val receiveTreatment = health + TREATMENT
        health = receiveTreatment
        println("Уровень здоровья у игрока $name равен $health")
        println(player.size)
    }

    private fun killing() {
        impactForce = 0
        health = 0
        receivingTreatment()
        println("Уровень здоровья у игрока $name равен $health, сила удара равна $impactForce - игрок убит")
    }
}

const val TREATMENT = 20