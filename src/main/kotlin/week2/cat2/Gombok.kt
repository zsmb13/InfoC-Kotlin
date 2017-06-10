package week2.cat2.gombok

fun main(args: Array<String>) {
    val squares = generateSequence(0.1) { it + 0.1 }
            .map { 4.0 * Math.PI * Math.pow(it, 3.0) / 3.0 }
            .takeWhile { it < 1 }
            .joinToString()
    println(squares)
}
