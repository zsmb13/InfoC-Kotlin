package week1.cat2.idotartam

fun main(args: Array<String>) {
    println("Adjon meg két időpontot!")
    println("Első időpont:")
    val time1 = getTime()
    println("Második időpont:")
    val time2 = getTime()

    println()

    val diff = time2 - time1

    if (diff < 0)
        println(diff + 86400)
    else
        println(diff)
}

private fun getTime(): Int {
    print("Óra: ")
    val hour: Int = readLine()!!.toInt()
    require(hour in 0..23) { "Az óra csak 0 és 23 között lehet" }

    print("Perc: ")
    val min: Int = readLine()!!.toInt()
    require(min in 0..59) { "A perc csak 0 és 59 között lehet" }

    print("Másodperc: ")
    val sec: Int = readLine()!!.toInt()
    require(sec in 0..59) { "A másodperc csak 0 és 59 között lehet" }

    return ((hour * 60) + min) * 60 + sec
}
