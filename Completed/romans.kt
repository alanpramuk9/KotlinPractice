import kotlin.math.round

//https://open.kattis.com/problems/romans

fun main() {
    readLine()!!.toDouble().calculatePaces().let{ println(it)}
}

fun Double.calculatePaces(): Int {
    return round(1000 * ((5280 * this) / 4854)).toInt()
}

//1.0 -> 1088
//20.267 -> 22046