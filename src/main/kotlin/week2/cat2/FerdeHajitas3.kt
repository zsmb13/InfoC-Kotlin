package week2.cat2.ferdehajitas3

fun main(args: Array<String>) {
    println("Ferde hajítás.")
    val v0 = getVariable("v0 (kezdeti sebesség)")
    val alpha = getVariable("alfa (szög)")
    val h = getVariable("h (domb magassága)")

    println()

    var t = 0.0
    while (true) {
        val x = getX(v0, alpha, t)
        val y = getY(v0, alpha, t)

        if (getVy(v0, alpha, t) < 0 && y < h) break

        println("$x, $y")

        t += 0.1
    }
}

private fun getVy(v0: Double, alpha: Double, t: Double) = v0 * Math.sin(alpha.rad) - 9.81 * t

private fun getVariable(name: String): Double {
    print("$name: ")
    return readLine()!!.toDouble()
}

private val Double.rad
    get() = this * Math.PI / 180.0

fun getX(v0: Double, alpha: Double, t: Double) = v0 * t * Math.cos(alpha.rad)

fun getY(v0: Double, alpha: Double, t: Double) = v0 * t * Math.sin(alpha.rad) - 9.81 / 2.0 * t * t
