package week2.cat3.sakktabla

fun main(args: Array<String>) {
    val evenLine = "  XX".repeat(4)
    val oddLine = evenLine.reversed().trim()

    for (i in 1..4) {
        println(oddLine)
        println(oddLine)
        println(evenLine)
        println(evenLine)
    }
}
