package org.example.lesson_18

import kotlin.math.pow

fun main() {

    val box = Box()
    val rectangularParcel = RectangularParcel(
        length = 25.0,
        width = 30.0,
        height = 17.0
    )
    val cubeParcel = CubeParcel(
        ribLength = 16.0
    )

    val list = arrayOf<Box>(rectangularParcel, cubeParcel)

    showArea(list)

}

fun showArea(box: Array<Box>) {
    box.forEach {
        it.calculatingSurfaceAreaOfParcel()
    }
}

open class Box {
    open fun calculatingSurfaceAreaOfParcel() {}
}

class RectangularParcel(
    val length: Double,
    val width: Double,
    val height: Double,
) : Box() {

    override fun calculatingSurfaceAreaOfParcel() {
        val area = COEFFICIENT_AREA_RECTANGULAR *
                ((length * width) + (width * height) + (length * height))
        println(area)
    }
}

class CubeParcel(
    val ribLength: Double,
) : Box(
) {

    override fun calculatingSurfaceAreaOfParcel() {
        val area = NUMBER_OF_FACES * ribLength.pow(SQUARE)
        println(area)
    }
}

const val SQUARE = 2.0
const val NUMBER_OF_FACES = 6.0
const val COEFFICIENT_AREA_RECTANGULAR = 2.0