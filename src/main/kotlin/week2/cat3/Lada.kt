package week2.cat3.lada

fun alternativeSolution(n: Int) {
    for (i in 0..(n + 1)) {
        for (j in 0..(n + 1)) {
            if ((j == n + 1 && i == n + 1) || (j == n + 1 && i == 0))
                println('x')
            else if ((j == 0 && i == 0) || (j == 0 && i == n + 1))
                print('x')
            else if (j == n + 1)
                println('|')
            else if (j == 0)
                print('|')
            else if (i == 0 || i == n + 1)
                print('-')
            else if (i == j)
                print("\\")
            else
                print(' ')
        }
    }
}

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()

    println((1..n).joinToString(prefix = "+", postfix = "+", separator = "") { "-" })
    for (i in 1..n) {
        print('|')
        print(" ".repeat((i - 1)))
        print('\\')
        print(" ".repeat(n - i))
        println('|')
    }
    println((1..n).joinToString(prefix = "+", postfix = "+", separator = "") { "-" })
}
