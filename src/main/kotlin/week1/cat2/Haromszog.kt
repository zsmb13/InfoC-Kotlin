package week1.cat2.haromszog

typealias Point = Pair<Double, Double>

fun main(args: Array<String>) {
    println("Adja meg egy háromszög csúcsait! (x,y formátumban)")

    val a = getPoint(1)
    val b = getPoint(2)
    val c = getPoint(3)

    println()

    println("Kerület: ${perimeter(a, b, c)}")
    println("Terület: ${area(a, b, c)}")
    println("Szögek: ${angles(a, b, c).joinToString()}")
    println("Magasságok: ${altitudes(a, b, c).joinToString()}")
}

fun getPoint(index: Int): Point {
    print("$index. koordináta: ")
    val pieces = readLine()!!.split(",")
    return Pair(pieces[0].toDouble(), pieces[1].toDouble())
}

fun perimeter(a: Point, b: Point, c: Point) = dist(a, b) + dist(b, c) + dist(c, a)

private fun distSquared(a: Point, b: Point)
        = (b.first - a.first) * (b.first - a.first) +
        (b.second - a.second) * (b.second - a.second)

private fun dist(a: Point, b: Point) = Math.sqrt(distSquared(a, b))

fun area(a: Point, b: Point, c: Point) = Math.abs((
        a.first * (b.second - c.second)
                + b.first * (c.second - a.second)
                + c.first * (a.second - b.second)
        ) / 2.0)

private fun sides(a: Point, b: Point, c: Point) = Triple(dist(b, c), dist(a, c), dist(a, b))

fun angles(_a: Point, _b: Point, _c: Point): Array<Double> {
    val (a, b, c) = sides(_a, _b, _c)
    return arrayOf(
            Math.acos((b * b + c * c - a * a) / (2 * b * c)) * 180 / Math.PI,
            Math.acos((a * a + c * c - b * b) / (2 * a * c)) * 180 / Math.PI,
            Math.acos((a * a + b * b - c * c) / (2 * a * b)) * 180 / Math.PI
    )
}

fun altitudes(_a: Point, _b: Point, _c: Point): Array<Double> {
    val (a, b, c) = sides(_a, _b, _c)
    val area = area(_a, _b, _c)

    return arrayOf(
            2 * area / a,
            2 * area / b,
            2 * area / c
    )
}
