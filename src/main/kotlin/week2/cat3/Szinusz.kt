package week2.cat3.szinusz

fun main(args: Array<String>) {
    var i = 0.0
    while (i <= 2 * Math.PI) {
        val offset = (10.0 + Math.sin(i) * 10.0).toInt()
        print(" ".repeat(offset))
        println('X')

        i += 2 * Math.PI / 18.0
    }
}
