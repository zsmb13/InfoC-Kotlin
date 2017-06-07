package week1.cat2.fahrenheitcelsius

fun main(args: Array<String>) {
    println("Fahrenheit -> Celsius átváltás. Kérek egy hőmérsékletet °F-ben megadva.")
    val fahrenheit = readLine()!!.toDouble()
    val celsius = (fahrenheit - 32) / 1.8
    println("Eredmény: $celsius°C")
}
