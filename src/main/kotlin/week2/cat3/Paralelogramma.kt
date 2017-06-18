package week2.cat3.paralelogramma

import java.util.*

fun main(args: Array<String>) {
    Scanner(System.`in`).use {
        val x = it.nextInt()
        val y = it.nextInt()

        for (i in 1..y) {
            print(" ".repeat(y - i))
            println("o".repeat(x))
        }
    }
}
