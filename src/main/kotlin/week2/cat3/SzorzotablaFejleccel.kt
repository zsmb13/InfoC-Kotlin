package week2.cat3.szorzotablafejleccel

fun main(args: Array<String>) {
    val N = readLine()!!.toInt()

    val numbers = 1..N
    println(numbers.joinToString(prefix = "  |", separator = " ", transform = { String.format("%3d", it) }))
    println(numbers.joinToString(prefix = "--+", separator = "-", transform = { "---" }))

    numbers.forEach { row ->
        println(numbers.joinToString(
                prefix = "${String.format("%2d", row)}|",
                separator = " ",
                transform = { String.format("%3d", it * row) }))
    }
}
