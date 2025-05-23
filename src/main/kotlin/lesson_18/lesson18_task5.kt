package org.example.lesson_18

fun main() {

    val screen = Screen()
    screen.draw(
        "круг",
        3,
        5,
    )
    screen.draw(
        "круг",
        2.1f,
        3.1f,
    )
    screen.draw(
        "квадрат",
        5,
        5,
    )
    screen.draw(
        "квадрат",
        3.1f,
        0.1f,
    )
    screen.draw(
        "точка",
        2,
        3,
    )
    screen.draw(
        "точка",
        1.1f,
        1.1f,
    )

}

open class Screen {

    fun draw(
        nameOfFigure: String,
        x: Int,
        y: Int,
    ) {
        println("Нарисована фигура $nameOfFigure в координатах ($x, $y)")
    }

    fun draw(
        nameOfFigure: String,
        x: Float,
        y: Float,
    ) {
        println("Нарисована фигура $nameOfFigure в координатах ($x, $y)")
    }
}