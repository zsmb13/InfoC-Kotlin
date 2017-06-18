package week2.cat3.negyzetrajzolasa

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()

    for (i in 0..(n + 1)) {
        for (j in 0..(n + 1)) {
            if (j == n + 1) {
                println('*')
            }
            else if (i == j || i == 0 || j == 0 || i == n + 1) {
                print('*')
            }
            else {
                print(' ')
            }
        }
    }
}
