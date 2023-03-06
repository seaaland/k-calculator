package net.seaaland.calculator

import net.seaaland.calculator.module.CalcModule
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val calc = CalcModule()

    println("-> Enter the first operation number: ")
    val one = scanner.nextInt()

    println("\n<$one, ?> -> Enter the second operation number: ")
    val two = scanner.nextInt()

    println("\n<$one, $two> -> Select the required operation:\n> [1] Addition\n> [2] Subtraction\n> [3] Multiplication\n> [4] Division")
    val option = scanner.nextInt()

    for (i in 0..100) println()

    when (option) {
        1 -> println("-> The result of your operation is ${calc.add(one, two)}!")
        2 -> println("-> The result of your operation is ${calc.subtract(one, two)}!")
        3 -> println("-> The result of your operation is ${calc.multiply(one, two)}!")
        4 -> println("-> The result of your operation is ${calc.divide(one, two)}!")
    }
}