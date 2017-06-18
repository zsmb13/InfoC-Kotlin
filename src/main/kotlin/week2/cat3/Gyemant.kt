package week2.cat3.gyemant

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()

    for (i in 1..n) {
        print(" ".repeat(n - i))
        print('/')
        print(" ".repeat(2 * (i - 1)))
        println('\\')
    }
    for (i in 1..n) {
        print(" ".repeat(i - 1))
        print('\\')
        print(" ".repeat(2 * (n - i)))
        println('/')
    }
}
