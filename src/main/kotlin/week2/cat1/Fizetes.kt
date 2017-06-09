package week2.cat1.fizetes

const val low = 100
const val high = 1000

fun main(args: Array<String>) {
    print("Adja meg a fizetését: ")

    val salary = readLine()!!.toDouble()

    println()

    when (salary) {
        in Int.MIN_VALUE..low -> println("Alacsony.")
        in high..Int.MAX_VALUE -> println("Magas.")
        else -> println("Átlagos.")
    }
}
