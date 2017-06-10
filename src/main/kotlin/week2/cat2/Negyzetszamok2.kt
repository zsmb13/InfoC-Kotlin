package week2.cat2.negyzetszamok2

fun main(args: Array<String>) {
    print("Adjon meg egy pozitív egész számot: ")
    val N = readLine()!!.toInt()
    println()

    val limit = Math.floor(Math.sqrt(N.toDouble())).toInt()

    val squares = generateSequence(1) { it + 1 }
            .map { it * it }
            .takeWhile { it < N }
            .joinToString()
    println(squares)
}
