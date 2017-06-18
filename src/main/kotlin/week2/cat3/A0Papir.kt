package week2.cat3.a0papir

fun main(args: Array<String>) {
    val sqrt2 = Math.sqrt(2.0)

    var h = Math.sqrt(sqrt2)
    var w = 1.0 / h

    println("${w * 1000} x ${h * 1000}")

    (1..6).forEach {
        h = w
        w /= sqrt2
        println("${w * 1000} x ${h * 1000}")
    }
}
