import java.lang.Math.pow
import java.text.DecimalFormat

//https://open.kattis.com/problems/tetration

fun main() {
    val number = readLine()!!.toDouble()
    val df = DecimalFormat("#.######")
    println(df.format(pow(number, 1 / number)))
}