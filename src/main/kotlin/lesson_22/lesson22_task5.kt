package org.example.lesson_22

import java.time.LocalDateTime

fun main() {

    val galacticGuide = GalacticGuide(
        eventName = "Звёздная система Alpha Centauri",
        eventDescription = "Alpha Centauri цель межзвёздной миссии, рассмотрим все варианты " +
                "комфортных и быстрых путешествий",
        dateAndTimeOfEvent = LocalDateTime.of(
            2025, 6,
            20, 15, 0
        ),
        distanceOfEventFromEarth = 4.24
    )

    val (eventName, eventDescription, dateAndTimeOfEvent, distanceOfEventFromEarth) = galacticGuide

    println(
        "$eventName \n $eventDescription \n $dateAndTimeOfEvent \n" +
                " всего лишь в $distanceOfEventFromEarth световых годах от Земли"
    )

}

data class GalacticGuide(
    val eventName: String,
    val eventDescription: String,
    val dateAndTimeOfEvent: LocalDateTime,
    val distanceOfEventFromEarth: Double
) {}