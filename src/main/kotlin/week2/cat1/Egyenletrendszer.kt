package week2.cat1.egyenletrendszer

fun main(args: Array<String>) {
    println("Egyenletrendszer megoldó.")
    println("Formátum:")
    println("ax + by = p")
    println("cx + dy = q")

    val a = getParam("a")
    val b = getParam("b")
    val p = getParam("p")

    val c = getParam("c")
    val d = getParam("d")
    val q = getParam("q")

    println()

    val solutions = solve(a, b, p, c, d, q)

    if (solutions == null) {
        println("Végtelen sok megoldás van.")
        return
    }
    else if (solutions.isEmpty()) {
        println("Nincs megoldás.")
    }
    else {
        println("Megoldások: x = ${solutions.first()}, y = ${solutions.last()}")
    }
}

fun solve(a: Double, b: Double, p: Double,
          c: Double, d: Double, q: Double): List<Double>? {
    // a/c != b/d
    if (Math.abs(a / c - b / d) > 0.01) {
        val x: Double = (d * p - b * q) / (a * d - b * c)
        val y: Double = (a * q - c * p) / (a * d - b * c)
        return listOf(x, y)
    }
    // a/c == b/d == p/q
    else if (Math.abs(b / d - p / q) < 0.01) {
        return null
    }
    else {
        return listOf()
    }
}

private fun getParam(name: String): Double {
    print("$name: ")
    return readLine()!!.toDouble()
}
