package week2.cat1.pozitivnegativnulla

fun main(args: Array<String>) {
    print("Írjon be egy számot: ")

    val line = readLine()!!
    val number = line.toDouble()

    println()

    if (number > 0) {
        println("Pozitív.")
    }
    else if (number < 0) {
        println("Negatív.")
    }
    else {
        println("Nulla.")
    }

    val fractionalPart = line.substringAfter('.', "")

    if (fractionalPart.isNotEmpty() && fractionalPart.any { it != '0' }) {
        println("Nem egész.")
    }
    else {
        println("Egész.")
    }
}
