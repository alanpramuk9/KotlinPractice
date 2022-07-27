//https://open.kattis.com/problems/server

fun main() {
    val (lines, totalMinutes) = readLine()!!.split(' ').map { it.toInt() }
    val numMinutesList = readLine()!!.split(' ').map { it.toInt() }.toMutableList()
    var currentTotalTime = 0
    var numTasks = 0
    for (i in 0 until lines) {
        if (numMinutesList[i] + currentTotalTime <= totalMinutes) {
            currentTotalTime += numMinutesList[i]
            numTasks = i + 1
        } else break
    }
    println(numTasks)
}

/*
6 180
45 30 55 20 80 20
-> 4

10 60
20 7 10 8 10 27 2 3 10 5
-> 5
 */
