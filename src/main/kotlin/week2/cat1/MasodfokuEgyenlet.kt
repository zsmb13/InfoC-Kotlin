package week2.cat1.masodfokuegyenlet

fun main(args: Array<String>) {
    println("Másodfokú egyenlet megoldó.")
    println("Formátum: a*x^2 + b*x + c = 0")

    val a = getParam("a")
    val b = getParam("b")
    val c = getParam("c")

    println()

    val result = solve(a, b, c)
    println(if (result.size > 1) "Megoldások:" else "Megoldás:")
    result.forEach(::println)
}

private fun getParam(name: String): Double {
    print("$name: ")
    return readLine()!!.toDouble()
}

private const val EPS = 0.001

fun solve(a: Double, b: Double, c: Double): List<Complex> {

    val D = b * b - 4 * a * c

    if (Math.abs(D) < EPS) {
        return listOf(
                Complex(-b / (2 * a))
        )
    }
    else if (D > 0) {
        return listOf(
                Complex((-b + Math.sqrt(D)) / (2 * a)),
                Complex((-b - Math.sqrt(D)) / (2 * a))
        )
    }
    else {
        return listOf(
                Complex(-b / (2 * a), Math.sqrt(-D) / (2 * a)),
                Complex(-b / (2 * a), -Math.sqrt(-D) / (2 * a))
        )
    }
}

class Complex(val Re: Double, val Im: Double? = null) {

    private val formattedIm = if (Im != null && Im < 0) "${Im}i" else "+${Im}i"

    override fun toString() = if (Im == null) "$Re" else "$Re$formattedIm"

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other?.javaClass != javaClass) return false
        other as Complex

        if (Math.abs(Re - other.Re) >= 0.01) return false

        if (Im == null || other.Im == null)
            return Im == null && other.Im == null

        return Math.abs(Im - other.Im) < 0.01
    }

    override fun hashCode(): Int {
        var result = Re.hashCode()
        result = 31 * result + (Im?.hashCode() ?: 0)
        return result
    }

}
