package week2.cat3.szogek

import java.math.BigDecimal
import java.util.*

fun main(args: Array<String>) {
    Scanner(System.`in`).use {
        val a = it.nextBigDecimal()
        val b = it.nextBigDecimal()

        val (start, end) = if (a < b) a to b else b to a

        val degToRad = BigDecimal(Math.PI / 180)
        val numbers = generateSequence(start) { it + BigDecimal.ONE }
                .takeWhile { it <= end }
                .joinToString(postfix = ",") { "$it (${String.format("%.3f", it * degToRad)})" }

        println(numbers)
    }
}
