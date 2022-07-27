import kotlin.math.absoluteValue

//https://open.kattis.com/problems/jobexpenses
fun main() {
    val line = readLine()!!.toInt()
    val expenseLine = readLine()!!.split(' ').map { it.toInt() }
    var expenseTotal = expenseLine.filter{ it < 0}
        .reduceOrNull {sum, element -> sum + element}?.absoluteValue ?: 0
    println(expenseTotal)
}

/*
10
-100 40000 -6500 -230 -18 34500 -450 13000 -100 5000
-> 0
 */