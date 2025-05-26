package org.example.lesson_20

fun main() {

    val player = Player(
        name = "Джек",
        currentHealth = 148,
    )

    println("Текущее здоровье игрока ${player.name} = ${player.currentHealth}")

    val healingPotion: (Player) -> Int

    healingPotion = {
        player.maxHealth.also { player.currentHealth = it }
    }

    healingPotion(player)

    println("Текущее здоровье игрока ${player.name} после лечебного зелья = ${player.currentHealth}")

}

class Player(
    val name: String,
    var currentHealth: Int,
    val maxHealth: Int = 1000,
) {
}