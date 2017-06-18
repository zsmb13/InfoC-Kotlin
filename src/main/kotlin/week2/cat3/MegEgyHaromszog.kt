package week2.cat3.megegyharomszog

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()

    for (i in 1..n) {
        print(" ".repeat(i - 1))
        println("o".repeat(n - i + 1))
    }
}
