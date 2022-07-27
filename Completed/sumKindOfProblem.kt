//https://open.kattis.com/problems/sumkindofproblem

fun main() {
    val numLines = readLine()!!.toInt()
    for (x in 0 until numLines) {
        val (dataSetNumber, number) = readLine()!!.split(" ").map { it.toInt() }
        print("${dataSetNumber} ")
        print("${(number * (number + 1) / 2)} ")
        print("${(number * number)} ")
        println("${(number * (number + 1))} ")
    }
}

/*
3
1 1
2 10
3 1001
->
1 1 1 2
2 55 100 110
3 501501 1002001 1003002
 */

