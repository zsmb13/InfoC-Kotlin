package week2.cat3.csokkenosorozat

import java.util.*

fun main(args: Array<String>) {
    Scanner(System.`in`).use {
        val a = it.nextBigDecimal()
        val b = it.nextBigDecimal()

        val (smaller, larger) = if (a < b) a to b else b to a

        val numbers = generateSequence(larger) { it - smaller }
                .takeWhile { it > smaller }
                .joinToString(separator = " ")

        println(numbers)
    }
}
