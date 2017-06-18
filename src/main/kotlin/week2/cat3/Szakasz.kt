package week2.cat3.szakasz

import java.util.*

fun main(args: Array<String>) {
    Scanner(System.`in`).use {
        val m = it.nextInt()
        val n = it.nextInt()

        val line = "x".repeat(m)
        for (i in 0 until n) {
            println(" ".repeat(m * i) + line)
        }
    }
}
