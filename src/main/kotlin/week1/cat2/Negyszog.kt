package week1.cat2.negyszog

typealias Point = Pair<Double, Double>

fun main(args: Array<String>) {
    println("Adja meg egy négyszög csúcsait! (x,y formátumban)")

    val a = getPoint(1)
    val b = getPoint(2)
    val c = getPoint(3)
    val d = getPoint(3)

    println()

    println("Kerület: ${perimeter(a, b, c, d)}")
    println("Terület: ${area(a, b, c, d)}")
}

fun getPoint(index: Int): Point {
    print("$index. koordináta: ")
    val pieces = readLine()!!.split(",")
    return Pair(pieces[0].toDouble(), pieces[1].toDouble())
}

private fun sides(a: Point, b: Point, c: Point, d: Point)
        = listOf(dist(a, b), dist(b, c), dist(c, d), dist(d, a))

fun perimeter(a: Point, b: Point, c: Point, d: Point) = sides(a, b, c, d).sum()

private fun distSquared(a: Point, b: Point)
        = (b.first - a.first) * (b.first - a.first) +
        (b.second - a.second) * (b.second - a.second)

private fun dist(a: Point, b: Point) = Math.sqrt(distSquared(a, b))

fun area(_a: Point, _b: Point, _c: Point, _d: Point): Double {
    val (a, b, c, d) = sides(_a, _b, _c, _d)
    val e = dist(_b, _d)            // diagonal
    val s = (a + b + c + d) / 2     // half perimeter

    val alpha = Math.acos((a * a + d * d - e * e) / (2.0 * a * d))
    val gamma = Math.acos((c * c + b * b - e * e) / (2.0 * c * b))

    val phi = (alpha + gamma) / 2
    val cosPhi = Math.cos(phi)

    return Math.sqrt(
            (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * cosPhi * cosPhi
    )
}
