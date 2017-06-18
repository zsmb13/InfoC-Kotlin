package week2.cat3.sorozatnovekvolepesekkel

import java.util.*

fun main(args: Array<String>) {
    Scanner(System.`in`).use {
        val a = it.nextInt()
        val b = it.nextInt()

        val (start, end) = if (a < b) a to b else b to a

        var step = 0
        val numbers = generateSequence(start) { step++; it + step }
                .takeWhile { it <= end }
                .joinToString(separator = " ")

        println(numbers)
    }
}
