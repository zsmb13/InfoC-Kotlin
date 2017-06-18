package week2.cat3.buszjegyek

fun main(args: Array<String>) {
    var x = 0
    for (i in 1..9) {
        for (j in (i + 1)..9) {
            for (k in (j + 1)..9) {
                print("$i$j$k")
                x++
                if (x == 8) {
                    x = 0
                    println()
                }
                else {
                    print(' ')
                }
            }
        }
    }
}
