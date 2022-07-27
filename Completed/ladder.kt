import kotlin.math.ceil
import kotlin.math.pow
import kotlin.math.sqrt
import kotlin.math.tan

//https://open.kattis.com/problems/ladder

fun main() {
    val (opposite, angle) = readLine()!!.split(' ').map { it.toDouble() }
    val adjacent = opposite / tan(Math.toRadians(angle))
    val hypotenuse = sqrt(opposite.pow(2.0) + adjacent.pow(2.0))
    println(ceil(hypotenuse).toInt())
}

//500 70 ->  533