package week2.cat3.szamtanisorozat

import java.math.BigDecimal
import java.util.*

fun main(args: Array<String>) {
    Scanner(System.`in`).use {
        val start = it.nextBigDecimal()
        val step = it.nextBigDecimal()
        val end = it.nextBigDecimal()

        print(if (start < BigDecimal.ZERO) "negativ " else "nemnegativ ")

        val numbers = generateSequence(start) { it + step }
                .takeWhile { it <= end }
                .joinToString(separator = " ")

        println(numbers)
    }
}
