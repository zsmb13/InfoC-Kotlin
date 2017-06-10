package week2.cat2.kobgyok

fun main(args: Array<String>) {
    print("Adjon meg egy számot: ")
    val n = readLine()!!.toDouble()
    println()

    val guesses = generateSequence(n / 2) { guess ->
        (n / (guess * guess) + 2 * guess) / 3.0
    }

    val cuberoot = guesses
            .takeWhile {
                Math.abs(it * it * it - n) > 0.001
            }
            .last()

    println(cuberoot)
}
