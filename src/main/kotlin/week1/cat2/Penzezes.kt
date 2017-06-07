package week1.cat2.penzezes

import java.util.*

fun main(args: Array<String>) {

    Scanner(System.`in`).use { scanner ->
        val sum = listOf(100, 200, 500).map {
            println("Hány darab $it-as?")
            val num = scanner.nextInt()
            num * it
        }.sum()

        println("Összeg: $sum")
    }

}
