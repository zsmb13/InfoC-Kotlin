package week2.cat2.hatvanyozo

fun main(args: Array<String>) {
    println("Hatványozó: k^n formátum")
    print("Alap: ")
    val k = readLine()!!.toDouble()
    print("Kitevő: ")
    val n = readLine()!!.toInt()
    println()

    println(Math.pow(k, n.toDouble()))
}
