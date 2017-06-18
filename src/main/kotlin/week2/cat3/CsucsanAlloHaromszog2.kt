package week2.cat3.csucsanalloharomszog2

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()

    for (i in 1..n) {
        print(" ".repeat(n - i))
        println("o".repeat(i))
    }
    for (i in 1 until n) {
        print(" ".repeat(i))
        println("o".repeat(n - i))
    }
}
