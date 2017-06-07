package week1.cat2.celsiusfahrenheit

fun main(args: Array<String>) {
    println("Celsius -> Fahrenheit átváltás. Kérek egy hőmérsékletet °C-ban megadva.")
    val celsius = readLine()!!.toDouble()
    val fahrenheit = celsius * 1.8 + 32
    println("Eredmény: $fahrenheit°F")
}
