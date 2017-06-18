package week2.cat3.haromszog

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()

    for (i in 1..n) {
        print(" ".repeat(n - i))
        print('/')
        print(" ".repeat(i - 1))
        println('|')
    }
    print((1..n).joinToString(separator = "", postfix = "+") { "-" })
}
