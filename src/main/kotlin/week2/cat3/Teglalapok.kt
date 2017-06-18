package week2.cat3.teglalapok

import java.util.*

fun main(args: Array<String>) {
    Scanner(System.`in`).use {
        val m = it.nextInt()
        val n = it.nextInt()
        val a = it.nextInt()
        val b = it.nextInt()
        val k = it.nextInt()

        val line = (1..m).joinToString(separator = " ".repeat(k)) { "o".repeat(a) }
        val blocks = (1..b).joinToString(separator = "\n") { line }
        val result = (1..n).joinToString(separator = "\n".repeat(k + 1)) { blocks }

        print(result)
    }
}
