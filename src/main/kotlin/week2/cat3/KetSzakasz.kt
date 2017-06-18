package week2.cat3.ketszakasz

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()

    val line = "#" + " ".repeat(n - 1) + "#"
    for (i in 0 until n) {
        print(" ".repeat(i))
        println(line)
    }
}
