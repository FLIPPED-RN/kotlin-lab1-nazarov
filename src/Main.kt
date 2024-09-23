import kotlin.math.abs
import kotlin.random.Random

// Назаров Руслан 23-ИСП-3/1
// lab-KOTLIN 11.59
// одномерные массивы

fun main() {
    var mas = Array(Random.nextInt(1, 60)) {Random.nextInt(1, 60) -15}
    println("сгенерированный массив: " + mas.joinToString(" "))
    println()

    var sumOfPositive = 0
    var modulNumbers = 0
    for (elem in mas) {
        if (elem > 0) {
            sumOfPositive += elem
        }
        else if (elem < 0) {
            modulNumbers += elem
        }
    }

    val modul = abs(modulNumbers)

    println()
    println("сумма положительных элементов массива: " + sumOfPositive)
    println("модуль суммы отрицательных элементов: " + modul)

    val c = sumOfPositive / modul

    println("частное от деления суммы положительных элементов массива на модуль суммы отрицательных : $c")
}