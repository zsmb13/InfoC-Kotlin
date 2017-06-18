package week2.cat3.tetszolegesmeretusakktabla

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()

    val evenLine = "..**".repeat(n)
    val oddLine = evenLine.reversed().trim()

    for (i in 1..n) {
        println(oddLine)
        println(oddLine)
        println(evenLine)
        println(evenLine)
    }
}
