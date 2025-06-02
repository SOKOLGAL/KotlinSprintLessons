package org.example.lesson_21

fun main() {
  
    val playerHealth = PlayerHealth(
        name = "Джек",
        currentHealth = 100,
        maxHealth = 100
    )
    println(playerHealth.isHealthy())
    
}

class PlayerHealth(
    val name: String,
    var currentHealth: Int,
    val maxHealth: Int,
) {
}

fun PlayerHealth.isHealthy(): Boolean {
    return currentHealth == maxHealth
}