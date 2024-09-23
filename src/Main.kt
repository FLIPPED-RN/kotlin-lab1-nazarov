import kotlin.random.Random

// Назаров Руслан 23-ИСП-3/1
// lab-KOTLIN 11.59
// одномерные массивы

fun main() {
    var mas = Array(Random.nextInt(1, 60)) {Random.nextInt(1, 60) -30}
    println("сгенерированный массив: " + mas.joinToString(" "))
    println()

    var sumOfPositive = 0
    for (elem in mas) {
        if (elem > 0) {
            sumOfPositive += elem
            print("$elem ")
        }
    }
    println()
    println("частное от положительных чисел массива: " + sumOfPositive / 2)
}