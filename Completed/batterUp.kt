//https://open.kattis.com/problems/batterup

//Slugging percentage represents the total number of bases a player records per at-bat
fun main() {
    val numAtBats = readLine()!!.toInt()
    val cases = readLine()!!.split(" ").map { it.toInt() }
    var validCounts = 0
    var total = 0
    for (x in cases) {
        if (x != -1) {
            validCounts++
            total += x
        }
    }
    val slug: Double = total.toDouble() / validCounts
    println(slug)
}
/*
3
3 0 2
-> 1.6666666666666667

11
-1 -1 -1 -1 0 0 0 0 0 0 1
-> 0.14285714285714285
 */