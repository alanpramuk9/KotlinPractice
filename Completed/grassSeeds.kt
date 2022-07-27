import java.text.DecimalFormat

fun main() {
    val cost = readLine()!!.toDouble()
    val numOfLawns = readLine()!!.toInt()
    var sum: Double = 0.0
    for (i in 1..numOfLawns) {
        val (a, b) = readLine()!!.split(' ').map(String::toDouble)
        sum += a * b
    }
    val res: Double = sum * cost
    println(DecimalFormat("#0.0000000").format(res))
}

/*
2
3
2 3
4 5
5 6 -> 112.0000000

 */