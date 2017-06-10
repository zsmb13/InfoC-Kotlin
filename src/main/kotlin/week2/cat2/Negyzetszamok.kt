package week2.cat2.negyzetszamok

fun main(args: Array<String>) {
    print("Adjon meg egy pozitív egész számot: ")
    val N = readLine()!!.toInt()
    println()

    val squares = (1..N)
            .map { it * it }
            .joinToString()
    println(squares)
}
