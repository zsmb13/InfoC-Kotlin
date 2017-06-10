package week2.cat2.ferdehajitas1

fun main(args: Array<String>) {
    println("Ferde hajítás.")
    val v0 = getVariable("v0 (kezdeti sebesség)")
    val alpha = getVariable("alfa (szög)")
    val t = getVariable("t (időpont, másodperc)")
    println()

    val x = getX(v0, alpha, t)
    val y = getY(v0, alpha, t)
    val dist = getDist(x, y)

    println("x: $x, y: $y, távolság: $dist")
}

private fun getVariable(name: String): Double {
    print("$name: ")
    return readLine()!!.toDouble()
}

private val Double.rad
    get() = this * Math.PI / 180.0

fun getX(v0: Double, alpha: Double, t: Double) = v0 * t * Math.cos(alpha.rad)

fun getY(v0: Double, alpha: Double, t: Double) = v0 * t * Math.sin(alpha.rad) - 9.81 / 2.0 * t * t

fun getDist(x: Double, y: Double) = Math.sqrt(x * x + y * y)
