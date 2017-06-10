package week2.cat2.osszesszam

fun rec(prefix: String, depth: Int): Unit =
        if (depth == 1)
            (4..6).forEach {
                println("$prefix$it")
            }
        else
            (4..6).forEach {
                rec("$prefix$it", depth - 1)
            }

fun main(args: Array<String>) {
    rec("", 4)
}
