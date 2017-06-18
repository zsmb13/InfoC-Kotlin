package week2.cat3.csucsanalloharomszog1

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()

    for (i in 1..n) {
        print(" ".repeat(i - 1))
        println("o".repeat(1 + (n - i) * 2))
    }
}
