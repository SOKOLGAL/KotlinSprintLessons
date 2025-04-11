fun main() {

    println("Введите ваш вес в кг:")
    val weight = readln().toFloat()
    println("Введите ваш рост в см:")
    val height = readln().toFloat()
    val bodyMassIndex = weight / ((height / CONVERT_CENTIMETERS_TO_METERS).pow(SQUARE)).toFloat()
    val bMI = "%.2f".format(bodyMassIndex)

    if (bodyMassIndex < UNDER_WEIGHT) {
        println("Ваш ИМТ равен $bMI - это недостаточная масса тела")
    } else if (bodyMassIndex >= UNDER_WEIGHT && bodyMassIndex < NORMAL_BODY_WEIGHT) {
        println("Ваш ИМТ равен $bMI - это нормальная масса тела")
    } else if (bodyMassIndex > NORMAL_BODY_WEIGHT && bodyMassIndex < OVER_WEIGHT) {
        println("Ваш ИМТ равен $bMI - это избыточная масса тела")
    } else if (bodyMassIndex >= OBESITY) {
        println("Ваш ИМТ равен $bMI - это ожирение")
    }

}

const val CONVERT_CENTIMETERS_TO_METERS = 100
const val SQUARE = 2
const val UNDER_WEIGHT = 18.5
const val NORMAL_BODY_WEIGHT = 25.0
const val OVER_WEIGHT = 30
const val OBESITY = 30