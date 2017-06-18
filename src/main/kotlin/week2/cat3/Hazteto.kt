package week2.cat3.hazteto

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()

    for (i in 1..n) {
        print(" ".repeat(n - i))
        print("#")
        print(" ".repeat(2 * (i - 1)))
        println("#")
    }
}
