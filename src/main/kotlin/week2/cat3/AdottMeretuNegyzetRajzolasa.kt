package week2.cat3.adottmeretunegyzetrajzolasa

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()

    println((1..n).joinToString(prefix = "+", separator = "", postfix = "+") { "-" })

    println((1..n).joinToString(separator = "\n") {
        (1..n).joinToString(prefix = "|", separator = "", postfix = "|") { " " }
    })

    println((1..n).joinToString(prefix = "+", separator = "", postfix = "+") { "-" })
}
