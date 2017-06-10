package week2.cat2.sorozateleme

fun main(args: Array<String>) {
    print("Adjon meg egy természetes számot: ")
    val n = readLine()!!.toInt()
    println()

    val seq = generateSequence(2) { 2 * it + 5 }

    println(seq.take(n + 1).last())
}
