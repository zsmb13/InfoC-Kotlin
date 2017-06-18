package week2.cat3.tablazat

fun main(args: Array<String>) {
    val N = readLine()!!.toInt()

    val numbers = 1..N

    val cellWidth = (N * N).toString().length

    numbers.forEach { row ->
        println(numbers.joinToString(
                separator = " ",
                transform = { String.format("%${cellWidth}d", it * row) }))
    }
}
